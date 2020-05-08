package entities;

public class OrderItem {
	
	private Integer quantity;
	private double price;
	private Product prod;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, double price, Product prod) {
		this.quantity = quantity;
		this.price = price;
		this.prod = prod;
	}
	
	public double subTotal() {
		return price*quantity;
	}
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProd() {
		return prod;
	}
	
	public String toString() {
		return prod.getName() 
				+ ", " 
				+ String.format("%.2f", price) 
				+ ", Quantity: " + quantity
				+ ", Subtotal: " + String.format("%.2f",subTotal());
	}
	
}
