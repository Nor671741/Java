	/*	
	* Name: Sarah Plazio     Nor671741@outlook.com
	* 
	* Overview:	
	*/	

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShapeApp extends JPanel
{
	private static final long serialVersionUID = -8664891112505625189L;

	public static void main(String[] args) 
	{
		//frame for application
		JFrame frame = new JFrame ("Shape App");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);   

		ShapeAppPanel panel = new ShapeAppPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}

