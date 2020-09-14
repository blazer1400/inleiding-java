package h10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Maanden extends Applet {

    Label label;
    TextField input;
    Button confirm;
    String maand = "Kies een maand";
    String dagen = "0";

    public void init() {

        label = new Label("Voer een maandnummer in:");

        input = new TextField("",10);
        input.addActionListener(new Listener());

        confirm = new Button("Ok");
        confirm.addActionListener(new Listener());

        add(label);
        add(input);
        add(confirm);

    }

    public void paint(Graphics g) {

        g.drawString("" + maand, 50,60);
        g.drawString("" + dagen + " dagen",50,70);

    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = input.getText();
            int getal = Integer.parseInt(output);
            switch(getal) {
                case 1:
                    maand = "Januari";
                    dagen = "31";
                    break;
                case 2:
                    maand = "Februari";
                    dagen = "28/29";
                    break;
                case 3:
                    maand = "Maart";
                    dagen = "31";
                    break;
                case 4:
                    maand = "April";
                    dagen = "30";
                    break;
                case 5:
                    maand = "Mei";
                    dagen = "31";
                    break;
                case 6:
                    maand = "Juni";
                    dagen = "30";
                    break;
                case 7:
                    maand = "Juli";
                    dagen = "31";
                    break;
                case 8:
                    maand = "Augustus";
                    dagen = "31";
                    break;
                case 9:
                    maand = "September";
                    dagen = "30";
                    break;
                case 10:
                    maand = "Oktober";
                    dagen = "31";
                    break;
                case 11:
                    maand = "November";
                    dagen = "30";
                    break;
                case 12:
                    maand = "December";
                    dagen = "31";
                    break;
                default:
                    maand = "Dat is geen maand";
                    dagen = "0";
                    break;
            }
            repaint();
        }
    }
}
