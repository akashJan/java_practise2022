package with_harry_exmples;

// Problem set 11

// Q4

abstract class Telephone {

    abstract void ring();

    abstract void lift();


}

class SmartPhone extends Telephone {

    void ring() {
        System.out.println("Ringing.....");
    }

    void lift() {
        System.out.println("Lifting");
    }

    void disconnect() {
        System.out.println("Disconnecting...");
    }
}


public class Exmple15_CwHarry11_1 {

    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();
        s.ring();
        s.lift();
        s.disconnect();


        Telephone t = new SmartPhone(); // polymorphism shown here
        t.lift();
        t.ring();
    }

}
