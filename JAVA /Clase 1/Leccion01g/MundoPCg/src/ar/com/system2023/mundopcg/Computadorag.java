package ar.com.system2023.mundopcg;

public class Computadorag {
    private final int idComputadorag;
    private String nombre;
    private Monitorg monitor;
    private Tecladog teclado;
    private Ratong raton;
    private static int contadorcomputadora;
    
    
    //Constructor vacio
    private Computadorag(){
        this.idComputadorag= ++Computadorag.contadorcomputadora;
        
         }
     //Constructor 2
     public Computadorag(String nombre,Monitorg monitor,Tecladog teclado,Ratong raton){
         this();
         this.nombre = nombre; 
         this.monitor = monitor;
         this.teclado= teclado;
         this.raton= raton;
     }
   public int getIdComputadorag(){
       return idComputadorag;
   }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitorg getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitorg monitor) {
        this.monitor = monitor;
    }

    public Tecladog getTeclado() {
        return teclado;
    }

    public void setTeclado(Tecladog teclado) {
        this.teclado = teclado;
    }

    public Ratong getRaton() {
        return raton;
    }

    public void setRaton(Ratong raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadorag{" + "idComputadorag=" + idComputadorag + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
        
       
    }
    
