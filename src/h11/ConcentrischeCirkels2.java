package h11;
import java.applet.*;
import java.awt.*;

public class ConcentrischeCirkels2 extends Applet {

    public void init() {
        setSize(600,600);
    }

    public void paint(Graphics g) {

        int teller;
        int height = 10;
        int width = 10;
        int x = 270;
        int y = 270;

        for(teller = 0; teller <= 50; teller++) {

            g.drawOval(x,y, width, height);
            height += 10;
            width += 10;
            x -= 5;
            y -= 5;

        }

    }

}
