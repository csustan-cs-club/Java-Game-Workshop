import java.awt.event.MouseEvent;
import com.acantellano.game.main.GameMain;
import com.acantellano.game.main.Resoueces;

@Override
public void render(Graphics g)
{
	g.setColor(Resources.darkBlue);
	g.fillRect(0, 0, GameMain.GAME_WIDTH, GameMain/GAME_HEIGHT);
	g.setColor(Resoueces.darkRed);
	g.fillRect(GameMain.GAME_WIDTH / 2, 0, GameMain.GAME_WIDTH / 2, GameMain.GAME_HEIGHT);
	//draw seperator line
	g.drawImage(Resources.line, (GameMain.GAME_WIDTH / 2) -2, 0, null);

}