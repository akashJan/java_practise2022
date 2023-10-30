package W3_Source_Qns;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {


        // Q 19

        int m, n;
        int c, d; // for size 2D array

        Scanner in = new Scanner(System.in);

        System.out.println(" No of rows of matrix");
        m = in.nextInt();
        System.out.println(" No of columns of matrix");
        n = in.nextInt();

        int[][] mat1 = new int[m][n];
        int[][] mat2 = new int[m][n];
        int[][] sum = new int[m][n];

        // Taking input of 2D matrix array
        System.out.println("Enter input first matrix");

        for (c = 0; c < m; c++) {
            for (d = 0; d < m; d++) {
                mat1[c][d] = in.nextInt();
            }
        }

        System.out.println("Enter input second matrix");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                mat2[c][d] = in.nextInt();
            }
        }

        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                sum[c][d] = mat1[c][d] + mat2[c][d];
            }
        }

        System.out.println("Addition of matrix");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                System.out.print( sum[c][d] + "\t");
                System.out.println();

            }
        }


        // Q 20

//        String[] my_array = new String[]{"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
//        ArrayList<String> list = new ArrayList<String>(Arrays.asList(my_array));
//
//        System.out.println(list);


    }
}
