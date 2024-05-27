package paquete1;

class Clase2 {
    String atributoDefault = "Atributo de valor default"; 
    
//    Clase2(){//Constructor default
//        System.out.println("Constructor default");
//    }
    
    public Clase2(){
        super();  
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    
    void metodoDefault(){//Metodo default
        System.out.println("Metodo default");
    }
    
}
