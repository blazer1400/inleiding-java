package h14;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class RandomKleurEnGetal extends Applet {

    int kleurgetal = -1;
    int getal;
    String kleur[] = {"Klaver", "Ruit", "Harten", "Schoppen"};
    String nummer[] = {"aas","2","3","4","5","6","7","8","9","10","boer","dame","heer"};

    public void init() {
        Button spin = new Button("spin");
        spin.addActionListener(new Listener());
        add(spin);

    }

    public void paint(Graphics g) {
        g.drawString("" + kleur[kleurgetal - 1] + " " + nummer[getal - 1],40,40);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double random1 = Math.random();
            double random2 = Math.random();
            kleurgetal = (int) (random1 * 4 + 1);
            getal = (int) (random2 * 13 + 1);
            repaint();
        }
    }

}
