package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatin implements ActionListener{
	JFrame frame = new JFrame("Pig Latin Translator");
	JTextField field1 = new JTextField(50);
	JTextField field2 = new JTextField(50);
	JButton button = new JButton("Translate");
	JPanel panel = new JPanel();
	
	public void run() {
		panel.add(field1);
		panel.add(button);
		panel.add(field2);
		frame.add(panel);
		button.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
