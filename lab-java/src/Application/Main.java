package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;
import Entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		 
		
		//OO_Rectangle();		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		OO_Produto(sc);
		

		sc.close();

	}

	/**
	 * 
	 */
	public static void OO_Rectangle() {
		Rectangle r = new Rectangle();
		r.height = 3;
		r.width = 4;
		
		System.out.println("Area: " + r.area());
		System.out.println("Perimetro: " + r.perimetro());
		System.out.println("diagonal: " + r.diagonal());
	}

	/**
	 * @param sc
	 */
	public static void OO_Produto(Scanner sc) {
		
		// Enter product
		System.out.println("Enter name");
		String name = sc.nextLine();

		System.out.println("Enter price");
		double price = sc.nextDouble();

		System.out.println("Enter quantity");
		int quantity = sc.nextInt();

//		System.out.println("Product: " + p.name + ";Price: " + p.price + ";Quantity: " + p.quantity);

		Product p = new Product(name, price, quantity) ;
	    System.out.println("Product data: " + p);
		System.out.println();
		
		p.setName("Computer");
		System.out.println("Update product to: "+ p.getName());

		System.out.println("Enter the number of product to be add in stock ");
		 quantity = sc.nextInt();
		p.addProducts(quantity);

		System.out.println("Product add update: " + p);
		System.out.println();

		System.out.println("Enter the number of product to be remove in stock ");
		quantity = sc.nextInt();
		p.removeProducts(quantity);

		System.out.println("Product remove update: " + p);
		System.out.println();
	}

}
