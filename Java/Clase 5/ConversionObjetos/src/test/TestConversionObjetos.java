
package Test;
import domain.*;
public class TestConversionObjetos {
      
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles()); // Si queremos acceder a métodos Escritor
        
        // Downcasting
        //((Escritor)empleado).getTipoEscritura(); // Esta es una forma
        Escritor escritor = (Escritor)empleado; //  Esta es otra de las formas 
        escritor.getTipoEscritura();
        
        // Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
    
}