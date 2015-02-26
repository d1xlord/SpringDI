package com.tigerit.Configuration;

import com.tigerit.Objects.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig  {

    @Bean
    public Shape shape1(){
        Rectangle ret = new Rectangle(10, 20);
        return ret;
    }
    @Bean
    public Shape shape2(){
        Circle ret = new Circle(10);
        return ret;
    }
    @Bean
    public Shape shape3(){
        ShapeMaker ret = new ShapeMaker();
        return ret.randomShape1();
    }
    @Bean
    public Shape shape4(){
        ShapeMaker ret = new ShapeMaker();
        return ret.randomShape2(100);
    }

    @Bean
    public ShapeList shapelist(){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(shape1());
        shapes.add(shape2());
        shapes.add(shape3());
        shapes.add(shape4());
        return new ShapeList(shapes);
    }
}