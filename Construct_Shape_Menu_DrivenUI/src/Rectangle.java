import javax.swing.JFrame;

/*
* Name: Sarah Plazio         C M S C  3 3 5 : Project 1
* Overview:	Object representing a Rectangle 
*/

public class Rectangle extends TwoDimensionalShape {
	
	
	private double length;
	private double width;

	//constructors
	public Rectangle() {
		length = 2;
		width = 1;
	}
	
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}
	
	//methods
	public double getArea()
	{
		return length * width;
	}
	
	public class RectangleFrame extends JFrame 
	{
	   public RectangleFrame() 
	   {
	        setTitle("Drawing a Rectangle");
	        setSize(500, 500);
	        setVisible(true);
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);    
	    }
	    
		/*@Override
	    public void paint(Graphics g) {
	    	super.paint(g);
	    	Graphics2D g2d = (Graphics2D) g;
	        Shape circleShape = new Ellipse2D.Double(5, 5, radius*2, radius*2);
	        g2d.draw(circleShape);
	        repaint();
	    }*/
	}
}
