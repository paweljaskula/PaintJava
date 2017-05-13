package Paint;
import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame{
	public Frame()
	{
		Container contentPane = getContentPane();
		setBounds(10,10,1020,600);
		setTitle("Rysowanie myszk¹");
		Panel panel1 = new Panel();
		contentPane.add(panel1);
	}
}
