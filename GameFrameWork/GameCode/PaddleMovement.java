//VK_DOWN is the down arrow and VK_UP is the up arrow
@Override void onKeyPress(KeyEvent e)
{
	if(e.getKeyCode() == KeyEvent.VK_UP)
	{
		paddleLeft.accelUp();
		paddleRight.accelDown();
	}
	else if(e.getKeyCode() == KeyEvent.VK_DOWN)
	{
		paddleLeft.accelDown();
		paddleRight.accelUp();
	}
}

@Override
public void onKeyRelase(KeyEvent e)
{
	if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN)
	{
		paddleLeft.stop();
		paddleRight.stop();
	}
}