import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ShapeAppPanel extends JPanel 
{
	//variables
	private static final long serialVersionUID = -3628482492750802253L;
	//private int shapeSel = 0;
	private String shapeSelected = "";
	private JButton circle, square, triangle, rectangle, sphere, 
		cube, cone, cylinder, torus, display;
	private JLabel radiusLabel = new JLabel ("Enter radius: ");
	private JLabel heightLabel = new JLabel ("Enter height: ");
	private JLabel slantLenLabel = new JLabel ("Enter slant length: ");
	private JLabel edgeLabel = new JLabel ("Enter edge: ");
	private JLabel lengthLabel = new JLabel ("Enter length: ");
	private JLabel widthLabel = new JLabel ("Enter width: ");
	private JLabel majorRadiusLabel = new JLabel ("Enter major radius: ");
	private JLabel minorRadiusLabel = new JLabel ("Enter minor radius: ");
	private JLabel baseLabel = new JLabel ("Enter radius: ");
	
	private JTextField aField = new JTextField (10);
	private JTextField bField = new JTextField (10);
	private JTextField cField = new JTextField (10);
	
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	JTextArea inputArea = new JTextArea (5,30);
	JTextField inputField = new JTextField (20);
	   
	//-----------------------------------------------------------------
	//  Constructor: Sets up the GUI.
	//-----------------------------------------------------------------
	public ShapeAppPanel()
	{
		//buttons
	 	circle = new JButton ("Circle");
	 	square = new JButton ("Square");
	 	triangle = new JButton ("Triangle");
	 	rectangle = new JButton ("Rectangle");
	 	sphere = new JButton ("Sphere");
	 	cube = new JButton ("Cube");
	 	cone = new JButton ("Cone");
	 	cylinder = new JButton ("Cylinder");
	 	torus = new JButton ("Torus");
	 	display = new JButton("Display");
	 	
	 	//actionListener for buttons
	 	circle.addActionListener (new ButtonListener());
	 	square.addActionListener (new ButtonListener());
	 	triangle.addActionListener (new ButtonListener());
	 	rectangle.addActionListener (new ButtonListener());
	 	sphere.addActionListener (new ButtonListener());
	 	cube.addActionListener (new ButtonListener());
	 	cone.addActionListener (new ButtonListener());
	 	cylinder.addActionListener (new ButtonListener());
	 	torus.addActionListener (new ButtonListener());
	 	display.addActionListener (new ButtonListener());
		
	   	//add text area to panel 1
	  	//panel1.add(inputArea);
	      
	  	
	  		  	
	  //add panels to frame
	 	add(circle);
	 	add(square);
	 	add(triangle);
	 	add(rectangle);
	 	add(sphere);
	 	add(cube);
	 	add(cone);
	 	add(cylinder);
	 	add(torus);
	 	add(inputField);
	 	//add(panel2, BorderLayout.SOUTH);
	  //frame properties
	   	setBackground (Color.lightGray);
	   	setPreferredSize (new Dimension(800, 200));
	}//ends constructor
	
	//*****************************************************************
	//  Represents a listener for button (action) events.
	//*****************************************************************

	public class ButtonListener implements ActionListener {
	
		public void actionPerformed(ActionEvent event) {
			
	    	
	    	//get source
			Object selection = event.getSource();
	    	//String shapeSelected = "not";
	    	String aInput = "";
	    	String bInput = "";
	    	String cInput = "";
	    	
	    	
			//circle button event
	    	if (selection == circle)
	    	{	
	    		panel2.removeAll();
	    		shapeSelected = "circle";
	    		inputField.setText("Circle Selected");   			    		
	    		panel2.add(radiusLabel);
	    		panel2.add (aField);	
	    		panel2.add(display);
	    	  	panel2.setSize(100, 5);
	    		add(panel2);   	  	
	    	  	revalidate();
	    	  	repaint();
	    	}
	    	  	
	    	if (selection == square)
	    	{	
	    		panel2.removeAll();
	    		inputField.setText("Square Selected");
	    		//class CirclePanal extends JPanel{
	    		panel2.removeAll();
	    		
	    		panel2.add(edgeLabel);
	    		panel2.add (aField);	
	    		panel2.add(display);
	    	  	add(panel2);
	    	  	shapeSelected = "square";
	    	  	revalidate();
	    	  	repaint();
	    	}
	    	
	    	if (selection == triangle)
	    	{	
	    		panel2.removeAll();
	    		inputField.setText("Triangle Selected");
	    		//class CirclePanal extends JPanel{
	    		
	    		panel2.add(baseLabel);
	    		panel2.add (aField);	
	    		panel2.add(heightLabel);
	    		panel2.add (bField);	
	    		panel2.add(display);
	    	  	add(panel2);
	    	  	shapeSelected = "triangle";
	    	  	revalidate();
	    	  	repaint();
	    	}
	    	
	    	if (selection == rectangle)
	    	{	
	    		panel2.removeAll();
	    		inputField.setText("Rectangle Selected");
	    		//class CirclePanal extends JPanel{
	    		
	    		panel2.add(lengthLabel);
	    		panel2.add (aField);
	    		panel2.add(widthLabel);
	    		panel2.add (bField);
	    		panel2.add(display);
	    	  	add(panel2);
	    	  	shapeSelected = "rectangle";
	    	  	revalidate();
	    	  	repaint();
	    	}
	    	
	    	if (selection == sphere)
	    	{	
	    		panel2.removeAll();
	    		inputField.setText("Sphere Selected");
	    		//class CirclePanal extends JPanel{
	    		
	    		panel2.add(radiusLabel);
	    		panel2.add (aField);	
	    		panel2.add(display);
	    	  	add(panel2);
	    	  	shapeSelected = "sphere";
	    	  	revalidate();
	    	  	repaint();
	    	}
	    	
	    	if (selection == cube)
	    	{	
	    		panel2.removeAll();
	    		inputField.setText("Cube Selected");
	    		//class CirclePanal extends JPanel{
	    		
	    		panel2.add(edgeLabel);
	    		panel2.add (aField);	
	    		panel2.add(display);
	    	  	add(panel2);
	    	  	shapeSelected = "cube";
	    	  	revalidate();
	    	  	repaint();
	    	}
	    	
	    	if (selection == cone)
	    	{	
	    		panel2.removeAll();
	    		inputField.setText("Cone Selected");
	    		//class CirclePanal extends JPanel{
	    		
	    		panel2.add(radiusLabel);
	    		panel2.add (aField);	
	    		panel2.add(heightLabel);
	    		panel2.add (bField);
	    		panel2.add(slantLenLabel);
	    		panel2.add (cField);
	    		panel2.add(display);
	    	  	add(panel2);
	    	  	shapeSelected = "cone";
	    	  	revalidate();
	    	  	repaint();
	    	}
	    	
	    	if (selection == cylinder)
	    	{	
	    		panel2.removeAll();
	    		inputField.setText("Cylinder Selected");
	    		//class CirclePanal extends JPanel{
	    		
	    		panel2.add(radiusLabel);
	    		panel2.add (aField);
	    		panel2.add(heightLabel);
	    		panel2.add (bField);
	    		panel2.add(display);
	    	  	add(panel2);
	    	  	shapeSelected = "cylinder";
	    	  	revalidate();
	    	  	repaint();
	    	}
	    	if (selection == torus)
	    	{	
	    		panel2.removeAll();
	    		inputField.setText("Torus Selected");
	    		//class CirclePanal extends JPanel{
	    		
	    		panel2.add(majorRadiusLabel);
	    		panel2.add (aField);	
	    		panel2.add(minorRadiusLabel);
	    		panel2.add (bField);	
	    		panel2.add(display);
	    	  	add(panel2);
	    	  	shapeSelected = "torus";
	    	  	revalidate();
	    	  	repaint();
	    	}
	    	
	    	// display button event
		    if (selection == display)
			{
		    	//inputField.setText("Display Selected " + shapeSelection);
		    	
		    	if (shapeSelected.equals("circle"))	
				{		    	
					aInput = aField.getText();
					if(!aInput.isEmpty())
		    		{
		    			try 
		    			{
		    				double i = Double.parseDouble(aInput);
							DisplayCircle(i);
						} catch (NumberFormatException e) {
						radiusLabel.setText("Invalid Entry. Enter radius (ex: 5.2)");
						}//end try/catch
	    			repaint();
		    		}//end if
					//revalidate();
		    	  	//repaint();
				}//end if selected circle
				
				if (shapeSelected.equals("square"))	
				{
					inputField.setText("Display Selected ");
					aInput = aField.getText();
					
		    	  	if(!aInput.isEmpty())
		    		{
		    			try 
		    			{
		    				double i = Double.parseDouble(aInput);
							DisplaySquare(i);
						} catch (NumberFormatException e) {
						edgeLabel.setText("Invalid Entry. Enter numbers (ex: 5.2)");
						}//end try/catch
	    			
		    		}//end if
				}
				
				if (shapeSelected.equals("triangle"))	
				{
					inputField.setText("Display Selected ");
					 aInput = aField.getText();
					 bInput = bField.getText();
					
		    	  	if(!aInput.isEmpty() && !bInput.isEmpty())
		    		{
		    			try 
		    			{
		    				double i = Double.parseDouble(aInput);
		    				double j = Double.parseDouble(bInput);
							DisplayTriangle(i, j);
						} catch (NumberFormatException e) {
						baseLabel.setText("Invalid Entry. Enter numbers (ex: 5.2)");
						}//end try/catch
	    			
		    		}//end if
				}
				
				if (shapeSelected.equals("rectangle"))	
				{
					inputField.setText("Display Selected ");
					aInput = aField.getText();
					bInput = bField.getText();
					
		    	  	if(!aInput.isEmpty() && !bInput.isEmpty())
		    		{
		    			try 
		    			{
		    				double i = Double.parseDouble(aInput);
		    				double j = Double.parseDouble(bInput);
							DisplayRectangle(i, j);
						} catch (NumberFormatException e) {
						lengthLabel.setText("Invalid Entry. Enter number (ex: 5.2)");
						}//end try/catch
	    			
		    		}//end if
				}
				
				if (shapeSelected.equals("sphere"))	
				{
					inputField.setText("Display Selected ");
					aInput = aField.getText();
					
		    	  	if(!aInput.isEmpty())
		    		{
		    			try 
		    			{
		    				double i = Double.parseDouble(aInput);
							DisplaySphere(i);
						} catch (NumberFormatException e) {
						radiusLabel.setText("Invalid Entry. Enter radius (ex: 5.2)");
						}//end try/catch
	    			
		    		}//end if
				}
				
				if (shapeSelected.equals("cube"))	
				{
					inputField.setText("Display Selected ");
					 aInput = aField.getText();
					
		    	  	if(!aInput.isEmpty())
		    		{
		    			try 
		    			{
		    				double i = Double.parseDouble(aInput);
							DisplayCube(i);
						} catch (NumberFormatException e) {
						edgeLabel.setText("Invalid Entry. Enter number (ex: 5.2)");
						}//end try/catch
	    			
		    		}//end if
				}
				
				if (shapeSelected.equals("cone"))	
				{
					inputField.setText("Display Selected ");
					aInput = aField.getText();
					bInput = bField.getText();
					cInput = cField.getText();
					
		    	  	if(!aInput.isEmpty() && !bInput.isEmpty() && !cInput.isEmpty())
		    		{
		    			try 
		    			{
		    				double i = Double.parseDouble(aInput);
		    				double j = Double.parseDouble(bInput);
		    				double k = Double.parseDouble(cInput);
							DisplayCone(i, j, k);
						} catch (NumberFormatException e) {
						radiusLabel.setText("Invalid Entry. Enter radius (ex: 5.2)");
						}//end try/catch
	    			
		    		}//end if
				}
				
				if (shapeSelected.equals("cylinder"))	
				{
					inputField.setText("Display Selected ");
					aInput = aField.getText();
					bInput = bField.getText();
					
		    	  	if(!aInput.isEmpty() && !bInput.isEmpty())
		    		{
		    			try 
		    			{
		    				double i = Double.parseDouble(aInput);
		    				double j = Double.parseDouble(bInput);
							DisplayCylinder(i, j);
						} catch (NumberFormatException e) {
						radiusLabel.setText("Invalid Entry. Enter number (ex: 5.2)");
						}//end try/catch
	    			
		    		}//end if
				}
				
				if (shapeSelected.equals("torus"))	
				{
					inputField.setText("Display Selected ");
					aInput = aField.getText();
					bInput = bField.getText();
					
		    	  	if(!aInput.isEmpty() && !bInput.isEmpty())
		    		{
		    			try 
		    			{
		    				double i = Double.parseDouble(aInput);
		    				double j = Double.parseDouble(bInput);
							DisplayTorus(i, j);
						} catch (NumberFormatException e) {
						majorRadiusLabel.setText("Invalid Entry. Enter radius (ex: 5.2)");
						}//end try/catch
	    			
		    		}//end if
				}
		
			}//end if display
			
		}//end actionPerformed
		
		private void DisplayTorus(double i, double j) {
			Torus torus = new Torus(i, j);
			torus.new TorusFrame().add(new JLabel(new ImageIcon
					("C:\\Users\\nor67\\eclipse-java-workspace\\CMSC335Proj2\\images\\Torus.PNG")));
			inputField.setText("torus " + i + j);
			revalidate();
			repaint();
		}
		private void DisplayCylinder(double i, double j) {
			Cylinder cylinder = new Cylinder(i, j);
			cylinder.new CylinderFrame().add(new JLabel(new ImageIcon
					("C:\\Users\\nor67\\eclipse-java-workspace\\CMSC335Proj2\\images\\cylinder.PNG")));
			inputField.setText("Cylinder " + i + j);
			revalidate();
			repaint();
		}
		private void DisplayCone(double i, double j, double k) {
			Cone cone = new Cone(i, j, k);
			cone.new ConeFrame().add(new JLabel(new ImageIcon
					("C:\\Users\\nor67\\eclipse-java-workspace\\CMSC335Proj2\\images\\cone.JFIF")));
			inputField.setText("cone " + i + j + k);
			revalidate();
			repaint();
		}
		private void DisplayRectangle(double i, double j) {
			Rectangle rectangle = new Rectangle(i, j);
			rectangle.new RectangleFrame().add(new JLabel(new ImageIcon
					("C:\\Users\\nor67\\eclipse-java-workspace\\CMSC335Proj2\\images\\rectangle.JPG")));
			inputField.setText("rectangle " + i + j);
			revalidate();
			repaint();
		}
		private void DisplayCube(double i) {
			Cube cube = new Cube(i);
			cube.new CubeFrame().add(new JLabel(new ImageIcon
					("C:\\Users\\nor67\\eclipse-java-workspace\\CMSC335Proj2\\images\\cube.JPG")));
			inputField.setText("cube " + i);
			revalidate();
			repaint();
		}
		private void DisplaySphere(double i) {
			Sphere sphere = new Sphere(i);
			sphere.new SphereFrame().add(new JLabel(new ImageIcon
					("C:\\Users\\nor67\\eclipse-java-workspace\\CMSC335Proj2\\images\\sphere.JFIF")));
			inputField.setText("sphere " + i);
			revalidate();
			repaint();
		}
		private void DisplayTriangle(double i, double j) {
			Triangle triangle = new Triangle(i, j);
			triangle.new TriangleFrame().add(new JLabel(new ImageIcon
					("C:\\Users\\nor67\\eclipse-java-workspace\\CMSC335Proj2\\images\\triangle.JFIF")));
			inputField.setText("triangle " + i + j);
			revalidate();
			repaint();
		}
		
		private void DisplaySquare(double i) {
			Square square = new Square(i);
			square.new SquareFrame().add(new JLabel(new ImageIcon
					("C:\\Users\\nor67\\eclipse-java-workspace\\CMSC335Proj2\\images\\square.PNG")));
			inputField.setText("square " + i);
			revalidate();
			repaint();			
		}
		public void DisplayCircle(double radius)  
		{
			Circle circle = new Circle(radius);
			circle.new CircleFrame().add(new JLabel(new ImageIcon
					("C:\\Users\\nor67\\eclipse-java-workspace\\CMSC335Proj2\\images\\circle.JFIF")));
			inputField.setText("A circle with radius " + radius);
			revalidate();
			repaint();
		}//end DisplayCircle
	}//end ButtonListener
	
	/*public class ShapeFrame extends Frame 
	{
	
		// create a frame object for circle.
		Frame frame=new ShapeFrame();
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
		    }
		});
		// circle coordinates.
		frame.setSize(200, 200);
		frame.setVisible(true);	
	}*/	
}//end ShapeAppPanel
