package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int inicial, horafinal;
		double total;
		
		
		inicial = sc.nextInt();
		
		horafinal = sc.nextInt();
		
		
		if(inicial < horafinal) {
			
			total = horafinal - inicial;
		
			
		}else {
			
			total = 24 - inicial + horafinal;
		
		}
		
		
		System.out.println("O jogo durou " + total + "Horas(S)");
		
		sc.close();
		
		

	}

}
