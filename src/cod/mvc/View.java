package cod.mvc;

public class View {
    private Model model;

        public View(Model model) {
            this.model = model;
        }
        public void muestraVelocidad(String matricula) {
            int velocidad = model.getVelocidad(matricula);
            if (velocidad != -1) {
                System.out.println("La velocidad del coche con matrícula " + matricula + " es: " + velocidad);
            } else {
                System.out.println("No se encontró un coche con la matrícula " + matricula);
            }
        }
}
