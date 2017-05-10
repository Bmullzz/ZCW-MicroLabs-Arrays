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
        String forward = Arrays.toString(inputArray); //converts array to string
        forward = forward.replaceAll("[^A-Za-z]", ""); //removes punctuation and spaces from string
        String palindrome = "";

        for (int i = inputArray.length - 1; i >= 0; i--){ //creates reverse string

            reversed += inputArray[i];
        }

        if (reversed.equals(forward)) { //checks if two strings are equal

            palindrome += "\n" + "True";
        }
        else{

            palindrome += "\n" + "False";
        }

        return output + palindrome;
    }

    //TODO Define the method compress
    public String compress(int[] nums){
        String output = "compress(nums)\n*** Output ***\n";
        String compArray = Integer.toString(nums[0]);

        for (int i = 0; i < nums.length-1; i++){

            if (nums[i] != nums[i+1]){

                compArray += "\n" + nums[i+1];
            }


        }

        return output + compArray;
    }


    //TODO Define the method pack

    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3, 3, 2, 2, 2, 1, 1, 1, 1, 4, 4, 4, 4};
        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty party = new ArrayParty();
        System.out.print(party.compress(nums));
    }



}
