package com.company.AyoolaEtiko;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int big = 1;
        int medium = 1;
        int small = 1;
        BooleanFactory manipulateBoolean = new BooleanFactory();
        ParkingSystem manipulateParkingSystem = new ParkingSystem(big, medium, small);
        List<Integer> arrList = new ArrayList<>();
        List<Integer> seqList = new ArrayList<Integer>();

        arrList.add(5);
        arrList.add(1);
        arrList.add(22);
        arrList.add(25);
        arrList.add(6);
        arrList.add(-1);
        arrList.add(8);
        arrList.add(10);
        seqList.add(5);
        seqList.add(1);
        seqList.add(22);
        seqList.add(10);
        System.out.println("ArrayList:" + arrList);
        System.out.println("ArrayList:" + seqList);

        manipulateBoolean.isValidSubsequence(arrList, seqList);
        manipulateBoolean.isValidSubsequence1(arrList, seqList);
        manipulateParkingSystem.addCar(1);
        manipulateParkingSystem.addCar(2);
        manipulateParkingSystem.addCar(3);
        manipulateParkingSystem.addCar(4);
        manipulateParkingSystem.addCar(1);

    }
}
