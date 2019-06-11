package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os numeros que vc quer");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			System.out.print("Value #" + i + ": ");
			
			int x =  sc.nextInt();
			
			sum += x;
		}
		
		System.out.println("Sum = "+ sum);
		
		sc.close();

	}

}
