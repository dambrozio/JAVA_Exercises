package entities;

public class Employees {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double NetSalary() {
		return (grossSalary - tax);
	}

	public void IncreaseSalary (double percentage) {
		grossSalary += grossSalary * percentage/100;
	}
	
	public String toString(){
		return "Employee: " + name + ", $" + String.format("%.2f",  NetSalary());
	}
}
