package assignment1;
import java.util.*;

public class a11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x coordinate for point 1: ");
		double x1 = input.nextDouble();
		System.out.println("Enter the x coordinate for point 2: ");
		double x2 = input.nextDouble();
		System.out.println("Enter the y coordinate for point 1: ");
		double y1 = input.nextDouble();
		System.out.println("Enter the y coordinate for point 2: ");
		double y2 = input.nextDouble();
		double a = (y2-y1)/(x2-x1);
		double b = y2 - a*x2;
		a = Math.round(a);
		b = Math.round(b);
		int a1 = (int)a;
		int b1 = (int)b;
		System.out.println("The slope of the line is: " + a);
		System.out.println("The slope intercept of the line is: " +  b);
		System.out.println("The line equation is y = " + a + "x + " + b);
		System.out.println("Here is the line equation with intiger format: y= "+a1+"x + " + b1);
		//
		System.out.println("Enter the x coordiante of point A: ");
		double xa = input.nextDouble();
		System.out.println("Enter the y coordinate of point A: ");
		double ya = input.nextDouble();
		double ap = -1/a;
		double bp = ya - ap * xa;
		System.out.println("The slope of the perpendicular line: " + ap);
		System.out.println("the slope intercept of the perpendicular line is: " + bp);
		x1 = (bp - b)/(a - ap);
		y1 = a * x1 +b;
		System.out.println("The coordinates of the intersection point are: x = " + x1 + " and y = " + y1);
		double d = Math.sqrt(((xa-x1)*(xa-x1)) + ((ya-y1)*(ya-y1)));
		System.out.println("The distance from point A to the line is: " + d);
		input.close();
	}
}
