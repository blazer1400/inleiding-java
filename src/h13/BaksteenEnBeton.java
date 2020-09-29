package h13;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BaksteenEnBeton extends Applet {

    Button baksteen;
    Button beton;
    int output = 0;

    public void init() {
        baksteen = new Button("baksteen");
        baksteen.addActionListener(new Baksteen());

        beton = new Button("beton");
        beton.addActionListener(new Beton());

        add(baksteen);
        add(beton);
    }

    public void paint(Graphics g) {
        if (output == 1) {
            baksteenMuur(g,10,10,400,300);
        } else if (output == 2) {
            betonMuur(g,10,10,400,300);
        }
    }

    void baksteenMuur(Graphics g, int x, int y, int width, int height) {
        int teller;
        g.setColor(Color.red);
        g.fillRect(x,y,width,height);
        g.setColor(Color.black);
        int ybegin = y;
        int width1 = width / 20;
        int height1 = height / 20;
        for (teller = 0; teller < height * width / height1; teller += width / 20) {
            g.drawRect(x,y,width1,height1);
            y += height1;
            while (y >= height) {
                y = ybegin;
                x += width1;
            }
        }
    }

    void betonMuur(Graphics g, int x, int y, int width, int height) {
        int teller;
        g.setColor(Color.gray);
        g.fillRect(x,y,width,height);
        g.setColor(Color.black);
        int ybegin = y;
        int width1 = width / 10;
        int height1 = height / 10;
        for (teller = 0; teller < height * width / height1; teller += width / 10) {
            g.drawRect(x,y,width1,height1);
            y += height1;
            while (y >= height) {
                y = ybegin;
                x += width1;
            }
        }
    }

    class Baksteen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            output = 1;
            repaint();
        }
    }
    class Beton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            output = 2;
            repaint();
        }
    }
}
