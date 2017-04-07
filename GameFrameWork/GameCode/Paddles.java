package com.acantellano.game.model;

import java.awt.Rectangle;

public class Paddle{
	private int x, y, width, height, velY;
	private Rectangle rect;
	
	public Paddle(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		rect = new Rectangle(x, y, width, height);
		velY = 0;
	}


}