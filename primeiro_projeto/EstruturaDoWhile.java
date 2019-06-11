package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
		
		double n = sc.nextDouble();
		
		double sq = Math.sqrt(n);
		
		System.out.printf("Square root = %.3f%n", sq);
		
		System.out.println("Dejesa continuar Y = SIM N = N");
		
		resp = sc.nextLine().charAt(0);
		
		}while(resp != 'n');
		
		sc.close();

	}

}
