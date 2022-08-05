import javax.swing.JFrame;

/*
* Name: Sarah Plazio     Nor671741@email.ccbcmd.edu     CMSC 335: Project 1
* Overview:	Object representing a Torus
*/
public class Torus extends ThreeDimensionalShape {

	private double majorRadius;
	private double minorRadius;
	//constructors
	public Torus() {
		// TODO Auto-generated constructor stub
		majorRadius = 2;
		minorRadius = 1;
	}
	
	public Torus (double majorRadius, double minorRadius)
	{
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}

	//methods
	public double getArea()
	{
		//Surface Area = 4 × Pi^2 × R × r
		return 4 * Math.pow(Math.PI, 2) * majorRadius * minorRadius;
	}
	
	public double getVolume() 
	{
		//Volume = 2 × Pi^2 × R × r^2
		return 2 * Math.pow(Math.PI, 2) * majorRadius * Math.pow(minorRadius, 2);
	}

	public class TorusFrame extends JFrame 
	{
	   public TorusFrame() 
	   {
	        setTitle("Drawing a Torus");
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
