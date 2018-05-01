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
	
		
		Double pits = (double) 3; 
		ArrayList<Double> pitNum = new ArrayList<>(); 
		for (int i=0; i<14; i++){
			pitNum.add(pits); 
		}
		pitNum.set(6,  (double)0);
		pitNum.set(13, (double)0); 
		
		MancalaModel m = new MancalaModel(pitNum); 
		PlayerPanel p = new PlayerPanel(m); 
		m.attach(p);
		
		
	}

}
