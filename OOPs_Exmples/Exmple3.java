package OOPs_Exmples;

class vehicle {

    String Name;
    int ModelID;


    public vehicle(){

        System.out.println("I am constructor");
     }
//     public skoda{
//
//         System.out.println("I am ");
//     }

    public void setName(String Name) {

        this.Name = Name;
    }

    public String getName() {

        return Name;
    }

    public void setModelID(int ModelID) {

        this.ModelID = ModelID;
    }

    public int getModelID() {
        return ModelID;
    }

}

class skoda extends vehicle {
    int modelYear;

    public void setModelYear(int modelYear) {

        this.modelYear = modelYear;

    }

    public int getModelYear() {
        return modelYear;
    }


}


public class Exmple3 {
    public static void main(String[] args) {

        vehicle obj = new vehicle();
//        obj.setName("Akash");
//        System.out.println(obj.getName());
//        obj.setModelID(1234);
//        System.out.println(obj.getModelID());

        skoda obj1 = new skoda();

        obj1.setName("Akash");
        System.out.println(obj1.Name);

        obj1.setModelID(1234);
        System.out.println(obj1.getModelID());

        obj1.setModelYear(1998);
        System.out.println("Getting complete info from derived class" + obj1.getModelYear());




    }
}



