package application;

import java.util.Locale;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Product p = new Product("TV", 1000.0);
		OrderItem oi1 = new OrderItem(1, 1000.0, p);
		System.out.println(oi1);
		
		

	}

}
