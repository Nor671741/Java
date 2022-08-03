import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

/*
* Name: Sarah Plazio        C M S C  3 3 5 : Project 1
* Overview:	Object representing a cone
*/
public class Cone extends ThreeDimensionalShape {
	
	private double radius;
	private double height;
	private double slantLength;

	//constructors
	public Cone() {
		// TODO Auto-generated constructor stub
		radius = 1;
		height = 1;
	}
	
	public Cone(double radius, double height, double slantLength){
		this.radius = radius;
		this.height = height;
		this.slantLength = slantLength;
	}

	//methods
	public double getArea()
	{
		slantLength = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
		return Math.PI * radius * (radius + slantLength) ;
	}
	
	public double getVolume()
	{
		return Math.PI * Math.pow(radius, 2) * (height/3);
		
	}

	public class ConeFrame extends JFrame 
	{
	
	   public ConeFrame() 
	   {
	        setTitle("Drawing a Cone");
	        setSize(500, 500);
	        setVisible(true);
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	        
	    }
	    
		/*@Override
	    public void paint(Graphics g) {
	    	super.paint(g);
	    	Graphics2D g2d = (Graphics2D) g;
	        Shape coneShape = new Ellipse2D.Double(5, 5, radius*2, radius*2);
	        g2d.draw(circleShape);
	        repaint();
	    }*/
	
	}
}
