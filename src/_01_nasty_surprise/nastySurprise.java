package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise implements ActionListener {
	public static void main(String[] args) {
		nastySurprise ns = new nastySurprise();
    
	}
	nastySurprise(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel1 = new JPanel();

		panel1.add(button1);
		button1.addActionListener(this);
		panel1.add(button2);
		button2.addActionListener(this);
		frame.add(panel1);
		frame.pack();
		
	}
	JButton button1 = new JButton("Trick");
	JButton button2 = new JButton("Treat");
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(button2)) {
			showPictureFromTheInternet("https://vmsseaglescall.org/wp-content/uploads/2019/10/E77800F7-8CF7-4D02-A9D8-51B6284D8317.jpeg");
			}
		if(arg0.getSource().equals(button1)) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/18/9c/48/189c484af6f4796764c677ea015c8f89.png");
			}
		
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

}
