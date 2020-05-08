package entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import entities.enums.OrderStatus;

public class Order {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	private Client client;
	List<OrderItem> order_item = new ArrayList<>();
	
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem item) {
		order_item.add(item);
	}
	
	public void removeItem(OrderItem item) {
		order_item.remove(item);
	}
	
	public double total() {
		double sum = 0;
		
		for (OrderItem o : order_item) {
			sum += o.subTotal();
		}
		
		return sum;
		
	}
	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY:" +"\n");
		sb.append("Order Moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append(client.toString() + "\n");
		sb.append("Order Items: " + "\n");
		for (OrderItem o : order_item) {
			sb.append(o.toString() + "\n");
		}
		sb.append("Total Price : " + String.format("%.2f", total()));
		
		return sb.toString();
		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
