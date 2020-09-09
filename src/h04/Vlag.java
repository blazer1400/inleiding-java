package h04;
import java.applet.*;
import java.awt.*;

public class Vlag extends Applet {

    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(50,50,200,50);
        g.setColor(Color.white);
        g.drawRect(50,100,200,50);
        g.setColor(Color.blue);
        g.fillRect(50,150,200,50);
        g.setColor(Color.black);
        g.drawLine(50,50,50,400);

    }

}
