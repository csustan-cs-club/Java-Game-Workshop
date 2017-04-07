public Ball(int x, int y, int width, int height)
{
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	velX = 5;
	velY = RandomNumberGenerator.getRandIntBetween(-4, 5);
	rect = new Rectangle(x, y, width, height);
}