package com.training.demo.fileSystemTree;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;

public class FileService {

    public static void printFiles(File[] file, int index, int level) {
        if (index == file.length) return;
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        if (file[index].isFile()) {
            var newFile = file[index];
            calculateFileSizeAndPrintResult(newFile);
        } else if (file[index].isDirectory()) {
            var newFile = file[index];
            calculateDirectorySizeAndPrintResult(newFile);
            printFiles(Objects.requireNonNull(newFile.listFiles()), 0, level + 1);
        }
        printFiles(file, index + 1, level);
    }

    private static void calculateFileSizeAndPrintResult(File newFile) {
        System.out.println(FileUtils.byteCountToDisplaySize(newFile.length()) + " " + newFile.getName());
    }

    public static void calculateDirectorySizeAndPrintResult(File newFile) {
        System.out.println(FileUtils.byteCountToDisplaySize(FileUtils.sizeOfDirectory(newFile)) + " " + "[Directory" + " " + newFile.getName() + "" + "]");
    }
}
