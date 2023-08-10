package Aula17.Entities;

import Aula17.Enums.Color;

public class Circle extends Shapes {
    private double radius;
    private static final double PI = 3.14;

    public Circle(){
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}
