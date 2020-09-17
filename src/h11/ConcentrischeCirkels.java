package h11;
import java.applet.*;
import java.awt.*;

public class ConcentrischeCirkels extends Applet {

    public void paint(Graphics g) {

        int teller;
        int height = 10;
        int width = 10;
        int x = 120;
        int y = 120;

        for(teller = 0; teller <= 5; teller++) {

            g.drawOval(x,y, width, height);
            height += 10;
            width += 10;
            x -= 5;
            y -= 5;


        }

    }

}
