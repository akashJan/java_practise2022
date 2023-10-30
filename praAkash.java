

import java.util.Scanner;


public class praAkash {


    static int sum(int a, int b) {      //Method callling
        return a + b;
    }

    public static void main(String[] args) {
        // write your code here

        // System.out.println("Hello world");
        System.out.println("Akash");
        //Variables
        // String,Float,Char,Boolean
        // <datatype> <variable name> = <value>;

      /*  String name = "Akash";
        System.out.println(name);

        int a=45;
        System.out.println(a);

        Float f=45.89f;
        System.out.println(f);

        char c = 'L';
        System.out.println(c);

        boolean isAdult = false;
        System.out.println(isAdult);

   byte u = -56;
   double d = 43.5698945;
        System.out.println(u);
        System.out.println(d); */

        //Operators in java

        // Arithmetic Operators, Comperision Operators, Assignment Operators,Logical operators

      /*  int num1=34, num2=65 ;

        System.out.println("operators");
        num1 += 89;



        System.out.println("Addition of num1 & num2");
           System.out.println( num1 + num2);

        System.out.println("Subtraction of num1 & num2");
          System.out.println( num1 - num2);

        System.out.println("Multiplication of num1 & num2");
          System.out.println( num1 * num2);

        System.out.println("Division of num1 & num2");
          System.out.println( num1 / num2); */

        //  System.out.println( num1 % num2);

    /*   System.out.println(num1++);
         System.out.println(++num2);
         System.out.println(++num1);
         System.out.println(++num2);
         System.out.println(num1++);
         System.out.println(num2++);
         System.out.println(num1);//
         System.out.println(num2);
         System.out.println(--num1);
*/
//        System.out.println(num1);
//        System.out.println(num1++);

        //Scanner
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Input");
        String input = scan.nextLine();
        System.out.println(input);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name");
        int input = scan.nextInt(); // used integer we can use float also
        System.out.println(input);
       */

//Strings

        //      String AJ = "AkashJan";
        //      String JA = "JanAkash";
/*
        System.out.println(AJ.length());
        System.out.println(AJ.toUpperCase());
        System.out.println(AJ.toLowerCase());
        System.out.println(AJ+JA);
        System.out.println(AJ+"HMM" +JA);
        System.out.println(AJ+"HMM \t" +JA);
        System.out.println(AJ+"HMM \\" +JA);
        System.out.println(AJ+"HMM \n" +JA);

// StringMethds


        System.out.println(AJ.contains("kas"));
        System.out.println(AJ.charAt(2));
        System.out.println(AJ.endsWith("an"));
        System.out.println(AJ.indexOf("lan"));
 */

        //Simple Mathes

  /* int Numb1 = 2, Numb2 =9;
        System.out.println(Math.max(Numb1,Numb2));
        System.out.println(Math.min(Numb1,Numb2));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.random());
        System.out.println(Math.abs(-89));
        System.out.println(Math.abs(98));
        System.out.println((4+(8-1)*Math.random());
*/

        // if Else Comnditons

    /*
      Scanner scan = new Scanner(System.in);
          System.out.println("Enter the age");
          int age = scan.nextInt();

         if(age>21) {

            System.out.println("You are adult");
        }
          else if(age>18) {
                System.out.println("You are Mature");
            }

          else if(age>10) {
            System.out.println("You are young");
        }
          else{

            System.out.println("Your are kid");
        }
            */

/*
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the number");
           int days = scan.nextInt(); ;

           switch(days){

            case 1:
                System.out.println("Sunday");
                break;   // if not write case2 to case7 also be going to print
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");

        }
     */


   /*  //Loops

        // 1: while

        int i= 0 ;

        while(i<=100){

            System.out.println(i);
            i += 1;
        }

       // 2: do while

       int j = 0;

        do{
            System.out.println(j);

            j += 1;
        } while(j<100);

    // 3: for Loop

        for(i=0;i<10;i++){

            System.out.println(i);
            //break // the loop is brake and only print 0
        }  */


       /* // Java Arrays

       //single dimension

        int [] marks = {1,4,6,8};

        marks[3] = 44;

        System.out.println(marks[0]);
        System.out.println(marks[3]);

        for(int i=0;i<marks.length;i++){   // itration of array

            System.out.println(i);
        }

           // 4: for each loop

        System.out.println("This is for Each loop");

        for(int value:marks)
        {
            System.out.println(value);
        }


        // 2Dimension

        int [] [] mar = { {1,2,3,8},{4,8,7,8,} };

        System.out.println(mar[0][3]);


        // array with string

        String []  words  = {"lol" ,"pol", "gol","stole","noll","small"};

        for (String value:words)
              {
                  System.out.println(value);

              }

 */


/*
          Try - Catch

        String []  words  = {"lol" ,"pol", "gol","stole","noll","small"};

        try{
            System.out.println(words[6]);
        }
         catch(Exception e){

             System.out.println(e);

         }
        System.out.println("Akash");
*/

        //System.out.println(sum(5,7)); //Method calling


        // MINI Project calculator

        float number_1, number_2;

        System.out.println("Enter the first number");
        Scanner scan1 = new Scanner(System.in);
        number_1 = scan1.nextFloat();

        System.out.println("Enter the second number");
        Scanner scan = new Scanner(System.in);
        number_2 = scan.nextFloat();

        System.out.println("You entered this number");
        System.out.println(number_1);
        System.out.println("And");
        System.out.println(number_2);

        String prompt = ("Enter 0 for the Addition, 1 for the subtraction, 2 for the Multiplication , 3 for the Division");

        System.out.println(prompt);

        int input = scan.nextInt();
        switch (input) {

            case 0:
                System.out.println("Adding this Number");
                System.out.println("Result is");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subtraction this Number");
                System.out.println("Result is");
                System.out.println(number_1 - number_2);
                break;

            case 2:
                System.out.println("Multiplication this Number");
                System.out.println("Result is");
                System.out.println(number_1 * number_2);
                break;

            case 3:
                System.out.println("Division this Number");
                System.out.println("Result is");
                System.out.println(number_1 / number_2);
                break;


            default:
                System.out.println("Invalid Input");

        }


       

    }
}


