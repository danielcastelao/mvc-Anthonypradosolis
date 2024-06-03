package cod.mvc.model;

import cod.mvc.controller.Observer;
import cod.mvc.view.View;

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
    public void notifyObservers(Coche coche,Model model) {
        for (Observer observer : observers) {
            observer.update(coche,model);
        }
    }

    /**
     * Metodo para crear Coches
     * @param matricula del coche
     * @param modelo del coche
     * @return devolvemos un coche
     */
    public static Coche crearCoche(String modelo, String matricula){
        coche = new Coche(modelo,matricula);
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
            if (e.matricula.equals(matricula)) {
                coche= e;
            }
        }
        return coche;
    }

//    /**
//     * Metodo para cambiar la velocidad
//     * @param matricula del coche
//     * @param nuevaVelocidad nueva velovidad
//     */
//    public static   Integer cambiarVelocidad(String matricula, Integer nuevaVelocidad) {
//        getCoche(matricula).velocidad = nuevaVelocidad;
//        return getCoche(matricula).velocidad;
////        notifyObservers(getCoche(matricula),this);
//
////        Coche coche = getCoche(matricula);
////        if (coche != null) {
////            coche.setVelocidad(nuevaVelocidad);
////        }
//    }
    public static void subirVelocidad(String matricula,Integer v){
        Coche coche = getCoche(matricula);
        if(coche != null){
            coche.velocidad += v;
            View.mostrarCambioVelocidad(matricula,v,"subida");
        }
    }
//    public static void bajarVelocidad(String matricula,Integer v){
//        Coche coche = getCoche(matricula);
//        if(coche != null){
//            coche.velocidad -= v;
//            if(coche.velocidad < 0){
//                coche.velocidad = 0;
//            }
//            View.mostrarCambioVelocidad(matricula,v,"bajada");
//        }
//    }

    /**
     * Metodo para devolver la Velocidad
     * @param matricula del coche
     * @return velocidad
     */

    public static Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }

    /**
     * Metodo de buscar coche
     * @param matricula del coche
     * @return matricula
     */
    public Coche buscarCoche(String matricula){
        return getCoche(matricula);
    }
}
