

import javax.swing.JButton;

public class Button extends JButton implements Observer{

	public Button(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	@Override
	public void control(int n) {
		if(n==4)
			this.setEnabled(true);
		else if(n==5)
			this.setEnabled(false);
		else {
			int temp=Integer.parseInt(this.getName());
			if(temp%2==n)
				this.setEnabled(false);
			else
				this.setEnabled(true);
		}		
	}		
}
