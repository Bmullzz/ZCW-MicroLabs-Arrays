package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "printArray(breakfast)\n*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "lastElement(breakfast)\n*** Output ***\nMushrooms";

        //: When
        String actual = arrayParty.lastElement(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastButOne(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "lastButOne(breakfast)\n*** Output ***\nTomatoes";

        //: When
        String actual = arrayParty.lastButOne(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void reverseTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "reverse(breakfast)\n" +
                "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";

        //: When
        String actual = arrayParty.reverse(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindromeTest(){
        //: Given
        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "isPalindrome(breakfast)\n" +
                "*** Output ***\n" +
                "True";

        //: When
        String actual = arrayParty.isPalindrome(palindromic);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void isPalindromeTestTwo(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "isPalindrome(breakfast)\n" +
                "*** Output ***\n" +
                "False";

        //: When
        String actual = arrayParty.isPalindrome(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }
    //TODO Define the method compressTest

    //TODO Define the method packTest


}
