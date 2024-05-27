package paquete1;

public class ClaseHija2 extends Clase2{
    public ClaseHija2(){
        super();//llamamos la constructor de la clase padre
        this.atributoDefault = "Modificamos atributo defeault";//Accedemos al atributo y lo modificamos
        System.out.println("atributoDefault = " + this.atributoDefault);//
        this.metodoDefault(); //Llamamos al metodo
    }
}
