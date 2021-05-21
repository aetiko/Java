package com.company.AyoolaEtiko;

public class Main {

    public static void main(String[] args) {
        int runningSumArray [] = {1,2,3,4};
        int arrToShuffle [] = {1,2,3,3,2,1};
        int [] arr = {3, 5, -4, 8, 11, 1, -1, 6};
        int arrayToBeSquared[] = {1, 2, 3, 5, 6, 8, 9};
        int bubbleArr[] = {5, 2, 8, 5, 6, 3, 9};
        int smallerNumbersThanCurrent[] = {8, 1, 2, 2, 3};

        int pointToBeginShuffle = 3;
        int targetSum = 10;
        int targetSum1 = 8;
        int targetSum2 = 22;
        int targetSum3 = -5;
        int targetSum4 = 7;


        FactoryMethods factoryMethods = new FactoryMethods();

        factoryMethods.printAyoola();


        ArrayManipulationFactory manipulateArray = new ArrayManipulationFactory();

        manipulateArray.runningSum(runningSumArray);
        manipulateArray.shuffle(arrToShuffle, pointToBeginShuffle);
        manipulateArray.sortedSquaredArray(arrayToBeSquared);

        manipulateArray.twoNumberSum(arr, targetSum);
        manipulateArray.twoNumberSum(arr, targetSum1);
        manipulateArray.twoNumberSum(arr, targetSum2);
        manipulateArray.twoNumberSum(arr, targetSum3);
        manipulateArray.twoNumberSum(arr, targetSum4);

        manipulateArray.printArr(bubbleArr);
        manipulateArray.bubbleSort(bubbleArr);
        manipulateArray.printArr(bubbleArr);


        System.out.println(" ------ Checks for if there are any values in the array though iterations-----------");
        manipulateArray.smallerNumbersThanCurrent(smallerNumbersThanCurrent);
        System.out.println("-------------------------------------------------------------------------------------");

        factoryMethods.printEnd();

    }
}
