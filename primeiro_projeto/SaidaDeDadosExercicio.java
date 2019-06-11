package primeiro_projeto;

import java.util.Locale;

public class SaidaDeDadosExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product1 = "Computer";
		
		String product2 = "Office desk";
		
		int age = 30;
		
		int code = 5290;
		
		double price1 = 2100.0;
		
		double price2 = 650.50;
		
		double measure = 53.234567;
		
		System.out.printf("Products %s, Which price is %3.2f%n", product1, price1);
		System.out.printf("Office desk, %s, Which price is %3.2f%n%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d%n%n", age, code);
		
		System.out.printf("Measure with eight decimal places: %3.8f %n", measure);
		
		System.out.printf("Rounded(three decimal places): %3.3f %n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("US decimal pont: %3.3f", measure);

	}

}
