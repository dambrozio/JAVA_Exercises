package utilities;

public class Aluno {
	
	public String nome;
	public double n1, n2, n3;
	
	
	public void boletim() {
		
		double nota_final = n1 + n2 + n3;
		
		if (nota_final >= 60) {
			System.out.println("FINAL GRADE = " + nota_final);
			System.out.println("PASS!");

		}
		
		else{
			System.out.println("FINAL GRADE = " + nota_final);
			System.out.println("FAILED!");
			System.out.println("MISSING " + String.format("%.2f",60-nota_final) + " POINTS!");
				
		}
	}
}
