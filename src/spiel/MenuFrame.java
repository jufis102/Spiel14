package spiel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * Created by julia on 17.04.14.
 */
public class MenuFrame extends JFrame {

    private JButton start;
    private JButton control;
    private JButton ende;

    private Steuerung steuerung;


    public MenuFrame() throws IOException {

        this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("src/spiel/menu.jpg")))));

        this.setResizable(false);
        this.setTitle("Hauptmenu");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);


        /**Button */
        start = new JButton("Spiel starten");
        start.setBounds(150, 300, 200, 40);
        this.add(start);

        control = new JButton("Steuerung");
        control.setBounds(150, 350, 200, 40);
        this.add(control);

        ende = new JButton("ENDE");
        ende.setBounds(150, 400, 200, 40);
        this.add(ende);

        /**Label */
        JLabel label = new JLabel("Created by");
        label.setBounds(600, 450, 200, 40);
        this.add(label);


        ActionListener alSteuerung = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                steuerung = new Steuerung();
            }
        };

        ActionListener alende = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        /**start.addActionListener(alstart);*/
        control.addActionListener(alSteuerung);
        ende.addActionListener(alende);

    }


public static void main(String[] args) throws IOException {
    MenuFrame Frame = new MenuFrame();
    musik titelspielen = new musik();
    titelspielen.PlayMusic();
}

}
