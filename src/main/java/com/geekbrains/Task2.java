package com.geekbrains;

public class Task2 {

    public static void main(String[] args) {
        boolean result = process(new int[]{1, 4, 1, 1, 1});
        System.out.println(result);
    }

    public static boolean process(int[] arr) {
        boolean one = false;
        boolean four = false;

        for (int i : arr) {
            if (i != 1 && i != 4) {
                return false;
            }
            if (i == 1) {
                one = true;
            }
            if (i == 4) {
                four = true;
            }
            if (one && four) {
                return true;
            }
        }
        return false;
    }

}