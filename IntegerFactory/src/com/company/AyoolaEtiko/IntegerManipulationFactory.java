package com.company.AyoolaEtiko;

import java.util.Arrays;

/*
All questions here are from Leetcode and AlgoExpert
All solved by Ayoola Nurudeen Etiko
 */


public class IntegerManipulationFactory {

    /*
     * Reverse integers in arrays
     * 32 bit intgers allowed only*/

    public int reverse(int x) {
        String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }
    public int maximumWealth(int[][] accounts) {
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
    public int numJewelsInStones(String jewels, String stones) {
        int jewelCounter = 0;
        char [] jewelsCharacters = jewels.toCharArray();
        char [] stonesCharacters = stones.toCharArray();
        for(int i = 0; i<jewels.length(); i++){
            for(int j = 0; j<stones.length(); j++){
                if(jewelsCharacters[i] == stonesCharacters[j]){
                    jewelCounter++;
                }
            }
        }
        System.out.println("Jewel Counter: " + jewelCounter);
        return jewelCounter;
    }
    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for(int i = 0 ; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(i<j && nums[i] == nums[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
    public int integerReplacement(int n) {
        int count = 0;
        int i = 0;
        int temp = n;
        if(n==0) return 0;
        if(n==1) return 1;
        if (n%2 == 1){
            System.out.println("n->: " + n);
            n = n+1;
            count++;
        }
        System.out.println("n->: " + n);
        while (i <= temp && n != 1){
            if(n%2 == 0){
                n = n/2;
            }else {
                n = (n+1)/2;
            }
            count++;
            i++;
            System.out.println("n->: " + n);
        }
        System.out.println("Output: " + count);
        return count;
    }

    public int minMoves20(int[] nums) {
        //first sort array
        int k = 0;
        int j;
        int minMoves = 0;
        int median = 0;
        Arrays.sort(nums);
        median = nums[nums.length/2];
        for (j=0; j<nums.length; j++){
            minMoves += Math.abs(nums[j] - median);
        }
        System.out.println("minMoves: "+ minMoves);
        return minMoves;
    }

    public int minMoves2(int[] nums){
        int minMoves = 0;
        int[] newArr = new int[nums.length];
        int i;
        int j;
        int move = 1;
        int avg = 0;
        int sum = 0;
        int k = 0;
        for (i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        avg = sum/nums.length;
        while (k < 10000){
            for (j=0; j<nums.length; j++){
                if(nums[j] != avg){
                    if(avg < nums[j]){
                        minMoves++;
                        newArr[j] = nums[j] - move;
                        nums[j] = nums[j] - move;
                    }else {
                        minMoves++;
                        newArr[j] = nums[j] + move;
                        nums[j] = nums[j] + move;
                    }
                }else {
                    newArr[j] = nums[j];
                }
            }
            k++;
        }
        System.out.println("minMoves: "+ minMoves);
        return minMoves;
    }
    public int minMoves(int[] nums){
        int minMove = 0;
        int min = nums[0];
        if(nums.length == 0){
            minMove = 0;
        }
        // what I am doing here is intead of using n-1
        // I am first getting the min value in the arr
        // subtracting num[y] by the min
        // which is the same as adding 1 to n-1
        for(int x: nums) min = Math.min(x,min);
        for(int y: nums) minMove += y - min;
        System.out.println("MinMoves: " + Math.abs(minMove));
        return Math.abs(minMove);
    }
    public int minCostToMoveChips(int[] position){
        int result = 0;
        int i;
        int odd = 0;
        int even = 0;
        //understanding the question better
        //tells me
        // when moving from even to even || odd to odd -> cost = 0
        // when moving from even to odd || odd to even -> cost = 1
        for (i=0; i<position.length; i++){
            if(position[i]%2 == 1){
                odd++;
            }else {
                even++;
            }
        }
        result = (int)Math.min(odd, even);
        System.out.println("Min: " + odd);
        System.out.println("Max: " + even);
        return result;
    }
}
