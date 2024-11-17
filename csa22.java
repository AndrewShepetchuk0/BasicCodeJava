import java.util.*;

class Circle{
	// Private instance variables
    private double radius;
    private String color;
    private double area;

    // Default constructor
    public Circle() {
        this.radius = 2.0;
        this.color = "Green";
        calculateArea();
    }
    // Parameterized constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        calculateArea(); 
    }
    // Method to calculate area
    public double calculateArea() {
        area = Math.PI * radius * radius;
        return area;
    }
    // Method to get perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    // Getter for radius
    public double getRadius() {
        return radius;
    }
    
    // Setter for radius with area recalculation
    public void setRadius(double radius) {
        this.radius = radius;
        calculateArea();
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
}

public class csa22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//import circle
		Circle c = new Circle();
		//First circle output
		System.out.println("The first circle is " + c.getColor() + " and has a radius of " + c.getRadius() + ", area of " + c.calculateArea() + " and perimeter of " + c.getPerimeter());
		double radius;
        do {
            System.out.print("Enter a positive radius: ");
            radius = input.nextDouble();
        } while (radius <= 0);
        input.nextLine();
        System.out.print("Enter the color: ");
        String color = input.nextLine();
        Circle cc = new Circle(radius, color);
        System.out.println("The second circle is " + cc.getColor() + " and has a radius of " + cc.getRadius() + ", area of " + cc.calculateArea() + " and perimeter of " + cc.getPerimeter());
        // Updating the radius of the second circle
        do {
            System.out.println("Enter a new positive radius for the second circle: ");
            radius = input.nextDouble();
        } while (radius <= 0);
        cc.setRadius(radius);
        System.out.println("The second circle is " + cc.getColor() + " and has a radius of " + cc.getRadius() + ", area of " + cc.calculateArea() + " and perimeter of " + cc.getPerimeter());
        input.close();
	}

}
