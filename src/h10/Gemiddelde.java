package h10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Gemiddelde extends Applet {

    TextField input;
    Button confirm;
    double gemiddelde = 0;
    double gemiddelde2 = 0;
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
        g.drawString("Gemiddelde: " + gemiddelde2,50,80);
        g.drawString("" + uitslag,50,100);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output;
            output = input.getText();
            double getal = Double.parseDouble(output);

            //bij elk getal gaat de getalcount met 1 omhoog. dat is nodig voor de rekensom
            ++getalcount;

            //getal wordt bij de andere getallen opgeteld, en dan door de hoeveelheid getallen gedeeld
            gemiddelde += getal;
            gemiddelde2 = gemiddelde / getalcount;

            //checken of het voldoende of onvoldoende is
            if (getal >= 5.5) {
                voldoende = "voldoende";
            } else  {
                voldoende = "onvoldoende";
            }
            //met het gemiddelde bekijken of de gebruiker is geslaagd
            if (gemiddelde >= 5.5) {
                uitslag = "Gefeliciteerd, je bent geslaagd!";
            } else {
                uitslag = "Helaas, je bent gezakt.";
            }
            repaint();
        }

    }

}
