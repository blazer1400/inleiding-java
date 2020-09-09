package h04;
import java.applet.*;
import java.awt.*;

public class Parktijkopdracht extends Applet {

    public void paint(Graphics g) {

        g.drawLine(10,330,210,330);
        g.drawString("Lijn",100,360);

        g.drawRect(10,20,200,100);
        g.drawString("Rechthoek",75,145);

        g.setColor(Color.magenta);
        g.fillRect(230,20,200,100);
        g.setColor(Color.black);
        g.drawArc(230,20,200,100,0,360);
        g.drawString("gevulde rechthoek met ovaal",250,145);

        g.drawArc(450,20,200,100,0,360);
        g.setColor(Color.magenta);
        g.fillArc(450,20,200,100,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",470,145);

        g.drawRoundRect(10,190,200,100,30,30);
        g.drawString("Afgeronde rechthoek",55,315);

        g.setColor(Color.magenta);
        g.fillArc(230,190,200,100,0,360);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",295,315);

        g.drawArc(500,190,100,100,0,360);
        g.drawString("Cirkel",535,315);

    }

}
