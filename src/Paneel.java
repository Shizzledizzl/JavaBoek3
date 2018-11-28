import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Voorbeeld 0302
//Operatoren
class Paneel extends JPanel {
    private int a, b, som, verschil, product, quotient, rest;

    public Paneel(){
        a = 10;
        b = 8;
        som         = a + b;
        verschil    = a - b;
        product     = a * b;
        quotient    = a / b;
        rest        = a % b;
    }

    public void paintComponent(Graphics g){
        super.paintComponent( g );
        g.drawString("a = " + a + " en b = " + b, 10, 20);
        g.drawString("De som is " + som, 10, 50);
        g.drawString("Het verschil is " + + verschil, 10, 70 );
        g.drawString("Het product = " + product, 10, 90 );
        g.drawString("Het quotient is " + quotient, 10, 110 );
        g.drawString("De rest is " + rest, 10, 130 );
    }
}

////Het paneel
//class Paneel extends JPanel {
//    private int a;
//    private int b;
//    private int antwoord;
//
//    public Paneel(){
//        a = 176;
//        b = 26;
//        antwoord = a + b;
//    }
//
//    public void paintComponent (Graphics g) {
//        super.paintComponent( g );
//        //Zet de waarden van a, b en antwoord op het scherm
//        g.drawString("OVerzicht van de berekening:",40, 20);
//        g.drawString("a = " + a, 40, 40);
//        g.drawString("b = " + b, 40, 60);
//        g.drawString("De som is: " + antwoord, 40, 80);
//    }
//}