package application;

import java.util.Scanner;

import utilities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno a = new Aluno();
		
		a.nome = sc.nextLine();
		a.n1 = sc.nextDouble();
		a.n2 = sc.nextDouble();
		a.n3 = sc.nextDouble();
		
		a.boletim();
		
		sc.close();
		
	}

}
