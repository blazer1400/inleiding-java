package h12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class PraktijkOpdrachtt extends Applet {

    TextField naam;
    TextField nummer;
    Label label;
    Label label1;
    Button confirm;
    String display[] = new String[10];
    int teller = 0;

    public void init() {

        naam = new TextField("",10);
        nummer = new TextField("",10);

        label = new Label("Naam: ");
        label1 = new Label(" Nummer: ");

        confirm = new Button("ok");
        confirm.addActionListener(new Listener());

        add(label);
        add(naam);
        add(label1);
        add(nummer);
        add(confirm);
    }

    public void paint(Graphics g) {
        if (teller < display.length) {
            int arraycount = teller - 1;
            g.drawString("" + display[arraycount], 10, 40);
        } else {
            int count;
            int y = 40;
            for(count = 0; count < 10; count++) {
                g.drawString("" + display[count], 10 , y);
                y += 20;
            }
        }
    }
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String naamoutput = naam.getText();
            String nummeroutput = nummer.getText();

            int getal = Integer.parseInt(nummeroutput);

            display[teller] = "Naam: " + naamoutput + " Nummer: " + getal;

            repaint();
            teller++;
        }
    }
}
