package cod.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(model);

        Coche coche = Model.crearCoche("1111-ABC", "Toyota", 120);

        ActionListener acelerarHandler = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int velocidadActual = Model.getVelocidad(coche.getMatricula());
                Model.cambiarVelocidad(coche.getMatricula(), velocidadActual + 10);
                view.displayVelocity(coche);
            }
        };

        ActionListener frenarHandler = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int velocidadActual = Model.getVelocidad(coche.getMatricula());
                if (velocidadActual >= 10) {
                    Model.cambiarVelocidad(coche.getMatricula(), velocidadActual - 10);
                } else {
                    Model.cambiarVelocidad(coche.getMatricula(), 0);
                }
                view.displayVelocity(coche);
            }
        };

        view.crearMandos(coche, acelerarHandler, frenarHandler);

        view.displayVelocity(coche);
        Model.cambiarVelocidad("1111-ABC", 150);
        view.displayVelocity(coche);
    }
}
