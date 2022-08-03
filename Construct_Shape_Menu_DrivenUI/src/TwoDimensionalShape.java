/*
* Name: Sarah Plazio        C M S C  3 3 5 : Project 1
* Overview:	Object representing a 2D shape
*/
public abstract class TwoDimensionalShape implements Shape{
	
	public TwoDimensionalShape()
	{
		
	}
	
	//methods
	public String NumberOfDimensions() {
		return "Two Dimensional";
	}
	public abstract double getArea();
}
