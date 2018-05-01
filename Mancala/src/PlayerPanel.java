
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.Random;

public class PlayerPanel extends JPanel implements ChangeListener {

	
	
	private static final int PANEL_WIDTH = 1000;
	private static final int PANEL_HEIGHT = 400;
	private double width;
	private double height;
	private ArrayList<Shape> circles;
	private ArrayList<Shape> beads;
	private MancalaModel mancalaModel;

	/**
	 * creates the playerpanel and initializes variables
	 * 
	 * @author anhthy
	 */

	private double xCoord;
	private double yCoord;
	private double barHeight;
	private ArrayList<Double> d;
	private int dm;
	private double max;
	private Point mousePoint;

	/**
	 * create MouseListeners
	 * 
	 * @author anhth
	 *
	 */
	private class MouseListeners extends MouseAdapter {
		/**
		 * updates data when mouse pressed
		 * 
		 * @param e
		 *            is the event when Mouse is pressed
		 */
		public void mousePressed(MouseEvent e) {
			mousePoint = e.getPoint();
			xCoord = mousePoint.getX();
			yCoord = mousePoint.getY();

		}

		@Override
		/**
		 * allows mouse wheel to be moved
		 * 
		 * @param arg0
		 *            is where mouse wheel is moved
		 */
		public void mouseWheelMoved(MouseWheelEvent arg0) {
			if (mousePoint == null) {
				return;
			}
			Point lastMousePoint = mousePoint;
			mousePoint = arg0.getPoint();
			double dx = mousePoint.getX() - lastMousePoint.getX();
			double dy = mousePoint.getY() - lastMousePoint.getY();

		}

	}

	public PlayerPanel(MancalaModel m){
		mancalaModel = m; 
		width = getWidth() / 8;
		height = getHeight() / 2;
		circles = mancalaModel.getData(); 
		beads = new ArrayList<>();
	}

	/**
	 * returns the width of the panel
	 * 
	 * @author anhthy
	 */
	public int getWidth() {
		return PANEL_WIDTH;
	}

	/**
	 * gets the height of the panel
	 * 
	 * @author anhthy
	 */
	public int getHeight() {
		return PANEL_HEIGHT;
	}

	/**
	 * paints the board with the pits and circles
	 * 
	 * @author anhthy
	 */
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.PINK);

		
		ArrayList<Shape> pits = new ArrayList<>();
		for (int i = 0; i < circles.size(); i++) {
			if (i != 13) {
				if (i != 6) {
					pits.add(circles.get(i));
				}

			}
		}

		Shape bead;
		for (int i = 0; i < circles.size(); i++) {
			Shape drawn = circles.get(i);

			if (pits.contains(circles.get(i))) {
				for (int j = 0; j < 3; j++) {
					bead = new Bead(drawn).create();
					beads.add(bead);
				}
			}

			g2.fill(drawn);
			g2.draw(drawn);
		}

		for (int i = 0; i < 36; i++) {
			Shape b = beads.get(i);
			Random rand = new Random();
			Color randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
			g2.setPaint(randomColor);
			g2.fill(b);
			g2.draw(b);
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub

	}
}
