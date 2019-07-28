import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WackADuck implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton i0 = new JButton();
int randy;
int ducks=0;
Date timeAtStart=new Date();

	public static void main(String[] args) {
	
		WackADuck duck = new WackADuck();
	duck.drawButtons();
}
	void drawButtons() {
		randy = new Random().nextInt(24);
		frame.setSize(275, 300);
		JButton j;
		panel.removeAll();
		frame.remove(panel);
		for(int i = 0;i<24;i++) {			
			j=new JButton();
			j.addActionListener(this);
			if(i==randy) {			
				j.setText("duck!");
				panel.add(j);
			}
			else {
				panel.add(j);
			}
		}
		frame.add(panel);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton test = (JButton) e.getSource();
		if(test.getText().equals("duck!")) {
			playSound("duck.wav");
			ducks++;
			if(ducks%10==0) {
				endGame(timeAtStart,ducks);
			}
			drawButtons();
		}
		else {
			playSound("boing.wav");
			speak("you missed");
		}
		
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your quack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " ducks per second.");
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}

}
