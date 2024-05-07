package ar.com.system2023.mundopcg;

public class Monitorg {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    private Monitorg(){
        this.idMonitor=++Monitorg.contadorMonitores;
    }
    
    public Monitorg(String marca,double tamanio){
        this();//llamado al constructor vacio 
        this.marca = marca;
        this.tamanio = tamanio;
        }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this. tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
 //Ingresamos manualmente el gatidMonitor
    public int getidMonitorg(){
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitorg{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
}
