package enumeracionesg;

public enum Continentesg {
    Africa(53,"1.2 billones"),
    Europa(46,"1.1 billones"),
    Asia(44,"1.9 billones"),
    America(34,"150.2 billones"),
    Oceania(14,"1.2 billones");
   
 private final int paises;
 private final String habitantes;
 
 Continentesg(int paises,String habitantes){
     this.paises = paises;
     this.habitantes = habitantes;
 }
 //Metodo Get
 public int getPaises(){
     return this.paises;
 }
 public String gethabitantes(){
         return this.habitantes;
 }
}