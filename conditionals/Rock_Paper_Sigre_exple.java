package _conditinals;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Sigre_exple {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the choice Press: 1.Rock , 2.Paper , 3.Scissor  ");
        int uin = scn.nextInt();

        Random random = new Random();
        int cin = random.nextInt(3);

        if (uin == cin) {

            System.out.println("Draw");

        } else if (uin == 1 && cin == 3 || uin == 2 && cin == 1 || uin == 3 && cin == 2) {

            System.out.println("You win");

        } else {
            System.out.println("Computer win");
        }

        if (cin==1){
            System.out.println("Computer choice is : Rock");
        }
        else if (cin==2){
            System.out.println("Computer choice is : Paper");
        }

        else if (cin==3){
            System.out.println("Computer choice is : Scisor");
        }

    }


}



