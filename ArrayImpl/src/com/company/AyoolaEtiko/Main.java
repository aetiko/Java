package com.company.AyoolaEtiko;

public class Main {

    public static void main(String[] args) {
	int runningSumArray [] = {1,2,3,4};
	runningSum(runningSumArray);
	int arrToShuffle [] = {1,2,3,3,2,1};
	int pointToBeginShuffle = 3;
	shuffle(arrToShuffle, pointToBeginShuffle);
    int accounts[][] = {{2,8,7}, {7,1,3}, {1,9,5}};
	maximumWealth(accounts);

    }
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int maxWealth = 0;
        for (int i=0; i<accounts.length; i++){
                for (int j = 0; j<accounts[i].length; j++){
                    sum += accounts[i][j];
                }
                if (maxWealth < sum){
                    maxWealth = sum;
                }
                sum = 0;
        }
        System.out.println("Max Wealth: "+ maxWealth);
        return maxWealth;
    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static int[] shuffle(int[] nums, int n) {
        int shuffledArray[] = new int [nums.length];
        int counter = 0;
        for (int i = 0; i<n; i++){
            shuffledArray[counter++] = nums[i];
            shuffledArray[counter++] = nums[i+n];
        }
        return shuffledArray;
    }
}
