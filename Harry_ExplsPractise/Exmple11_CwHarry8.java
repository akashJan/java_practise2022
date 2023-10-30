package with_harry_exmples;


// Problem set 8

// Q1

class Employee {

    int salary;
    String name;

    public void setname(String n) {

        name = n;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

}

// Q2
class cellphone {

    public void ring() {
        System.out.println("Ringing......");
    }

    public void vibrate() {
        System.out.println("Vibrating.....");
    }

    public void calling() {
        System.out.println("Calling Akash");
    }
}

// Q3
class Sqare {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }


}

// Q4 same as 3
class Rectangle {
    int length;
    int width;

    public int area1() {
        return length * width;
    }

    public int perimeter1() {

        return 2 * (length + width);
    }
}
// Q5 Same as 3

    class Circle {
        int radius;
        double pie;

        public double area2() {
            return (pie * (radius * radius));
        }

        public double perimeter2() {
            return 2 * pie * radius;
        }
 }


    public class Exmple11_CwHarry8 {

        public static void main(String[] args) {

            Employee obj = new Employee();
            obj.setname("akash");
            System.out.println(obj.getName());
            obj.salary = 122;
            System.out.println(obj.getSalary());


            cellphone obj1 = new cellphone();
            obj1.ring();
            obj1.vibrate();
            obj1.calling();


            Sqare obj2 = new Sqare();
            obj2.side = 3;
            System.out.println(obj2.area());
            System.out.println(obj2.perimeter());

            Rectangle obj3 = new Rectangle();
            obj3.length = 5;
            obj3.width = 8;
            System.out.println(obj3.area1());
            System.out.println(obj3.perimeter1());

            Circle obj4 = new Circle();
            obj4.pie = 3.14;
            obj4.radius = 3;
            System.out.println(obj4.area2());
            System.out.println(obj4.perimeter2());


        }
    }