import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	char currentLetter;
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
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	System.out.println("You typed: "+e.getKeyChar());
	if(e.getKeyChar()==currentLetter) {
		System.out.println("correct");
	}
	else {
		System.out.println("incorrect");
	}
}
@Override
public void keyReleased(KeyEvent e) {
	label.setText(generateRandomLetter()+"");
	
}
}
