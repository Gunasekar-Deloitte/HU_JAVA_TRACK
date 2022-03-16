package oops_assignment_1_solution;

import java.util.concurrent.Callable;

public class Area{
    public static void main(String[] args) {
        AreaOfShapes shapes = new AreaOfShapes();
        shapes.area(10);
        shapes.area(10,20);
        shapes.area(10d);
        shapes.area(10d,20d);
    }

}
