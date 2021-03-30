package com.company.AyoolaEtiko;
/*
All questions here are from Leetcode and AlgoExpert
All solved by Ayoola Nurudeen Etiko
 */
import java.util.ArrayList;
import java.util.List;

public class ListFactory {
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
}
