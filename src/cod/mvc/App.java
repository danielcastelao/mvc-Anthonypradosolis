package cod.mvc;

import cod.mvc.controller.Controller;
import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;

import java.util.Scanner;

/**
 * Clase principal de la aplicación
 */
public class App {

    private static Controller miController = new Controller(Model.getInstance());
    public static void main(String[] args) {
        // Inicializamos la app
        // instanciamos el modelo
        Model miModel = Model.getInstance();
        // instanciamos el controlador
        // le pasamos el Model instanciado
        Controller miController = new Controller(miModel);

        // Crear tres coches
        miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");
        miController.crearCoche("Aston Martin", "FGH 3333");

        // Cambiar la velocidad de un coche
        miController.cambiarVelocidad("SBC 1234", 30);

        // otro cambio de velocidad
        // sobrepasando la velocidad máxima
        miController.cambiarVelocidad("HYU 4567", 150);
//        View.crearVentana();
//        System.out.println("[App] fin del main");
        buscarYMostrarCoche();

    }

    /**
     * Metodo para buscar y mostrar los datos de coche
     */
    public static void buscarYMostrarCoche(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la matricula del coche:");
        String matricula = scanner.nextLine();
        Coche coche = miController.buscarYMostrarCoche(matricula);
        if(coche!=null){
            System.out.println("Matricula: "+coche.matricula);
            System.out.println("Modelo:" + coche.modelo);
            System.out.println("Velocidad:"+coche.velocidad);
        } else{
            System.out.println("No se encontro un coche con la matricula dada");
        }

    }
}
