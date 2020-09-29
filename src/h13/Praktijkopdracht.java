package h13;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    public void paint(Graphics g) {
        boom(g,150,90);
    }

    void boom(Graphics g, int x, int y) {
        g.fillRect(x,y,20,100);
        g.setColor(Color.green);
        g.fillArc(x-35,y-70,90,90,0,360);
    }
}
