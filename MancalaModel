import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MancalaModel {
	private ArrayList<Double> data;
	private ArrayList<ChangeListener> listeners;

	public MancalaModel(ArrayList<Double> pitNum) {
		data = pitNum;
		listeners = new ArrayList<ChangeListener>();
	}

	/**
	 * Constructs a DataModel object
	 * 
	 * @return the data in an ArrayList
	 */
	public ArrayList<Double> getData() {
		return (ArrayList<Double>) (data.clone());
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
	public void update(int location, Double value) {
		data.set(location, value);
		for (ChangeListener l : listeners) {
			l.stateChanged(new ChangeEvent(this));
		}
	}
}
