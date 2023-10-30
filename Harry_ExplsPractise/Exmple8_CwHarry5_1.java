package with_harry_exmples;

public class Exmple8_CwHarry5_1 {


    public static void main(String[] args) {

        // Problem set 5

        //  Q2  Multiplication of n using + sum using while loop
//        int n = 8;
//        int i = 1;
//        int sum= 0;
//        while (i<= 10) {
//            System.out.println(n*i);
//            sum += n*i++;
//
//        }
//        System.out.println(sum);



        // Q4  Multiplication of n reverse using for loop

//        int a = 2;
//        for(int i = 10; i>=1;i-- ){
//            System.out.print(a*i);
//        }

        // Q5 n factorial using for loop
//        int n = 4;
//        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//
//            fact *= i;
//            System.out.println(fact);
//    }

        // Q9

        int n = 8;
        int sum  = 0;
        for(int i = 1; i<=8 ; i++){

            sum += n*i++;

        }
        System.out.println(sum);


    }
}
