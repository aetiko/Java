package com.company.AyoolaEtiko;
//Given an array of integers nums, sort the array in ascending order.
//
//
//
//        Example 1:
//
//        Input: nums = [5,2,3,1]
//        Output: [1,2,3,5]
//        Example 2:
//
//        Input: nums = [5,1,1,2,0,0]
//        Output: [0,0,1,1,2,5]
//
//
//        Constraints:
//
//        1 <= nums.length <= 50000
//        -50000 <= nums[i] <= 50000
public class Main {

        public static void main(String[] args) {
            // write your code here
            int bubbleArr[] = {5, 2, 8, 5, 6, 3, 9};
            printArr(bubbleArr);
            System.out.print("\n");
            bubbleSort(bubbleArr);
            printArr(bubbleArr);
        }
//        runs in constant time runs in place O(1)
//        time complexity O(n^2)
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
        public static void swap(int x, int y, int[] array){
            int temp;
            temp = array[y];
            array[y] = array[x];
            array[x] = temp;
        }

        public static void printArr(int[] array) {
            for (int num : array) {
                System.out.print("" + num + ",");

            }
        }
}
