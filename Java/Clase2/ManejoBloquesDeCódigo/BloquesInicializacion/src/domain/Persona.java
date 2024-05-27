package domain;
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    //Creamos el bloque de inicialización estático
    static{
        System.out.println("Ejecucion bloque estático");
        ++Persona.contadorPersonas;
    }
    //Creamos el bloque de inicialización NO estático o diámico
    {
        System.out.println("Ejecucion bloque dinámico");
        this.idPersona = Persona.contadorPersonas++;//Incrementa
    }
    //Constructor
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    //getter
    public int getIdPersona() {
        return this.idPersona;
    }
    //toString

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
