package com.techupdate.dsa.searching;

public class BinarySearch {
    //Best case complexity is 1 [Constant]
    //Worst case complexity is logN [i.e. for 1000000 elements it will take only 6 comparisons]

    public static void main(String[] args) {
        int arr[] = {2, 6, 7, 8, 9, 11, 15, 16, 17, 19, 22, 25, 28, 29, 55, 64, 77, 85, 99};
        int target = 16;
        System.out.println(binarySearch(arr, target));

    }

    //Return the index
    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
