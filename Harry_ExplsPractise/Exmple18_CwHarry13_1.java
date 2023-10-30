package with_harry_exmples;

// Problem Set 14 video problems

import java.util.Scanner;

class MyException extends Exception {

    public String toString() {

        return "I am toSting()";

    }

    public String getMessage() {

        return "I am Get Message";
    }

}

class MyAgeException extends Exception {

    public String toString() {
        return "Age cannot be greater than 125";
    }

    public String getMessage() {

        return "Make sure that the value of age entered is correct";
    }
}


public class Exmple18_CwHarry13_1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no");
        int a = scn.nextInt();

        if (a < 100) {
            try {
                // throw new MyException();
                throw new ArithmeticException("This is an exception");
            } catch (Exception e) {

                System.out.println(e);
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Finished");
            }

            System.out.println("Yes Finished");
        }



    }
}
