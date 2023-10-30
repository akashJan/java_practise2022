package _conditinals;


import java.util.Scanner;


public class OddEven {
    public static void main(String[] args) {


//        System.out.print("Even numbers : ");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println("even : " + i);
//            } else {
//                System.out.println("odd : " + i);
//            }
//        }

//        System.out.println();
//        System.out.print("Odd numbers : ");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }

        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(s);

        stringBuffer.reverse();
        String reverseOfS = stringBuffer.toString();


        if (s.equals(reverseOfS)) {

            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }

        scanner.close();
    }
}






