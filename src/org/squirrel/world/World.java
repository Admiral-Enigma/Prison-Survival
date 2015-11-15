package org.squirrel.world;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class World {
	
	public World(){
		
	}
	
	public void update(){
		
	}
	
	public void draw(Graphics2D g2d){
		g2d.drawImage(bgImage(), 0, 0, null);
		g2d.setColor(Color.GRAY);
		g2d.drawRect(600, 300, 600, 400);
		g2d.fillRect(600, 300, 600, 400);
		g2d.setColor(Color.black);
	}
	
	public Image bgImage(){
		ImageIcon i = new ImageIcon(getClass().getResource("/assets/grassbg.png"));
		return i.getImage();
	}
}
