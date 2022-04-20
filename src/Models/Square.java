package Models;

public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calArea() {
        return side * side;
    }

    @Override
    public double calPerimeter() {
        return side * 4;
    }
}
