package loopsAndArrays;

import java.util.Scanner;

public class Array_Exple {

    public static void main(String[] args) {

//     # Problem number 1 Adding the array elements

//        float[] marks1 = {10.5f, 11.5f, 12.5f, 13.5f, 14.5f};

//        float sum = 0;
//
//        for (float element : marks1){
//
//            sum = sum + element;
//        }
//        System.out.println(sum);

//     # Problem Number 2 Checks number is present in array or not

        float[] marks2 = {15.5f, 16.5f, 17.5f, 17.5f, 18.5f};
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);

        float num = scn.nextFloat();

        //   float num = 14.5f;
        boolean InArray = false;
        for (float element : marks2) {
            if (num == element) {
                InArray = true;
                break;

            }

        }
        if (InArray) {
            System.out.println("Its in array");

        } else {

            System.out.println("Its not in array");
        }


    }
}
