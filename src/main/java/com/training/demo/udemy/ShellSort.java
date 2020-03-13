package com.training.demo.udemy;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openjdk.jmh.annotations.Benchmark;

@Log4j2
@NoArgsConstructor
public class ShellSort {


    private int number;
    private Tinner tinner;

    public ShellSort(int number, String profession) {
        this.number = number;
        this.profession = profession;

    }

    private String profession;

    public void doSomething() {

        tinner.doSomething();
        log.debug(number);
    }


    public class Tinner {
        private int number1;
        private String profession;

        public void doSomething() {
            log.debug(number);
        }
    }


    public static class TinnerStatic {
        private int number2;
        private String profession2;

        public void doSomething() {
            log.debug(number2);
        }
    }


}
