/********************************************************
 * Example taken from https://books.trinket.io/thinkjava2/appendix-c.html
 ********************************************************/
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class mickey extends JFrame {
	
	public static void main(String args[])	{
		new mickey();
	}

	public mickey()	{
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g)	{
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 400, 300);
		
		Font f1 = new Font("Rockwell", Font.PLAIN, 20);
		g.setFont(f1);
		g.setColor(Color.blue);
		g.drawString("Sushaant K", 100, 200);

		// Add Student ID nationality hobbies etc., here
		g.setColor(Color.blue);
        paintMickey(g, new Rectangle(50, 60, 100, 100));
	}

	public void boxOval(Graphics g, Rectangle bb) {
    	g.fillOval(bb.x, bb.y, bb.width, bb.height);
		System.out.println("x= " + bb.x + "; y= " + bb.y + " width= " + bb.width + " height= " + bb.height);
	}
	
	public void paintMickey(Graphics g, Rectangle bb) {
		boxOval(g, bb);
	
		int dx = bb.width / 2;
		int dy = bb.height / 2;
		Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
	
		half.translate(-dx / 2, -dy / 2);
		boxOval(g, half);
	
		half.translate(dx * 2, 0);
		boxOval(g, half);
	}
}
