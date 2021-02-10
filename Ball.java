import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;


public class Ball extends JComponent
{
	private Ellipse2D.Double circle;
	
	public Ball(int x, int y, int d)
	{
		circle = new  Ellipse2D.Double(0,0,d,d);
		this.setSize(d+1,d+1);
		this.setLocation(x,y);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.YELLOW);
		g2.fill(circle);
		g2.setColor(Color.BLACK);
		g2.draw(circle);
	}
}
