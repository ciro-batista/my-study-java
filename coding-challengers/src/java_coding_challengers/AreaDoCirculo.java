package java_coding_challengers;
import java.util.Scanner;


public class AreaDoCirculo {

	public static void main(String[] args) {
		
		//Area = pi * r^2;
		
		
		try (Scanner input = new Scanner(System.in)) {
			double pi = 3.14159;
			
			double r = input.nextDouble();
			
			
			double a = pi * (r * r);
			
			System.out.printf("A=%.4f\n", a);
		}		

	}

}
