package es.iesmz.tests;

public class Vocales {
    public static int contarvocales(String cadena){
        String[] vocales = {"a","e","i","o","u"};
        String cadenaLower = cadena.toLowerCase().replace(" ","");
        int cont = 0;
        for (int i = 0; i < cadenaLower.length(); i++) {
            char letra = cadenaLower.charAt(i);
            for (String vocal : vocales) {
                if(String.valueOf(letra).equals(vocal)) {
                    cont++;
                }
            }


        }
        return cont;
    }
}
