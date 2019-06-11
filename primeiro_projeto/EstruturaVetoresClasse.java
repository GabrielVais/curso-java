package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class EstruturaVetoresClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//lendo a variavel n
		
		int n = sc.nextInt();
		
		//instanciando a classe Products
		
		Products[] vect = new Products[n];

		for (int i=0; i<vect.length; i++) {
			
			sc.nextLine();
			
			String name = sc.nextLine();
			
			double price = sc.nextDouble();
			
			vect[i] = new Products(name, price);		
			
		}
		
		double sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			
			//pegando so o preço do produto
			sum += vect[i].getPrice();
			
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("media = %.2f%n ", avg);
		
		sc.close();
		
	}

}
