import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestsModel {
    Model model;

    @BeforeEach
    void setUp() {
        model = new Model();
    }

    @Test
    void testCrearCoche() {
        Coche coche = model.crearCoche("LaFerrari", "1234ABC");
        assertNotNull(coche);
        assertEquals("1234ABC", coche.getMatricula());
        assertEquals("LaFerrari", coche.getModelo());
        assertEquals(0, coche.getVelocidad());
    }

    @Test
    void testGetCoche() {
        model.crearCoche("LaFerrari", "1234ABC");
        Coche coche = model.getCoche("1234ABC");
        assertNotNull(coche);
        assertEquals("1234ABC", coche.getMatricula());
    }

    @Test
    void testSubirVelocidad() {
        model.crearCoche("LaFerrari", "1234ABC");
        model.subirVelocidad("1234ABC", 200);
        Integer velocidad = model.getVelocidad("1234ABC");
        assertEquals(200, velocidad);
    }

    @Test
    void testBajarVelocidad() {
        model.crearCoche("LaFerrari", "1234ABC");
        model.subirVelocidad("1234ABC", 200);
        model.bajarVelocidad("1234ABC", 20);
        Integer velocidad = model.getVelocidad("1234ABC");
        assertEquals(180, velocidad);
    }

    @Test
    void testGetVelocidad() {
        model.crearCoche("LaFerrari", "1234ABC");
        Integer velocidad = model.getVelocidad("1234ABC");
        assertEquals(0, velocidad);
    }
}