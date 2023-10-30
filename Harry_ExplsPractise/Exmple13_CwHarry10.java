package with_harry_exmples;

// problem set10

// Q1 with changes of Q3

class Circle1 {

    public int radius;


    Circle1(int r) {
        this.radius = r;

    }

    public double areaofcircle1() {

        return Math.PI * 2 * this.radius;
    }
}

class Cylinder1 extends Circle1 {

    public int height;

    Cylinder1(int r, int h) {

        super(r);
         this.height = h ;

    }

    public double volume1() {

        return Math.PI* this.radius * this.radius * this.height;
    }

}


// Q2 with changes of Q4
/*class Rectangle1 {

    public int length;
    public int width;

    Rectangle1(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public double rectangle_area() {

        return 2 * length * width;

    }

}

class Cuboid extends Rectangle1 {

    public int height;

    Cuboid(int l, int w, int h) {

        super(l, w);

        this.height = h;
    }

    public int cubiod_volume() {

        return length * width * height;
    }


}

 */


public class Exmple13_CwHarry10 {
    public static void main(String[] args) {

        // Q1
        Cylinder1 vikas = new Cylinder1(12,20);
        System.out.println(vikas.volume1());

        // Q2
//        Cuboid akash = new Cuboid(12, 12, 12);
//        System.out.println(akash.cubiod_volume());


    }
}
