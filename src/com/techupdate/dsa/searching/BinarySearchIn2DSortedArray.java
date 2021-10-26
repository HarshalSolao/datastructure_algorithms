package com.techupdate.dsa.searching;

import java.util.Arrays;

public class BinarySearchIn2DSortedArray {
    //Best case complexity is 1 [Constant]
    //Worst case complexity is log(N) + log(M) [N,M are rows and column in matrix]

    public static void main(String[] args) {
        //Here array is Row and Column wise sorted
        int arr[][] = {{10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 110, 120, 130},
                {140, 150, 160, 170}};

        int target = 1650;
        System.out.println(Arrays.toString(binarySearch(arr, target)));
    }

    private static int[] binarySearch(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious, matrix may be empty

        if (rows == 1) {
            return simpleBinarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        //Run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now check we have two rows
        //Check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }

        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        //Search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return simpleBinarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //Search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return simpleBinarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        //Search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return simpleBinarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return simpleBinarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    //Search in the row provided between the cols provided
    private static int[] simpleBinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }

            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}
