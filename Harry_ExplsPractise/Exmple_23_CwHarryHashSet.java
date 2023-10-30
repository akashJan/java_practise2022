package with_harry_exmples;

import java.util.HashSet;
import java.util.Scanner;

public class Exmple_23_CwHarryHashSet {
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length");
        int num = scn.nextInt();

        while (num>0){
          h.add(scn.nextInt());
          num--;
        }
        h.clone();
        System.out.println(h);
    }
}
