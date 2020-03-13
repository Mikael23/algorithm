package com.training.demo.udemy;

import lombok.extern.log4j.Log4j2;
import org.openjdk.jmh.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.*;
import java.util.concurrent.TimeUnit;


@Component
public class InsertionSort {

    private static StopWatch stopWatch = new StopWatch("Performance test");


    private final static int value = 100;
    int[] mas = new Random().ints(1, 10).limit(value).toArray();


    public static void merge(int[] mas, int first, int mid, int right) {
        int[] merge = new int[right - first+1];
        var i = 0;
        var j = 0;
        i = first;
        var k = 0;
        j = mid + 1;
        while (i <= mid || j <= right) {
            if (mas[i] < mas[j]) {
                merge[k] = mas[i];
            }
        }
    //to write merge
    }

    public static void mergeSort(int[] mas, int i, int i1) {
        if (i != i1) {
            int middle = (i1 - i) / 2;
            mergeSort(mas, i, middle);
            mergeSort(mas, middle + 1, i1);


        }

        HashMap hashMap;

        TreeMap treeMap;

        Hashtable<String,String>qw=new Hashtable<>();

//        NavigableMap<String,String> map= new NavigableMap<String, String>();

    }


    //home work: shell sort!!!!!!!!!!!
    // merge sort

    public static int[] shellSortNew() {
        int[] mas = new Random().ints(1, 100).limit(value).toArray();
        stopWatch.start("shellSortNew");
        int q = 0;
        for (int rage = mas.length / 3; rage > 0; rage /= 3) {
            for (q = rage; q < mas.length; q++) {
                int qq = q;
                int key = mas[q];
                while (q >= rage && mas[q - rage] > key) {
                    mas[q] = mas[q - rage];
                    q -= rage;
                }
                mas[q] = key;
            }
        }
        stopWatch.stop();
        System.out.println("this is sorted shell sort new" + Arrays.toString(mas));
        return mas;
    }

    public static int[] shellSort() {
        int[] intArray = new Random().ints(1, 1000).limit(value).toArray();
        stopWatch.start("shellSort");
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;


//                Collections

            }
        }
        stopWatch.stop();
        return intArray;
    }


//    public static void shellSortNew() {
//        int[] mas = new Random()
//                .ints(1, 10000)
//                .limit(10)
//                .toArray();
//        System.out.println("This is shellSortNew and massive not sorted" + Arrays.toString(mas));
//        var length = mas.length;
//        for (int rage = length / 2; rage > 0; rage /= 2) {
//            for (int t = rage; t < length; t++) {
//                var i = t;
//                var key = mas[t];
//                while (i >= rage && mas[i - rage] > key) {
//                    mas[i] = mas[i - rage];
//                    i -= rage;
//                }
//                mas[i] = key;
//            }
//        }
//        System.out.println("This is shellSortNew" + Arrays.toString(mas));
//
//    }


    public static int[] bubleSort() {
        int[] mas = new Random()
                .ints(1, 1000)
                .limit(value)
                .toArray();

        System.out.println("here we get massive unsorted:" + Arrays.toString(mas));
        int n = 0;
        stopWatch.start("bubleSort");
        while (mas.length > n) {
            for (int i = 0; i < mas.length - n - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    functionSwap(i, i + 1, mas);
                }
            }
            n++;
        }
        stopWatch.stop();
        System.out.println(Arrays.toString(mas));
        return mas;
    }

    public static int[] selectionSort() {
        int[] mas = new Random().ints(1, 1000).limit(value).toArray();
        stopWatch.start("selectionSort");
        for (int i = 0; i <= mas.length - 2; i++) {
            for (int q = i + 1; q <= mas.length - 1; q++) {
                if (mas[i] > mas[q]) {
                    functionSwap(i, q, mas);
                }
            }
        }
        stopWatch.stop();
        System.out.println(Arrays.toString(mas));
        return mas;

    }


    private static void functionSwap(int maleft, int iright, int[] mas) {
        int paramright = mas[iright];
        mas[iright] = mas[maleft];
        mas[maleft] = paramright;
    }

    public static int[] combsort() { //comb sort
        int[] mas = new Random().ints(1, 1000).limit(value).toArray();
        stopWatch.start("combsort");
        double param = 1.245;
        int range = (int) ((double) (mas.length) / param);
        while (range >= 1) {
            for (int i = 0; i + range <= mas.length - 1; i++) {
                if (mas[i] > mas[i + range]) {
                    functionSwap(i, i + range, mas);
                }
            }
            range = (int) (range / param);
        }
        stopWatch.stop();
        System.out.println(Arrays.toString(mas));
        return mas;
    }

    public static int[] sortInsertion() {
        int[] mas = new Random().ints(1, 1000).limit(value).toArray();
        stopWatch.start("sortInsertion");
        for (int i = 1; i < mas.length; i++) {
            int n = mas[i];
            int j = i - 1;
            while (j >= 0 && mas[j] > n) {
                mas[j + 1] = mas[j];
                j = j - 1;
            }
            mas[j + 1] = n;
        }
        stopWatch.stop();
        System.out.println(Arrays.toString(mas));
        return mas;
    }


    public static int checkLevels(int n, String s) {
        int level = 0;
        boolean flaf = false;
        boolean levelsea = false;
        int rise = 0;
        int down = 0;
        char[] count = s.toCharArray();
        for (int i = 0; i <= count.length - 1; i++) {
            if (count[i] == 'U' && rise + 1 == 0) {
                level++;
            }

            if (count[i] == 'U') {
                rise++;
            }

            if (count[i] == 'D') {
                rise--;
            }
        }
        return level;
    }

    public void insertionSort() {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }


    public static void printResult() {
        System.out.println(stopWatch.prettyPrint());
    }


}
