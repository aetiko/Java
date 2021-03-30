package com.company.AyoolaEtiko;

public class Main {

    public static void main(String[] args) {
        String inputStr ="1.1.1.1";


        StringsManipulationFactory manipulateStrings = new StringsManipulationFactory();
        manipulateStrings.defangIpaddr(inputStr);

    }

}
