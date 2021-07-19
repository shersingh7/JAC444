/*
Name: Davinder Verma
Section: NBB
Student Number: 121802201
Email: dverma22@myseneca.ca
Date: 16/07/2021
Workshop: 7
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentProcess {

    private static Student[] students = {
            new Student("Jack", "Smith", 50.0, "IT"),
            new Student("Aaron", "Johnson", 76.0, "IT"),
            new Student("Maaria", "White", 35.8, "Business"),
            new Student("John", "White", 47.0, "Media"),
            new Student("Laney", "White", 62.0, "IT"),
            new Student("Jack", "Jones", 32.9, "Business"),
            new Student("Wesley", "Jones", 42.89, "Media")};

    public static void main(String[] args) {

        //TASK-1
        List<Student> list = Arrays.asList(students);
        System.out.println("Task 1:\n\n" + "Complete Student list:" );
        list.forEach(System.out::println);

        //TASK-2
        System.out.println("\nTask 2:\n\nStudents who got 50.0-100.0 sorted by grade:");
        list.stream().filter(std-> std.getGrade() >= 50 && std.getGrade() <= 100)
                .sorted(Comparator.comparing(Student::getGrade))
                .forEach(System.out::println);

        //TASK-3
        System.out.println("\nTask 3:\n\nFirst Student who got 50.0-100.0:");
        list.stream().filter(student->student.getGrade() >= 50 && student.getGrade() <= 100).findFirst().ifPresent(System.out::println);

        //TASK-4
        System.out.println("\nTask 4:\n\nStudents in ascending order by last name then first:");
        list.stream().sorted(Comparator.comparing(Student::getFirstName))
                .sorted(Comparator.comparing(Student::getLastName))
                .forEach(System.out::println);

        System.out.println("\nStudents in descending order by last name then first:");
        list.stream().sorted(Comparator.comparing(Student::getFirstName).reversed())
                .sorted(Comparator.comparing(Student::getLastName).reversed())
                .forEach(System.out::println);

        //TASK-5
        System.out.println("\nTask 5:\n\nUnique Student last names:");
        list.stream().map(Student::getLastName).distinct().sorted().forEach(System.out::println);
    }
}
