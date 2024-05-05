package cod.mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    private Model model;
    private JFrame frame;
    private JPanel panel;
    private JButton acelerarButton;
    private JButton frenarButton;

    public View(Model model) {
        this.model = model;
        this.frame = new JFrame("Controlador de Coche");
        this.panel = new JPanel(new GridLayout(0, 1));
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.add(panel);
    }

    public void crearMandos(Coche coche) {
        acelerarButton = new JButton("Acelerar " + coche.getMatricula());
        frenarButton = new JButton("Frenar " + coche.getMatricula());

        acelerarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int velocidadActual = coche.getVelocidad();
                coche.setVelocidad(velocidadActual + 10);
            }
        });

        frenarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int velocidadActual = coche.getVelocidad();
                if (velocidadActual >= 10) {
                    coche.setVelocidad(velocidadActual - 10);
                } else {
                    coche.setVelocidad(0);
                }
            }
        });

        panel.add(acelerarButton);
        panel.add(frenarButton);
        frame.pack();
        frame.setVisible(true);
    }
}
