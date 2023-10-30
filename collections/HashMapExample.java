package colletionsa;

import java.util.HashMap;

public class HashMapExample {

    private static HashMap<String, Integer> courses;

    public static void main(String[] args){


        HashMap<String,Integer> courses = new HashMap<>();


        courses.put("Kotline",20000);
        courses.put("Python",30000);
        courses.put("XML",40000);
        courses.put("JAVA",50000);

        System.out.println(courses);

        courses.forEach((key,value ) ->{

            System.out.println(key);
            System.out.println("=>");
            System.out.println(value);

            System.out.println(courses.get("JAVA"));

        });




    }

}
