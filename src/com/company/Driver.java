package com.company;

public class Driver extends Car {
    public static String name;
    public int age;


    public void drive(Car myCar){
        if(myCar.isEngineOn()){
            System.out.println(name  +  " ridi "+  myCar.getName() + myCar.getSPZ());
        }
        else {
            System.out.println("turn your car on ");
        }

    }



    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
