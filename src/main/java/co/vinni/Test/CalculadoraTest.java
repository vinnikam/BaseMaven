package co.vinni.Test;

import co.vinni.util.Operaciones;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSumarStrings(){
        Operaciones calc = new Operaciones();
        long resultado = calc.sumar("2","3");
        assertEquals("El resultado esperado de '2' y '3', debe ser 5",5, resultado);
    }

    @Test
    public void testSumarVacios(){
        Operaciones calc = new Operaciones();
        Long resultado = calc.sumar("","");
        assertEquals("La suma de  '' y '', debe ser null",null, resultado);
    }
}
