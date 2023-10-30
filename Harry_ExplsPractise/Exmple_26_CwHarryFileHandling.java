package with_harry_exmples;

import java.io.File;

public class Exmple_26_CwHarryFileHandling {
    public static void main(String[] args) {

        // Creating tje File

      /*  File myFile = new File("akash.txt");
        try {

            myFile.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        // Writing in the file

     /*   try {
            FileWriter fileWriter = new FileWriter("akash.txt");
            fileWriter.write("Hello Akash ");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        // Reading the file

    /*    File myFile = new File("akash.txt");
        try {

            Scanner scn = new Scanner(myFile);
            while (scn.hasNextLine()) {

                String line = scn.nextLine();
                System.out.println(line);
            }
            scn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        */

        File myFile = new File("aj.txt");
        if(myFile.delete()){
            System.out.println("My file was deleted" + myFile.getName());
        }
        else{
            System.out.println("Some error is occured deleting the file");
        }


    }
}
