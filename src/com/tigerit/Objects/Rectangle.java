package com.tigerit.Objects;

/**
 * Created by nafis on 2/26/15.
 */
public class Rectangle extends Shape {
    private double length, width;

    public Rectangle() {}
    public Rectangle(double length, double width) {
        System.out.println("New Rectange : " + length + ", " + width);
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length*width;
    }
}
