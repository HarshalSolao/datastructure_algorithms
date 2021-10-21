package com.techupdate.dsa.LeetCodeQuestions;

//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int arr[][] = {{1, 5}, {7, 3}, {-3, 15}};
        System.out.println("Max Wealth is : " + maxiWealth(arr));
    }

    public static int maxiWealth(int[][] accounts) {
        //person = row
        //account = col
        int maxAccountWealth = 0;
        for (int person = 0; person < accounts.length; person++) {
            int personWealth = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                personWealth = personWealth + accounts[person][account];
            }
            if (maxAccountWealth < personWealth)
                maxAccountWealth = personWealth;
        }
        return maxAccountWealth;
    }
}
