import java.util.HashMap;
import java.util.Scanner;

public class Customer {
	private String name;
	private String order;
	private double price;
	final static double TIP_TAX = 1.15;
	
	private HashMap<String, Double> menu;

	public Customer(String n, HashMap<String, Double> m) {
		name = n;
		
		menu = m;
		

	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		String[] orderItems = order.split(",");
		for (String s : orderItems) {
			if (menu.containsKey(s))
				price += menu.get(s);
		}

		price *= TIP_TAX;
		
		return price;
	}

	public void takeOrder()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ok, " + name + " what can I get you?");
		order = scan.nextLine();
		
	}
	
	public void addToOrder(String s) {
		order += s;
	}

	public String toString() {
		return name;
	}

}