import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModelTest {

    @Test
    public void testCrearCoche() {
        Coche coche = Model.crearCoche("1111-ABC", "Toyota", 120);
        assertNotNull(coche);
        assertEquals("1111-ABC", coche.getMatricula());
        assertEquals("Toyota", coche.getModelo());
        assertEquals(120, coche.getVelocidad());
    }

    @Test
    public void testGetCoche() {
        Model.crearCoche("1111-ABC", "Toyota", 120);
        Coche coche = Model.getCoche("1111-ABC");
        assertNotNull(coche);
        assertEquals("1111-ABC", coche.getMatricula());
        assertEquals("Toyota", coche.getModelo());
        assertEquals(120, coche.getVelocidad());
    }

    @Test
    public void testCambiarVelocidad() {
        Model.crearCoche("1111-ABC", "Toyota", 120);
        Model.cambiarVelocidad("1111-ABC", 150);
        assertEquals(150, Model.getVelocidad("1111-ABC"));
    }

    @Test
    public void testGetVelocidad() {
        Model.crearCoche("1111-ABC", "Toyota", 120);
        assertEquals(120, Model.getVelocidad("1111-ABC"));
    }
}
