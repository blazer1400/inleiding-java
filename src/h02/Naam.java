package h02;
import java.awt.*;
import java.applet.*;

public class Naam extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Stan", 100, 50);
        g.setColor(Color.red);
        g.drawString("Broersma", 100 , 60);

    }

}
