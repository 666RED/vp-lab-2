package com.hongchen.vp_lab2;

public class Main {

	public static void main(String[] args) {
		Polygon polygon  = new Polygon();
		Triangle triangle  = new Triangle();
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Area of Polygon: " + polygon.getArea() + "\n");
		System.out.print("Area of Triangle: " + triangle.getArea() + "\n");
		System.out.print("Area of Rectangle: " + rectangle.calcArea());
	}
}
