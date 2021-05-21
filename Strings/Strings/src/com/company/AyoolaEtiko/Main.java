package com.company.AyoolaEtiko;

public class Main {

    public static void main(String[] args) {
        String inputStr ="1.1.1.1";
        String jewels ="aA";
        String stones ="aAAbbbb";

        FactoryMethods factoryMethods = new FactoryMethods();
        factoryMethods.printAyoola();

        StingsImplementedFuncts implementedFuncts = new StingsImplementedFuncts();

        implementedFuncts.defangIpaddr(inputStr);
        implementedFuncts.numJewelsInStones(jewels, stones);

        factoryMethods.printEnd();
    }

}
