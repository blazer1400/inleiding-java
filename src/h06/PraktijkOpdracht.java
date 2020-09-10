package h06;
import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    double berekening;
    double gemiddelde;
    int afgerond;

    public void init() {

        berekening = 5.9 + 6.3 + 6.9 ;
        gemiddelde= (berekening / 3) * 10;
        afgerond = (int) gemiddelde;

    }

    public void paint(Graphics g) {

        g.drawString("" + 5.9 + ", " + 6.3 + " en " + 6.9 + " is gemiddeld: " + afgerond / 10,10,10);

    }

}
