package es.iesmz.tests;

public class Vector {
    public static int[] reverso(int[] v){
        int[] resul = new int[v.length];
        for (int i = 0;i < v.length; i++) {
            resul[i] = v[v.length - 1 - i];
        }
        return resul;
    }
}
