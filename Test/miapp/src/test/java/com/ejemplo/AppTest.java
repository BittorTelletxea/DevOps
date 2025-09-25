import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void sumaDebeFuncionar() {
        int resultado = 2 + 3;
        assertEquals(5, resultado, "La suma debería dar 5");
    }

    @Test
    void cadenaNoDebeSerNula() {
        String saludo = "Hola mundo";
        assertNotNull(saludo, "El saludo no debe ser nulo");
    }
}
