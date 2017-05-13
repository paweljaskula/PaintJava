package Paint;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
public class Panel extends JPanel {
	int draw = 0;
	Graphics2D g2;
	int x,y,xt,yt,radius;
	Color col;
	JButton white;
	JButton red;
	JButton blue;
	JButton green;
	JButton orange;
	JButton yellow;
	
	JButton pics4;
	JButton pics10;
	JButton pics15;
	public Panel()
	{
		setLayout(null);
		white = new JButton("WHITE");
		red = new JButton("RED");
		blue = new JButton("BULE");
		green = new JButton("GREEN");
		orange = new JButton("ORANGE");
		yellow = new JButton("YELLOW");
		
		pics4 = new JButton("4 pixels");
		pics10 = new JButton("10 pixels");
		pics15 = new JButton("15 pixels");
		
		white.setBounds(900,50,90,20);
		red.setBounds(900,80,90,20);
		blue.setBounds(900,110,90,20);
		green.setBounds(900,140,90,20);
		orange.setBounds(900,170,90,20);
		yellow.setBounds(900,200,90,20);
		
		pics4.setBounds(900,300,90,20);
		pics10.setBounds(900,330,90,20);
		pics15.setBounds(900,360,90,20);
		
		add(white);
		add(red);
		add(blue);
		add(green);
		add(orange);
		add(yellow);
		add(pics4);
		add(pics10);
		add(pics15);
		
		MouseMotionListener mouseMotion = new KlikMyszy();
		addMouseMotionListener(mouseMotion);
		ActionListener action = new KlikMyszy();
		white.addActionListener(action);
		red.addActionListener(action);
		blue.addActionListener(action);
		green.addActionListener(action);
		orange.addActionListener(action);
		yellow.addActionListener(action);
		pics4.addActionListener(action);
		pics10.addActionListener(action);
		pics15.addActionListener(action);
	}
	class KlikMyszy implements MouseMotionListener, ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getSource());
			if (e.getSource()==blue) {
				col = Color.BLUE;
			}
			if (e.getSource()==red) {
				col = Color.RED;
			}
			if (e.getSource()==white) {
				col = Color.WHITE;
			}
			if (e.getSource()==green) {
				col = Color.GREEN;
			}
			if (e.getSource()==orange) {
				col = Color.ORANGE;
			}
			if (e.getSource()==yellow) {
				col = Color.YELLOW;
			}
			if (e.getSource()==pics4) {
				radius = 4;
			}
			if (e.getSource()==pics10) {
				radius = 10;
			}
			if (e.getSource()==pics15) {
				radius = 15;
			}
		}
		public void mouseDragged(MouseEvent e) {
			xt = e.getX();
			yt = e.getY();
			repaint();
		}

		public void mouseMoved(MouseEvent e) {
			
		}
		
	}
	public void paintComponent(Graphics g)
	{
		g2 = (Graphics2D)g;
		g2.setColor(col);
		g2.fillOval(xt, yt, radius, radius);
		
	}
}
