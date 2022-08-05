/*
* Name: Sarah Plazio     Nor671741@email.ccbcmd.edu     CMSC 335: Project 1
* Overview:	Program that shows the area or volume of a shape chosen by the 
* user with required measurements to calculate from the user as well.
*/

import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

//============================================================================


public class ConstructShapes {
		
	public static void main(String[] args) {
			
		System.out.println("*********Welcome to the Java OO " 
			+ "Construct Shapes Program **********");		
		int choice = displayMenu();
	
		while (choice != 10) {
			switch(choice)
			{
			case 1:
				constructCircle();
				break;
			case 2:
				constructRectangle();
				break;
			case 3:
				constructSquare();
				break;
			case 4: 
				constructTriangle();
				break;
			case 5:
				constructSphere();
				break;
			case 6:
				constructCube();
				break;
			case 7:
				constructCone();
				break;
			case 8:
				constructCylinder();
				break;
			case 9:
				constructTorus();
				break;
			default:
				//handles if input is not an option.
				System.out.println("That is not valid option, " +
				"please try again." );
			}
			
			
			//recursive call for DisplayMenu()
			choice = displayMenu();
		}
		if (choice == 10)
		{
			exitProgram();
		}
	
}
	
	static double getInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		double value = 0.0;
		try {
			value = Double.valueOf(input);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("invalid input");
		} /*
			 * catch (NoSuchElementException e) { value = Double.valueOf(input); }
			 */
		//scan.close();
		return value;
	}
//	static double getInput() {
//		Scanner scan = new Scanner(System.in);
//		
//		try {
//			return scan.nextDouble();
//		} catch (InputMismatchException e) {
//			// choice is set to 11 to trigger default message in switch
//			
//		}
//		return 0.0;
//		
//	}

	private static void constructTorus() {
		// TODO Auto-generated method stub
		//System.out.println("torus");
		double majorRadius;
		double minorRadius;
		System.out.println("Torus selected\n" + "Enter major radius: ");
		majorRadius = getInput();
		System.out.println("Enter minor radius: ");
		minorRadius = getInput();
		if (majorRadius > 0 && minorRadius > 0) {
			//create Torus
			Torus torus1 = new Torus(majorRadius, minorRadius);
			System.out.println("The volume of the torus is " + torus1.getVolume() + ".");
		}
	}

	private static void constructCylinder() {
		// TODO Auto-generated method stub
		//System.out.println("cylinder");
		double radius;
		double height;
		System.out.println("Cylinder selected\n" + "Enter radius: ");
		radius = getInput();
		System.out.println("Enter height: ");
		height = getInput();
		if (radius > 0 && height > 0) {
			//create Cylinder
			Cylinder cylinder1 = new Cylinder(radius, height);
			System.out.println("The volume of the cylinder is " + cylinder1.getVolume() + ".");
		}
	}

	private static void constructCone() {
		// TODO Auto-generated method stub
		//System.out.println("cone");
		double radius;
		double height;
		double slantLength;
		System.out.println("Cone selected\n" + "Enter radius: ");
		radius = getInput();
		System.out.println("Enter height: ");
		height = getInput();
		System.out.println("Enter slant length: ");
		slantLength = getInput();
		
		if (radius > 0 && height > 0 && slantLength > 0) {
			Cone cone1 = new Cone(radius, height, slantLength);
			System.out.println("The volume of the cone is " + cone1.getVolume() + ".");
		}
		
	}

	private static void constructCube() {
		// TODO Auto-generated method stub
		//System.out.println("cube");
		double edge;
		System.out.println("Cube selected\n" + "Enter edge length: ");
		edge = getInput();
		if (edge > 0) {
			//create Cube
			Cube cube1 = new Cube(edge);
			System.out.println("The volume of the cube is " + cube1.getVolume() + ".");
		}
		
	}

	private static void constructSphere() {
		// TODO Auto-generated method stub
		//System.out.println("sphere");
		double radius;
		System.out.println("Sphere selected\n" + "Enter radius: ");
		radius = getInput();
		//create Sphere
		if (radius > 0) {
			Sphere sphere1 = new Sphere(radius);
			System.out.println("The volume of the sphere is " + sphere1.getVolume() + ".");
		}
	}

	private static void constructTriangle() {
		// TODO Auto-generated method stub
		//System.out.println("triangle");
		double base = 2;
		double height = 1;
		System.out.println("Triangle selected\n" + "Enter base: ");
		base = getInput();
		System.out.println("Enter height: ");
		height = getInput();
		if (base > 0 && height > 0) {
			Triangle triangle1 = new Triangle(base, height);
			System.out.println("The area of the triangle is " + triangle1.getArea() + ".");
		}
		
	}

	private static void constructSquare() {
		// TODO Auto-generated method stub
		//System.out.println("square");
		double edge;
		System.out.println("Square selected\n" + "Enter edge length: ");
		edge = getInput();
		if (edge > 0) {
			Square square1 = new Square(edge);
			System.out.println("The area of the square is " + square1.getArea() + ".");
		}
		
	}

	private static void constructRectangle() {
		// TODO Auto-generated method stub
		//System.out.println("rectangle");
		double length;
		double width;
		System.out.println("Rectangle selected\n" + "Enter length: ");
		length = getInput();
		System.out.println("Enter width: ");
		width = getInput();
		if (length > 0 && width > 0) {
			Rectangle rectangle1 = new Rectangle(length, width);
			System.out.println("The area of the rectangle is " + rectangle1.getArea() + ".");
		}
	}

	private static void constructCircle() {
		// TODO Auto-generated method stub
		// used for testing    System.out.println("circle");
		double radius; 
		System.out.println("Circle selected\n" + "Enter radius: ");
		radius = getInput();
		if (radius > 0) {
			//create circle
			Circle circle1 = new Circle(radius);
			System.out.println("The area of the circle is " + circle1.getArea() + ".");
		}
			}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		Date now = new Date();
		String timestamp = now.toString(); 
		System.out.println("Thank you for visiting the Construct Shape Program");
		System.out.println("Timestamp: " + timestamp);
	}

	private static int displayMenu() {
		// displays menu for options to construct a shape
		
		int choice = 0;
		Scanner input = new Scanner(System.in);
		//List<Integer> options = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println("\nSelect from the menu below:\n" +
		"1. Construct a Circle\n" +
		"2. Construct a Rectangle\n" +
		"3. Construct a Square\n" +
		"4. Construct a Triangle\n" +
		"5. Construct a Sphere\n" +
		"6. Construct a Cube\n" +
		"7. Construct a Cone\n" +
		"8. Construct a Cylinder\n" +
		"9. Construct a Torus\n" +
		"10. Exit the program\n");	
		
		try {
			choice = input.nextInt();
		} catch (InputMismatchException e) {
			// choice is set to 11 to trigger default message in switch
			choice = 11;
		}
		//input.close();
		return choice;
	}
}

