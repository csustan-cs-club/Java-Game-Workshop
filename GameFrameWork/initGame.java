private void initGame()
{
    running = true;
    gameThread = new Thread(this, "Game Thread");
    gameThread.start();
}