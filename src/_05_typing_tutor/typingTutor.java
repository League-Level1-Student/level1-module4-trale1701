package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	
	public char currentLetter;
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		typingTutor tutor = new typingTutor();
		tutor.setup(); 
		
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	void setup(){
		JFrame frame = new JFrame();
        
        currentLetter = generateRandomLetter();
        
        label.setFont(label.getFont().deriveFont(28.0f));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setText("" + currentLetter);
        frame.addKeyListener(this);
        panel.add(label);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        }

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyChar()==currentLetter) {
			System.out.println("correct");
			panel.setBackground(Color.GREEN);
			
		}
		else {
			System.out.println("wrong");
			panel.setBackground(Color.red);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
