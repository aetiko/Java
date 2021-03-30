package com.company.AyoolaEtiko;
/*
All questions here are from Leetcode and AlgoExpert
All solved by Ayoola Nurudeen Etiko
 */
public class StringsManipulationFactory {

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
}
