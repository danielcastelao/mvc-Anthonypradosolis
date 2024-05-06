package cod.mvc;

import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();
    static Coche coche;

    public static Coche crearCoche(String matricula, String modelo, int velocidad){
        coche = new Coche(matricula,modelo,velocidad);
        parking.add(coche);
        return coche;
    }
    public static Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
    }
    public static void cambiarVelocidad(String matricula, int nuevaVelocidad) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(nuevaVelocidad);
        }
    }
    public static int getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            return coche.getVelocidad();
        }
        return -1;
    }
}
