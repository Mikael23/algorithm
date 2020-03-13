package com.training.demo.singleton;


import java.lang.ref.SoftReference;

public class TaxCalculator {


    SoftReference<StringBuilder> softReference = new SoftReference<>(new StringBuilder());

}
