package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray) {

        String output = "printArray(breakfast)\n*** Output ***";
        String arrayList = "";

        for (int i = 0; i < inputArray.length; i++) {

                arrayList += "\n" + inputArray[i];

        }

        return output + arrayList;
    }

    public String lastElement(String[] inputArray) {

        String output = "lastElement(breakfast)\n*** Output ***\n";

        return output + inputArray[inputArray.length - 1];

    }

    public String lastButOne(String[] inputArray) {

        String output = "lastButOne(breakfast)\n*** Output ***\n";

        return output + inputArray[inputArray.length - 2];


    }
    
    public String reverse(String[] inputArray) {

        String output = "reverse(breakfast)\n*** Output ***";
        String reversed = "";

        for (int i = inputArray.length - 1; i >= 0; i--){

            reversed += "\n" + inputArray[i];

        }
        return output + reversed;
    }

    //TODO Define the method isPalindrome


    //TODO Define the method compress

    //TODO Define the method pack



}
