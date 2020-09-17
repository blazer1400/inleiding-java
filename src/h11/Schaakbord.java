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

        for(teller = 0; teller < 64;) {

            if (rij < 8) {

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
                x += 20;
                y = 20;
                rij = 0;
                if (wit == 1) {
                    wit = 0;
                } else {
                    wit = 1;
                }
            }

        }

        g.setColor(Color.black);
        g.drawRect(20,20,160,160);

    }

}
