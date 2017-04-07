public void update()
{
	x += velX;
	y += velY;
	correctYCollision();
	updateRect();
}

private void correctYCollision()
{
	if(y < 0)
	{
		y = 0;
	}
	else if(y + height > GameMain.GAME_HEIGHT)
	{
		y = GameMain.GAME_HEIGHT - height;
	}
	else
	{
		return;
	}
	velY = -velY;
	Resources.bounce.play();
}

private void updateRect()
{
	rect.setBounds(x, y, width, height);
}
