package com.training.demo.extendClasses;

public class Bmw  extends Car {


    public Bmw(String color, String name) {
        super(color, name);
    }


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

    @Override
    void print() {

    }

    private String color;
    private String name;
}
