package com.techupdate.dsa.searching;

public class LinearSearchMinMax {

    public static void main(String[] args) {
        int arr[] = {56, 51, -78 , -99 ,66, 146, 98};
        int minResult = min(arr);
        int maxResult = max(arr);
        System.out.println(String.format("Result for Max is %d and Min is %d", maxResult, minResult));

    }

    private static int min(int[] arr) {
        int min = arr[0];
        for (int element : arr) {
            if(element < min)
                min = element;
        }
        return min;
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int element : arr) {
            if(element > max)
                max = element;
        }
        return max;
    }


}
