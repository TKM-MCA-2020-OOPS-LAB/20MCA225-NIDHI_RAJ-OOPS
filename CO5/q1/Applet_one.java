import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Applet_one extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawRect(120, 50, 100, 100);
	}
}
/* 
<applet code="Applet_one.class" width="300" height="300"> 
</applet> 
*/  