package pkg.nward.FormLayouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JLabel label2;
	JTextField textName;
	JButton button;
	JPanel panel2;
	
public Form(){
	createFrame();
}
	
	private void createFrame(){
		frame = new JFrame();
		frame.setBounds(100, 100, 200, 400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	private void createPanel(){
		panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		label = new JLabel("Enter name");
		textName = new JTextField(25);
		button = new JButton("Click");
		button.AddActionListener(ButtonListener);
		label2 = new JLabel();
		panel.add(label);
		panel.add(textName);
		panel.add(button);
		panel.add(label2);
	}


	private void borderPanel(){
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		//return panel2;
		
	}
	
	private class ButtonListener implements ActionListener{
		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label2.setText("Hello" + textName.getText());
	}
	}
}
