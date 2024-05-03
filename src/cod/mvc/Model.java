package cod.mvc;

import java.util.ArrayList;

public class Model {
    ArrayList<Coche> parking = new ArrayList<>();

    public Coche crearCoche(String matricula, String modelo, int velocidad){
        Coche coche = null;
        coche.setMatricula(matricula);
        coche.setModelo(modelo);
        coche.setVelocidad(velocidad);
        return coche;
    }
}
