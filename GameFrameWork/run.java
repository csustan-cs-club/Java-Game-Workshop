@Override
public void run()
{
	while(running){
		currentState.update();
		prepareGameImage();
		currentState.render(gameImage.getGraphics());
		repaint();
	}
	//end game immediately when running becomes false
	System.exit(0);
}

private void prepareGameImage()
{
	if(gameImage == null)
	{
		gameImage = createImage(gameWidth, gameHeight);
	}
	Graphics g = gameImage.getGraphics();
	g.clearRect(0, 0, gameWidth, gameHeight);
}