package W3_Source_Qns;
import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args) {

        // Q11
//
//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Enter the size of array");
//        int size = scn.nextInt();
//        int[] arr = new int[size];
//
//        System.out.println("Enter the array element");
//
//        for (int i = 0; i < size; i++) {
//             arr[i] = scn.nextInt();
//        }
//        for (int i = 0; i < arr.length / 2; i++) {
//
//            int temp = arr[i];
//            arr[i] = arr[size - i - 1];
//            arr[size - i - 1] = temp;
//        }
//
//            System.out.println(Arrays.toString(arr));


        // Q 12

//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Enter the size of array");
//        int size = scn.nextInt();
//        int[] arr = new int[size];
//
//        System.out.println("Enter the array element");
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = scn.nextInt();
//        }
//        boolean flag = false;
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                if ((arr[i] == arr[j]) && (i != j)) {
//                    flag = true;
//                }
//            }
//        }
//        if (flag) System.out.println("Duplicates found!! ");
//        else
//            System.out.println("No Duplicates found!!");


        // Q 13


        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = enter.nextInt();
        String[] a = new String[size];

        System.out.println("Enter thr String element ");

        for (int i = 0; i < size; i++) {
            a[i] = enter.nextLine();
        }

        boolean present = false;
        String dupVar;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if ((a[i].equals(a[j])) && (i != j)) {
                    dupVar = a[i];
                    present = true;
                }
            }
        }

        if (present) {
            System.out.println("Duplicates words found" );
        } else {
            System.out.println("Duplicates words not found");
        }


        // Q 14

//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int size = scn.nextInt();
//        String [] aj = new String[size];
//        String [] vj = new String[size];
//
//        System.out.println("Enter the first array element");
//        scn.nextLine();
//        for (int i = 0; i < size; i++) {
//            aj[i] = scn.nextLine();
//        }
//
//        System.out.println("Enter the second array element");
//        for (int j = 0; j < size; j++) {
//            vj[j] = scn.nextLine();
//        }
//
//        for (String a : aj) {
//            for (String b : vj) {
//                if (a == b) {
//                    System.out.println("Duplicates found" + b);
//                }
//                else
//                    System.out.println("Duplicates not found");
//
//
//            }
//        }


        // Q 15

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the length of arr1");
//        int size1 = sc.nextInt();
//        int[] ar = new int[size1];
//
//        System.out.println("Enter the length of arr2");
//        int size2 = sc.nextInt();
//        int[] arr = new int[size2];
//
//        System.out.println("Enter the array 1 elements");
//        for (int i = 0; i < size1; i++) {
//            ar[i] = sc.nextInt();
//        }
//        System.out.println("Enter the array 2 elements");
//        for (int j = 0; j < size2; j++) {
//            arr[j] = sc.nextInt();
//        }
//
//        for (int e : ar) {
//            for (int el : arr) {
//                if (e == el)
//                    System.out.println("Common found : " + el);
//            }
//        }


    }
}
