package h14;
import java.applet.*;
import java.awt.*;
import java.util.Random;

public class VierSpelerDeck extends Applet {

    String deck[] = {
            "Klaver aas",
            "Klaver 2",
            "Klaver 3",
            "Klaver 4",
            "Klaver 5",
            "Klaver 6",
            "Klaver 7",
            "Klaver 8",
            "Klaver 9",
            "Klaver 10",
            "Klaver boer",
            "Klaver dame",
            "Klaver heer",
            "Ruiten aas",
            "Ruiten 2",
            "Ruiten 3",
            "Ruiten 4",
            "Ruiten 5",
            "Ruiten 6",
            "Ruiten 7",
            "Ruiten 8",
            "Ruiten 9",
            "Ruiten 10",
            "Ruiten boer",
            "Ruiten dame",
            "Ruiten heer",
            "Harten aas",
            "Harten 2",
            "Harten 3",
            "Harten 4",
            "Harten 5",
            "Harten 6",
            "Harten 7",
            "Harten 8",
            "Harten 9",
            "Harten 10",
            "Harten boer",
            "Harten dame",
            "Harten heer",
            "Schoppen aas",
            "Schoppen 2",
            "Schoppen 3",
            "Schoppen 4",
            "Schoppen 5",
            "Schoppen 6",
            "Schoppen 7",
            "Schoppen 8",
            "Schoppen 9",
            "Schoppen 10",
            "Schoppen boer",
            "Schoppen dame",
            "Schoppen heer",
    };

    public void paint(Graphics g) {
        int teller;
        int y = 40;
        g.drawString("Speler 1",10,20);
        for(teller = 0; teller < 13; teller++) {
            g.drawString(""+deelKaart(),10,y);
            y += 20;
        }

        y = 40;
        g.drawString("Speler 2",100,20);
        for(teller = 0; teller < 13; teller++) {
            g.drawString(""+deelKaart(),100,y);
            y += 20;
        }

        y = 40;
        g.drawString("Speler 3",190,20);
        for(teller = 0; teller < 13; teller++) {
            g.drawString(""+deelKaart(),190,y);
            y += 20;
        }

        y = 40;
        g.drawString("Speler 4",190,20);
        for(teller = 0; teller < 13; teller++) {
            g.drawString(""+deelKaart(),190,y);
            y += 20;
        }
    }
    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart;
    }
}
