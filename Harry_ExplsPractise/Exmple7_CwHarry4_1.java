package with_harry_exmples;

import java.util.Scanner;

public class Exmple7_CwHarry4_1 {

    public static void main(String[] args) {

        // # Practise set 4
        // Problem 4

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 1: monday 2:Tuesday..7:Sunday");

        int in = scn.nextInt();

        switch (in) {

            case 1:
                System.out.println("It is Monday");
                break;

            case 2:
                System.out.println("It is Tuesday");
                break;

            case 3:
                System.out.println("It is Wednesday");
                break;

            case 4:
                System.out.println("It is Thursday");
                break;

            case 5:
                System.out.println("It is Friday");
                break;

            case 6:
                System.out.println("It is Saturday");
                break;

            case 7:
                System.out.println("It is Sunday");
                break;

            default:
                System.out.println("Invalid Input or Bigger than 7 th no ");
        }


    }
}
