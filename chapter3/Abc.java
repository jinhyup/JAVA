package chapter3;

import java.util.Random;
import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		Random random  = new Random();
	      int score = random.nextInt(101);
	      if (90 <= score) {
	         System.out.println("A");
	      } else if (80 <= score) {
	         System.out.println("B");
	      } else if (70 <= score) {
	         System.out.println("C");
	      } else{
	         System.out.println("D");
	      }
	      
	}
	

}
