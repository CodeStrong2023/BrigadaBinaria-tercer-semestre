package test;
import enumeracionesg.Continentesg;
import enumeracionesg.Diasg;

public class TestEnumeracionesg {
    public static void main(String [] args){
       //System.out.println("Dia 1: "+Diasg.Lunes);
      // indicarDiaSemana(Diasg.Lunes);//Las enumeraciones se tratan como cadenas
       //Ahora no se deben utlizar comillas,se accede a travez de el operador de punto
     
       
        System.out.println("Continentesg Nro.1: "+Continentesg.Africa);
        System.out.println("No.de paises en el 1er.continente: "
                +Continentesg.Africa.getPaises());
        System.out.println("No.de paises en el 1er.continente: "
                +Continentesg.Africa.gethabitantes());
        
  
         System.out.println("Continentesg Nro.2: "+Continentesg.Europa);
        System.out.println("No.de paises en el 2do.continente: "
                +Continentesg.Europa.getPaises());
        System.out.println("No.de paises en el 2do.continente: "
                +Continentesg.Europa.gethabitantes());
        
        
        System.out.println("Continentesg Nro.3: "+Continentesg.Asia);
        System.out.println("No.de paises en el 3er.continente: "
                +Continentesg.Asia.getPaises());
        System.out.println("No.de paises en el 3er.continente: "
                +Continentesg.Asia.gethabitantes());
        
        System.out.println("Continentesg Nro.4: "+Continentesg.America);
        System.out.println("No.de paises en el 4to.continente: "
                +Continentesg.America.getPaises());
        System.out.println("No.de paises en el 4to.continente: "
                +Continentesg.America.gethabitantes());
        
        
        System.out.println("Continentesg Nro.5: "+Continentesg.Oceania);
        System.out.println("No.de paises en el 5to.continente: "
                +Continentesg.Oceania.getPaises());
        System.out.println("No.de paises en el 5to.continente: "
                +Continentesg.Oceania.gethabitantes());
    }
   
    
    
         private static void indicarDiaSemana(Diasg dias){
        switch(dias){
            case Lunes:
           System.out.println("Primer dia de la semana: "); 
           break;
            case Martes:
           System.out.println("Segundo dia de la semana: ");
           break;
            case Miercoles:
           System.out.println("Tercer dia de la semana: ");
           break;
            case Jueves:
           System.out.println("Cuarto dia de la semana: ");
           break;
            case Viernes:
            System.out.println("Quinto dia de la semana: ");
            break;
            case Sabado:
           System.out.println("Sexto dia de la semana: ");
           break;
            case Domingo:
          System.out.println("Septimo dia de la semana: ");
          break;
        }
    }
}
