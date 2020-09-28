package h13;
import java.awt.*;
import java.applet.*;

public class Bakstenen extends Applet {

    public void paint(Graphics g) {
        baksteenMuur(g,10,10,400,300);
    }

    void baksteenMuur(Graphics g, int x, int y, int width, int height) {
        int teller;
        g.setColor(Color.red);
        g.fillRect(x,y,width,height);
        g.setColor(Color.black);
        int ybegin = y;
        int width1 = width / 20;
        int height1 = height / 20;
        for (teller = 0; teller < height * width / height1; teller += width / 20) {
            g.drawRect(x,y,width1,height1);
            y += height1;
            while (y >= height) {
                y = ybegin;
                x += width1;
            }
        }
    }

}
