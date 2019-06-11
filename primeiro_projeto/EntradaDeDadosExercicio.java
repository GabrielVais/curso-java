package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter your full name:");
			
			sc.nextLine();	
			
			String name = sc.nextLine();// bob
			
			System.out.printf("How many bedrooms are in your house");

			int n1 = sc.nextInt(); // 3
			
			sc.nextLine();	
			
			System.out.printf("Enter product price:");
			
			
			sc.nextLine();	
			
			double n2 = sc.nextDouble();
			
			sc.nextLine();	
			
			System.out.printf("Enter  your last name, age height (same line):");
			
			sc.nextLine();	
			
			String lastname = sc.next();
			
			int n3 = sc.nextInt();
			
			double digit = sc.nextDouble();
				
			
			System.out.println(name);
			
			System.out.println(n1);
			
			System.out.printf("%.2f%n", n2);
			
			System.out.println(lastname);
			
			System.out.println(n3);
			
			System.out.printf("%.2f", digit);
			
			
			
			
		
		sc.close();
		

	}

}
