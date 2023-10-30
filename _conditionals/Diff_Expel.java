package _conditinals;

import java.util.Scanner;

public class Diff_Expel {

    public static void main(String[] args) {

       int num,digit,sum = 0;

        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the  number");
         num = scan.nextInt();

        while(num>0){

            digit = num % 10;   //adds last digit to the variable sum

            sum = sum + digit;  //removes the last digit from the number

            num = num / 10;
        }
             System.out.println("Sum of Digits"+ sum);
             
            

    }
}
