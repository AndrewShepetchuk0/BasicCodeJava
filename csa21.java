package csa2;
import java.util.*;

//Andrew Shepetchuk

public class csa21 {

	public static void main(String[] args) {
		//initializes variables
		int p1= 0, p2 = 0, p3 = 0, pos1=0, pos2=0, pos3=0;
		int pp1 = 0, pp2 = 0, pp3 = 0;
		
		//rolls the dice and stops when one player reaches 15
		while(p1 <= 15 || p2 <= 15 || p3 <= 15) {
			int v1 = dice(), v2 = dice();
			System.out.println("Player 1 rolled a " + v1 + " and a " + v2);
			p1 += v1 + v2;
			v1 = dice();
			v2 = dice();
			System.out.println("Player 2 rolled a " + v1 + " and a " + v2);
			p2 += v1 + v2;
			v1 = dice();
			v2 = dice();
			System.out.println("Player 3 rolled a " + v1 + " and a " + v2);
			p3 += v1 + v2;
		}
		//finds the position of each player
		if(p1 > p2) {pos1++;}
		if(p1 > p3) {pos1++;}
		if(p2 > p3) {pos2++;}
		if(p2 > p1) {pos2++;}
		if(p3 > p1) {pos3++;}
		if(p3 > p2) {pos3++;}
		
		if(pos1 ==2) {pp1 = 1;}
		if(pos1 ==1) {pp1 = 2;}
		if(pos1 ==0) {pp1 = 3;}
		if(pos2 ==2) {pp2 = 1;}
		if(pos2 ==1) {pp2 = 2;}
		if(pos2 ==0) {pp2 = 3;}
		if(pos3 ==2) {pp3 = 1;}
		if(pos3 ==1) {pp3 = 2;}
		if(pos3 ==0) {pp3 = 3;}
		
		//sorts win message
		if(pp1 <= pp2 && pp1 <= pp3) 
		{
			if(pp2 <= pp3) {
				System.out.println("Player one is in position " + pp1 + " with a score of " + p1);
				System.out.println("Player two is in position " + pp2 + " with a score of " + p2);
				System.out.println("Player three is in position " + pp3 + " with a score of " + p3);
			}
			else {
				System.out.println("Player one is in position " + pp1 + " with a score of " + p1);
				System.out.println("Player three is in position " + pp3 + " with a score of " + p3);
				System.out.println("Player two is in position " + pp2 + " with a score of " + p2);
			}
			
		}else if(pp2 <= pp1 && pp2 <= pp3)
		{
				if(pp1 <= pp3) {
					System.out.println("Player two is in position " + pp2 + " with a score of " + p2);
					System.out.println("Player one is in position " + pp1 + " with a score of " + p1);
					System.out.println("Player three is in position " + pp3 + " with a score of " + p3);
				}
				else {
					System.out.println("Player two is in position " + pp2 + " with a score of " + p2);
					System.out.println("Player three is in position " + pp3 + " with a score of " + p3);
					System.out.println("Player one is in position " + pp1 + " with a score of " + p1);
				
		}}else if(pp3 <= pp1 && pp3 <= pp2)
		{
			if(pp2 <= pp1) {
				System.out.println("Player three is in position " + pp3 + " with a score of " + p3);
				System.out.println("Player two is in position " + pp2 + " with a score of " + p2);
				System.out.println("Player one is in position " + pp1 + " with a score of " + p1);
			}
			else {
				System.out.println("Player three is in position " + pp3 + " with a score of " + p3);
				System.out.println("Player one is in position " + pp1 + " with a score of " + p1);
				System.out.println("Player two is in position " + pp2 + " with a score of " + p2);
			}
		}	
	}
	//rolls the dice
	public static int dice() 
	{
		Random d = new Random();
		int f = d.nextInt(1,7);
		return f;
	}

}
