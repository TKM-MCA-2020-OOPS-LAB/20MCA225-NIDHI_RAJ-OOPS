package circle;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class circle extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(20, 20, 120, 120);
		g.setColor(Color.green);
		g.fillOval(20,20,120,120);
	}
}
/* 
<applet code="circle.class" width="300" height="300"> 
</applet> 
*/  