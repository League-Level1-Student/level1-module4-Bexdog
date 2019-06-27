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

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	 JButton button0=new JButton();
	 JButton button1=new JButton();
	public  void start() {
		button0.setText("Trick");
		button0.addActionListener(this);
		button1.setText("Treat");
		button1.addActionListener(this);
		frame.add(panel);
		panel.add(button0);
		panel.add(button1);
		frame.setVisible(true);
		frame.pack();
	
	}
	
	public static void main(String[] args) {
		NastySurprise surprise = new NastySurprise();
		surprise.start();
}
	
	public void showPictureFromTheInternet(String imageUrl) {
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
	@Override
	public void actionPerformed(ActionEvent arg0) {
		NastySurprise surprise = new NastySurprise();
		if(arg0.getSource()==button0) {
			
			surprise.showPictureFromTheInternet("https://img.purch.com/h/1400/aHR0cDovL3d3dy5saXZlc2NpZW5jZS5jb20vaW1hZ2VzL2kvMDAwLzA5My80MDIvb3JpZ2luYWwvbWVnYWxvZG9uLXNoYXJrcy5qcGc=");
		}
		else {
			surprise.showPictureFromTheInternet("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Candy_in_Damascus.jpg/1200px-Candy_in_Damascus.jpg");
		}
		
	}
}
