package spiel;

import javax.swing.*;

/**
 * Created by julia on 17.04.14.
 */
/** Hier kann der Nutzer sich die Steuerung ansehen*/
public class Steuerung {

    private JButton schliessen;

    /**private static final Icon iconSteuerung = new ImageIcon(Konstanten.direction + "steuerungsicon.png")*/

    private static final JLabel STEUERUNG = new JLabel();

    /** Konstruktor, der eine neues Fenster mit Hintergrundbild aufruft*/
    public Steuerung() {
        final JFrame frame = new JFrame();

        frame.setResizable(true);
        frame.setSize(400,310);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        STEUERUNG.setBounds(0, 0, 400, 310);
        STEUERUNG.setVisible(true);
        frame.add(STEUERUNG);
    }
}
