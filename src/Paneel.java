import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Het paneel
class Paneel extends JPanel {
    private int a;
    private int b;
    private int antwoord;

    public Paneel(){
        a = 176;
        b = 26;
        antwoord = a + b;
    }

    public void paintComponent (Graphics g) {
        super.paintComponent( g );
        //Zet de waarden van a, b en antwoord op het scherm
        g.drawString("OVerzicht van de berekening:",40, 20);
        g.drawString("a = " + a, 40, 40);
        g.drawString("b = " + b, 40, 60);
        g.drawString("De som is: " + antwoord, 40, 80);
    }
}