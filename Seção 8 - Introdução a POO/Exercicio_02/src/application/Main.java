package application;
import java.util.Scanner;
import entities.Employees;

public class Main {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		Employees empl = new Employees();
		
		System.out.print("Name:");
		empl.name = sc.nextLine();
		System.out.print("Gross Salary:");
		empl.grossSalary = sc.nextDouble();
		System.out.print("Tax:");
	    empl.tax = sc.nextDouble();
					
		System.out.println(empl);
		
		System.out.println("Which percentage to increase salary?");
		double tax = sc.nextDouble();
		empl.IncreaseSalary(tax);
		
		System.out.println("Updated data: " + empl);
		
		sc.close();
	}

}