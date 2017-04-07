@Override
protected void paintComponent(Graphics g)
{
	super.paintComponent(g);
	if(gameImage == null)
	{
		return;
	}
	g.drawImage(gameImage, 0, 0, null);

}