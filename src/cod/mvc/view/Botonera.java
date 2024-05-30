package cod.mvc.view;
import cod.mvc.controller.Controller;
import cod.mvc.model.Model;

import javax.swing.*;

public class Botonera {

    public JPanel panel;
    private JTextField text_matricula;
    private JLabel label_matricula;
    private JLabel label_cambiar;
    private JTextField text_cambiar;
    private JButton button_cambiar;

    /**
     * Constructor de la clase Botonera
     * tendrá los listener de la interfaz gráfica
     */
    public Botonera() {

        /**
         * Listener del boton cambiar
         */
        button_cambiar.addActionListener(e -> {
            /**
             * Creamos un nuevo controlador
             */
            Controller miController = new Controller(new Model());
            /**
             * Cambiamos la velocidad
             */
            miController.cambiarVelocidad(text_matricula.getText(), Integer.valueOf(text_cambiar.getText()));

            /**
             * Mostramos el mensaje
             */
            Dialog.mostrarMensaje("Velocidad cambiada: " + text_cambiar.getText() + "km/h");
            /**
             * Limpiamos los campos
             */
            text_matricula.setText("");
            text_cambiar.setText("");
        });
    }

    /**
     * Inicializa Botonera para cambiar velocidad
     *
     * @return JPanel con los elementos de la botonera
     */

    public static JPanel crearBotonera() {
        return new Botonera().panel;
    }


}