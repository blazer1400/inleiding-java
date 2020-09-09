package h04;
import java.applet.*;
import java.awt.*;

public class Ellips extends Applet {

    public void init() {

        setBackground(Color.blue);

    }

    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillArc(50,50,100,50,0,1000);

    }

}
