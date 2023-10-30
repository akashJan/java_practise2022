package W3_Source_Qns;

public class Ex7 {

    public static void main(String[] args) {

        // 25

//        ArrayList<Integer> common = new ArrayList<Integer>();
//        int[] array1 = {2, 4, 8};
//        int[] array2 = {2, 3, 4, 8, 10, 16};
//        int[] array3 = {4, 8, 14, 40};
//
//        int x = 0, y = 0, z = 0;
//
//        while (x < array1.length && y < array2.length && z < array3.length) {
//            if (array1[x] == array2[y] && array2[y] == array3[z]) {
//                common.add(array1[x]);
//                x++;
//                y++;
//                z++;
//            } else if (array1[x] < array2[y])
//                x++;
//            else if (array2[y] < array3[z])
//                y++;
//            else
//                z++;
//        }
//        System.out.println("Common elements from three sorted (in non-decreasing order ) arrays: ");
//        System.out.println(common);

        // Q 26

        int[] array_num= {0, 0, 1, 0, 3, 0, 5, 0, 6};
        int i = 0;
        System.out.println("\n Original array: \n ");
        for (int n : array_num) {
            System.out.println(n + " ");
        }

        for (int j = 0; j <= array_num.length ; j++) {
            if (array_num[j] == 0)
                j++;
            else {
                int temp = array_num[i];
                array_num[i] = array_num[j];
                array_num[j] = temp;
                i++;
                j++;
            }
        }
        while (i < array_num.length)
            array_num[i++] = 0;
        System.out.print("\nAfter moving 0's to the end of the array: \n");
        for (int n : array_num)
            System.out.print(n + "  ");
        System.out.print("\n");


    }
}
