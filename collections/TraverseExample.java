package colletionsa;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseExample {
    public static void main(String[] args) {


        ArrayList<String> name = new ArrayList<String>();

        name.add("Akash");
        name.add("Vikas");
        name.add("Nikhil");
        name.add("Swapnil");
        name.add("nikhil");

       for (String str:name) {

           StringBuffer br = new StringBuffer(str);
           System.out.println(str + "\t" + str.length() + "\t" + br.reverse());
       }
           System.out.println("__________________");

           Iterator <String> it = name.iterator();
           while (it.hasNext()){
               String staa = it.next();
               System.out.println(staa);


           }



    }

}
