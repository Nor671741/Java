import javax.swing.JFrame;

/*
* Name: Sarah Plazio     Nor671741@email.ccbcmd.edu     CMSC 335: Project 1
* Overview:	Object representing a Cylinder
*/
public class Cylinder extends ThreeDimensionalShape {

	private double radius;
	private double height;

	//constructors
	public Cylinder() {
		
		radius = 1;
		height = 1; 
	}
	
	public Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	//methods
	public double getArea()
	{
		return 2 * Math.PI * radius * (height + radius);
	}

	public double getVolume()
	{
		return Math.PI * Math.pow(radius, 2) * height;
		
	}
	
	public class CylinderFrame extends JFrame 
	{
	   public CylinderFrame() 
	   {
	        setTitle("Drawing a Cylinder");
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
