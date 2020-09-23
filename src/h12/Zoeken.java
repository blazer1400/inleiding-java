package h12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Zoeken extends Applet {

    int array[] = {100,200,300,400,500};
    TextField input;
    Label label;
    int getal;
    boolean gevonden;

    public void init() {
        label = new Label("Zoek naar een getal");
        input = new TextField("",10);
        input.addActionListener(new Listener());
        add(label);
        add(input);
    }

    public void paint(Graphics g){
        if (gevonden == true) {
            g.drawString("Gevonden: " + getal, 10 ,40);
        } else {
            g.drawString("Niet gevonden", 10, 40);
        }
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = input.getText();
            getal = Integer.parseInt(output);
            int teller = 0;
            gevonden = false;
            while(teller < array.length) {
                if(array[teller] == getal) {
                    gevonden = true;
                }
                teller ++;
            }
            repaint();
        }
    }
}
