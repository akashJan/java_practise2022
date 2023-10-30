package with_harry_exmples;

import java.util.Scanner;

public class Exmple7_CwHarry4_0 {
    public static void main(String[] args) {

        // # Practise set 4
        // Problem 2

        int maths, phy, bio;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the marks of subjects Maths, Phy, Bio");

        System.out.println("Enter the maths marks");
        maths = scn.nextInt();

        System.out.println("Enter the phy marks");
        phy = scn.nextInt();

        System.out.println("Enter he bio marks");
        bio = scn.nextInt();

        System.out.println("Enter the total marks: Exple 100");
        int total_marks = scn.nextInt();
        if (maths<33|| phy<33||bio<33)

        {
            System.out.println("You are Fail");
        }
        else {
            int per = (maths+phy+bio)/total_marks*100;
            if (per<40){
                System.out.println("You are Fail");
            }
            else {
                System.out.println("You are Pass");
            }
        }



//            int avg = 100 * (maths + phy + bio) / total_marks;
//
//
//        if (avg >= 40 && maths >= 33 && phy >= 33 && bio >= 33) {
//
//            System.out.println("You are pass");
//        } else {
//            System.out.println("Faild");
//        }


    }
}
