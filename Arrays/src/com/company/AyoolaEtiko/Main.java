package com.company.AyoolaEtiko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int sumArr[] = {3,2,3};
        twoSum(sumArr, 6);
        int [] arr = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int targetSum1 = 8;
        int targetSum2 = 22;
        int targetSum3 = -5;
        int targetSum4 = 7;

        twoNumberSum(arr, targetSum);
        twoNumberSum(arr, targetSum1);
        twoNumberSum(arr, targetSum2);
        twoNumberSum(arr, targetSum3);
        twoNumberSum(arr, targetSum4);

        List<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(1);
        arrList.add(22);
        arrList.add(25);
        arrList.add(6);
        arrList.add(-1);
        arrList.add(8);
        arrList.add(10);
        System.out.println("ArrayList:" + arrList);
        List<Integer> seqList = new ArrayList<Integer>();
        seqList.add(5);
        seqList.add(1);
        seqList.add(22);
        seqList.add(10);
        System.out.println("ArrayList:" + seqList);
        isValidSubsequence(arrList, seqList);
        isValidSubsequence1(arrList, seqList);

        int n = 8;
        int n1 = 7;
        int n2 = 4;
        integerReplacement(n);
        integerReplacement(n1);
        integerReplacement(n2);
        integerReplacement(1234);

        int extraCandiesOne = 3;
        int extraCandiesTwo = 1;
        int extraCandiesThree = 10;

        int candyArrayOne[] = {2,3,5,1,3};
        int candyArrayTwo[] = {4,2,1,1,2};
        int candyArrayThree[] = {12,1,12};

        kidsWithCandies(candyArrayOne, extraCandiesOne);
        kidsWithCandies(candyArrayTwo, extraCandiesTwo);
        kidsWithCandies(candyArrayThree, extraCandiesThree);
        int nums[] = {1,2,3};
        int nums2[] = {1,0,0,8,6};
        int nums3[] = {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143};
//        first solution does not work with case 2
//        we then implement the a 2.0 verion which uses the median math rule instead of the mean
//        neither does it work for case 3
        System.out.println("Case 1");
        minMoves2(nums);
        minMoves2(nums2);
        minMoves2(nums3);

        int nums4[] = {1,2,3};
        int nums5[] = {1,0,0,8,6};
        int nums6[] = {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143};

        System.out.println("Case 2");
        //2.0 verion which works for both
        minMoves20(nums4);
        minMoves20(nums5);
        minMoves20(nums6);

        int[] input = {1,2,3};
        int[] input1 = {1,1,1};
        int[] input2 = {1,2147483647};
        int[] input3 = {2};
        minMoves(input);//3
        minMoves(input1);//1
        minMoves(input2);//2147483646
        minMoves(input3);//1

        int positionArrOne[] = {1,2,3};
        int positionArrTwo[] = {2,2,2,3,3};
        int positionArrThree[] = {1,1000000000};

        minCostToMoveChips(positionArrOne);
        minCostToMoveChips(positionArrTwo);
        minCostToMoveChips(positionArrThree);



    }
    /*
     * Two number sum
     * Writing a function which takes an array of distinct integers and a integer representing an integer sum.
     * The function should return the two numbers in an array.
     * else an empty array.
     * NOTE
     * Most be 2 different integers in the array
     * */

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

    //Time O(n^2) space: O(1)
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrPtr = 0;
        int seqPtr = 0;
        int j, i;
        if(sequence.size() <= array.size()){
            for (i=0; i< sequence.size(); i++){
                for (j=0; j< array.size(); j++){
                    seqPtr = i;
                    arrPtr = j;
                    if (sequence.get(seqPtr).equals(array.get(arrPtr))){
                        i = seqPtr + 1;
                        if (i == sequence.size()){
                            System.out.println("subseq");
                            return true;
                        }
                    }
                }
                if (!sequence.get(seqPtr).equals(array.get(arrPtr)) || !array.contains(sequence.get(seqPtr))){
                    return false;
                }
            }
        }
        System.out.println("not in seq");
        return false;
    }
    //Time O(n) space: O(1)
    public static boolean isValidSubsequence1(List<Integer> array, List<Integer> sequence) {
        int arrPtr=0;
        int segPtr=0;
        while (segPtr < sequence.size() && arrPtr < array.size()){
            if(array.get(arrPtr).equals(sequence.get(segPtr))){
                segPtr++;
            }
            arrPtr++;
        }
        System.out.println("in seq");
        return segPtr == sequence.size();
    }

    public static int integerReplacement(int n) {
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
    public static int numIdenticalPairs(int[] nums) {
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
//Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
//
//        For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
//
//
//
//        Example 1:
//
//        Input: candies = [2,3,5,1,3], extraCandies = 3
//        Output: [true,true,true,false,true]
//        Explanation:
//        Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids.
//        Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
//        Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
//        Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
//        Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
//
//        Example 2:
//
//        Input: candies = [4,2,1,1,2], extraCandies = 1
//        Output: [true,false,false,false,false]
//        Explanation: There is only 1 extra candy, therefore only kid 1 will have the greatest number of candies among the kids regardless of who takes the extra candy.
//
//        Example 3:
//
//        Input: candies = [12,1,12], extraCandies = 10
//        Output: [true,false,true]
//
//
//
//        Constraints:
//
//        2 <= candies.length <= 100
//        1 <= candies[i] <= 100
//        1 <= extraCandies <= 50

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> candieList = new ArrayList<>();
        int max = 0;
        int i;
        int j;
        for (i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for (j = 0; j < candies.length; j++){
            if(candies[j] + extraCandies >= max){
                candieList.add(true);
            }else if(candies[j] + extraCandies < max){
                candieList.add(false);
            }
        }
        System.out.println("candieList: " + candieList);
        return candieList;
    }


    //Given a non-empty integer array, find the minimum number of moves required to make all array elements equal, where a move is incrementing a selected element by 1 or decrementing a selected element by 1.
//
//        You may assume the array's length is at most 10,000.
//
//        Example:
//
//        Input:
//        [1,2,3]
//
//        Output:
//        2
//
//        Explanation:
//        Only two moves are needed (remember each move increments or decrements one element):
//
//        [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
    public static int minMoves20(int[] nums) {
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
    //Given a positive integer n, you can apply one of the following operations:
//
//        If n is even, replace n with n / 2.
//        If n is odd, replace n with either n + 1 or n - 1.
//
//        Return the minimum number of operations needed for n to become 1.
//
//
//
//        Example 1:
//
//        Input: n = 8
//        Output: 3
//        Explanation: 8 -> 4 -> 2 -> 1
//
//        Example 2:
//
//        Input: n = 7
//        Output: 4
//        Explanation: 7 -> 8 -> 4 -> 2 -> 1
//        or 7 -> 6 -> 3 -> 2 -> 1
//
//        Example 3:
//
//        Input: n = 4
//        Output: 2
    public static int minMoves2(int[] nums){
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
    //Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.
//
//        Example:
//
//        Input:
//        [1,2,3]
//
//        Output:
//        3
//
//        Explanation:
//        Only three moves are needed (remember each move increments two elements):
//
//        [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
    public static int minMoves(int[] nums){
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
    //We have n chips, where the position of the ith chip is position[i].
//
//        We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:
//
//        position[i] + 2 or position[i] - 2 with cost = 0.
//        position[i] + 1 or position[i] - 1 with cost = 1.
//
//        Return the minimum cost needed to move all the chips to the same position.
//
//
//
//        Example 1:
//
//        Input: position = [1,2,3]
//        Output: 1
//        Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
//        Second step: Move the chip at position 2 to position 1 with cost = 1.
//        Total cost is 1.
//
//        Example 2:
//
//        Input: position = [2,2,2,3,3]
//        Output: 2
//        Explanation: We can move the two chips at position  3 to position 2. Each move has cost = 1. The total cost = 2.
//
//        Example 3:
//
//        Input: position = [1,1000000000]
//        Output: 1
    public static int minCostToMoveChips(int[] position){
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
    //Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
//
//        The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
//
//        You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//        Example 1:
//
//        Input: [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
//
//        Example 2:
//
//        Input: [4,3,2,1]
//        Output: [4,3,2,2]
//        Explanation: The array represents the integer 4321.
//    public static void main(String[] args) {
//        int increment =2;
//        int newArray[] = new int[0];
//        int arr[] = {9};
//
//        for (int i = 0; i < arr.length; i++){
//            if (i == arr.length-1 && arr[i] != 9){
//                arr[i]++;
//            }
//            for (int j = 0; j < arr.length; j++) {
//                newArray = Arrays.copyOf(arr, j + increment);
//                if(newArray[j] == 9){
//                    newArray[j] = 1;
//                    newArray[j+1] = 0;
//                }
//            }
//        }
//        for (int i = 0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int [] newArr = new int[2];
        boolean isASum = false;
        int counter = 0;
        sum = nums[counter];
        while (!isASum){
            for (int i = 0; i < nums.length-1-counter; i++){
                if (sum + nums[i+1] == target){
                    newArr[0] = counter;
                    newArr[1] = i+1;
                    isASum = true;
                }
            }
            counter++;
        }

        return newArr;
    }
}
