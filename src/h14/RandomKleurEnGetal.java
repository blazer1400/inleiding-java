package h14;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class RandomKleurEnGetal extends Applet {

    int kleurgetal;
    int getal = 0;
    int kleurarray;
    Color kleur[] = {Color.red, Color.blue, Color.green, Color.yellow, Color.magenta, Color.cyan};

    public void init() {
        Button confirm = new Button("spin");
        confirm.addActionListener(new Listener());
        add(confirm);
    }

    public void paint(Graphics g) {
        g.setColor(kleur[kleurarray - 1]);
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
                    kleurarray = 1;
                    break;
                case 2:
                    kleurarray = 2;
                    break;
                case 3:
                    kleurarray = 3;
                    break;
                case 4:
                    kleurarray = 4;
                    break;
                case 5:
                    kleurarray = 5;
                    break;
                case 6:
                    kleurarray = 6;
                    break;
            }
            repaint();
        }
    }
}
