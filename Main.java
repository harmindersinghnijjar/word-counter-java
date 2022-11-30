/*

   Programmer: Harminder Singh Nijjar

   Assignment Chapter: Chapter 8

   Purpose: The purpose of this code is to create a method that can be used to count the number of words
   in a given string. It also demonstrates how to use the method in a program which asks the user to input
   a string and then passes it to the method, displaying the number of words in the string on the screen.

   Date modified: 11/29/2022

   IDE/Tool used: IntelliJ IDEA

   */

//Main method


import java.util.Scanner;

public class Main {
    public static int countWords(String str) {

        int count = 0;

        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
            count++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scanner.nextLine();
        int wordCount = countWords(str);
        System.out.println("The number of words in the string is: " + wordCount);
    }
}
