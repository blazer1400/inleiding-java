package h08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    double getal1;
    double getal2;
    TextField input1;
    TextField input2;
    Button keerknop;
    Button deelknop;
    Button plusknop;
    Button minknop;

    public void init() {

        input1 = new TextField("",15);

        input2 = new TextField("",15);

        keerknop = new Button("*");
        keerknop.addActionListener(new Keer());

        deelknop = new Button("/");
        deelknop.addActionListener(new Deel());

        plusknop = new Button("+");
        plusknop.addActionListener(new Plus());

        minknop = new Button("-");
        minknop.addActionListener(new Min());

        add(input1);
        add(input2);
        add(keerknop);
        add(deelknop);
        add(plusknop);
        add(minknop);
    }

    public void paint(Graphics g) {}

    class Keer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output1 = input1.getText();
            String output2 = input2.getText();
            getal1 = Double.parseDouble(output1);
            getal2 = Double.parseDouble(output2);
            getal1 = getal1 * getal2;
            input1.setText("" + getal1);
            input2.setText("");
            repaint();
        }
    }
    class Deel implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output1 = input1.getText();
            String output2 = input2.getText();
            getal1 = Double.parseDouble(output1);
            getal2 = Double.parseDouble(output2);
            getal1 = getal1 / getal2;
            input1.setText("" + getal1);
            input2.setText("");
            repaint();
        }
    }
    class Plus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output1 = input1.getText();
            String output2 = input2.getText();
            getal1 = Double.parseDouble(output1);
            getal2 = Double.parseDouble(output2);
            getal1 = getal1 + getal2;
            input1.setText("" + getal1);
            input2.setText("");
            repaint();
        }
    }
    class Min implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output1 = input1.getText();
            String output2 = input2.getText();
            getal1 = Double.parseDouble(output1);
            getal2 = Double.parseDouble(output2);
            getal1 = getal1 - getal2;
            input1.setText("" + getal1);
            input2.setText("");
            repaint();
        }
    }
}
