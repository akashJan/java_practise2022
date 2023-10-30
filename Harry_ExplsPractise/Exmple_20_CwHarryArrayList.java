package with_harry_exmples;

import java.util.ArrayList;

public class Exmple_20_CwHarryArrayList {
    public static void main(String[] args) {

        // Collection Array list

        ArrayList<String> akash = new ArrayList<>();
        ArrayList<String> vikas = new ArrayList<>();

        akash.add("Akash");
        akash.add("Jan");
        akash.add("Ganesh");

        vikas.add("vikas");
        vikas.add("jan");
        vikas.add("jan");

        System.out.println(akash);
        System.out.println(vikas);

        akash.addAll(vikas);  // for merging two the array

        System.out.println("Array 1 merged with array 2" + akash); // Printing the merged array

        System.out.println(akash.indexOf("Jan")); // Showing first time occurrence in arraylist with index
        System.out.println(vikas.lastIndexOf("jan")); // Showing last time occurrence in arraylist with index
        System.out.println(vikas.lastIndexOf("j")); // Showing -1 because element does not exist
        System.out.println("Array element " + akash.contains("akash")); // Checking the element present in arraylist or not
        akash.set(0,"arush");
        System.out.println(akash);
        akash.trimToSize();
        System.out.println(akash.remove(2));

       // akash.isEmpty();
        akash.ensureCapacity(100); // ensuring the arraylist having the minimum capacity as given

//        akash.clone();
//        akash.add(0, "akhil");  // adding the element at specific index
//        akash.add(2, "nikhil");  // adding the element at specific index
//        akash.remove(2);  // removing the index


        // We can use the loop for printing the arraylist

//        for (int i = 0; i < akash.size(); i++) {
//            System.out.println(akash.get(i));
//        }


    }
}
