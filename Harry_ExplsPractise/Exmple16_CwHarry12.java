package with_harry_exmples;

// Problem Set 13
//  Q1 to Q5

//class Mythr1 extends Thread {
//
//    Mythr1(String name) {
//        super(name);
//    }
//
//    public void run() {
//
//
//        while (true){
//            System.out.println("Good morning " + this.getName());
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

class Mythr2 extends Thread {

    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}


public class Exmple16_CwHarry12 {
    public static void main(String[] args) {

//        Mythr1 t1 = new Mythr1("akash");
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        System.out.println(t1.getPriority());

        Mythr2 t2 = new Mythr2();
        t2.setPriority(Thread.MIN_PRIORITY);

        t2.getState(); // Q4
        t2.start();
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getState()); // Q5
    }
}
