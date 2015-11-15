package org.squirrel.utils;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Loadimage {
	public Loadimage(String path){
		loadimage(path);
	}
	
	public Image loadimage(String path){
		ImageIcon i = new ImageIcon(getClass().getResource(path));
		return i.getImage();
	}
}
