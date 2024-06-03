package cod.mvc.view;

import cod.mvc.model.Model;

import javax.swing.*;

/**
 * Entorno gráfico
 */
public class View {

    // inicializamos elementos del entorno gráfico
    // Botonera es un JPanel que contiene los elementos para cambiar la velocidad
//    static JPanel botonera = Botonera.crearBotonera();
//
//    /**
//     * Inicializamos el entorno gráfico
//     */
//    public static void crearVentana() {
//        IU.crearVentana(botonera);
//    }
//    public static void iniciarBotonera(){
//        botonera = Botonera.crearBotonera();
//    }
//
//    /**
//     * Muestra la velocidad
//     * @param matricula del coche
//     * @param v velocidad que queremos mostrar
//     * @return true si todo bien
//     */
//    public static boolean mostrarVelocidad(String matricula, Integer v){
//        // modificamos interfaz gráfica
//        botonera.setBorder(BorderFactory.createTitledBorder("Mostrando velocidad de " + matricula));
//
//        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";
//        // debug
//        System.out.println("[View] " + mensaje);
//
//        Dialog.mostrarMensaje(mensaje);
//
//        // Volvemos a poner el titulo de la botonera
//        botonera.setBorder(BorderFactory.createTitledBorder("Cambiar velocidad"));
//        return true;
//    }
    public static void mostrarCambioVelocidad(String matricula, Integer v, String accion) {
        String mensaje = "La velocidad del coche con matricula " + matricula + " ha sido " + accion + " en " + v + " unidades. Nueva velocidad: " + Model.getVelocidad(matricula);
        System.out.println(mensaje);
    }
}
