package domaing;

public class Personag {
 private final int idpersonag;
 private static int ContadorPersonasg;
 static{//Bloque de inicializacion estatico
     System.out.println("Ejecucion del bloque estatico");
     ++Personag.ContadorPersonasg;
 }
// idPersonag=10;No es un atributo estatico ,por esto tenemos un error
 
 
 {//Bloque de inicializacion No estatico(Contexto Dinamico)
     System.out.println("Ejecucion del bloque NO estatico ");
     this.idpersonag =Personag.ContadorPersonasg++;//Incrementamos el atributo
    
 }
 //Los bloques de inicializacion se ejecutan antes del constructor
 public Personag(){
      System.out.println("Ejecucion del Contructor ");
 }
 public int getidpersonag(){
     return this.idpersonag;
 }

    @Override
    public String toString() {
        return "Personag{" + "idpersonag=" + idpersonag + '}';
    }
 
 
}

