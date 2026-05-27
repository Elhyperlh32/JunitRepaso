package es.iesmz.tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VocalesTest {

@Test
    public void sinvocales1(){
    int contador = Vocales.contarvocales("Hola Mundo");
    assertEquals(4,contador);
}

    @Test
    public void sinvocales2(){
        int contador = Vocales.contarvocales("Esto Es una cadenA");
        assertEquals(8,contador);
    }
    @Test
    public void sinvocales3(){
        int contador = Vocales.contarvocales("Java mola MogollOn");
        assertEquals(7,contador);
    }
    @Test
    public void sinvocales4(){
        int contador = Vocales.contarvocales("4h0r4 s0n num3r0s");
        assertEquals(1,contador);
    }
    @Test
    public void sinvocales5(){
        int contador = Vocales.contarvocales("Cadena S1n Vocales");
        assertEquals(6,contador);
    }

}