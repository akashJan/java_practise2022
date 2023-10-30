package with_harry_exmples;

import java.util.Scanner;

public class Exmple19_CwHarry13_2 {

    public static void main(String[] args) {

        // Problem set 14

        // Problem 1
        // Syntax Error - int a = 7
        int age = 78;
        int year_born = 2000-78; // Logical error
//        System.out.println(6/0);

        // Problem 2
        try{
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }

        // Q3

        Scanner scn = new Scanner(System.in);
        int[] arrray = new int[3];
        System.out.println("Enter the array index element");
        for (int i = 0; i < 3; i++) {
            arrray[i] = scn.nextInt();
        }

        boolean flag = true;
        int s = 0;
        while (flag && s <= 5) {
            try {
                System.out.println("Enter the array index");
                int index = scn.nextInt();
                System.out.println("The value of index array[index] is" + arrray[index]);
            } catch (Exception e) {
                System.out.println(e);
                s++;
            }
        }
        if(s>=5){
            System.out.println("Error");
        }

    }

}
