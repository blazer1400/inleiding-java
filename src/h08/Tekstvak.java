package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tekstvak extends Applet {

    Button ok;
    Button reset;
    String displayTekst;
    TextField tekstvak;

    public void init() {

        KnopListener kl = new KnopListener();

        tekstvak = new TextField("",20);
        tekstvak.addActionListener(kl);

        ok.addActionListener(kl);
        ok = new Button();
        ok.setLabel("Ok");

        ResetEvent bl = new ResetEvent();
        reset = new Button();
        reset.setLabel("Reset");
        reset.addActionListener(bl);

        displayTekst = "";

        add(tekstvak);
        add(ok);
        add(reset);

    }

    public void paint(Graphics g) {

        g.drawString("" + displayTekst, 10, 40);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = tekstvak.getText();
            displayTekst = "" + output;
            repaint();
        }
    }
    class ResetEvent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            displayTekst = "";
            repaint();
        }
    }

}
