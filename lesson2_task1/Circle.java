package lesson2.task1;

public class Circle {
    private double radius;
    private String color;
    
    public Circle() {
        radius = 1.0D;
        color = "red";
    }
    
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString() {
    	return "Color is: " + this.color + ",  radius is: "  + this.radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}