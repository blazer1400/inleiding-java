package h04;
import java.applet.*;
import java.awt.*;

public class Staafdiagram extends Applet {

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
        g.fillRect(50,130,50,80);
        g.setColor(Color.red);
        g.fillRect(100,10,50,200);
        g.setColor(Color.green);
        g.fillRect(150,50,50,160);
        g.setColor(Color.black);
        g.drawString("Valerie",55,225);
        g.drawString("Jeroen",105,225);
        g.drawString("Hans",155,225);
    }

}
