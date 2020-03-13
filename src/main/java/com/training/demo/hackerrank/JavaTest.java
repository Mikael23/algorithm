package com.training.demo.hackerrank;

import java.util.Arrays;

public class JavaTest {

    public static void sumString() {
        String a = "name";
        String b = "qwe";
        System.out.println(a.length() + b.length());
        if (a.compareTo(b) > 0) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1));
    }


    public static void javaSubstring() {
        String q = "ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
        String smallest = q.substring(0, 3);
        String largest = q.substring(0, 3);
        int k = 3;
        String test = "";

//        if(q.length()<3){
//        return  "" + "\n" + largest;
//        }

        for (int i = 0; i <= q.toCharArray().length - 3; i++) {
            test = q.substring(i, i + 3);
            if (test.compareTo(largest) > 0) {
                largest = test;
            }
            if (test.compareTo(smallest) < 0) {
                smallest = test;
            }
        }
        System.out.println(largest + smallest);
    }


    public static void minimubribes() {
        int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
        int[] arr = new int[q.length + 1];
        arr[0] = q[0];
        String ar = "";
        int t = 0;
        int count = 0;
        for (int i = 0; i <= q.length - 1; i++) {
            t = q[i] - (i + 1);
            if (t <= 2 && t >= 0) {
                count = t + count;
            }

            if (t == 2) {
                arr[i + 1] = arr[i] - t;
                arr[i + 2] = arr[i] - t - 1;
            }
            if (t == 1) {
                arr[i + 1] = arr[i] - t;
            }

            if (q[i] - (i + 1) > 2) {
                ar = "Too chaotic";
            }
        }
        ar = !ar.isEmpty() ? ar : String.valueOf(count);
        System.out.println(ar + "massive" + Arrays.toString(arr));
    }


}
