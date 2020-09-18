package h11;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht1 extends Applet {

    TextField input;
    Button confirm;
    int getal;

    public void init() {

        input = new TextField("",10);
        input.addActionListener(new Listener());

        confirm = new Button("ok");
        confirm.addActionListener(new Listener());

        add(input);
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
            String output = input.getText();
            getal = Integer.parseInt(output);
            repaint();
        }
    }
}
