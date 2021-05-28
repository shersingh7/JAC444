import java.sql.SQLOutput;
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
            Stack inputStack = new Stack(str.length());

            for (int i = 0; i < str.length(); i++) {
                inputStack.push(str.charAt(i));
            }

            String strReverse = "";
            while (!inputStack.checkEmpty()) strReverse += inputStack.pop();


            if (strReverse.equals(str)) System.out.println("Input is a palindrome.");
            else System.out.println("Input is not a plaindrome.");
        }
    }
}
