
package ar.com.system2023.mundopcg;


public class DispositivoEntradag {
     private String tipoEntrada;
    private String marca;

    public DispositivoEntradag (String tipoEntrada, String marca){
        
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        
    }

    public String getTipoEntrada() {
        return this. tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this. marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntradag{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
    
    
}



   