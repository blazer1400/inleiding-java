package h11;
import java.applet.*;
import java.awt.*;

public class Schaakbord extends Applet {

    public void paint(Graphics g) {

        int teller;
        int wit = 0;
        int rij = 0;
        int x = 20;
        int y = 20;
        int width = 20;
        int height = 20;

        //for teller tot max 64 om de max tegels in te stellen
        for(teller = 0; teller < 64;) {
            //als er 8 tegels in een rij zitten verandert de x
            if (rij < 8) {
                //int wit verandert om de tegel om zwart en wit in te stellen
                if (wit < 1) {
                    g.setColor(Color.black);
                    g.fillRect(x,y,width,height);
                    y += 20;
                    wit++;
                    rij++;
                    teller++;
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x,y,width,height);
                    y += 20;
                    wit--;
                    rij++;
                    teller++;
                }

            } else {
                //als er al 8 tegels in een rij zitten wordt de nieuwe rij ingestelt
                x += 20;
                y = 20;
                rij = 0;
                //dit is omdat je anders zwart naast zwart krijgt en wit naast wit
                if (wit == 1) {
                    wit = 0;
                } else {
                    wit = 1;
                }
            }

        }
        //het randje om het schaakbord
        g.setColor(Color.black);
        g.drawRect(20,20,160,160);

    }

}
