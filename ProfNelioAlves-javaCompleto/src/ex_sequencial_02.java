

import java.util.Locale;
import java.util.Scanner;

public class ex_sequencial_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double pi = 3.14159;
				
		double r = sc.nextDouble();
		
		double r2 = Math.pow(r, 2);
		
				
		double area = pi * r2;
		
		sc.close();
		
		System.out.printf("A=%.4f", area);
		
		

	}

}
