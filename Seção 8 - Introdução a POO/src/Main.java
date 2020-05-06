import entities.Rectangule;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		Rectangule ret = new Rectangule();
		
		System.out.print("Enter rectangle width and height:");
		ret.width = sc.nextDouble();
	    ret.height = sc.nextDouble();
					
		System.out.println("AREA: " + ret.area());
		System.out.println("PERIMETER: " + ret.perimeter());
		System.out.println("DIAGONAL: " + ret.diagonal());
		
		sc.close();
	}

}
