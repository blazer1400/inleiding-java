package h10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Gemiddelde extends Applet {

    TextField input;
    Button confirm;
    double gemiddelde = 0;
    String voldoende = "?";
    String uitslag = "?";
    double getalcount = 0;

    public void init() {
        input = new TextField("",10);
        input.addActionListener(new Listener());

        confirm = new Button("ok");
        confirm.addActionListener(new Listener());

        add(input);
        add(confirm);
    }

    public void paint(Graphics g) {
        g.drawString("Je hebt een " + voldoende + " gehaald",50,60);
        g.drawString("Gemiddelde: " + gemiddelde,50,80);
        g.drawString("" + uitslag,50,100);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output;
            output = input.getText();
            double getal = Double.parseDouble(output);
            ++getalcount;
            gemiddelde += getal;
            gemiddelde = gemiddelde / getalcount;

            if (getal >= 5.5) {
                voldoende = "voldoende";
            } else  {
                voldoende = "onvoldoende";
            }
            if (gemiddelde >= 5.5) {
                uitslag = "Gefeliciteerd, je bent geslaagd!";
            } else {
                uitslag = "Helaas, je bent gezakt.";
            }
            repaint();
        }

    }

}
