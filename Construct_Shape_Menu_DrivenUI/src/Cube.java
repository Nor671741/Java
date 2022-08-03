import javax.swing.JFrame;

/*
* Name: Sarah Plazio         C M S C  3 3 5 : Project 1
* Overview:	Object representing a Cube
*/
public class Cube extends ThreeDimensionalShape {

	private double edge;
	//constructors
	public Cube() {
		// TODO Auto-generated constructor stub
		edge = 1;
	}
	
	public Cube(double edge)
	{
		this.edge = edge;
	}

	//methods
	public double getArea()
	{
		return 6 * Math.pow(edge, 2);
	}

	public double getVolume()
	{
		return Math.pow(edge, 3);
	}
	
	public class CubeFrame extends JFrame 
	{
	
	   public CubeFrame() 
	   {
	        setTitle("Drawing a Cone");
	        setSize(500, 500);
	        setVisible(true);
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	        
	    }
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
