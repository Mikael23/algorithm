package com.training.demo;

import com.training.demo.extendClasses.Bmw;
import com.training.demo.extendClasses.Mersedes;
import com.training.demo.miltithreading.MyThreadingClass;
import org.apache.commons.io.FileUtils;
import org.openjdk.jmh.runner.RunnerException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

import static com.training.demo.fileSystemTree.FileService.calculateDirectorySizeAndPrintResult;
import static com.training.demo.fileSystemTree.FileService.printFiles;
import static com.training.demo.hackerrank.JavaTest.*;

//
//@Log4j2
@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingApplication.class, args);
        File root = new File("/home/mikael/Documents/Books");
        if (root.exists() && root.isDirectory()) {
            calculateDirectorySizeAndPrintResult(root);
            printFiles(Objects.requireNonNull(root.listFiles()), 0, 1);
        }

    }

}
