package lesson2.task1;

public class TestCircle {
	
	public static void main(String[] args){
	    Circle c1 = new Circle();
	    System.out.println("Color is: " + c1.getColor() + ",  radius is: "  + c1.getRadius());
	    double radius2 = 2.0;
	    Circle c2 = new Circle(radius2);
	    System.out.println("Color is: " + c2.getColor() + ",  area is: "  + c1.getArea());
	    
	    System.out.println(c1.toString());
	    System.out.println(c1);
	    
	}


}


