package main;

import shapes.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        System.out.println("------->JAC 444 Assignment 1<-------\n" +
                "------->Task 1 ... <-------");

        Shape[] shapes = new Shape[32];
        int size = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("Shapes.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] tokens = s.split(",");

                String name = tokens[0];

                //Circle
                if (name.equals("Circle") && tokens.length == 2) {
                    try {
                        shapes[size] = new Circle(Double.parseDouble(tokens[1]));
                        size++;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                //Triangle
                if (name.equals("Triangle") && tokens.length == 4) {
                    try {
                        shapes[size] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
                        size++;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                //Square
                if (name.equals("Square") && tokens.length == 2) {
                    try {
                        shapes[size] = new Square(Double.parseDouble(tokens[1]));
                        size++;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                //Rectangle
                if (name.equals("Rectangle") && tokens.length == 3) {
                    try {
                        shapes[size] = new Rectangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                        size++;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n" + shapes.length + " shapes were created:");

        for (int i = 0; i < shapes.length; i++)
        {
            if (shapes[i] != null)
            {
                System.out.println(shapes[i]); //implicitly calls toString() method
            }

        }

    }
}
