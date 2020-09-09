package h04;
import java.awt.*;
import java.applet.*;

public class Driehoek extends Applet {

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.drawLine(50,60,10,100);
        g.setColor(Color.black);
        g.drawLine(50,60,90,100);
        g.setColor(Color.black);
        g.drawLine(10,100,90,100);

    }

}
