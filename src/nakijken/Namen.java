package nakijken;

import java.applet.*;
import java.awt.*;

public class Namen extends Applet {

    public void paint(Graphics g) {

        int y = 20;
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                g.drawString("We zijn al op de helft", 10, y);
                y += 20;
            }
            g.drawString("Stan", 10, y);
            y += 20;
        }

    }

}
