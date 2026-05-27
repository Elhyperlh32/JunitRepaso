package es.iesmz.tests;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {
    @Test
    public void reverso1(){
        int []v = {1,2,3,4,5,6};
        int []resulEsperado = {6,5,4,3,2,1};
        int []resul =  Vector.reverso(v);
        assertArrayEquals(resulEsperado,resul);
    }
    @Test
    public void reverso2(){
        int []v = {10,12,5,221,6,7};
        int []resulEsperado = {7,6,221,5,12,10};
        int []resul =  Vector.reverso(v);
        assertArrayEquals(resulEsperado,resul);
    }
    @Test
    public void reverso3(){
        int []v = {5};
        int []resulEsperado = {5};
        int []resul =  Vector.reverso(v);
        assertArrayEquals(resulEsperado,resul);
    }
    @Test
    public void reverso4(){
        int []v = {5,10,20};
        int []resulEsperado = {20,10,5};
        int []resul =  Vector.reverso(v);
        assertArrayEquals(resulEsperado,resul);
    }

}