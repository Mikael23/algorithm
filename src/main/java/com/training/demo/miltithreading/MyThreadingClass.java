package com.training.demo.miltithreading;

public class MyThreadingClass implements Runnable {


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        number = number;
    }


    private static int number;


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            number++;
        }
    }


    public MyThreadingClass(int numberOfThreads) {
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(this);
            thread.start();
        }
    }


}
