package loopsAndArrays;

public class Array_Exple2 {

    public static void main(String[] args) {

        // # Problem no 3 calculating average marks using for each loop
//
//        int[] marks = {10, 10, 10, 10, 50};
//        int  sum = 0;
//
//        for (int element : marks) {
//
//            sum = sum + element;
//
//        }
//        System.out.println("Avg marks"+ "\n" + sum/ marks.length);

        // # Problem no 3 Array reverse

//        int[] array = {10, 11, 12, 13, 12, 15};
//        int l = array.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//        for (int i = 0; i < n; i++) {
//
//            temp = array[i];
//            array[i] = array[l - i - 1];
//            array[l - i - 1] = temp;
//
//        }
//        for (int element : array) {
//            System.out.println(element + " ");
//        }

        // # Problem no 5 Finding array max value

        int[] arr = {12, 123, 123, 12, 423, 123, 43};
        int max = Integer.MIN_VALUE;
        for (int e : arr) {

            if (e > max) {
                max = e;
            }
        }
        System.out.println("Maximum element i array is" + "\t"+ max);


    }
}
