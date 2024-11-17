import java.util.*;

public class cs3 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner input = new Scanner(System.in);
		int n = ran.nextInt(100);
		System.out.println("Guess the number");
		int num = input.nextInt();	
		while(num < n || num > n) {
			if(num < n) {System.out.println("Too low. Try again");num = input.nextInt();}
			if(num > n) {System.out.println("Too high. Try again");num = input.nextInt();}}
		System.out.println("You guessed right");input.close();}}
