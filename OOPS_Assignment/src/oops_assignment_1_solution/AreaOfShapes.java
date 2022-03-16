package oops_assignment_1_solution;

public class AreaOfShapes {

    public void area(int side){
        System.out.println("Area of Square "+side*side );
    }
    public void area(int l, int b){
        System.out.println("Area of Rectangle "+ l*b);
    }
    public void area(double rad) {
        System.out.println("Area of circle " + 3.14 * rad * rad);
    }
    public void area(double b, double h) {
        double v = b * h;
        System.out.println("Area of Triangle " + v / 2);
    }
}
