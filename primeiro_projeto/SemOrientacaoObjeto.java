package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class SemOrientacaoObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle  X:");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		
		double py = (yA + yB + yC) / 2.0;
		
		double areaY = Math.sqrt(py * (py - yA) * (py - yB) * (py - yC));
		
		System.out.printf("larger area : %.4f%n", areaX);
		System.out.printf("Larger area : %.4f%n", areaY);
		
		
		if(areaX > areaY) {
			
			System.out.println("Larger area X");
		}else {
			
			System.out.println("Larger area Y");
		}

		sc.close();
		
	}

}
