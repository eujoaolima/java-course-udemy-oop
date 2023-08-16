package Aula28.Application;

import Aula28.Entities.Circle;
import Aula28.Entities.Rectangle;
import Aula28.Entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class CoringaDelimitado {
    public static void main(String[] args) {
        // Coringas delimitados

        List<Shape> myShapes = new ArrayList<>();

//        List<Circle> myCircles = new ArrayList<>();
//        myCircles.add(new Circle(5));
//        myCircles.add(new Circle(15));

        myShapes.add(new Circle(10));
        myShapes.add(new Rectangle(30, 20));

        System.out.println("Área total: " + totalArea(myShapes));
    }

    public static double totalArea(List<? extends Shape> shapes) {
        double soma = 0;

        for (Shape shape : shapes) {
            soma += shape.area();
        }

        return soma;
    }
}
