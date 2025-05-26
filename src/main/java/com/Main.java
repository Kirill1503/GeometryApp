package com;

import com.geometry.Circle;
import com.geometry.Rectangle;
import com.geometry.Triangle;
import com.geometry.utils.ShapeOperations;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Rectangle rectangle1 = new Rectangle(4, 6);
        Rectangle rectangle2 = new Rectangle(4, 7);
        Triangle triangle1 = new Triangle(3, 4, 5, 4);
        Triangle triangle2 = new Triangle(3, 4, 8, 4);

        System.out.println("=== Circle ===");
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("Diameter: " + circle1.getDiameter());

        System.out.println("\n=== Rectangle ===");
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        System.out.println("\n=== Triangle ===");
        System.out.println("Area: " + triangle1.getArea());
        System.out.println("Perimeter: " + triangle1.getPerimeter());

        System.out.println("\n=== Compare Shape Areas ===");

        System.out.println("Areas of shares is equals: " + ShapeOperations.compareAreas(circle1, circle2));
        System.out.println("Areas of shares is equals: " + ShapeOperations.compareAreas(rectangle1, rectangle2));
        System.out.println("Areas of shares is equals: " + ShapeOperations.compareAreas(triangle1, triangle2));

        System.out.println("\n=== Compare Shape Perimeter ===");

        System.out.println("Perimeter of shares is equals: " + ShapeOperations.comparePerimeters(circle1, circle2));
        System.out.println("Perimeter of shares is equals: " + ShapeOperations.comparePerimeters(rectangle1, rectangle2));
        System.out.println("Perimeter of shares is equals: " + ShapeOperations.comparePerimeters(triangle1, triangle2));
    }
}