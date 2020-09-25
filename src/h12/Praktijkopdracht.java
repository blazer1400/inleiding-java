package h12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Praktijkopdracht extends Applet {

    Label label1;
    Label label2;
    TextField naaminput;
    TextField nummerinput;
    Button confirm;
    String[] naamarray = new String[10];
    int[] nummerarray = new int[10];
    int teller;

    public void init() {

        label1 = new Label("Naam: ");
        label2 = new Label("Nummer: ");

        naaminput = new TextField("", 10);
        nummerinput = new TextField("",10);

        confirm = new Button("ok");
        confirm.addActionListener(new Listener());

        add(label1);
        add(naaminput);
        add(label2);
        add(nummerinput);
        add(confirm);
    }

    public void paint(Graphics g) {

        g.drawString("" + naamarray[teller],10,40);
        g.drawString("" + nummerarray[teller],10,60);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int teller = 0;
            String naamoutput = naaminput.getText();
            String nummeroutput = nummerinput.getText();
            int getal = Integer.parseInt(nummeroutput);
            if (teller < 9) {
                naamarray[teller] = naamoutput;
                nummerarray[teller] = getal;
                teller++;
            } else if (teller == 9) {
                naamarray[teller] = naamoutput;
                nummerarray[teller] = getal;
                teller++;
            }
            repaint();
        }
    }
}
