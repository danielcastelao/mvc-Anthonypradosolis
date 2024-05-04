package cod.mvc;

public class Controler {
    public static void main(String[] args) {
        Model model = new Model();

        model.crearCoche("1111-ABC", "Toyota", 120);

        View view = new View(model);

        view.muestraVelocidad("1111-ABC");

        model.cambiarVelocidad("1111-ABC", 150);

        view.muestraVelocidad("1111-ABC");
    }
}
