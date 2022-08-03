import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

/*
* Name: Sarah Plazio          C M S C  3 3 5 : Project 1
* Overview:	Object representing a circle
*/
public class Circle  extends TwoDimensionalShape {
	
	private double radius;
	private double circumference;
	// input the value for circle and square.
	Shape circle=new Ellipse2D.Double();


/*	public Circle() {
		// TODO Auto-generated constructor stub
		radius = 1;
		circle = new Ellipse2D.Double(100, 100, 100, 100);
		
	}*/
	
	public Circle(double radius)
	{
		this.radius = radius;
		this.circle = new Ellipse2D.Double(100, 100, radius*2, radius*2);
		
	}
	
	//methods
	
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	public double getCircumference()
    {
    return circumference = 2 * Math.PI * radius;
    }
	
	public class CircleFrame extends JFrame 
	{
	
	   public CircleFrame() 
	   {
	        setTitle("Drawing a Circle");
	        setSize(500, 500);
	        setVisible(true);
	        
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	        
	    }
	    
		@Override
	    public void paint(Graphics g) {
	    	super.paint(g);
	    	Graphics2D g2d = (Graphics2D) g;
	        Shape circleShape = new Ellipse2D.Double(5, 5, radius*2, radius*2);
	        g2d.draw(circleShape);
	        repaint();
	    }
	
	}
}




