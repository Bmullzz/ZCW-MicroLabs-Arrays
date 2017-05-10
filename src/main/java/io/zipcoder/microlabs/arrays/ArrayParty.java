package io.zipcoder.microlabs.arrays;
import java.util.Arrays;

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

    public String isPalindrome(String[] inputArray) {

        String output = "isPalindrome(breakfast)\n*** Output ***";
        String reversed = "";
        String forward = Arrays.toString(inputArray);
        forward = forward.replaceAll("[^A-Za-z]", "");
        String palindrome = "";

        for (int i = inputArray.length - 1; i >= 0; i--){

            reversed += inputArray[i];
        }

        if (reversed.equals(forward)) {

            palindrome += "\n" + "True";
        }
        else{

            palindrome += "\n" + "False";
        }

        System.out.println(reversed);
        System.out.println(forward);

        return output + palindrome;
    }


    //TODO Define the method compress


    //TODO Define the method pack

    public static void main(String[] args) {

        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty party = new ArrayParty();
        System.out.print(party.isPalindrome(breakfast));
    }



}
