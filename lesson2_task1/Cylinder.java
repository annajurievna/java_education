package lesson2.task1;

public class Cylinder extends Circle {
	private double hight;
	
	public double getRadius() {
        return radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getHight() {
        return hight;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setHight(double hight) {
        this.hight = hight;
    }
	
	public Cylinder() {
		this.hight = 1.0;
	}
	
	public Cylinder(double radius) {
		this.hight = 1.0;
		this.radius = radius;
	}
	
	public Cylinder(double radius, double hight) {
		this.hight = hight;
		this.radius = radius;
	}
	
	public Cylinder(double radius, double hight, String color) {
		this.hight = hight;
		this.radius = radius;
		this.color = color;
	}
	
	public double getVolume() {
        return Math.PI * radius * radius * hight;
    }
}