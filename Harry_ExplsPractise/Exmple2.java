package with_harry_exmples;

import java.util.Arrays;
import java.util.Scanner;

public class Exmple2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[] arr = null;

        System.out.println("Enter the length of array");
        int length = scn.nextInt();

        arr = new int[length];

        System.out.println("Enter the numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Entered array");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(Arrays.toString(arr));
        }


    }

}
