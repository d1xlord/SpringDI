package com.tigerit.Objects;

/**
 * Created by nafis on 2/26/15.
 */
public class Circle extends Shape {
    private double radius;

    public Circle() {}
    public Circle(double radius){
        System.out.println("New circle : " + radius);
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
}
