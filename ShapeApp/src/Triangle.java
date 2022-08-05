import javax.swing.JFrame;

/*
* Name: Sarah Plazio     Nor671741@email.ccbcmd.edu     CMSC 335: Project 1
* Overview:	Object representing a Triangle
*/
public class Triangle extends TwoDimensionalShape {
	private double base;
	private double height;
	// constructors
	public Triangle() {
		// TODO Auto-generated constructor stub
		base = 1;
		height = 2;	
	}
	
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	//methods
	public double getArea()
	{
		return 0.5 * base * height;
	}

	public class TriangleFrame extends JFrame 
	{
	   public TriangleFrame() 
	   {
	        setTitle("Drawing a Triangle");
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
