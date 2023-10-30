package method;

public class Pr_Methods_Exple2 {

//       static void pattern(int n){
//              for(int i=0;i<n;i++){
//                 for(int j=0 ;j<i+1;j++){
//                        System.out.print("*");
//                 }
//                     System.out.println("");
//              }
//
//       }

    static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

//   static int fib(int n) {

//         if (n==1){
//             return 0;
//         }
//         else if(n==2){
//             return 1;
//         } else {
//             return fib(n-1)+fib (n-2);
//         }

    // also, we can write
//        if (n == 1 || n == 2) {
//            return n - 1;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
//    }


//    static int sum(int... arr) {
//
//        int result = 0;
//        for (int a : arr) {
//            result += a;
//        }
//        return result;
//    }

    static String logic(String x, String y) {
        return x.concat(y);
    }

    public static void main(String[] args) {

//          pattern(9);
        pattern1(4);

//          int result = fib(5);
//          System.out.println(result);

//        System.out.println("Var argument example");
//        System.out.println(sum(4,5));

        String a = "Akash";
        String b = "Jan";
        String c;
        c = logic(a, b);
        System.out.println(c);

    }

}
