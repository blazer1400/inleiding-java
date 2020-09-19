package h12;
import java.applet.*;
import java.awt.*;

public class Gemiddelde extends Applet {

    public void paint(Graphics g) {

        int teller;
        double[] getal = new double[10];
        getal[0] = 10;
        getal[1] = 1;
        getal[2] = 4.5;
        getal[3] = 7.5;
        getal[4] = 3.2;
        getal[5] = 8.1;
        getal[6] = 9.5;
        getal[7] = 6.2;
        getal[8] = 7.3;
        getal[9] = 6.4;
        int y = 20;
        double gemiddelde = 0;

        for(teller = 0; teller < getal.length; teller++) {

            g.drawString("" + getal[teller], 10,y);
            y += 20;
            gemiddelde += getal[teller];

        }
        gemiddelde = gemiddelde / getal.length;
        g.drawString(""+gemiddelde,10,240);

    }

}
