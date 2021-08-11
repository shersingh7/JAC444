/*
Name: Davinder Verma
Section: NBB
Student Number: 121802201
Email: dverma22@myseneca.ca
Date: 10/08/2021
Workshop: 10
*/

import java.rmi.Remote;

public interface CarInterface extends Remote {
    String plate(Car car) throws java.rmi.RemoteException;
}
