/*
* Name: Sarah Plazio     Nor671741@email.ccbcmd.edu     CMSC 335: Project 1
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
