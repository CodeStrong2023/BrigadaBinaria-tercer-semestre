package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1{ //Clase 3 hija de Clase1
    public Clase3(){
        super("Protected");//llamamos al constructor de la clase padre
        this.atributoProtected = "Accedemos desde la clase hija";
        System.out.println("AtributoProtected = "+this.atributoProtected);
        this.atributoPublico = "Es totalmente publico";
    }
}
