import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionesEvalTest {

    @Test
    void esPerfecto() {
        assertTrue(FuncionesEval.esPerfecto(6));
        assertFalse(FuncionesEval.esPerfecto(7));
        Assertions.assertThrows(ArithmeticException.class, () -> FuncionesEval.esPerfecto(0));
    }

    @Test
    void getTipoClima() {
    assertEquals("FRIO", FuncionesEval.getTipoClima(5));
    assertEquals("NUBLADO", FuncionesEval.getTipoClima(14));
        assertEquals("NUBLADO", FuncionesEval.getTipoClima(20));
    assertEquals("CALUROSO", FuncionesEval.getTipoClima(25));
        assertEquals("CALUROSO", FuncionesEval.getTipoClima(30));
    assertEquals("TROPICAL", FuncionesEval.getTipoClima(37));
    assertEquals("FRIO", FuncionesEval.getTipoClima(-100));
    }

    @Test
    void invertirArray() {
    assertArrayEquals(new int[]{3, 2, 1}, FuncionesEval.invertirArray(new int[]{1, 2, 3}));
    Assertions.assertThrows(IllegalArgumentException.class, () -> FuncionesEval.invertirArray(null));

    }
    @Test
    void contarApariciones() {
        assertEquals(2, FuncionesEval.contarApariciones(new int[]{1, 2, 3, 1, 4}, 1));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{5, 6, 7}, 2));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{}, 5));
    }

    @Test
    void testEncontrarMayor() {
        int[] array1 = {1, 3, 2, 5, 4};
        assertEquals(5, FuncionesEval.encontrarMayor(array1));

        int[] array2 = {-1, -2, -3, -4};
        assertEquals(-1, FuncionesEval.encontrarMayor(array2));

        int[] array3 = {10};
        assertEquals(10, FuncionesEval.encontrarMayor(array3));

        int[] array4 = {};
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array4));

        int[] array5 = null;
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array5));
    }

}