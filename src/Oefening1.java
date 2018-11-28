import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Oefening1 extends JFrame {

    public static void main(String[] args) {
        //Maak Framce
        JFrame frame = new Oefening1();
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("VoorbeeldUitBoek");
        JPanel paneel = new Paneel();
        frame.setContentPane( paneel );
        frame.setVisible(true);
    }
}
