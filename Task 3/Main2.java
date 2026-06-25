package com.mycompany.lab3;
interface shape{
    double calculateArea();
    
}
class Rectangle implements shape{
    double length;
    double width;
    
    Rectangle(double length,double width){
        this.length = length ;
        this.width = width;
    }
    public double calculateArea(){
        return length* width;
    
}
    
}
class Circle implements shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
        
    }
    
}
 class AreaCalculator {

    double calculateTotalArea(shape[] shapes) {
        double totalArea = 0;

        for (shape shape : shapes) {
            totalArea += shape.calculateArea();
        }

        return totalArea;
    }
}

public class TASK2 {
    public static void main(String[] args) {

        shape[] shapes = {
            new Rectangle(10, 5),
            new Circle(7)
        };

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Total Area: " +
                calculator.calculateTotalArea(shapes));
    }
}
