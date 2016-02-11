

import javax.swing.JButton;

public class buttonFactory {
	
	JButton button;
	public JButton makeButton(int i) {
		if(i==0)
			button=new ButtonOne("1");
		if(i==1)
			button=new ButtonTwo("2");
		if(i==2)
			button=new ButtonThree("3");
		if(i==3)
			button=new ButtonFour("4");
		if(i==4)
			button=new ButtonAllon("allo");
		if(i==5)
			button=new ButtonAlloff("allx");
		
		return button;
	}
}
