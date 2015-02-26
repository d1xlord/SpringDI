package com.tigerit.Objects;

/**
 * Created by nafis on 2/26/15.
 */
public abstract class Shape {
    public abstract double getArea();

    public void printInfo() {
        System.out.printf("%s with area of %,.2f\n",
                getClass().getSimpleName(),
                getArea());
    }
}
