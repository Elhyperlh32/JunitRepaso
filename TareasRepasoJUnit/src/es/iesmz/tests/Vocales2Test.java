package es.iesmz.tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Vocales2Test {
    @Test
    public void sinvocales1(){
        String resul = Vocales2.sinvocales("Hola Mundo");
        assertEquals("Hl Mnd",resul);
    }
    @Test
    public void sinvocales2(){
        String resul = Vocales2.sinvocales("Esto Es una cadenA");
        assertEquals("st s n cdn",resul);
    }
    @Test
    public void sinvocales3(){
        String resul = Vocales2.sinvocales("Java mola MogollOn");
        assertEquals("Jv ml Mglln",resul);
    }
    @Test
    public void sinvocales4(){
        String resul = Vocales2.sinvocales("4h0r4 s0n num3r0s");
        assertEquals("4h0r4 s0n nm3r0s",resul);
    }
    @Test
    public void sinvocales5(){
        String resul = Vocales2.sinvocales("Cadena Sin Vocales");
        assertEquals("Cdn Sn Vcls",resul);
    }
}