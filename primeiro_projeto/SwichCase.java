package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class SwichCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			
		int x = sc.nextInt();
		
		String day;
		
		switch(x) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Sunday";
			break;
		case 3:
			day = "Sunday";
			break;
		case 4:
			day = "Sunday";
			break;
		case 5:
			day = "Sunday";
			break;
		case 6:
			day = "Sunday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			day = "Invalid value";
			
		}
		
		System.out.println("Day: " +day);
		sc.close();

	}
	

}
