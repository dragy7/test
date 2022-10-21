package com.company;


public class Main {

    public static void main(String[] args) {
	Driver myDriver = new Driver("Petr", 24);
    Car myCar =  new Car(false,"Bmw", "A5S 5252", 5);
    myDriver.drive(myCar);
    myCar.setEngineOn(true);
    myDriver.drive(myCar);
    }
}
