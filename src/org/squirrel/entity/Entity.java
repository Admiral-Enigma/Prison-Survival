package org.squirrel.entity;

public class Entity {
	public static int xPos = 0;
	public static int yPos = 0;
	
	public Entity(int x, int y){
		Entity.setxPos(x);
		Entity.setyPos(y);
	}

	public static int getyPos() {
		return yPos;
	}

	public static void setyPos(int yPos) {
		Entity.yPos = yPos;
	}

	public static int getxPos() {
		return xPos;
	}

	public static void setxPos(int xPos) {
		Entity.xPos = xPos;
	}

}
