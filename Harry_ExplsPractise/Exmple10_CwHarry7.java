package with_harry_exmples;

public class Exmple10_CwHarry7 {

    // practice set 7

//    // Q1
//    static void multiplication(int n) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.format("%d X %d = %d\n", n, i, n * i);
//        }
//    }
//
//    // Q2
//
//    static void pattern(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    // Q3

//    static int sumRec(int n) {
//        // Base condition
//        if (n == 1) {
//            return 1;
//        }
//        return n + sumRec(n - 1);
//    }

    // Q4
//    static void pattern1(int n) {
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    // Q5
//    static int fib(int n) {
//
//        if (n == 1 || n == 2) {
//            return n - 1;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
//    }

    // Remaining
    //Q6
    //Q7
    //Q8

    //Q9

    static void conversion(int c) {

        double Celsius = c;

        Celsius =  (c * 1.8) + 32;

        System.out.println(Celsius);


    }

    //Q10
    //Q11


    public static void main(String[] args) {

// Q numbers

//        multiplication(18); // 1

//        pattern(5); //2


//        int c = sumRec(4); // 3
//        System.out.println(c);

//      pattern1(6);  //4

//        // Q5   fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//        int result = fib(7);
//        System.out.println(result);

// Q9
        conversion(12);


    }
}