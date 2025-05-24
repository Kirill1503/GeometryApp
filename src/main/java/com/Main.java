package com;

import com.geometry.Circle;
import com.geometry.Rectangle;
import com.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        // Создаём фигуры
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5, 4);

        // Выводим площади и периметры
        System.out.println("=== Circle ===");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\n=== Rectangle ===");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\n=== Triangle ===");
        System.out.println("Area: " + triangle.getArea(3, 4));
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}