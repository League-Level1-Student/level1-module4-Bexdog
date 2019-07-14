import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button0 = new JButton();
	JButton button1 = new JButton();
public static void main(String[] args) {
	Chuckle_Clicker i = new Chuckle_Clicker();
	i.makeButtons();
}
  private void makeButtons() {
	
	button0.setText("joke");
	button0.addActionListener(this);
	
	button1.setText("punchline");
	button1.addActionListener(this);
	frame.add(panel);
	panel.add(button0);
	panel.add(button1);
	frame.pack();
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == button0) {
		JOptionPane.showMessageDialog(null, "Why did the dinosaur cross the road?");
		JOptionPane.showMessageDialog(null, "Because chickens weren't invented yet");
	}
	else {
		JOptionPane.showMessageDialog(null, "Why does Waldo wear stipes");
		JOptionPane.showMessageDialog(null, "Because he doesn't want to be spotted");
	}
}
}
