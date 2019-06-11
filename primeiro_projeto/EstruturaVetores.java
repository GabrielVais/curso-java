package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero de vetores");
		
		int n = sc.nextInt();
		
		//criando um vetor
		
		double [] vect = new double [n];
		
		//fazendo um for para percorrer o vetor
		
		for (int i=0; i<n; i++) {
			
			//enquanto i < n incrementar 1 vetor
			vect[i] = sc.nextDouble();
			
		}
		
		//calculando a soma de todos os vetores
		
		double sum = 0.0;
		
		for(int i=0; i < n; i++) {
			
			sum += vect[i];
			
		}
		
		//calculando a media
		
		double avg = sum / n;
		
		System.out.println("Soma dos vetores " + sum);
		
		System.out.println("Media dos vetores " + avg);
		
		
		sc.close();
	}

}
