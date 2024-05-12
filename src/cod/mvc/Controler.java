package cod.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controler {
    public static void main(String[] args) {
        Model model = new Model();
//        View view = new View(model);

        Coche coche = model.crearCoche("1111-ABC", "Toyota", 120);
//
//        ActionListener acelerarHandler = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int velocidadActual = coche.getVelocidad();
//                coche.setVelocidad(velocidadActual + 10);
//                view.printVelocidad(coche);
//            }
//        };

//        ActionListener frenarHandler = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int velocidadActual = coche.getVelocidad();
//                if (velocidadActual >= 10) {
//                    coche.setVelocidad(velocidadActual - 10);
//                } else {
//                    coche.setVelocidad(0);
//                }
//                view.printVelocidad(coche);
//            }
//        };
//
//        view.crearMandos(coche, acelerarHandler, frenarHandler);
//
//        view.printVelocidad(coche);
//        model.cambiarVelocidad("1111-ABC", 150);
//        view.printVelocidad(coche);




    }
}
