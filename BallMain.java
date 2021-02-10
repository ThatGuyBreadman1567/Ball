import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BallMain extends JFrame
{
	private Ball b = new Ball(100,100,25);
	
	public BallMain()
	{
		//ArrayList<Ball> balls = new ArrayList<Ball>();
		
		setBounds(100,100,600,400);
		setLayout(null);
		setTitle("Ball Jawn");
		
		add(b);
		
//		JButton btn = new JButton("click me please");
//		btn.setBounds(380,300,200,60);
//		btn.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent arg0) 
//			{
//				Ball b = new Ball((int)(Math.random()*560),
//						(int)(Math.random()*360),
//						(int)(Math.random()*50));
//				add(b);
//				repaint();
//			}	
//		});
//		add(btn);
		
		this.addKeyListener(new KeyListener() 
		{
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_W)
				{
					b.setLocation(b.getX(),b.getY()-10);
				}
				if(e.getKeyCode() == e.VK_A)
				{
					b.setLocation(b.getX()-10,b.getY());
				}
				if(e.getKeyCode() == e.VK_S)
				{
					b.setLocation(b.getX(),b.getY()+10);
				}
				if(e.getKeyCode() == e.VK_D)
				{
					b.setLocation(b.getX()+10,b.getY());
				}
				repaint();
			}
			public void keyReleased(KeyEvent e) 
			{
				
			}
			public void keyTyped(KeyEvent e) 
			{
				
			}			
		});
		
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new BallMain();
	}
}
