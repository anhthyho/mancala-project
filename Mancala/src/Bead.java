import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.*;

import javax.swing.Icon;
public class Bead{
	private double x;
	private double y;
	private static int BEAD_SIZE = 20;
	public Bead(Ellipse2D c){
		x = c.getCenterX() + Math.random()*(c.getWidth()/4)+1;
		y = c.getY() + Math.random()*(c.getHeight()/2)+1;
	}
	public Ellipse2D.Double create(){
		Ellipse2D.Double e = new Ellipse2D.Double(x,y,BEAD_SIZE, BEAD_SIZE);
		return e;
	}
	
	
	
	
}
