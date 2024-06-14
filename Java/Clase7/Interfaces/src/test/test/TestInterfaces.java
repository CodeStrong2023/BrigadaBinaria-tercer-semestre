package test;
import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySQL();
        //datos.listar();
        
        imprimir(datos);
        
        datos = new ImplementacionOracle();//Reutilizamos la var datos para llamar a la clase ImplementacionOracle
        //datos.listar();
        
        imprimir(datos);
    }
    public static void imprimir(IAccesoDatos datos){//Metodo generico - Recibe la interface con la var datos
            datos.listar();
    }
}
