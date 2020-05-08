package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		
		String name, email, birth, prod_name;
		Integer num, quantity;
		Double price;
		
		System.out.print("Name: ");
		name = sc.nextLine();		
		System.out.print("Email: ");
		email = sc.nextLine();		
		System.out.print("Birth Date: ");
		birth = sc.nextLine();
		
		Client client = new Client(name,email, sdf.parse(birth));
	
		System.out.println("Enter Order Data");
		System.out.println("Status:");		
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		
		Order order = new Order(date.from(Instant.now()), status, client);
	
		System.out.print("How many items to this order?");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product Name: ");
			sc.nextLine();
			prod_name = sc.nextLine();
			System.out.println("Product Price: ");
			price = sc.nextDouble();
			
			Product prod = new Product(prod_name, price);
			
			System.out.print("Quantity: ");
			quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity,price, prod);
			
			order.addItem(item);
		}
		System.out.println();		
		System.out.println(order);
			
		
	}

}
