package org.squirrel;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window {
	public static final double version = 0.1;
	public static final String title = "Prison Survival V"+version;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[1];

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setTitle(title);
		frame.add(new Game());
		int answer = JOptionPane.showConfirmDialog (frame, "Fullscreen?");
	    if (answer == JOptionPane.YES_OPTION) {
			device.setFullScreenWindow(frame);
			System.out.println("0");
		}else if (answer == JOptionPane.NO_OPTION) {
			frame.setSize(WIDTH, HEIGHT);
			frame.setLocationRelativeTo(null);

		}else{
			frame.setSize(WIDTH, HEIGHT);
			frame.setLocationRelativeTo(null);
		}
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
