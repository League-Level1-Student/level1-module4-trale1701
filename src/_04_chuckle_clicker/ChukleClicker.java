package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChukleClicker implements ActionListener {
	public static void main(String[] args) {
		ChukleClicker b = new ChukleClicker();
		b.makeButtons();
		
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();
	
	public void makeButtons() {
		joke.setText("joke");
		punchline.setText("punchline");
		joke.addActionListener(this);
		punchline.addActionListener(this);
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(joke)) {
			JOptionPane.showMessageDialog(null, "joke");
			
		}
		else if(arg0.getSource().equals(punchline)) {
			JOptionPane.showMessageDialog(null, "punchline");
			
		}
	}

}
