package h04;
import java.applet.*;
import java.awt.*;

public class Dobbelsteen extends Applet {

    public void paint(Graphics g) {

        g.drawRoundRect(50,50,100,100,50,50);
        g.fillArc(110,70,20,20,0,360);
        g.fillArc(70,70,20,20,0,360);
        g.fillArc(110,110,20,20,0,360);
        g.fillArc(70,110,20,20,0,360);

    }

}
