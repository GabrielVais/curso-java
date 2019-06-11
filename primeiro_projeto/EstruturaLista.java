package primeiro_projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstruturaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando a lista de numeros inteiros 
		
		List<String> list = new ArrayList<>();
		
		//colocando elementos na lista
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Roberval");
		
		//colocando um elemento de determinando a posiçao
		
		list.add(2, "Roberpai");
		
		//imprimindo o tamanho da lista
		
		System.out.println(list.size());
				
		//imprimindo a lista com forEach
		for(String x : list) {
			
			System.out.println(x);
			
		}
		
		System.out.println("------------------------------------");
				
		//removendo um elemento da lista a partir da comparaçao
		
				list.remove("Maria");
				
		//removendo um elemento da lista a partir da posiçao
				
				list.remove(1);
				
		//removendo elementos por predicado
				
				//remove o elemento que a primeira letra é igual a M
				
				list.removeIf(x -> x.charAt(0) == 'M');
				
				for(String x : list) {
					
					System.out.println(x);
										
				}
				
		System.out.println("------------------------------------");
		
		//Encontrando a posiçao de um elemento por meio da lista
				
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		
		System.out.println("------------------------------------");
		
		//Filtrando a lista apenas para que os elementos que começam com A
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			
			System.out.println(x);
								
			}
		System.out.println("------------------------------------");
		
		//Filtrando o primeiro elemento que atenda o predicado da lista
		
			String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
			
			System.out.println(name);

		}

}
