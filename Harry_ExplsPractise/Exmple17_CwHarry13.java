package with_harry_exmples;

public class Exmple17_CwHarry13 {
    public static void main(String[] args) {

        // Problem set 14 video problems

        // Exception demo
//        int a = 1000;
//        int b = scn.nextInt();
//        System.out.println("Start the program");
//        try {
//            int c = a / b;
//            System.out.println(c);
//        } catch (Exception e) {
//
//            System.out.println(e);
//        }
//        System.out.println("End the program");


        // Handling specific exception

        //       Scanner scn = new Scanner(System.in);

//        System.out.println("Enter the marks to be inserted in array");
//        int[] marks = new int[3];
//        for (int i = 0; i < 3; i++) {
//            marks[i] = scn.nextInt();
//        }
//
//        System.out.println("Enter the Array index");
//        int index = scn.nextInt();
//
//        System.out.println("Enter the number would you like divide by");
//        int number = scn.nextInt();
//
//        try {
//            System.out.println("The value at array index enterd is"+" "+ marks[index]);
//            System.out.println("The value at array index enterd is"+" "+  marks[index] / number);
//        } catch (ArithmeticException a) {
//
//            System.out.println("Arithmetic exception occurred");
//            System.out.println(a);
//
//        } catch (ArrayIndexOutOfBoundsException b) {
//
//            System.out.println("ArrayIndexOutOfBoundsException exception occurred");
//            System.out.println(b);
//        } catch (Exception e) {
//
//            System.out.println(e);
//        }

        // Nested try

//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the marks to be inserted in array");
//        int[] marks = new int[3];
//        for (int i = 0; i < 3; i++) {
//            marks[i] = scn.nextInt();
//        }
//
//        System.out.println("Enter the Array index");
//        int index = scn.nextInt();
//
//        try {
//            System.out.println("Hello akash");
//
//            try {
//                System.out.println(marks[index]);
//            } catch (ArrayIndexOutOfBoundsException a) {
//                System.out.println("ArrayIndexOutOfBoundsException occurred");
//                System.out.println(a);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }

        // Quick Qiz Q printing array index element if exception occurred ask again


        //        Scanner scn = new Scanner(System.in);
        //        System.out.println("Enter the marks to be inserted in array");
        //        int[] marks = new int[3];
        //        for (int i = 0; i < 3; i++) {
        //            marks[i] = scn.nextInt();
        //        }
        //
        //        boolean flag = true;
        //        while (flag) {
        //            System.out.println("Enter the array index");
        //            int index = scn.nextInt();
        //
        //            try {
        //                System.out.println("hello akash");
        //                try {
        //                    System.out.println(marks[index]);
        //                    flag = false;
        //                } catch (ArrayIndexOutOfBoundsException a) {
        //                    System.out.println("ArrayIndexOutOfBoundsException occurred");
        //                    System.out.println(a);
        //
        //                }
        //            } catch (Exception e) {
        //                System.out.println(e);
        //            }
        //        }


    }
}
