/*
Name: Davinder Verma
Section: NBB
Student Number: 121802201
Email: dverma22@myseneca.ca
Date: 30/07/2021
Workshop: 9
*/

public class Main {
    public static void main(String[] args) {

        double[] balance = {1,2,3};
        String[] currency = {"Dollar(s)", "Euro(s)", "Pound(s)"};

        Shared account = new Shared(0,"");

        Deposit deposit = new Deposit(account, balance, currency);
        Withdrawal withdrawal = new Withdrawal(account, balance);

        deposit.start();
        withdrawal.start();
    }
}
