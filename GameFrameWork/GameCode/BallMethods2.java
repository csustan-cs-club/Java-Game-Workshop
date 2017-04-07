public void onCollideWith(Paddle p)
{
	if(x < GameMain.GAME_WIDTH / 2)
	{
		x = p.getX() + p.getWidth();
	}
	else
	{
		x = p.getX() - width;
	}
	velX = -velX;
	velY += RandomNumberGenerator.getRandIntBetween(-2, 3);
}

public boolean isDead()
{
	return (x < 0 || x + width > GameMain.GAME_WIDTH);
}

public void reset()
{
	x = 300;
	y = 200;
	velX = 5;
	velY = RandomNumberGenerator.getRandIntBetween(-4, 5);
}