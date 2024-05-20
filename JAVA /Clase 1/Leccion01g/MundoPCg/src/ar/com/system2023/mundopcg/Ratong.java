package ar.com.system2023.mundopcg;

public class Ratong extends DispositivoEntradag{
    private final int idRaton;
    private static int contadorRatones;
    
 public Ratong (String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton=++Ratong.contadorRatones;
 }

    @Override
    public String toString() {
        return "Ratong{" + "idRaton=" + idRaton + '}'+super.toString()+'}' ;
    }
}

 
