package com.techupdate.dsa.searching;

import java.util.Arrays;

public class LinearSearchIn2DArray {

    public static void main(String[] args) {
        int arr[][] = {
                {24, 5, 6},
                {55, 9, -66},
                {36, -55, 66, 6},
                {56, 51, -78, -99, 66, 146, 98}
        };

        int target = 146;

        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(searchMin(arr,target));

    }


    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target)
                    return new int[]{row, column};
            }

        }
        return new int[]{-1, -1};
    }

    static int searchMin(int[][] arr, int target) {
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (min > arr[row][column])
                    min = arr[row][column];
            }

        }
        return min;
    }
}
