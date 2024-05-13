package cod.mvc.model;

import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();
    static Coche coche;

    /**
     * Metodo para crear Coches
     * @param matricula del coche
     * @param modelo del coche
     * @param velocidad del coche
     * @return devolvemos un coche
     */
    public static Coche crearCoche(String matricula, String modelo, int velocidad){
        coche = new Coche(matricula,modelo,velocidad);
        parking.add(coche);
        return coche;
    }

    /**
     * Metodo devolver Coche
     * @param matricula del coche
     * @return coche
     */
    public static Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    /**
     * Metodo para cambiar la velocidad
     * @param matricula del coche
     * @param nuevaVelocidad nueva velovidad
     */
    public static void cambiarVelocidad(String matricula, int nuevaVelocidad) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(nuevaVelocidad);
        }
    }

    /**
     * Metodo para devolver la Velocidad
     * @param matricula del coche
     * @return velocidad
     */
    public static int getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            return coche.getVelocidad();
        }
        return -1;
    }
}
