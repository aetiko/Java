package com.company.AyoolaEtiko;

public class FactoryMethods {

    public static void printAyoola(){
        System.out.println(" All coding questions gotten from AlgoExpert and Leetcode");
        System.out.println("---------------------------------------------------------");
        System.out.println("--------All code written by Ayoola Nurudeen Etiko--------");
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
        System.out.println(
                "\n"
        );
    }


}
