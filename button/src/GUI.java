

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame implements ActionListener {
	
	private JFrame frame=new JFrame("Button Example");
	private buttonFactory factory=new buttonFactory();
	private JButton button[]=new JButton[10];
	private Subject subject=new subjectImpl();
	
	GUI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,120);
		frame.setLayout(new GridLayout(1,8));
		frame.setVisible(true); 
		addButton();
	}
	
	private void addButton() {
		for(int i=1;i<=6;i++) {
			button[i]=factory.makeButton(i);
			button[i].addActionListener(this);
			subject.add((Observer)button[i]);
			frame.add(button[i]);
		}
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button[1])
			subject.notifyObserver(1);
		else if(e.getSource()==button[2])
			subject.notifyObserver(2);
		else if(e.getSource()==button[3])
			subject.notifyObserver(3);
		else if(e.getSource()==button[4])
			subject.notifyObserver(4);
		else if(e.getSource()==button[5])
			subject.notifyObserver(5);
		else 
			subject.notifyObserver(6);
	}
}
