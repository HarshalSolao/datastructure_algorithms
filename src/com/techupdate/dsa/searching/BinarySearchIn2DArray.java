package com.techupdate.dsa.searching;

import java.util.Arrays;

public class BinarySearchIn2DArray {

    //Best case complexity is 1 [Constant]
    //Worst case complexity is N [i.e. O(n)]

    public static void main(String[] args) {
        //Here array is Row and Column wise sorted
        int arr[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        int target = 37;
        System.out.println(Arrays.toString(binarySearch(arr, target)));
    }

    static int[] binarySearch(int[][] arr, int target) {

        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {

            if (arr[r][c] == target) {
                return new int[]{r, c};
            }

            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
