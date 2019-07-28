

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	char currentLetter;
	int numChar = 0;
	int correct = 0;
public static void main(String[] args) {
	TypingTutor tutor = new TypingTutor();
	tutor.start();
	
	}
 void start() {
	
	frame.setTitle("Type or die");
	frame.setVisible(true);
	
	currentLetter = generateRandomLetter();
	
	label.setText(currentLetter+"");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.add(label);
	frame.pack();
	frame.addKeyListener(this);
}
static char generateRandomLetter() {
	int r;
    int randy = new Random().nextInt(2);
    if(randy==0) {
    	 r = new Random().nextInt(26)+'a';
    int k = (char) (r);
    	
    }
    else {
    	 r = new Random().nextInt(26)+'A';	
       int K =  (char) (r);
        }
    while((r=='I')||(r=='l')) {	
    	
        if(randy==0) {
        	 r = new Random().nextInt(26)+'a';
        int k = (char) (r);
        	
        }
        else {
        	 r = new Random().nextInt(26)+'A';	
           int K =  (char) (r);
           
            }
    }
    return (char) r;
	}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	//73, 108
}
@Override
public void keyPressed(KeyEvent e) {
	if(((e.getKeyChar()>='A')&&(e.getKeyChar()<='Z'))||((e.getKeyChar()>='a')&&(e.getKeyChar()<='z'))) {
		System.out.println("You typed: "+e.getKeyChar());
	System.out.println("Correct answer was: "+currentLetter);
	if(e.getKeyChar()==currentLetter) {
		System.out.println("correct");
		frame.setBackground(Color.GREEN);
		correct++;
	}
	else {
		System.out.println("incorrect");
		frame.setBackground(Color.RED);
	}
	numChar++;
	if(numChar==50) {
		showTypingSpeed(correct);
	}
}
	else {
//		System.out.println("You typed: "+e.getKeyChar());
	}
}
	Date timeAtStart = new Date();

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	      Date timeAtEnd = new Date();
	      long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	      long gameInSeconds = (gameDuration / 1000) % 60;
	      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	      int charactersPerMinute = (int) (charactersPerSecond * 60);
	      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

	


@Override
public void keyReleased(KeyEvent e) {
	if(((e.getKeyChar()>='A')&&(e.getKeyChar()<='Z'))||((e.getKeyChar()>='a')&&(e.getKeyChar()<='z'))) {
	currentLetter=generateRandomLetter();
	label.setText(currentLetter+"");
	}
}
}
