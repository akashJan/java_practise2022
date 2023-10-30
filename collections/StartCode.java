package colletionsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

public class StartCode {

    public static void main(String[] args) {


        System.out.println("Welcome to java collection frameworks ");

        // Un type safe - means we not make hardcore the list as string or int

        // Type safe - means we make hardcore the list as string or int
        ArrayList<String> name = new ArrayList<>();

        name.add("akash");
        name.add("vikas");
        name.add("nikhil");

        System.out.println(name);
        name.remove("vikas");
        System.out.println(name);

         ArrayList<String> AJ = new ArrayList<>();

        AJ.add("AKash");
        AJ.add("V12");
        AJ.add("143l");

        System.out.println(AJ);

        AJ.remove("V12");
        System.out.println(AJ);

        AJ.add(0,"AKAKA");
        System.out.println(AJ);

        System.out.println(name.isEmpty());
        System.out.println(name.size());

        Vector <String> vector = new Vector<> ();
        vector.addAll(name);
        System.out.println("vector"+ "\t" + vector);


        HashSet <Double> aka = new HashSet<> ();

        aka.add(14.6);
        aka.add(156.98);
        aka.add(145.89);

        System.out.println(aka);
        System.out.println(aka.size());
        System.out.println(aka.clone());


        TreeSet <Double> tsa = new TreeSet <> ();
        tsa.addAll(aka);
        System.out.println(tsa);



    }

}
