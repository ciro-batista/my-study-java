import java.util.Locale;
import java.util.Scanner;

public class ex_sequencial_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
	
		
		Scanner sc = new Scanner(System.in);
		
		
		int NUMBER = sc.nextInt();
		int h = sc.nextInt();
		double vh = sc.nextDouble();
		
		
		double SALARY = h * vh;
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f", SALARY);
		
		
		sc.close();
		
			

	}

}

