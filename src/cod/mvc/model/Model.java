package cod.mvc.model;

import cod.mvc.controller.Observer;

import java.util.ArrayList;

public class Model implements Observable {
    static ArrayList<Coche> parking = new ArrayList<>();
    static Coche coche;


    // para los observadores
    private static final ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers) {
            observer.update(coche);
        }
    }

    /**
     * Metodo para crear Coches
     * @param matricula del coche
     * @param modelo del coche
     * @return devolvemos un coche
     */
    public static Coche crearCoche(String matricula, String modelo){
        coche = new Coche(matricula,modelo);
        parking.add(coche);
        return coche;
    }

    /**
     * Metodo devolver Coche
     * @param matricula del coche
     * @return coche
     */
    public static Coche getCoche(String matricula) {
        Coche coche = null;
        for (Coche e : parking) {
            if (e.getMatricula().equals(matricula)) {
                coche= e;
            }
        }
        return coche;
    }

    /**
     * Metodo para cambiar la velocidad
     * @param matricula del coche
     * @param nuevaVelocidad nueva velovidad
     */
    public  void cambiarVelocidad(String matricula, int nuevaVelocidad) {
        getCoche(matricula).velocidad = nuevaVelocidad;
//        Coche coche = getCoche(matricula);
        notifyObservers(coche);
//        if (coche != null) {
//            coche.setVelocidad(nuevaVelocidad);
//        }
    }

    /**
     * Metodo para devolver la Velocidad
     * @param matricula del coche
     * @return velocidad
     */

    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}
