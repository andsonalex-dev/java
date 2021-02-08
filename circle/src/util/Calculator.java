package util;

public class Calculator {
	public static final double PI= 3.14159; //atribuindo uma constante publica
	
	
	public double circumference(double radius) {
		
		return 2*PI*radius;
	}
	
	public double volume(double radius) {
		return 4*PI* radius * radius *radius / 3;
	}

}
