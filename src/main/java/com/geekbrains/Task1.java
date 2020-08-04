package com.geekbrains;

import java.util.Arrays;
import java.util.logging.Logger;

public class Task1 {

    private static final Logger logger = Logger.getLogger("com.geekbrains.Task1");

    public static void main(String[] args) {
        System.out.println(Arrays.toString(process(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
    }

    public static int[] process(int[] arr) {

//        int[] backArr = new int[];
////
////        if (arr.length == 0) {
////            logger.info("В массиве нет элементов");
////            return arr;
////        }
////        for (int i = arr.length - 3; i >= 0; i--) {
////            if (arr[i] == 4) {
////                System.arraycopy(arr, (i + 1), backArr, 0, 2);
////                return backArr;
////            }
////        }
////        throw new RuntimeException("В массиве нет ни одной 4-ки, после которой были бы числа");

        int countNumber = 0;
        int serialNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                countNumber++;
                serialNumber = i;
            }
        }

        int[] newArray = new int[arr.length - serialNumber - 1];

        if (countNumber != 0) {
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 4 && i > serialNumber) {
                    newArray[j] = arr[i];
                    j++;
                }
            }
            if (j == 0) {
                newArray = new int[]{};
            }
        } else {
            throw new RuntimeException();
        }

        return newArray;
    }
}
