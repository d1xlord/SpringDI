package com.tigerit.Controller;

/**
 * Created by nafis on 2/26/15.
 */

import com.tigerit.Configuration.AppConfig;
import com.tigerit.Objects.Shape;
import com.tigerit.Objects.ShapeList;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShapeTest {
    public static void main(String args[]) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("/spring-config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Different types of shapes and their areas:");

        for (int i = 1; i <= 4; i++) {
            Shape shape = (Shape) context.getBean("shape"+i);
            shape.printInfo();
        }
        ShapeList shapes = (ShapeList) context.getBean("shapelist");
        shapes.getTotalArea();
    }
}
