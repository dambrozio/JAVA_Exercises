package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.Conta;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String nome;
		int num;
		char d_inicial;
		double valor = 0;
		
		System.out.println("Enter account number: ");
		num = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		nome = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		d_inicial = sc.next().charAt(0);
		Conta c;
		
		if (d_inicial == 'y') {
			
			System.out.println("Enter inicial deposit value: ");
			valor = sc.nextDouble();
			c = new Conta(num, nome, valor);
		}
			
		else {
			 c = new Conta(num, nome);
		}
		
		
		System.out.println("Account data:");
		System.out.println(c);
		
		System.out.println("Enter a deposit Value: ");
		valor = sc.nextDouble();
		c.depositar(valor);
		System.out.println(c);
		
		
		System.out.println("Enter a withdrae Value: ");
		valor = sc.nextDouble();
		c.sacar(valor);
		System.out.println(c);
		
	}

}
