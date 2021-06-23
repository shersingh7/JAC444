/*
Name: Davinder Verma
Section: NBB
Student Number: 121802201
Email: dverma22@myseneca.ca
Date: 22/06/2021
Workshop: 4
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadStudentInfo implements AutoCloseable{

    public static void main(String[] args){

        try {
            ArrayList<Student> student;

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.txt"));
            student = (ArrayList<Student>) ois.readObject();

            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    @Override
    public void close() throws Exception {

    }
}
