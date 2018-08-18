package applet1;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class Line extends Applet {
public void paint(Graphics g){
 
		g.setColor(new Color(80,10,124));
		 g.drawRoundRect(40, 50, 90, 90, 200, 200);
		    g.fillRoundRect(40, 160, 90, 90, 200, 200);

	}
}


