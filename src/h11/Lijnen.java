package h11;
import java.applet.*;
import java.awt.*;

public class Lijnen extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 0; teller <= 10; teller++) {
            y += 20;
            g.drawLine(50, y, 150, y);
        }
    }

}
