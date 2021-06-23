/*
Name: Davinder Verma
Section: NBB
Student Number: 121802201
Email: dverma22@myseneca.ca
Date: 22/06/2021
Workshop: 4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EnterStudentInfo {

    public static void main(String[] args){

        ArrayList<Student> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean addAnother;
        String fName,lName;
        Integer sID;


        do{
            addAnother = false;

            Student student =  new Student();

            System.out.print("Enter First Name: ");
            fName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            lName = sc.nextLine();

            System.out.print("Enter Student ID: ");
            sID = Integer.parseInt(sc.nextLine());

            String tempCourses;

            do{
                System.out.print("Enter the courses (0 to stop): ");
                tempCourses = sc.nextLine();

                if(tempCourses.equals("0")) break;

                student.setCourses(tempCourses);

            }while(!tempCourses.equals("0"));

            student.setFirstName(fName);
            student.setLastName(lName);
            student.setStdID(sID);

            arrayList.add(student);

            System.out.print("Add another student Y/N: ");
            String yn = sc.nextLine();

            if(yn.equals("Y") || yn.equals("y")) addAnother = true;


        }while (addAnother);

        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("Student.txt"))){
            objOut.writeObject(arrayList);
            objOut.flush();
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

}
