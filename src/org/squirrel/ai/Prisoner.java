package org.squirrel.ai;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import org.squirrel.objects.Player;

public class Prisoner extends Ai{
	
	public int velX = 0;
	public int velY = 0;

	public Prisoner(int x, int y, String name, boolean good) {
		super(x, y, name, good);
	}

	public String path = "/assets/Prisoner.png";
	
	public void update(){
		//followPlayer();
	}
	
	public void draw(Graphics2D g2d){
		g2d.drawImage(loadImage(), xPos, yPos, null);
		g2d.setColor(Color.BLACK);
		g2d.drawString(aiName, xPos, yPos-5);
		
	}
	
	public Image loadImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(path));
		return i.getImage();
	}
	
	public void followPlayer(){
		if(xPos >= Player.getxPos() - 100){
			velX = 0;
		}else{
			velX = 2;
			xPos += velX;
		}
		if(xPos <= Player.getxPos() - 100){
			velX = 0;
		}else{
			velX = 2;
			xPos -= velX;
		}
		if(yPos >= Player.getyPos() - 100){
			velY = 0;
		}else{
			velY = 2;
			yPos += velY;
		}
		if(yPos <= Player.getyPos() - 100){
			velY = 0;
		}else{
			velY = 2;
			yPos -= velY;
		}
	}
}
