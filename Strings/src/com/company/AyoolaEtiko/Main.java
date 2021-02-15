package com.company.AyoolaEtiko;

public class Main {

    public static void main(String[] args) {
        String inputStr ="1.1.1.1";
        defangIpaddr(inputStr);
    }
    public static String defangIpaddr(String address) {
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
