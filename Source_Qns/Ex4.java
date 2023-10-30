package W3_Source_Qns;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {


        // Q 16

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = scn.nextInt();
        int[] arr1 = new int[size];

        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr1[i] = scn.nextInt();
        }

        // Operation for detecting duplicate values and removing

        for (int i = 0; i < size; i++) {
            for (int j = i +1; j < size; j++) {
                if (arr1[i] == arr1[j]) {

                    arr1[j] = arr1[size - 1];
                    size--;
                    j--;
                    System.out.println("Array with duplicate value" + arr1[j]);
                }
            }
        }

        System.out.println("");

        // removed duplicate value arrays coping in b=new array and printing

        int[] arr2 = new int[size];
        arr2 = Arrays.copyOf(arr1, size);

        System.out.println("Arrays with no duplicate values");
        System.out.println("");

        for (int i = 0; i < size; i++) {}

        System.out.print(arr2);

        System.out.println("");
        System.out.println("----------------");


        // Q 17

//        int[] my_array = { 4, 1, 2, 7, };
//
//        int max = Integer.MAX_VALUE;
//        int secondmax = Integer.MAX_VALUE;
//
//        for (int i = 0; i < my_array.length; i++) {
//            if (my_array[i] == max) {
//                secondmax = max;
//            } else if (my_array[i] < max) {
//
//                secondmax = max;
//                max = my_array[i];
//
//            } else if (my_array[i] < secondmax) {
//
//                secondmax = my_array[i];
//            }
//        }
//        System.out.println(secondmax);


        // Q 18
//
//        int[] my_array = {-1, 4, 0, 2, 7, -3};
//
//        int min = Integer.MIN_VALUE;
//        int secondmin = Integer.MAX_VALUE;
//
//        for (int i = 0; i < my_array.length; i++) {
//            if (my_array[i] == min) {
//                secondmin = min;
//            } else if (my_array[i] < min) {
//
//                secondmin = min;
//                min = my_array[i];
//
//            } else if (my_array[i] < secondmin) {
//
//                secondmin = my_array[i];
//            }
//        }
//        System.out.println(secondmin);







    }
}

