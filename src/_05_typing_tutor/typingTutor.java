package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor {
	
	public char currentLetter;
	
	public static void main(String[] args) {
		
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	void setup(){
         JFrame frame = new JFrame();
         JPanel panel = new JPanel();
         currentLetter = generateRandomLetter();
         JLabel lable = new JLabel();
         lable.setText(currentLetter);
         
         }

}
