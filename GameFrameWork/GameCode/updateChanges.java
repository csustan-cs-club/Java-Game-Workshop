if(ballCollides(paddleLeft))
{
	playerScore++;
	ball.onCollideWith(paddleLeft);
	Resources.hit.play();
}
else if(ballCollides(paddleRight))
{
	playerScore++;
	ball.onCollideWith(paddleRight);
	Resources.hit.play();
}
else if(ball.isDead())
{
	playerScore -= 3;
	ball.reset();
}