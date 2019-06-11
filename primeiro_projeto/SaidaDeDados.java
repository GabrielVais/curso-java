package primeiro_projeto;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char gender = 'f';
		
		int age = 32;
		
		double balance = 10.35784;
		
		String name = "Maria";
			
		
		
		System.out.print("GoodMorning!");
		
		System.out.println("Good Morning!");
		
		System.out.printf("%.2f%n", balance);
		
		System.out.printf("%.4f%n", balance);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.4f%n", balance);
		
		System.out.printf("%s is %d years old,"
				+ "gender %c and got balance = %.2f bitcoins%n", name, age, gender, balance);
	
	}

}
