package org.squirrel.ui;

import java.awt.Graphics2D;

import org.squirrel.objects.Player;

public class Hud {
	
	public Hud(){
		
	}
	
	public void update(){
		
	}
	
	public void draw(Graphics2D g2d){
		g2d.drawString("HP: "+Player.health, Player.xPos, Player.yPos + 45);
	}
}
