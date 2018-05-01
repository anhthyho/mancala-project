import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MancalaModel {
	private ArrayList<Shape> data;
	private ArrayList<ChangeListener> listeners;

	public MancalaModel(ArrayList<Shape> pits) {
		data = pits;
		listeners = new ArrayList<ChangeListener>();
	}

	/**
	 * Constructs a DataModel object
	 * 
	 * @return the data in an ArrayList
	 */
	public ArrayList<Shape> getData() {
		return (ArrayList<Shape>) (data.clone());
	}

	/**
	 * Attach a listener to the Model
	 * 
	 * @param barFrame
	 *            the listener
	 */
	public void attach(PlayerPanel playerPanel) {
		listeners.add(playerPanel);
	}

	

	/**
	 * Change the data in the model at a particular location
	 * 
	 * @param location
	 *            the index of the field to change
	 * @param value
	 *            the new value
	 */
	public void update(int location, Shape value) {
		data.set(location, value);
		for (ChangeListener l : listeners) {
			l.stateChanged(new ChangeEvent(this));
		}
	}
}
