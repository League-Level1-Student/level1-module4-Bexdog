import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	int I1;
	int I2;
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JTextField i1 =  new JTextField(20);
JTextField i2 =  new JTextField(20);
	public static void main(String[] args) {
	PigLatin pig = new PigLatin();
	pig.run();
}
	void run() {
		button.setText("Translate");
		button.addActionListener(this);
		panel.add(i1);
		panel.add(button);
		panel.add(i2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		PigLatinTranslator Pig = new PigLatinTranslator();
		i2.setText(Pig.translate(i1.getText()));
		
	}
}
	

