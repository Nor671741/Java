import javax.swing.JFrame;

/*
* Name: Sarah Plazio         C M S C  3 3 5 : Project 1
* Overview:	Object representing a Sphere
*/
public class Sphere  extends ThreeDimensionalShape {

	private double radius;
	//constructors
	public Sphere() {
		// TODO Auto-generated constructor stub
		radius = 1;
	}
	
	public Sphere(double radius)
	{
		this.radius = radius;
	}

	//methods
	public double getArea()
	{
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public double getVolume()
	{
		return (4/3) * Math.PI * Math.pow(radius, 3);
	}

	public class SphereFrame extends JFrame 
	{
	   public SphereFrame() 
	   {
	        setTitle("Drawing a Sphere");
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
