package h11;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Lijnen extends Applet {

    int teller = 0;
    int y = 20;

    public void init() {
    }

    public void paint(Graphics g) {
        for (teller = 0; teller <= 10; teller++) {
            g.drawLine(50, y, 150, y);
            y += 20;
        }
    }

}
