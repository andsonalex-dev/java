package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do triangulo X, a, b e c, uma de cada vez: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo Y, a, b e c, uma de cada vez: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		System.out.printf("Área do triangulo X: %.4f%n", areaX);
		System.out.printf("Área do triangulo Y: %.4f%n", areaY);
		
		if(areaX>areaY) {
			System.out.printf("Maior área é a do triangulo X");
		}else {
			System.out.printf("Maior área é a do triangulo Y");
		}				
				
		sc.close();
	}

}
