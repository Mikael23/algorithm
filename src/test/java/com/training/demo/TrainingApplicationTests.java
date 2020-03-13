package com.training.demo;

import com.training.demo.udemy.InsertionSort;
import com.training.demo.udemy.ShellSort;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

import static com.training.demo.udemy.InsertionSort.*;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class TrainingApplicationTests {


    @Test
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Warmup(iterations = 2)
    @Measurement(iterations = 1)
    void contextLoads() throws InterruptedException, RunnerException {
        combsort();
        shellSort();
//        bubleSort();
        selectionSort();
        sortInsertion();
//        Options opt = new OptionsBuilder().include(InsertionSort.class.getName())
//                .forks(1)
//                .mode(Mode.AverageTime)
//                .timeUnit(TimeUnit.MICROSECONDS)
//                .warmupTime(TimeValue.seconds(1))
//                .measurementTime(TimeValue.seconds(1))
//                .shouldDoGC(true)
//                .jvmArgs("-server")
//                .build();
//        new Runner(opt).run();
//        }

    }
}
