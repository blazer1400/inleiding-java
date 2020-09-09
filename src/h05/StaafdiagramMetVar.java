package h05;

import java.applet.Applet;
import java.awt.*;

public class StaafdiagramMetVar extends Applet {

    int valerie;
    int jeroen;
    int hans;

    public void init() {
        valerie = 40 *2;
        jeroen = 100 *2;
        hans = 80 *2;
    }

    public void paint(Graphics g) {

        g.drawLine(50,0,50,210);
        g.drawLine(50,210,250,210);
        g.drawString("0",40,210);
        g.drawString("20",30,170);
        g.drawString("40",30,130);
        g.drawString("60",30,90);
        g.drawString("80",30,50);
        g.drawString("100",25,10);
        g.setColor(Color.blue);
        g.fillRect(50,210-valerie,50,valerie);
        g.setColor(Color.red);
        g.fillRect(100,210-jeroen,50,jeroen);
        g.setColor(Color.green);
        g.fillRect(150,210-hans,50,hans);
        g.setColor(Color.black);
        g.drawString("Valerie",55,225);
        g.drawString("Jeroen",105,225);
        g.drawString("Hans",155,225);
    }

}
