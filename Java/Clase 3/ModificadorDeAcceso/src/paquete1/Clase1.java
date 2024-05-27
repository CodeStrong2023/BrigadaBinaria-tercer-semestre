package paquete1;

public class Clase1 {
    public String atributoPublico = "Atributo Publico";
    protected String atributoProtected = "Atributo protected";
    
    public Clase1(){  //Constructor public
        System.out.println("Construcor publico");
    }
    
    protected Clase1(String atributoPublico){
        System.out.println("Constructor protected");
    }
    
    public void metodoPublico(){ //Metodo publico
        System.out.println("Metodo Publico");
    }
    
    protected void metodoProtected(){//Metodo protected
        System.out.println("Metodo protected");
    }
    
}

