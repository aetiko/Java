package com.company.AyoolaEtiko;
import java.util.*;
/*
All questions here are from Leetcode and AlgoExpert
All solved by Ayoola Nurudeen Etiko
 */
public class ArrayManipulationFactory extends FactoryMethods{

    public int [] smallerNumbersThanCurrent(int[] nums){
        int [] ouputArr = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            int count = 0;
            for (int j = 0; j <= nums.length-1; j++){
                if (i != j && nums[j] < nums[i]){
                    count++;
                }
            }
            System.out.println(" ------ Checks for if there are any values in the array though iterations-----------");
            ouputArr[i] = count;
            printArr(ouputArr);
            System.out.println("-------------------------------------------------------------------------------------");
        }
        return ouputArr;
    }
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public int[] shuffle(int[] nums, int n) {
        int shuffledArray[] = new int [nums.length];
        int counter = 0;
        for (int i = 0; i<n; i++){
            shuffledArray[counter++] = nums[i];
            shuffledArray[counter++] = nums[i+n];
        }
        return shuffledArray;
    }
    public int[] sortedSquaredArray(int[] array) {
        int length = array.length;
        int squaredArray[] = new int[length];
        for(int i = 0; i < length; i++){
            squaredArray[i] = array[i]*array[i];
            System.out.println("Squared Array: " + squaredArray[i]);
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }

    //Time O(n^2) space: O(n)

    public static int[] twoNumberSum(int[] arr, int targetSum){
        int [] newArr = new int[2];
        int firstNum = 0;
        int secNum = 0;
        for (int i : arr){
            if (i <= targetSum){
                firstNum = i;
            }
            for (int j=1; j< arr.length; j++){
                secNum = arr[j];
                if((firstNum + secNum) == targetSum && firstNum != secNum){
                    newArr[0] = firstNum;
                    newArr[1] = secNum;
                    System.out.println("newArr0: " + newArr[0]);
                    System.out.println("newArr1: " + newArr[1]);
                    System.out.println("");
                    return newArr;
                }
            }
        }
        return new int[0];
    }
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int counter = 0;
        if(array.length == 0){ return new int[] {}; }
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i<array.length - 1 - counter; i++){

                if (array[i] > array[i+1]){
                    swap(i, i+1, array);
                    isSorted = false;
                }
            }
            counter++;
        }

        return array;
    }
}
