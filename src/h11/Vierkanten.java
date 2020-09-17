package h11;
import java.applet.Applet;
import  java.awt.*;

public class Vierkanten extends Applet {

    public void paint(Graphics g) {

        int teller;
        int x = 40;
        int y = 40;

        for(teller = 0; teller <= 10; teller++) {

            g.drawRect(x, y, 20, 20);
            x += 20;
            y += 20;

        }

    }

}
