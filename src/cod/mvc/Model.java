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
}
