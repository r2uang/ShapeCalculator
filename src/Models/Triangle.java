package Models;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double halfCircumference() {
        return (a + b + c)/2;
    }

    @Override
    public double calArea() {
        return Math.sqrt(halfCircumference()*(halfCircumference() - a)
                *halfCircumference()*(halfCircumference() -b)*halfCircumference()*(halfCircumference()-c));
    }

    @Override
    public double calPerimeter() {
        return a + b + c;
    }
}
