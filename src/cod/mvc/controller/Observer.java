package cod.mvc.controller;
import cod.mvc.model.Coche;
import cod.mvc.model.Model;

/**
 * Interfaz Observer que implementarán los observadores

 */
public interface Observer {
    // metodo que se ejecutará cuando el objeto observado cambie
    void update(Coche arg, Model model);
}
