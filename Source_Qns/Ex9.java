package W3_Source_Qns;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {


        // Q 30

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter th array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        if (test(arr))
            System.out.println("0 & -1 not found");
        else
            System.out.println("0 & -1 found");


    }

    public static boolean test(int[] numbers) {
        for (int number : numbers) {
            if (number == 0 || number == -1)
                return false;
        }
        return true;
    }
}
