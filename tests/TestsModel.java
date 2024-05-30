import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestsModel {
    @Test
    public void testCrearCoche() {
        Coche coche = Model.crearCoche("1111-ABC", "Toyota");
        assertNotNull(coche);
        assertEquals("1111-ABC", coche.getMatricula());
        assertEquals("Toyota", coche.getModelo());
    }

    @Test
    public void testGetCoche() {
        Model.crearCoche("1111-ABC", "Toyota");
        Coche coche = Model.getCoche("1111-ABC");
        assertNotNull(coche);
        assertEquals("1111-ABC", coche.getMatricula());
        assertEquals("Toyota", coche.getModelo());
    }

    @Test
    public void testCambiarVelocidad() {
        Model.crearCoche("1111-ABC", "Toyota");
        Model.cambiarVelocidad("1111-ABC", 150);
        Coche coche = Model.getCoche("1111-ABC");
        assertEquals(150, coche.getVelocidad());
    }

    @Test
    public void testGetVelocidad() {
        Model.crearCoche("1111-ABC", "Toyota");
        Coche coche = Model.getCoche("1111-ABC");
        assertEquals(0, coche.getVelocidad()); // Assuming new cars start with 0 speed
    }
}