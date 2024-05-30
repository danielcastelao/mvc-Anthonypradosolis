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
    public  void crearCoche(String nombre, String matricula){
        miModel.crearCoche(nombre, matricula);
//        Coche aux = Model.crearCoche(nombre, matricula);
//        // muestra la velocidad del coche creado
//        if(aux!= null){
//            View.mostrarVelocidad(aux.matricula, aux.velocidad);
//        }
//        //TODO mandar mensaje de error si no fue posible crear el coche
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula del coche
     * @param velocidad nueva
     */
    public  void  cambiarVelocidad(String matricula, Integer velocidad) {
        miModel.cambiarVelocidad(matricula, velocidad);
//        Integer v_aux = Model.cambiarVelocidad(matricula, velocidad);
//        if (v_aux != null) {
//            View.mostrarVelocidad(matricula, v_aux);
//        }
//        //TODO mandar mensaje de error si no fue posible cambiar la velocidad

    }
}
