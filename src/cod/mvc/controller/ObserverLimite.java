package cod.mvc.controller;
 import cod.mvc.model.Coche;
 import cod.mvc.model.Observable;

/**
 * Otro observador que se encarga de controlar el límite de velocidad de un coche

 */
public class ObserverLimite implements Observer {
    // velocidad máxima
    final static int LIMITE = 120;
    /**
     * Este es el observador de limite de velocidad
     * @param coche Coche al que se le actualizó la velocidad
     */
    @Override
    public void update(Coche coche) {
        // verificamos veloidad máxima
        if (coche.velocidad > LIMITE) {
            // avisamos de una infracción
            System.out.println("[ObserverLimite] INFRACCION");
        }
    }
}
