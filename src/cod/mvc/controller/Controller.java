package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;

public class Controller {
    // definimos la instancia del modelo
    private final Model miModel;

    /**
     * Constructor. Inicializamos el controller
     * Creamos los observadores que necesitamos
     * @param miModel
     */
    public Controller(Model miModel){
        this.miModel = miModel;

        // instanciamos al observador de la velocidad
        ObserverVelocidad observoVelocidad = new ObserverVelocidad();
        miModel.addObserver(observoVelocidad);

        // instanciamos un segundo observador para el limite de velocidad
        ObserverLimite observoLimite = new ObserverLimite();
        miModel.addObserver(observoLimite);
    }

    /**
     * Crea un coche
     * @param nombre del coche
     * @param matricula del coche
     */
    public void crearCoche(String nombre, String matricula){
        miModel.crearCoche(nombre, matricula);
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula del coche
     * @param velocidad nueva
     */
    public void cambiarVelocidad(String matricula, Integer velocidad){
        miModel.cambiarVelocidad(matricula, velocidad);
    }
//        View view = new View(model);

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
