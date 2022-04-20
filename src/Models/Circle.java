package Models;

import Models.Shape;

public class Circle extends Shape {
    final double Pi = 3.14;
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getPi() {
        return Pi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calArea() {
        return r * r * Pi;
    }

    @Override
    public double calPerimeter() {
        return 2 * Pi * r;
    }
}
