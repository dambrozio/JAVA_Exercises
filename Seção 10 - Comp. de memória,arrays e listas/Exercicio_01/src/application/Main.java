package application;
import java.util.Scanner;

import entities.Estudante;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, email;
		int room=0;
		
		Estudante[] rent = new Estudante[10];
		
		System.out.println("How many rooms will be rented?");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<num; i++) {
			
			System.out.println("Rent #"+(i+1));
			
			System.out.print("Name: ");
			name= sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			sc.nextLine();
			
			rent[room] = new Estudante(name, email,room);
				
			
		}
		
		System.out.println("Busy Rooms:");
		for(int i=0; i<10;i++) {
			if(rent[i]!=null)
				System.out.println(rent[i]);
		}
			
		

	}

}
