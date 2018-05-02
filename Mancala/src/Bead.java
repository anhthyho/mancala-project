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
	private int pitnum;
	public Bead(Shape c, int j){
		pitnum = j;
		Rectangle2D bounds = c.getBounds2D();
		x = bounds.getCenterX() + pitnum*BEAD_SIZE - 2*BEAD_SIZE;
		if (pitnum<=3 ){
			y = bounds.getCenterY() - BEAD_SIZE ;
		}
		else if (pitnum>3){
			y = bounds.getCenterY() ;
		}
		
	}
	public Ellipse2D.Double create(){
		Ellipse2D.Double e = new Ellipse2D.Double(x,y,BEAD_SIZE, BEAD_SIZE);
		return e;
	}
	
}
