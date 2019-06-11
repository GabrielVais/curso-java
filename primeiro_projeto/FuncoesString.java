package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class FuncoesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String original = "abcde FDHJ ABC DEF";
	
		//toLowerCase transforma String em letras minusculas
		String s01 = original.toLowerCase();
		//toUpperCase transformar String em letras maiusculas
		String  s02 = original.toUpperCase();
		//trim retira os espacos da String
		String s03 = original.trim();
		//substring gera uma nova string a partir do  recorte
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		//replace troca o conteudo da string
		String s06 = original.replace('a', 'x');
		//indexOf pega a primeira posiçao da string como array
		int i = original.indexOf("bc");
		//lastIndexOf pega a ultima posiçao da string como array
		int j = original.lastIndexOf("bc");
	
		
		
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(i);
		System.out.println(j);
		
		sc.close();

	}

}
