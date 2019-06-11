package primeiro_projeto;

import java.util.Scanner;

public class EstruturaMatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//criando a matriz que é um vetor bidmensional
		
		int[][] mat = new int[n][n];
		
		//fazendo um for para percorrer as linhas
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
		
		}
		
		//mostrando a diagonal
		
		System.out.println("Main diagonal:");
		
		for(int i=0; i<n; i++) {
			
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		System.out.println("--------------------------------");
		
		//quantidade de numeros negativos
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			
			for(int j=0; j<n; j++) {
				
				if(mat[i][j] < 0) {
					
					count++;
					
				}
				
			}
			
			
		}
		
		System.out.println("Negative numbers = " + count);
		
		//quantidade de linhas = math.length colunas = math[i].length
		
		sc.close();
		
	
	}

}
