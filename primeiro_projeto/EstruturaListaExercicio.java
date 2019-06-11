package primeiro_projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregados;

public class EstruturaListaExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
			
		Scanner sc = new Scanner(System.in);
			
		List<Empregados> empregados = new ArrayList<>();
		
		System.out.println("How many employees will be registred ?");
		
		int n = sc.nextInt();
		
		
		for(int i=0; i < n; i++) {
			
			System.out.println("Employee # " + (i + 1));
			
			System.out.print("ID "); 
			
			Integer id = sc.nextInt();
			
			System.out.print("Name: "); 
			
			sc.nextLine();
			
			String nome = sc.nextLine();
		
			System.out.print("Salary: "); 
			
			Double salario = sc.nextDouble();
			
			empregados.add(new Empregados(id, nome, salario));
			
			
			System.out.println();
				
		}
		
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Empregados emp = empregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (Empregados obj : empregados) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
}
