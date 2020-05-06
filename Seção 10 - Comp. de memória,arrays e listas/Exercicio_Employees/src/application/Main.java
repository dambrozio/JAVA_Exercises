package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, id;
		String nome;
		double salario, porc;
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantos Funcionarios? ");
		num = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<num; i++) {
			
			System.out.println("Employee #" + (i+1));
			
			System.out.print("ID: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Salario: ");
			salario = sc.nextDouble();
			
			list.add(new Employee(id,nome,salario));
			
		}
		
		System.out.print("ID para aumento de salario: ");
		int id1 = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id1).findFirst().orElse(null);
		if (emp == null) {
			
			System.out.println("Não existe!");
		}
		else {
			System.out.print("Porcentagem: ");
			porc = sc.nextDouble();
			
			emp.aumento_salario(porc);
		}
		
		
		System.out.println("Empregados: ");
		for(Employee x : list) {
			System.out.println(x);
		}
		
			
	}

}
