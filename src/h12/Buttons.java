package h12;
import java.applet.*;
import java.awt.*;

public class Buttons extends Applet{

    public void init() {

        Button[] knoppen = new Button[25];
        int teller;

        for(teller = 0; teller < knoppen.length; teller++) {
            knoppen[teller] = new Button("" + teller);
            add(knoppen[teller]);
        }

    }

}
