package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;


import entities.Room;

public class EstruturaVetoresExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		//instanciando a classe Room
		
		Room[] vect = new Room[n];
		
		for(int i=0; i < vect.length; i++) {
		
		
		sc.nextLine();
		
		System.out.println("Rent #" + (i + 1));
		
		System.out.printf("Name: "); String name = sc.nextLine();
		
		System.out.printf("Email: "); String email = sc.nextLine();
		
		System.out.printf("Room: " ); int quarto = sc.nextInt();
		
		vect[i] = new Room(name, email, quarto);
		
		System.out.println();
		
		
		}
		System.out.println("Busy rooms: ");
		
		for(int i=0; i<vect.length; i++) {
			
			if(vect[i] != null) {
			
			
			
			System.out.printf("%n" + vect[i].getQuarto() + " : " + vect[i].getName() + " , " + vect[i].getEmail());
			
			}
			
		}
		
		sc.close();
		
		

	}

}
