package primeiro_projeto;

import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enther trhee numbers: ");
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
		
		
	}
	
	// criando fun�ao max
	
	public static int max(int x, int y, int z) {
		
		//criando variavel local
		
		int aux;
		
		if(x > y && x > z) {
			
			aux = x;
			
	
		}else if (y > z) {
			
			aux = y;
			
		}else {
			
			aux = z;
		}
		
		return aux;
		
	}
	
	//criando fun�ao show resulta
	
	public static void showResult(int value) {
		
		System.out.println("Higher = " + value);
		
	}

}
