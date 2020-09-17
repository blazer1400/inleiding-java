package h11;
import java.applet.*;
import java.awt.*;

public class Getallen extends Applet {

    public void paint(Graphics g) {

        int teller;
        int y = 20;

        for(teller = 20; teller >= 10; teller--) {
            g.drawString("" + teller, 30, y);
            y += 20;
        }
    }

}
