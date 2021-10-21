package com.techupdate.dsa.searching;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {21, 55, 78 , 99 ,66, 6, 98};
        int target = 982;
        int result = searchElementInIntArray(arr, target);
        System.out.println("Result is : " + result);

        boolean isCharPresent = searchInString("Harshal Solao", 'h');
        System.out.println("Is given char present : " + isCharPresent);
    }

    private static int searchElementInIntArray(int arr[] , int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    private static boolean searchInString(String input, char ch){
        if(input.length() == 0){
            return false;
        }

//        for (int i = 0; i < input.length(); i++) {
//            if(ch == input.charAt(i)){
//                return true;
//            }
//        }

        //You can also convert string to array and then check
        char arr[] = input.toCharArray();
        for (char element : arr) {
            if(element == ch){
                return true;
            }
        }

        return false;
    }
}
