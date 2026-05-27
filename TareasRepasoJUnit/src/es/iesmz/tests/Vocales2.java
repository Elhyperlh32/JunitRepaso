package es.iesmz.tests;

public class Vocales2 {
    public static String sinvocales(String cadena){
        String[] vocales = {"a","e","i","o","u","A","E","I","O","U"};
        String newCadena = cadena;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            for (String vocal : vocales) {
                if(String.valueOf(letra).equals(vocal)) {
                    newCadena = newCadena.replace(vocal,"");
                }
            }
        }
        return newCadena;
    }
}
