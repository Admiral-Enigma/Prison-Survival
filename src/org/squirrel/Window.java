package org.squirrel;

import javax.swing.JFrame;

public class Window {
	public static final double version = 0.1;
	public static final String title = "Prison Survival V"+version;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setTitle(title);
		frame.add(new Game());
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
