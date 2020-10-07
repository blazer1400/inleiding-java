package h10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {

    TextField input;
    Label label;
    Button confirm;
    String voldoende = "";
    String error = "";

    public void init() {

        setSize(500,300);

        label = new Label("Voer een cijfer in");

        input = new TextField("",10);
        input.addActionListener(new Listener());

        confirm = new Button("ok");
        confirm.addActionListener(new Listener());

        add(label);
        add(input);
        add(confirm);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("" + error,200,120);
        g.setColor(Color.black);
        g.drawString("" + voldoende,230,100);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getal = Integer.parseInt(input.getText());
            if (getal == 1 || getal == 2 || getal == 3) {
                error = "";
                voldoende = "slecht";
            } else if (getal == 4) {
                error = "";
                voldoende = "onvoldoende";
            } else if (getal == 5) {
                error = "";
                voldoende = "matig";
            } else if (getal == 6 || getal == 7) {
                error = "";
                voldoende = "voldoende";
            } else if (getal == 8 || getal == 9 || getal == 10) {
                error = "";
                voldoende = "goed";
            } else {
                error = "Verkeerd cijfer ingevuld!";
                voldoende = "";
            }
            repaint();
        }
    }
}
