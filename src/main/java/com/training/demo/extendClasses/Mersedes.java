package com.training.demo.extendClasses;

public class Mersedes extends Car {


    public Mersedes(int q) {
        System.out.println();
    }


    @Override
    public String toString() {
        return "Mersedes{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Mersedes(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Mersedes() {
        System.out.println("this + this");
        print();
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
     System.out.println("This is method print");
    }

    private String color;
    private String name;

}
