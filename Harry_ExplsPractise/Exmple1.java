package with_harry_exmples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exmple1 {
    public static void main(String[] args) {

        //Creating five element Array list

        ArrayList<Integer> it = new ArrayList<>();
        it.add(11);
        it.add(12);
        it.add(13);
        it.add(14);
        it.add(15);


        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println(it);
            System.out.println("Enter the Choice");
            System.out.println("1.Insert" + "\n" + "2.delete" + "\n" + "3.reverse" + "\n" + "4.sum" + "\n" + "5.Exit");

            int select = scan.nextInt();

            switch (select) {

                case 1:
                    System.out.println("Enter the index and value to be inserted respectively");
                    int index, value;
                    index = scan.nextInt();
                    value = scan.nextInt();
                    it.add(index, value);

                    break;


                case 2:
                    System.out.println("Deleting the index ");
                    int in;
                    in = scan.nextInt();
                    it.remove(in);

                    break;

                case 3:

                    System.out.println("Reversing the List");

                    Collections.reverse(it);
                    System.out.println(it);
                    Collections.reverse(it);
                    break;

                case 4:
                    System.out.println("Adding the list");
                    int sum = 0;
                    for (int i = 0; i < it.size(); i++) {
                        sum += it.get(i);
                    }
                    System.out.println("Sum is :" + sum);
                    break;
                case 5:
                    System.out.println("Exiting the Program!!");
                    System.exit(0);
                    break;

                default:

                    System.out.println("Invalid input");
            }

        }

    }
}

