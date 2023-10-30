package with_harry_exmples;

// Problem set 11

// Q 1+2
abstract class Pen {

    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Writing something");
    }

    void refill() {
        System.out.println("Refiling pen");
    }

    void changeNib() {
        System.out.println("Changing the nib");
    }
}

// Q3 with changes of Q5

class Monkey {

    void jump() {
        System.out.println("Monkey Jumping");
    }

    void bite() {
        System.out.println("Monkey Biting");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {

    void speak() {
        System.out.println("Hello Sir");
    }

    public void eat() {
        System.out.println("Eating.....");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}


public class Exmple14_CwHarry11 {
    public static void main(String[] args) {

        // Q 1+2
        FountainPen obj = new FountainPen();
        obj.write();
        obj.refill();
        obj.changeNib();

        // Q3
        Human obj2 = new Human();
        obj2.sleep();

        // Q5 showing polymorphism

        Monkey m1 = new Human(); // taking reference as monkey  calling obj of human then only monkey methods will be executed
        m1.bite();
        m1.jump();

        BasicAnimal b = new Human();
        b.eat();
        b.sleep();


    }
}
