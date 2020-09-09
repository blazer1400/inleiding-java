package h04;
import java.applet.*;
import java.awt.*;

public class Stoplicht extends Applet {

    public void paint(Graphics g) {

        g.fillArc(50,50,60,50,0,180);
        g.fillRect(50,75,60,90);
        g.fillArc(50,140,60,50,180,180);
        g.setColor(Color.red);
        g.fillArc(65,65,30,30,0,360);
        g.setColor(Color.yellow);
        g.fillArc(65,105,30,30,0,360);
        g.setColor(Color.green);
        g.fillArc(65,145,30,30,0,360);
        g.setColor(Color.black);
        g.drawLine(80,190,80,250);

    }

}
