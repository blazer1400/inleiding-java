package h12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Getallen extends Applet {

    TextField[] input = new TextField[5];
    Button confirm;
    int[] getal = new int[5];

    public void init() {

        int teller;

        for(teller = 0; teller < input.length; teller++) {

            input[teller] = new TextField("",10);
            input[teller].addActionListener(new Listener());
            add(input[teller]);
        }
        confirm = new Button("ok");
        confirm.addActionListener(new Listener());
        add(confirm);

    }

    public void paint(Graphics g) {
        int teller;
        int x = 10;
        int max;
        for (teller = 0; teller < input.length; teller++) {
            g.drawString("" + getal[teller], x,80);
            x += 40;
        }
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int teller;
            String[] output = new String[input.length];
            for(teller = 0; teller < input.length; teller++) {
                output[teller] = input[teller].getText();
                getal[teller] = Integer.parseInt(output[teller]);
            }
            Arrays.sort(getal);
        repaint();
        }
    }

}
