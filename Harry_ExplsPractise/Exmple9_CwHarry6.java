package with_harry_exmples;

public class Exmple9_CwHarry6 {
    public static void main(String[] args) {

        // practise set 6

        // Q1

//        float[] marks = {1.2f, 2.2f, 4.3f, 4.4f};
//        float sum = 0;
//
//        for (float element : marks) {
//            sum = sum + element;
//        }
//
//        System.out.println("Avg sum is " + sum);
//
//
//// Q2
//
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int value_checked = 7;
//
//        boolean inarray = false;
//
//        for (int element : array) {
//
//            if (value_checked == element) {
//                inarray = true;
//                break;
//            }
//
//        }
//
//        if (inarray) {
//            System.out.println("Value is present");
//        } else {
//            System.out.println("Value is not is present");
//        }
//
//        // Q3
//
//        int[] physics = {10, 24, 43, 43, 34};
//        int avg = 0;
//
//        for (int element : physics) {
//            avg = avg + element;
//        }
//
//        System.out.println("Avg sum is " + avg);
//
//        // Q4
//
//        int[][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int[][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i = 0; i < mat1.length; i++) { // row number of times
//            for (int j = 0; j < mat1[i].length; j++) { // column number of time
//                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        // Printing the elements of a 2-D Array
//        for (int i = 0; i < mat1.length; i++) { // row number of times
//            for (int j = 0; j < mat1[i].length; j++) { // column number of time
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(""); // Prints a new line
//        }

        // Q5

//        int[] array = {1, 2, 1, 2, 1, 2, 1, 2};
//
//        int l = array.length;
//        int temp;
//        int n = Math.floorDiv(l, 2);
//
//        for (int i = 0; i < n; i++) {
//
//            temp = array[i];
//            array[i] = array[l - i - 1];
//            array[l - i - 1] = temp;
//
//        }
//
//        for (int element : array) {
//            System.out.print(element + " ");
//        }

        // Q 6 & 7 not done

//        int[] arr = {1, 2100, 3, 455, 5, 34, 67};
//
//        int max = Integer.MAX_VALUE;
//        int min = Integer.MIN_VALUE;
//        for (int e : arr) {
//            if (e > max) {
//                max = e;
//                System.out.println("The value of maximum element is" + max);
//            }
//            if (e < min) {
//                min = e;
//                System.out.println("The value of maximum element is" + min);
//            }
//            System.out.println(Integer.MIN_VALUE);
//            System.out.println(Integer.MAX_VALUE);
//        }


        // Q9
        boolean isSorted = true;
        int[] arr = {1, 12, 3, 4, 5, 34, 67};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }


    }
}







