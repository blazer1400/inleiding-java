package h06;
import java.awt.*;
import java.applet.*;

public class Karwei extends Applet {

    int uitkomst;

    public void init() {

        uitkomst = 113 / 4;

    }

    public void paint(Graphics g) {

        g.drawString("Jan krijgt: " + uitkomst + " euro",10,10);
        g.drawString("Ali krijgt: " + uitkomst + " euro",10,30);
        g.drawString("Jeannette krijgt: " + uitkomst + " euro",10,50);
        g.drawString("Stan krijgt: " + uitkomst + " euro",10,70);

    }

}
