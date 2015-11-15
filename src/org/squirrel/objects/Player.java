package org.squirrel.objects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import org.squirrel.Game;
import org.squirrel.entity.Entity;

public class Player extends Entity{

	public int velX = 0;
	public int velY = 0;
	public int speed = 3;
	public static int health = 100;
	public String playerImg = "/assets/Player.png";
	
	public Player(int x, int y) {
		super(x, y);
	}
	
	public void update(){
		setxPos(getxPos() + velX);
		setyPos(getyPos() + velY);
		//border();
	}
	public void draw(Graphics2D g2d){
		g2d.drawImage(loadPlayerImage(), getxPos(), getyPos(), null);
		g2d.setColor(Color.BLACK);
		g2d.drawString(Game.name, getxPos(), getyPos()-5);
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_W){
			velY -= speed;
		}else if (key == KeyEvent.VK_S){
			velY = speed;
		}else if (key == KeyEvent.VK_D){
			velX = speed;
		}else if (key == KeyEvent.VK_A){
			velX-= speed;
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_W){
			velY = 0;
		}else if (key == KeyEvent.VK_S){
			velY = 0;
		}else if (key == KeyEvent.VK_D){
			velX = 0;
		}else if (key == KeyEvent.VK_A){
			velX = 0;
		}
	}
	public Image loadPlayerImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(playerImg));
		return i.getImage();
	}
	
	public void border(){
		if(xPos < 0){
			xPos = 0;
		}
		if(xPos > 800 - 40){
			xPos = 800 - 40;
		}
		if(yPos < 0){
			yPos = 0;
		}
		if(yPos > 600 - 61){
			yPos = 600 - 61;
		}
	}
}
