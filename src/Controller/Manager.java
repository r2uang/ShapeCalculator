package Controller;

import Models.Circle;
import Models.Rectangle;
import Models.Square;
import Models.Triangle;

public class Manager {
    Validation val = new Validation();
    public void calCircle() {
        Circle circle = new Circle();
        double r = val.getDouble("Enter Radius: ","Invalid,Please re-enter",1 , Double.MAX_VALUE);
        circle.setR(r);
        System.out.println("Area of circle: " + circle.calArea());
        System.out.println("Perimeter of circle " + circle.calPerimeter());
    }

    public void calRectangle() {
        Rectangle rectangle = new Rectangle();
        System.out.print("Enter side A: ");
        double ra = val.getDouble("Enter side A: ","Invalid,Please re-enter",1 , Double.MAX_VALUE);
        rectangle.setLength(ra);
        System.out.print("Enter side B: ");
        double rb = val.getDouble("Enter side B: ","Invalid,Please re-enter",1 , Double.MAX_VALUE);
        rectangle.setWidth(rb);
        System.out.println("Area of circle: " + rectangle.calArea());
        System.out.println("Perimeter of circle " + rectangle.calPerimeter());
    }

    public void calTriangle() {
        Triangle triangle = new Triangle();
        double ta = val.getDouble("Enter side A: ","Invalid,Please re-enter",1 , Double.MAX_VALUE);
        triangle.setA(ta);
        double tb = val.getDouble("Enter side B: ","Invalid,Please re-enter",1 , Double.MAX_VALUE);
        triangle.setB(tb);
        double tc = val.getDouble("Enter side C: ","Invalid,Please re-enter",1 , Double.MAX_VALUE);
        triangle.setC(tc);
        System.out.println("Area of triangle: " + triangle.calArea());
        System.out.println("Perimeter of triangle " + triangle.calPerimeter());
    }

    public void calSquare() {
        Square square = new Square();
        double sa = val.getDouble("Enter side: ","Invalid,Please re-enter",1 , Double.MAX_VALUE);
        square.setSide(sa);
        System.out.println("Area of triangle: " + square.calArea());
        System.out.println("Perimeter of triangle " + square.calPerimeter());
    }
}
