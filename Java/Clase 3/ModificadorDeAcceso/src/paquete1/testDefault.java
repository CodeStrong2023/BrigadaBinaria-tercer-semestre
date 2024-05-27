package paquete1;

import paquete2.Clase4;

public class testDefault {
    public static void main(String[] args) {
        ClaseHija2 ClaseH2 = new ClaseHija2();
        ClaseH2.atributoDefault = "Cambio desde la prueba";
        System.out.println("ClaseH2 atributo default= " + ClaseH2.atributoDefault);
        ClaseH2.metodoDefault();
        
        Clase4 clase4 = new Clase4("Publico");
        System.out.println(clase4.getAtributoPrivado());
        clase4.setAtributoPrivado("Cambio");
        System.out.println("clase4 = " + clase4.getAtributoPrivado());
    }
}
