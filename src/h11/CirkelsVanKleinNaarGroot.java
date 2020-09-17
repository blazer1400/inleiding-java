package h11;
import java.applet.*;
import java.awt.*;

public class CirkelsVanKleinNaarGroot extends Applet {

    public void init() {
        setSize(550,550);
    }

    public void paint(Graphics g) {

        int teller;
        int height = 5;
        int width = 5;
        int kleurteller = 1;


        for(teller = 0; teller <= 100; teller++) {

            switch(kleurteller) {
                case 1:
                    g.setColor(Color.blue);
                    ++kleurteller;
                    break;
                case 2:
                    g.setColor(Color.red);
                    ++kleurteller;
                    break;
                case 3:
                    g.setColor(Color.green);
                    ++kleurteller;
                    break;
                case 4:
                    g.setColor(Color.yellow);
                    ++kleurteller;
                    break;
                case 5:
                    g.setColor(Color.black);
                    kleurteller = 1;
                    break;
            }

            g.drawOval(10,10, width, height);
            height += 5;
            width += 5;

        }

    }


}
