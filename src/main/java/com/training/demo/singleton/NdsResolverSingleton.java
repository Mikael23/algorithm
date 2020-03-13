package com.training.demo.singleton;



public class NdsResolverSingleton {

private static NdsResolverSingleton ourInstance = new NdsResolverSingleton();

public static NdsResolverSingleton getInstance(){return ourInstance; }

private NdsResolverSingleton(){

}

public double getNds(){
    return 0.2;
}
}
