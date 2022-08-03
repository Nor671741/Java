/*
* Name: Sarah Plazio         C M S C  3 3 5 : Project 1
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