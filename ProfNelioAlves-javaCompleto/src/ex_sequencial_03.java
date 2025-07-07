import java.util.Scanner;

public class ex_sequencial_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int DIFERENCA = (A * B) - (C * D);
		
		System.out.printf("DIFERENCA = " + DIFERENCA);
		
		sc.close();
		

	}

}
