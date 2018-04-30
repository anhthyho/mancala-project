import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.*;
public class MancalaTester {
	public static void main (String[] args){
		JFrame frame = new JFrame(); 
		frame.setSize(1000, 400);
		frame.setLayout(new BorderLayout());
		frame.setTitle("Mancala");
	
		
		ArrayList<Ellipse2D.Double> circles = new ArrayList<>(); 
		double width = 900 / 8;
		double height = 400 / 2;
		double x = width;
		double y = 25;

		double dx = width - 10;
		double dy = width + 10;

		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, dx, dy);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(x * 2, y, dx, dy);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(x * 3, y, dx, dy);
		Ellipse2D.Double circle4 = new Ellipse2D.Double(x * 4, y, dx, dy);
		Ellipse2D.Double circle5 = new Ellipse2D.Double(x * 5, y, dx, dy);
		Ellipse2D.Double circle6 = new Ellipse2D.Double(x * 6, y, dx, dy);
		Ellipse2D.Double pitCircle = new Ellipse2D.Double(5, y, width - 10, height * 2 - 100);
		circles.add(circle);
		circles.add(circle2);
		circles.add(circle3);
		circles.add(circle4);
		circles.add(circle5);
		circles.add(circle6);
		circles.add(pitCircle);

		x = width;
		y = height + 15;

		Ellipse2D.Double bcircle = new Ellipse2D.Double(x, y, dx, dy);
		Ellipse2D.Double bcircle2 = new Ellipse2D.Double(x * 2, y, dx, dy);
		Ellipse2D.Double bcircle3 = new Ellipse2D.Double(x * 3, y, dx, dy);
		Ellipse2D.Double bcircle4 = new Ellipse2D.Double(x * 4, y, dx, dy);
		Ellipse2D.Double bcircle5 = new Ellipse2D.Double(x * 5, y, dx, dy);
		Ellipse2D.Double bcircle6 = new Ellipse2D.Double(x * 6, y, dx, dy);
		Ellipse2D.Double bpitCircle = new Ellipse2D.Double(5 + 7 * x, 25, width - 10, height * 2 - 100);
		circles.add(bcircle);
		circles.add(bcircle2);
		circles.add(bcircle3);
		circles.add(bcircle4);
		circles.add(bcircle5);
		circles.add(bcircle6);
		circles.add(bpitCircle);

		MancalaModel m = new MancalaModel(circles); 
		frame.add(new PlayerPanel(m));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
