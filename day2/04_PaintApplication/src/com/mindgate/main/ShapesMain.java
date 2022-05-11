package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.ShapeFactory;
import com.mindgate.pojo.Shapes;

public class ShapesMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;
		//System.out.println("Enter Your choice");
		System.out.println(" Menu \n1. Circle \n2. Triangle \n3. Square\n Enter Your choice");
		choice = scanner.nextInt();
		Shapes shapes=ShapeFactory.getShape(choice);
		if(shapes!=null)
		shapes.draw();
		else System.out.println("Invalid shape choice");
	}

}
