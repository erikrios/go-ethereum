package com.erikriosetiawan;

import java.util.Scanner;

public class Solution {

    private static void plusMinus(int[] arr) {
        int positiveNumberSum = 0;
        int negativeNumberSum = 0;
        int zeroNumberSum = 0;

        for (int value : arr) {
            if (value > 0) {
                positiveNumberSum++;
            } else if (value < 0) {
                negativeNumberSum++;
            } else {
                zeroNumberSum++;
            }
        }

        float positiveNumberProportion = (float) (positiveNumberSum) / (float) arr.length;
        float negativeNumberProportion = (float) (negativeNumberSum) / (float) arr.length;
        float zeroNumberProportion = (float) (zeroNumberSum) / (float) arr.length;

        System.out.printf("%6f\n", positiveNumberProportion);
        System.out.printf("%6f\n", negativeNumberProportion);
        System.out.printf("%6f", zeroNumberProportion);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
