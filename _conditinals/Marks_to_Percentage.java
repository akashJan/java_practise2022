package _conditinals;

import java.util.Scanner;

public class Marks_to_Percentage {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Percentage Calculation");

        System.out.println("Enter the marks" + "\t" + "Sub1" + "\t" + "Sub2" + "\t" + "Sub3");
        int marks1 = scn.nextInt();
        int marks2 = scn.nextInt();
        int marks3 = scn.nextInt();

        int sum = marks1 + marks2 + marks3;
        System.out.println("Total the Marks");
        int totalmarks = scn.nextInt();

        float percentage;
        percentage = 100 * sum / totalmarks;
        System.out.println("Total Percentage : " + percentage + "%");






    }

 }
