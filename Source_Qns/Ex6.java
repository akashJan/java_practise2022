package W3_Source_Qns;

public class Ex6 {
    public static void main(String[] args) {

        // Q 22
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int size = in.nextInt();
//        int[] a = new int[size];
//
//        int in_number = 30;
//        System.out.println("Enter the elements");
//
//        for (int i = 0; i < size; i++) {
//               a[i]  = in.nextInt();
//            }
//
//        for ( int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (a[i] + a[j] == in_number) {
//
//                    System.out.println(a[i] + " + " + a[j] + " = " + in_number);
//                }
//
//            }
//        }


// input
// 2, 7, 4, -5, 11, 5, 20
// 14, -15, 9, 16, 25, 45, 12, 8

        //        Q 23

//        int[] array1 = {2, 5, 7, 9, 11};
//        int[] array2 = {2, 5, 7, 9, 11};
//        int[] array3 = {2, 5, 7, 9, 11};
//
//        boolean equalornot = true;
//
//        for (int i = 0; i < array1.length; i++)
//
//            if (array1[i] != array2[i]) {
//                equalornot = false;
//                break;
//            }
//
//
//        if (equalornot) {
//            for (int i = 0; i < array1.length; i++)
//
//                if (array2[i] != array3[i]) {
//                    equalornot = false;
//                    break;
//                }
//            if (equalornot) {
//                for (int i = 0; i < array1.length; i++)
//
//                    if (array1[i] != array3[i]) {
//                        equalornot = false;
//                        break;
//                    }
//                if (equalornot)
//                    System.out.println("Two arrays are equal");
//                else
//                    System.out.println("Two arrays are not equal");
//
//            } else
//                System.out.println("Two arrays are not equal");
//        } else {
//            System.out.println("Two arrays are not equal");
//        }


//  24 when take even total num output get wrong

        int  [] numbers = {1,2,3,4,6,7};
        int total_num = 7;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        int num_sum = 0;
        for(int i : numbers){

            num_sum += i;
        }
        System.out.println(expected_num_sum - num_sum);
        System.out.println("\n");
    }
}