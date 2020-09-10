package h06;
import java.awt.*;
import java.applet.*;

public class NegatieveInt extends Applet {

    int optellen;

    public void init() {

        optellen = 2147483647 + 10;

    }

    public void paint(Graphics g) {

        g.drawString("" + optellen,10,10);

    }

}