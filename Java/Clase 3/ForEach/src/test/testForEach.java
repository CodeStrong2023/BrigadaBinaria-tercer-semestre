package test;
import domain.Persona;

public class testForEach {
    public static void main(String[] args) {
        int edades [] = {5,6,7,8};//Sintaxis resumida de arreglo
        for (int i = 0; i <edades.length; i++) { //De esta forma recorremos como siempre el arreglo
            System.out.println("Ciclo for normal");
            System.out.println("i = " + edades[i]);   
        }
        for(int edad:edades){//Ciclo forEach
            System.out.println("Ciclo forEach");
            System.out.println("edad = " + edad);
        }
        Persona personas[] = {new Persona("Santiago"),new Persona("Angelina"),new Persona("Santino")}; 
        //ForEach para objetos de persona
        for(Persona persona:personas){
            System.out.println("persona = " + persona);
        }
    }
}

