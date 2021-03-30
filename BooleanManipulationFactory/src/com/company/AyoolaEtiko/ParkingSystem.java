package com.company.AyoolaEtiko;

public class ParkingSystem {
    int bigCar;
    int mediumCar;
    int smallCar;
    public ParkingSystem(int big, int medium, int small){
        bigCar = big;
        mediumCar = medium;
        smallCar = small;
    }

    public int getBigCar() {
        return bigCar;
    }

    public int getMediumCar() {
        return mediumCar;
    }

    public int getSmallCar() {
        return smallCar;
    }

    public void setBigCar(int bigCar) {
        this.bigCar = bigCar;
    }

    public void setMediumCar(int mediumCar) {
        this.mediumCar = mediumCar;
    }

    public void setSmallCar(int smallCar) {
        this.smallCar = smallCar;
    }

    public boolean addCar(int carType){
        int numberOfCars = 4;
        boolean carIsAdded = false;
        for (int i = 1; i<numberOfCars; i++){
                if (i == carType){
                    if(carType == 1 && bigCar != 0){
                        bigCar--;
                        carIsAdded = true;
                    }else if (carType == 2 && mediumCar != 0){
                        mediumCar--;
                        carIsAdded = true;
                    }
                    else if (carType == 3 && smallCar != 0){
                        smallCar--;
                        carIsAdded = true;
                    }
                }
            }

        return carIsAdded;
    }
}
