import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	int result;
	int I1;
	int I2;
	JFrame frame = new JFrame();
	JPanel panel= new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JButton exp = new JButton();
	JTextField i1 = new JTextField(20);
	JTextField i2 = new JTextField(20);
	void run(){
	add.setText("add");
	sub.setText("sub");
	mul.setText("mul");
	div.setText("div");
	exp.setText("exp");
	panel.add(i1);
	panel.add(i2);
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	panel.add(exp);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	exp.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		I1 = Integer.parseInt(i1.getText());
		I2 = Integer.parseInt(i2.getText());
		if(e.getSource()==add) {
			System.out.println(I1+I2);
		}
		else if(e.getSource()==sub) {
			System.out.println(I1-I2);
		}
		else if(e.getSource()==mul) {
			System.out.println(I1*I2);
		}
		else if(e.getSource()==div) {
			if(I2!=0) {
			System.out.println(I1/I2);
			}
			else {
				System.out.println("Undefined");
			}
		}
		else if(e.getSource()==exp) {			
			System.out.println(result = (int)Math.pow(I1, I2) );
		}
		
	}
}
