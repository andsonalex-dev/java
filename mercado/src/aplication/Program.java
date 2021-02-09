package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		
		System.out.println("Enter prodcut data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		System.out.println("Product Data: "+ product);		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int newQuantity = sc.nextInt();
		product.addProducts(newQuantity);		
		System.out.println();		
		System.out.println("Update Data: "+ product);
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		newQuantity = sc.nextInt();
		product.removeProducts(newQuantity);
		System.out.println();
		System.out.println("Remove Data: "+ product);
		
		sc.close();
	}

}
