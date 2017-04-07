package com.acantellano.game.main;

import javax.swing.JFrame;

public class GameMain{
	private static final String GAME_TITLE = "Java Game Development Framework";
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 450;
	public static Game sGame;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame(GAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}