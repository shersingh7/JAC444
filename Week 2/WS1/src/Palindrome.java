/*
Name: Davinder Verma
Section: NBB
Student Number: 121802201
Email: dverma22@myseneca.ca
Date: 30/05/2021
Workshop: 1
*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //Taking input
        String str;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter anything: ");
        str = input.nextLine();
        input.close();

        if(str.length() > 0) {
            str = str.toLowerCase();

            //Creating new stack
            Stack inputStack = new Stack(str.length());

            //Adding elements to the stack
            for (int i = 0; i < str.length(); i++) {
                inputStack.push(str.charAt(i));
            }


            //Reversing the string
            String strReverse = "";
            while (!inputStack.checkEmpty()) strReverse += inputStack.pop();

            //Comparing the reversed string and the input string
            if (strReverse.equals(str)) System.out.println("Input is a palindrome.");
            else System.out.println("Input is not a palindrome.");
        }
    }
}
