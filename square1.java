package applet1;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class Line extends Applet {
public void paint(Graphics g){
	Color customColor = new Color(128,0,128);
	Color customColor1 = new Color(0,0,0);
	
	g.setColor(customColor1);
	g.drawLine(10,10,30,30);
	
	g.setColor(customColor);
	g.fillRect(40,40,40,40);
	
	g.setColor(customColor1);
	g.fillRect(80,80,40,40);
	
	g.draw3DRect(81,81,40,40,true);
	}
}

