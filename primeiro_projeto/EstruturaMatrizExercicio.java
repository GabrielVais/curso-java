package primeiro_projeto;

import java.util.Scanner;

public class EstruturaMatrizExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();

		int c = sc.nextInt();
	
		int[][] mat = new int[l][c];
		
		//fazendo um for para percorrer as linhas
		
		for(int i=0; i<l; i++) {
			
			for (int j=0; j<c; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
		
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < l; i++) {
			
			for(int j=0; j<c; j++) {
				
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					
				}
				
				if(j > 0) {
					
					System.out.println("Left: " + mat[i][j - 1]);
				}
				
				if(i > 0) {
					
					System.out.println("Up: " + mat[i-1][j]);
				}
				
				if (j < mat[i].length-1) {
					
					System.out.println("Right: " + mat[i][j+1]);
				}
				if (i < mat.length-1) {
					
					System.out.println("Down: " + mat[i+1][j]);
				}
				
			}
			
			
		}
		
		

		
		sc.close();
		
		
	}

}
