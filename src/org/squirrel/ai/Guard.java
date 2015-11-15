package org.squirrel.ai;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Guard extends Ai{

	public Guard(int x, int y, String name, boolean good) {
		super(x, y, name, good);
	}
	
	public void update(){
		
	}
	
	public void draw(Graphics2D g2d){
		g2d.drawImage(loadImage(), xPos, yPos, null);
	}
	
	public Image loadImage(){
		ImageIcon i = new ImageIcon(getClass().getResource("/assets/Player.png"));
		return i.getImage();
	}
}
