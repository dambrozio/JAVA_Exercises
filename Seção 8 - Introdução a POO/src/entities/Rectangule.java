package entities;

public class Rectangule {
	
	public double height;
	public double width;
	
	public double area() {
		return height * width;
	}
	
	public double perimeter() {
		return (2 * height) + (2 * width);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(height,2) + Math.pow(width,2));
	}
	

}
