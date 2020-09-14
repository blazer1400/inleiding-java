package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BTW extends Applet {

    String stringgeld;
    TextField input;
    Button confirm;
    double bedrag;
    String display;
    Label label;


    public void init() {
        input = new TextField("",20);
        input.addActionListener(new Calc());

        confirm = new Button("Ok");
        confirm.addActionListener(new Calc());

        label = new Label("Typ een bedrag:");

        display = "";

        add(label);
        add(input);
        add(confirm);
    }

    public void paint(Graphics g) {
        g.drawString(display,50,40);
    }

    class Calc implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringgeld = input.getText();
            bedrag = Double.parseDouble(stringgeld);
            double btwper = bedrag / 100 * 21;
            bedrag = bedrag + btwper;
            display = "" + bedrag;
            repaint();
        }
    }

}
