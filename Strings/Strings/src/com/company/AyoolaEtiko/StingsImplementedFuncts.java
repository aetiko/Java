package com.company.AyoolaEtiko;

import java.util.ArrayList;

public class StingsImplementedFuncts {

    public  String defangIpaddr(String address) {
        String newSring = "";
        int counter = 0;
        char characterArr[] = address.toCharArray();
        while (counter <= address.length() - 1) {
            if (characterArr[counter] == '.'){
                newSring += "[.]";
            }else {
                newSring += characterArr[counter];
            }
            counter++;
        }
        System.out.println("New String: "+ newSring);
        return newSring;
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

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String test = "";
        int score = 0;
        ArrayList<ArrayList<Object>> scores = new ArrayList<>();
            for (int i = 0; i < competitions.size(); i++){
                for (int j = 0; j < competitions.get(i).size(); j++){
                    if(results.get(i) == 0){
                        test += competitions.get(j).get(1);
                        score += 3;
//                        scores.add();
                    }else {
                        test += competitions.get(j).get(0);
                        score += 3;
                    }
                }
            }
        return "";
    }
}
