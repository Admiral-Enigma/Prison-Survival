package org.squirrel.ai;

public class Ai {
	public int xPos = 0;
	public int yPos = 0;
	public String aiName = "";
	public boolean good = false;
	
	public Ai(int x, int y, String name, boolean good){
		this.xPos = x;
		this.yPos = y;
		this.aiName = name;
		this.good = good;
	}
}
