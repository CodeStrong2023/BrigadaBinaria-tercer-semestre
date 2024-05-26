package test;

import Enumeraciones.Continentes;
import Enumeraciones.Dias;

public class testEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1:"+Dias.LUNES);
        indicarDiaSemana(Dias.VIERNES);
        System.out.println("Continente n° 3: "+Continentes.ASIA);
        System.out.println("Paises de Asia: "+Continentes.ASIA.getPaises());
        System.out.println("habitantes de Continente Asia:"+Continentes.ASIA.getHabitantes());
        //Tarea: Agregar cada uno de los continentes con sus atributos
        //America
        System.out.println("Continente n° 4: "+Continentes.AMERICA);
        System.out.println("Paises de America: "+Continentes.AMERICA.getPaises());
        System.out.println("habitantes de Continente America:"+Continentes.AMERICA.getHabitantes());
        //Africa
        System.out.println("Continente n° 1: "+Continentes.AFRICA);
        System.out.println("Paises de Continente Africa: "+Continentes.AFRICA.getPaises());
        System.out.println("habitantes de Africa:"+Continentes.AFRICA.getHabitantes());
        //Europa
        System.out.println("Continente n° 2: "+Continentes.EUROPA);
        System.out.println("Paises de Europa: "+Continentes.EUROPA.getPaises());
        System.out.println("habitantes de Europa"+Continentes.EUROPA.getHabitantes());
        //Oceania
        System.out.println("Continente n° 5: "+Continentes.OCEANIA);
        System.out.println("Paises de Oceania: "+Continentes.OCEANIA.getPaises());
        System.out.println("habitantes de Oceania:"+Continentes.OCEANIA.getHabitantes());
    }
    private static void indicarDiaSemana(Dias dias){//Creamos un metodo
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
                //Tarea: Agregar todos los dias de la semana    
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Séptimo dia de la semana");
                break;
            default:
                System.out.println("Ingresó un valor incorrecto");
        }
    }
}
    
    
