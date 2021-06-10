package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackAmole implements ActionListener {
JFrame frame = new JFrame("Whack a button for flame and glory!!");
JPanel panel = new JPanel();
int turn = 0;
int misses = 0;
int hit = 0;
Date start = new Date(0);

	public void run() {
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		panel.setLayout(new GridLayout(8,3));
		
		Random r = new Random();
		int rn = r.nextInt(24);
		for(int i = 0; i < 24; i++) {
			JButton b = new JButton("    ");
			b.addActionListener(this);
			if(i == rn) {
				b.setText("Mole");
			}
			panel.add(b);
		}
		frame.pack();
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date(0);
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton b = (JButton)arg0.getSource();
		frame.remove(panel);
		panel = new JPanel();
		run();
		turn++;
		if(turn >=10) {
			//endGame(start,hit);
			JOptionPane.showMessageDialog(null, "you hit " + hit + "times");
		}
		else {
			if(b.getText().equals("Mole")) {
			System.out.println("MOLE");
			hit++;
		}
			else {
				misses++;
				if(misses>=5) {
					JOptionPane.showMessageDialog(null, "you missed 5 times");
				}
			}
		}
		
	}

}
