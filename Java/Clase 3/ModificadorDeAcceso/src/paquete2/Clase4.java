package paquete2;

public class Clase4 {
    private String atributoPrivado = "Atributo Privado";//atributo privado
    
    private Clase4(){//Construcot 1 privado
        System.out.println("Constructor privado"); 
    }
    public Clase4(String argumento){//Constructor publicos con parametros para poder crear objetos
        this();//Llamamos la constructor vacio
        System.out.println("Constructor publico");
    }
    private void metodoPrivado(){
        System.out.println("Metodo Privado");
    }

    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
}
