import java.util.Scanner;

import Entities.Triangle;

/**
 * @author sergio.ramos
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = x.area();
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = x.area();
		
		System.out.println("Area x: " + areaX);
		System.out.println("Area y: " + areaY);

	}
}