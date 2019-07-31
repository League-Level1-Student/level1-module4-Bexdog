import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	int randy;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	String i = "cherry.jpg";
	String b = "lime.jpg";
	String l = "orange.png";
	JLabel i1;
	JLabel i2;
	JLabel i3;
	int a;
	int d;
	int c;
	static SlotMachine slots = new SlotMachine();
public static void main(String[] args) {
	
	slots.run();
}
void run() {
	try {
		if(randy()==0) {
		i1 = createLabelImage(i);
		a=1;
		}
		else if(randy()==1) {
			i1 = createLabelImage(b);
			a=2;
			}
		else {
			i1 = createLabelImage(l);
			a=3;
		}
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		if(randy()==0) {
			i2 = createLabelImage(i);
			d=1;
			}
			else if(randy()==1) {
				i2 = createLabelImage(b);
				d=2;
				}
			else {
				i2 = createLabelImage(l);
				d=3;
			}
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		if(randy()==0) {
			i3 = createLabelImage(i);
			c=1;
			}
			else if(randy()==1) {
				i3 = createLabelImage(b);
				c=2;
				}
			else {
				i3 = createLabelImage(l);
				c=3;
			}
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel.add(i1);
	panel.add(i2);
	panel.add(i3);
	button.setText("SPIN!");
	panel.add(button);
	button.addActionListener(this);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
	if((a==c)&&(a==d)&&(c==d)) {
		JOptionPane.showMessageDialog(null, "YOU WIN!");
	}
}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
int randy() {
	randy = new Random().nextInt(3);
	return randy;
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	panel.removeAll();
	slots.run();
	
}
}

