package es.iesmz.tests;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class NumerosTest {
    @BeforeAll
    public static void BeforeAllNumeros(){

    }

    @Test
    public void SonIguales1(){
        int resul = Numeros.soniguales(4,55,7);
        assertEquals(2,resul);
    }
    @Test
    public void SonIguales2(){
        int resul = Numeros.soniguales(14,23,27);
        assertEquals(2,resul);
    }
    @Test
    public void SonIguales3(){
        int resul = Numeros.soniguales(14,55,14);
        assertEquals(1,resul);
    }
    @Test
    public void SonIguales4(){
        int resul = Numeros.soniguales(14,14,33);
        assertEquals(1,resul);
    }
    @Test
    public void SonIguales5(){
        int resul = Numeros.soniguales(32,55,55);
        assertEquals(1,resul);
    }
    @Test
    public void SonIguales6(){
        int resul = Numeros.soniguales(329,329,329);
        assertEquals(0,resul);
    }
}