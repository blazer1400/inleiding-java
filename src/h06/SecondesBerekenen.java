package h06;
import java.awt.*;
import java.applet.*;

public class SecondesBerekenen extends Applet {

    int uur;
    int dag;
    int jaar;

    public void init() {

        uur = 60 * 60;
        dag = 24 * uur;
        jaar = 365 * dag;

    }

    public void paint(Graphics g) {

        g.drawString("In een uur zitten " + uur + " secondes",10,10);
        g.drawString("In een dag zitten " + dag + " secondes", 10, 30);
        g.drawString("In een jaar zitten " + jaar + " secondes", 10, 50);

    }

}
