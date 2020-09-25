package h12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Zoeken2 extends Applet {

    int array[] = {100,200,300,400,500,200,200,300,100,400,200};
    TextField input;
    Label label;
    int getal;
    int aantal = 0;
    boolean gevonden;

    public void init() {
        label = new Label("Zoek naar een getal");
        input = new TextField("",10);
        input.addActionListener(new Listener());
        add(label);
        add(input);
    }

    public void paint(Graphics g){
        if (gevonden) {
            g.drawString("Gevonden: " + getal, 10 ,40);
            g.drawString("Aantal: " + aantal,10,60);
        } else {
            g.drawString("Niet gevonden", 10, 40);
            g.drawString("",10,60);
        }
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = input.getText();
            getal = Integer.parseInt(output);
            int teller = 0;
            aantal = 0;
            gevonden = false;
            while(teller < array.length) {
                if(array[teller] == getal) {
                    gevonden = true;
                    aantal++;
                }
                teller++;
            }
            repaint();
        }
    }
}