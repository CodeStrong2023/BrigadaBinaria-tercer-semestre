package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class testModificadorDeAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();//Señala al contructor 
        System.out.println("clase1 = " + clase1.atributoPublico);//Señala al constructor
        clase1.metodoPublico();//Señala al metodo
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);
    }  
}
