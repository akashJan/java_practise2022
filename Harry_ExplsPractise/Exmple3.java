package with_harry_exmples;

public class Exmple3 {

    public static void main(String[] args) {
        /* Take in string
           convert to char array
           print elements in array one by one
         */

      java.util.Scanner scn = new java.util.Scanner(System.in);
        System.out.println("Enter the string word");
        String akash = scn.nextLine();

        char [] AJ = akash.toCharArray();
        for (char c : AJ) {
            System.out.print(c + " ");

        }

        // Use of Scanner
//        Scanner scn = new Scanner(System.in);
//        int arr [] = new int[5];
//        System.out.println("Enter the elements");
//        for (int i = 0; i < 5; i++) {
//            arr [i]  = scn.nextInt();
//        }
//        for (int i : arr) {
//            System.out.println(i + "");
//
//        }
//        System.out.println("");


    }

}


