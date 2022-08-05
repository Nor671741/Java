/*
* Name: Sarah Plazio     Nor671741@email.ccbcmd.edu     CMSC 335: Project 1
* Overview:	Object representing a 3D shape
*/
public abstract class ThreeDimensionalShape implements Shape {

	public ThreeDimensionalShape() {
		// TODO Auto-generated constructor stub
	}
		public String NumberOfDimensions() {
		return "Three Dimensional";
	}
	public abstract double getArea();
	public abstract double getVolume();
}