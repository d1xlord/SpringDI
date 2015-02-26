package com.tigerit.Objects;

/**
 * Created by nafis on 2/26/15.
 */
public class ShapeMaker {
    public static Shape randomShape1(){
        return randomShape2(10);
    }

    public static Shape randomShape2(double size) {
        double d = Math.random();
        if(d < 0.5) return (new Circle(size));
        else return (new Rectangle(size, 2*size));
    }
}
