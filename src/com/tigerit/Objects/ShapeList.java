package com.tigerit.Objects;

import java.util.ArrayList;

/**
 * Created by nafis on 2/26/15.
 */
public class ShapeList {
    private ArrayList<Shape> shapes;

    public ShapeList(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void getTotalArea() {
        double ret = 0.0;
        for(Shape var : shapes) {
            ret += var.getArea();
        }
        System.out.printf("Total area for all shapes is: %,.2f\n", ret);
    }
}
