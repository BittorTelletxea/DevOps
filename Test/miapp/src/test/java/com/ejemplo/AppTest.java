package com.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testSumaCorrecta() {
        int resultado = App.suma(2, 3);
        assertEquals(5, resultado, "La suma debería dar 5");
    }

}
