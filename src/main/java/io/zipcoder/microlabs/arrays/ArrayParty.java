package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray){

        String output = "printArray(breakfast)\n*** Output ***";
        String arrayList = "";

        for (int i = 0; i < inputArray.length; i++) {

                arrayList += "\n" + inputArray[i];

        }

        return output + arrayList;
    }

    public String lastElement(String[] inputArray){

        String output = "lastElement(breakfast)\n*** Output ***\n";

        return output + inputArray[inputArray.length - 1];

    }

    //TODO Define the method lastButOne

    //TODO Define the method reverse

    //TODO Define the method isPalindrome

    //TODO Define the method compress

    //TODO Define the method pack



}
