package com.twair;

public class TravelClass {
    private ClassType classType;
    private Integer totalSeats;
    private Double basePrice;
    private Integer occupiedSeats;

    public TravelClass(ClassType classType, Integer totalSeats, Double basePrice) {
        this.classType = classType;
        this.totalSeats = totalSeats;
        this.basePrice = basePrice;
        this.occupiedSeats = 0;
    }

    public void book(int numberOfSeats) throws Exception {
        if(canBook(numberOfSeats) == false) {
            throw new Exception("Booking can not be made");
        }
        occupiedSeats += numberOfSeats;
    }

    public boolean canBook(Integer numberOfSetas) {
        if(occupiedSeats + numberOfSetas > totalSeats) {
            return false;
        }
        return true;
    }

    public ClassType getClassType() {
        return classType;
    }

    public double getCostForSeats(Integer numberOfSeats) {
        if(numberOfSeats == 0) {
            numberOfSeats = 1;
        }
        return numberOfSeats*this.basePrice;
    }
}
