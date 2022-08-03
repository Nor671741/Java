import javax.swing.JFrame;

/*
* Name: Sarah Plazio         C M S C  3 3 5 : Project 1
* Overview:	Object representing a Square
*/
public class Square extends TwoDimensionalShape {

	private double edge;
	
	//constructors
	public Square() {
		edge = 2;

	}
	
	public Square(double edge) 
	{
		this.edge = edge;
	}
	
	//methods
	public double getArea()
	{
		return Math.pow(edge, 2);
	}
	
	public class SquareFrame extends JFrame 
	{
	   public SquareFrame() 
	   {
	        setTitle("Drawing a Square");
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
