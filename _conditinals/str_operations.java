package _conditinals;

import java.util.Locale;

public class str_operations {


    public static void main(String[] arg) {


        String str = "abc,xyz";


        String[] words = str.split("\\,");//splits the string based on comma ','
        String Caps =  words[1];
        System.out.println(words[0]);
        System.out.println(Caps.toUpperCase(Locale.ROOT));
        String st = Caps.toUpperCase(Locale.ROOT) +","+ words[0];
        System.out.println(st);


//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the string :");
//        String AJ = scn.nextLine();
//        System.out.println(AJ.length());
//        System.out.println(AJ.toUpperCase());
//        System.out.println(AJ.toLowerCase());
//        System.out.println(AJ.substring(3));
//        System.out.println(AJ.substring(1,4));
//        System.out.println(AJ.charAt(2));
//        System.out.println(AJ.equals("akashjan"));
//        System.out.println(AJ.equalsIgnoreCase("AKASHJAN"));
//
//
//        String a = "Akash";
//        System.out.println(a.replace('A','V'));
//        System.out.println(a.startsWith("A"));
//        System.out.println(a.endsWith("h"));
//        System.out.println(a.lastIndexOf('s'));
//        System.out.println(a.lastIndexOf('s','4'));
//        System.out.println(a.indexOf('s'));
//        System.out.println(a.indexOf('s','2'));
//
//        String b = "   Vikas   ";
//        b = b.replace(" ","-");
//        System.out.println(b);
//        System.out.println(b.trim());





    }
}
