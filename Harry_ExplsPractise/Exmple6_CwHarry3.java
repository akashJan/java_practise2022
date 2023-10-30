package with_harry_exmples;

import java.util.Locale;

public class Exmple6_CwHarry3 {

    public static void main(String[] args) {

        // # Practise set 3
        // Problem 1

        String a = "AKASH";
        System.out.println(a.toLowerCase(Locale.ROOT));


        // Problem 2

        String b = " AKASH ";
        System.out.println(b.replace(" ", "_" ));


         // Problem 3

        String letter = "Dear |<name>|, Thanks a lot ";
        letter = letter.replace("|<name>|","akash");
        System.out.print(letter);
        System.out.println("");

        // Problem 4

        String c = "This String contains double  space and triple space";
        System.out.println(c.indexOf("  "));
        System.out.println(c.indexOf("   ")); // if string not contain double or triple space returns -1


        // Problem 5

        String d = "Dear\" + \"\\t\" + \"Harry \" + \"\\n\" + \"This java program is nice";
        System.out.println(d);

    }
}
