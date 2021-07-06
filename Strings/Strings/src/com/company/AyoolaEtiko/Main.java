package com.company.AyoolaEtiko;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String inputStr ="1.1.1.1";
        String jewels ="aA";
        String stones ="aAAbbbb";

        ArrayList<String> first = new ArrayList<>();
        first.add("HTML");
        first.add("C#");
        ArrayList<String> second = new ArrayList<>();
        second.add("C#");
        second.add("Python");
        ArrayList<String> third = new ArrayList<>();
        third.add("Python");
        third.add("HTML");
        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);



        FactoryMethods factoryMethods = new FactoryMethods();
        factoryMethods.printAyoola();

        StingsImplementedFuncts implementedFuncts = new StingsImplementedFuncts();

        implementedFuncts.defangIpaddr(inputStr);
        implementedFuncts.numJewelsInStones(jewels, stones);

        ArrayList<ArrayList<String>> competitons = new ArrayList<ArrayList<String>>();
        competitons.add(first);
        competitons.add(second);
        competitons.add(third);

        System.out.println("-----------checks for the tournament winner----------");
        System.out.println("------------with a home team and away team------------");
        System.out.println("------------if result is a 0, away team gets 3 points--------");
        System.out.println("--------if result is a 1, home team gets 3 points----------");
        implementedFuncts.tournamentWinner(competitons, results);

        factoryMethods.printEnd();
    }

}
