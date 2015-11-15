package org.squirrel.managers;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import org.squirrel.objects.Player;

public class inputManager extends KeyAdapter{

	Player player;
	
	public inputManager(Player p){
		this.player = p;
	}
	public void keyPressed(KeyEvent e){
		player.keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e){
		player.keyReleased(e);

	}
}
