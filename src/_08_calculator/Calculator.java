package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JTextField field1 = new JTextField(5);
	JTextField field2 = new JTextField(5);
	JButton addButton = new JButton("add");
	JButton subButton = new JButton("sub");
	JButton mulButton = new JButton("mul");
	JButton divButton = new JButton("div");
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	
	public void run() {
		panel.add(field1);
		panel.add(field2);
		panel.add(addButton);
		panel.add(subButton);
		panel.add(mulButton);
		panel.add(divButton);
		panel.add(label);
		frame.add(panel);
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
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
		if(arg0.getSource() == addButton) {
			String num1 = field1.getText();
			int x1 = Integer.parseInt(num1);
			String num2 = field2.getText();
			int x2 = Integer.parseInt(num2);
			int answer = add(x1,x2);
			label.setText("result: "+answer);
		}
		else if(arg0.getSource() == subButton) {
			String num1 = field1.getText();
			int x1 = Integer.parseInt(num1);
			String num2 = field2.getText();
			int x2 = Integer.parseInt(num2);
			int answer = sub(x1,x2);
			label.setText("result: "+answer);
		}
		else if(arg0.getSource() == mulButton) {
			String num1 = field1.getText();
			int x1 = Integer.parseInt(num1);
			String num2 = field2.getText();
			int x2 = Integer.parseInt(num2);
			int answer = mul(x1,x2);
			label.setText("result: "+answer);
		}
		else if(arg0.getSource() == divButton) {
			String num1 = field1.getText();
			int x1 = Integer.parseInt(num1);
			String num2 = field2.getText();
			int x2 = Integer.parseInt(num2);
			int answer = div(x1,x2);
			label.setText("result: "+answer);
		}
		frame.pack();
	}

}
