/*
Name: Davinder Verma
Section: NBB
Student Number: 121802201
Email: dverma22@myseneca.ca
Date: 30/07/2021
Workshop: 9
*/

public class Deposit extends Thread{

    private Shared account;
    private double[] balance;
    private String[] currency;

    public Deposit(Shared deposit, double[] b, String[] c){
        super("Depositing Money:");
        account = deposit;
        balance = b;
        currency = c;
    }

    @Override
    public void run() {

        for(int i=0; i < balance.length; i++){

            try{
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (account){
                account.Deposit(balance[i], currency[i]);
            }

        }
    }
}
