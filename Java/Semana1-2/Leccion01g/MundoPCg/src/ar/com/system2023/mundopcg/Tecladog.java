package ar.com.system2023.mundopcg;

public class Tecladog extends DispositivoEntradag{
      private final int idTeclado;
    private static int contadorTeclado;
    
 public Tecladog (String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado=++Tecladog.contadorTeclado;
 }

    @Override
    public String toString() {
        return "TecladoG{" + "idTeclado=" + idTeclado + '}'+super.toString()+'}' ;
    }
}

    

