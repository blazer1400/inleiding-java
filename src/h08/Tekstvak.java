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

        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new KnopListener());

        ok = new Button();
        ok.addActionListener(new KnopListener());
        ok.setLabel("Ok");

        reset = new Button();
        reset.setLabel("Reset");
        reset.addActionListener(new ResetEvent());

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
