package h14;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class RandomKleurEnGetal extends Applet {

    int kleurgetal;
    int getal = 0;
    Color kleur = Color.black;

    public void init() {
        Button confirm = new Button("spin");
        confirm.addActionListener(new Listener());
        add(confirm);
    }

    public void paint(Graphics g) {
        g.setColor(kleur);
        g.fillRect(50,50,20,20);
        g.setColor(Color.black);
        g.setFont(new Font("font", Font.PLAIN, 20));
        g.drawString(""+getal,53,69);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double random1 = Math.random();
            double random2 = Math.random();
            kleurgetal = (int) (random1 * 6 + 1);
            getal = (int) (random2 * 9 + 1);
            switch(kleurgetal) {
                case 1:
                    kleur = Color.red;
                    break;
                case 2:
                    kleur = Color.blue;
                    break;
                case 3:
                    kleur = Color.green;
                    break;
                case 4:
                    kleur = Color.yellow;
                    break;
                case 5:
                    kleur = Color.magenta;
                    break;
                case 6:
                    kleur = Color.cyan;
                    break;
            }
            repaint();
        }
    }
}
