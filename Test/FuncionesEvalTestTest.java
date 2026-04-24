import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionesEvalTestTest {

    @Test
    void esPerfecto() {
        assertTrue(FuncionesEvalTest.esPerfecto(6));
        assertFalse(FuncionesEvalTest.esPerfecto(7));
        Assertions.assertThrows(ArithmeticException.class, () -> FuncionesEvalTest.esPerfecto(0));
    }

    @Test
    void getTipoClima() {
    assertEquals("FRIO", FuncionesEvalTest.getTipoClima(5));
    assertEquals("NUBLADO", FuncionesEvalTest.getTipoClima(14));
        assertEquals("NUBLADO", FuncionesEvalTest.getTipoClima(20));
    assertEquals("CALUROSO", FuncionesEvalTest.getTipoClima(25));
        assertEquals("CALUROSO", FuncionesEvalTest.getTipoClima(30));
    assertEquals("TROPICAL", FuncionesEvalTest.getTipoClima(37));
    assertEquals("FRIO", FuncionesEvalTest.getTipoClima(-100));
    }

    @Test
    void invertirArray() {
    assertArrayEquals(new int[]{3, 2, 1}, FuncionesEvalTest.invertirArray(new int[]{1, 2, 3}));
    Assertions.assertThrows(IllegalArgumentException.class, () -> FuncionesEvalTest.invertirArray(null));

    }
}