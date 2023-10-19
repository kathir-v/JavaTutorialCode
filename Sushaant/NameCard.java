/********************************************* 
	NameCard using Cheburashka
	by Sushaant KATHIRVEL MURUGAN (ID:26002304740)
	on October 23rd 2023
*********************************************/
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class NameCard extends JFrame {
	
	public static void main(String args[])	{
		new NameCard();
	}

	public NameCard()	{
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

		//Sample pattern
		//cheburashka(100, 150, 100, g);
		
		//Call cheburashka to draw the pattern
		cheburashka(100, 50, 60, g);
	}

	public void cheburashka (int size, int centerX, int centerY, Graphics g)	{
		/*
		g.setColor(new Color(150, 50, 0));
		g.fillOval(centerX - (int)(size * 0.6), centerY - size / 2, (int) (size * 1.2), size);
		g.fillOval(centerX - (int)(size * 1.2), centerY - size / 2, (int) (size * 0.7), size);
		g.fillOval(centerX + (int)(size * 0.5), centerY - size / 2, (int) (size * 0.7), size);
		
		g.setColor(Color.yellow);
		g.fillOval(centerX - (int)(size * 0.5), centerY - (int) (size * 0.4), (int) size, (int) (size * 0.8));
		g.fillOval(centerX - (int)(size * 1.1), centerY - (int) (size * 0.4), (int) (size * 0.5), (int) (size * 0.8));
		g.fillOval(centerX + (int)(size * 0.6), centerY - (int) (size * 0.4), (int) (size * 0.5), (int) (size * 0.8));
		*/ 
		//Draw Mickey
		//ears
		g.setColor(Color.black);
		g.fillOval(centerX/2, (centerY/2)+5, size/2, size/2);
		g.fillOval((centerX/2)+centerX+centerX, (centerY/2)+5, size/2, size/2);

		//head
		g.setColor(Color.red);
		g.fillOval(centerX, centerY, size, size);

		//eyes
		g.setColor(Color.white);
		g.fillOval((centerX/2)+centerX, (centerY/2)+centerY, 10, 20);
		g.fillOval((centerX/2)+centerX+centerX-10, (centerY/2)+centerY, 10, 20);	

		//eye balls
		g.setColor(Color.black);
		g.fillOval((centerX/2)+centerX, (centerY/2)+centerY+5, 10, 20-5);
		g.fillOval((centerX/2)+centerX+centerX-10, (centerY/2)+centerY+5, 10, 20-5);

		//nose
		g.setColor(Color.black);
		g.fillOval((centerX/2)+centerX+15, (centerY/2)+centerY+20, 20, 20);

		//smiling mouth
		g.setColor(Color.black);
		g.fillArc((centerX/2)+centerX+15, (centerY/2)+centerY+20+20, 20, 20, 180, 180);
	}
}