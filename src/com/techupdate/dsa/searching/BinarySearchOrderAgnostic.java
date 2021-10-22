package com.techupdate.dsa.searching;

public class BinarySearchOrderAgnostic {

    public static void main(String[] args) {
        int arr[] = {-18, -16, -5, 0, 2, 6, 7, 8, 9, 11, 15, 16, 17, 19, 22, 25, 28, 29, 55, 64, 77, 85, 99};
        int arr2[] = {9, 8, 5, 6, 2, 1, 1};
        int target = 9;
        System.out.println("Ascending array output : "  + binarySearch(arr, target));
        System.out.println("Descending array output : "  + binarySearch(arr2, target));

    }

    //Return the index
    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        //To check array is Ascending or descending order
        boolean isAsc = arr[end] >= arr[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            //Common condition put outside as in BinarySearch.java it's part of IF condition
            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}