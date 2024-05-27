package domain;

public class Persona {
    private String nombre;

    public Persona(String nombre) { // Constructor para nombre
        this.nombre = nombre;
    }
    
    public String getNombre() {//Get para nombre
        return this.nombre;
    }

    public void setNombre(String nombre) {//Set para nombre
        this.nombre = nombre;
    }

    @Override
    public String toString() { //metodo toString
        return "Persona{" + "nombre=" + nombre + '}';
    }
       
}
