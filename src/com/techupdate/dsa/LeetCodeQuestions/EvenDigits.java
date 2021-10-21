package com.techupdate.dsa.LeetCodeQuestions;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 49, 69, 78965, -5454};
        System.out.println("Even numbers in array are : " + findNumbers(arr));
    }

    static int findNumbers(int arr[]) {
        int count = 0;
        for (int num : arr) {
            if (even(num))
                count++;
        }
        return count;
    }

    static boolean even(int num) {
        return digits(num) % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        //Make negative number to positive
        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int digits2(int num) {
        return (int)Math.log10(num);
    }
}
