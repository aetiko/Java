package com.company.AyoolaEtiko;

public class Main {

    public static void main(String[] args) {
        String jewels ="aA";
        String stones ="aAAbbbb";
        int accounts[][] = {{2,8,7}, {7,1,3}, {1,9,5}};
        int factory[] = {2,3,4,2, 4};
        int nums[] = {1,2,3};
        int nums2[] = {1,0,0,8,6};
        int nums3[] = {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143};
        int nums4[] = {1,2,3};
        int nums5[] = {1,0,0,8,6};
        int nums6[] = {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143};
        int[] input = {1,2,3};
        int[] input1 = {1,1,1};
        int[] input2 = {1,2147483647};
        int[] input3 = {2};
        int positionArrOne[] = {1,2,3};
        int positionArrTwo[] = {2,2,2,3,3};
        int positionArrThree[] = {1,1000000000};

        int x = 321;
        int digit = 8;


        IntegerManipulationFactory manipulateInteger = new IntegerManipulationFactory();

        manipulateInteger.reverse(x);
        manipulateInteger.maximumWealth(accounts);
        manipulateInteger.numJewelsInStones(jewels, stones);
        manipulateInteger.numIdenticalPairs(factory);
        manipulateInteger.integerReplacement(digit);
        manipulateInteger.minMoves2(nums);
        manipulateInteger.minMoves2(nums2);
        manipulateInteger.minMoves2(nums3);
        manipulateInteger.minMoves20(nums4);
        manipulateInteger.minMoves20(nums5);
        manipulateInteger.minMoves20(nums6);
        manipulateInteger.minMoves(input);
        manipulateInteger.minMoves(input1);
        manipulateInteger.minMoves(input2);
        manipulateInteger.minMoves(input3);
        manipulateInteger.minCostToMoveChips(positionArrOne);
        manipulateInteger.minCostToMoveChips(positionArrTwo);
        manipulateInteger.minCostToMoveChips(positionArrThree);

    }

}
