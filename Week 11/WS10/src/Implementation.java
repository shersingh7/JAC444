/*
Name: Davinder Verma
Section: NBB
Student Number: 121802201
Email: dverma22@myseneca.ca
Date: 10/08/2021
Workshop: 10
*/


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implementation extends UnicastRemoteObject implements CarInterface {
    protected Implementation() throws RemoteException {
    }

    @Override
    public String plate(Car car) throws RemoteException {
        return "" + car.hashCode(); //Random number
    }
}
