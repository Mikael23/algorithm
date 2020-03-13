package com.training.demo.extendClasses;

 public abstract class Car {

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }


    public Car() {
        System.out.println("HHHHHHHH");
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    abstract void print();
}
