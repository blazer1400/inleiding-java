package h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class PraktijkOpdracht extends Applet {
    TextField input;
    Button confirm;
    Label label;
    int stenen = 23;
    boolean playerturn = true;
    private URL pad;
    private AudioClip sound;

    public void init() {
        pad = PraktijkOpdracht.class.getResource("../resources/");
        sound = getAudioClip(pad, "victory.wav");

        label = new Label("Voer een getal in van 1 tot en met 3");
        input = new TextField("",10);
        input.addActionListener(new Listener());

        confirm = new Button("ok");
        confirm.addActionListener(new Listener());

        add(label);
        add(input);
        add(confirm);
    }

    public void paint(Graphics g) {

        if (!playerturn && stenen > 0) {
            if (stenen % 4 == 2) {
                stenen -= 1;
            } else if (stenen % 4 == 3) {
                stenen -= 2;
            } else if (stenen % 4 == 0) {
                stenen -= 3;
            } else {
                double random = Math.random();
                int getal = (int) (random * 3 + 1);
                stenen -= getal;
            }
            playerturn = true;
        }

        if (stenen <= 0 && playerturn) {
            g.drawString("You won!",70,40);
            remove(label);
            remove(input);
            remove(confirm);
            stenen = 0;
            sound.play();
        } else if (stenen <= 0 && !playerturn) {
            g.drawString("You lost!",70,40);
            remove(label);
            remove(input);
            remove(confirm);
            stenen = 0;
        }

        int teller;
        int x = 20;
        int y = 60;
        for (teller = 0; teller < stenen; teller++) {
            g.fillRect(x,y,10,10);
            x += 20;
            if(teller == 9 || teller == 19) {
                y += 20;
                x = 20;
            }
        }

        if (stenen > 0) {
            g.drawString("Er zijn nog: " + stenen + " stenen", 10,50);
        }
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = input.getText();
            int getal = Integer.parseInt(output);
            if (getal <= 3 && getal > 0) {
                stenen -= getal;
                playerturn = false;
            }
            input.setText("");
            repaint();
        }
    }
}
