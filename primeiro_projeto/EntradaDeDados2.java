package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
			int n1 = sc.nextInt();//35
			//evitando que o nextLine consuma a quebra de linha
			//chamando um outro nextline
			
			sc.nextLine();
			
			String name = sc.nextLine();// bob
			
			//lendo um char
			
			char gender = sc.next().charAt(0);// F
			
			//guardando um codigo char e int
			
			String s = sc.next();
			
			char letter = s.charAt(0);
			
			int digit = Integer.parseInt(s.substring(1));
			
			double n2 = sc.nextDouble();
			
			//Maria F 23 1.68
			
			String name2 = sc.next();
			
			char ch = sc.next().charAt(0);
			
			int age = sc.nextInt();
			
			double height = sc.nextDouble();
			
			System.out.println(n1);
			
			System.out.println(name);
			
			System.out.println(gender);
			
			System.out.println(letter);
			
			System.out.println(digit);
			
			System.out.println(n2);
			
			System.out.println(name2);
			
			System.out.println(ch);
			
			System.out.println(age);
			
			System.out.println(height);
			
		
	
		
		sc.close();

	}

}
