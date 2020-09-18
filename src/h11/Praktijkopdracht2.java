package h11;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht2 extends Applet {

    Button confirm;
    int getal = 1;

    public void init() {

        confirm = new Button("ok");
        confirm.addActionListener(new Listener());
        add(confirm);

    }
    public void paint(Graphics g) {
        int uitkomst;
        int teller;
        int y = 40;

        for(teller = 1; teller <= 10; teller++) {
            uitkomst = getal * teller;
            y += 20;
            g.drawString(""+ getal + " x " + teller + "= " + uitkomst,40,y);
        }
    }
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (getal < 10) {
                getal++;
            } else {
                getal = 1;
            }
            repaint();
        }
    }
}
