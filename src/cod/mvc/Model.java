package cod.mvc;

import java.util.ArrayList;

public class Model {
    ArrayList<Coche> parking = new ArrayList<>();
    Coche coche;

    public Coche crearCoche(String matricula, String modelo, int velocidad){
        coche = new Coche(matricula,modelo,velocidad);
        parking.add(coche);
        return coche;
    }
    public Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
    }
}
