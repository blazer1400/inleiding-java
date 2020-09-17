package h11;
import java.applet.*;
import java.awt.*;

public class TafelVanDrie extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 20;
        int uitkomst = 0;

        for(teller = 0; teller <= 10; teller++) {
            uitkomst = 3 * teller;
            g.drawString("" + uitkomst, 40, y);
            y += 20;
        }

    }

}