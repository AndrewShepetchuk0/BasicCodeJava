import java.util.*;

public class a13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a sphere: ");
		double r = input.nextDouble();
		double a = 4*(Math.PI*Math.pow(r, 2));
		double v = 4/3*(Math.PI*Math.pow(r, 3));
		System.out.println("The area of the sphere is: " + a);
		System.out.println("The volume of the spphere is: " + v);
		input.close();
	}

}
