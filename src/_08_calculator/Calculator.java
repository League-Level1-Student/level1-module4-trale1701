package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JTextField field1 = new JTextField();
	JTextField field2 = new JTextField();
	JButton addButton = new JButton();
	JButton subButton = new JButton();
	JButton mulButton = new JButton();
	JButton divButton = new JButton();
	
	public void run() {
		frame.add(field1);
		frame.add(field2);
		frame.add(addButton);
		frame.add(subButton);
		frame.add(mulButton);
		frame.add(divButton);
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
	}
	
	public int add(int add1, int add2) {
		return add1+add2;
	}
	
	public int sub(int sub1, int sub2) {
		return sub1-sub2;
	}
	
	public int mul(int mul1, int mul2) {
		return mul1*mul2;
	}
	
	public int div(int div1, int div2) {
		return div1/div2;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
