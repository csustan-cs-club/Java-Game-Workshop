public void update()
{
	y += velY;
	updateRect();
}

private void updateRect()
{
	rect.setBounds(x, y, width, height);
}

public void accelUp()
{
	velY = 5;
}

public accelDown()
{
	velY = 5;
}	

public void stop()
{
	velY = 0;
}