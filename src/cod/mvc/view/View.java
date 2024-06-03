package cod.mvc.view;

import cod.mvc.model.Model;

import javax.swing.*;

/**
 * Entorno gráfico
 */
public class View {

    public static void mostrarCambioVelocidad(String matricula, Integer v, String accion) {
        String mensaje = "La velocidad del coche con matricula " + matricula + " ha sido " + accion + " en " + v + " unidades. Nueva velocidad: " + Model.getVelocidad(matricula);
        System.out.println(mensaje);
    }
}
