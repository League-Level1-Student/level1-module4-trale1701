package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackAmole implements ActionListener {
		JFrame frame = new JFrame("Whack a button for flame and glory!!");
		JButton button = new JButton();
		
		JPanel panel = new JPanel();
	
	public void run() {
		panel.add(button);
		
		
		button.addActionListener(this);
		
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
