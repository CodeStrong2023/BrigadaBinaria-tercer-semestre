package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListarPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo whilw
        List<Persona>personas = new ArrayList<>();
        //Empezamos con el menú
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            }catch(Exception e){
                System.out.println("Ocurrió unn error: "+e.getMessage());
            }
                
            System.out.println("");
        }//Fin del while
    }//Fin del main
    
    private static void mostrarMenu(){
        //Mostramos las opciones 
        System.out.print("""
                        ******LISTADO DE PERSONAS******
                        1. Agregar 
                        2. Listar
                        3. Salir
                        """);
        System.out.print("Ingrese una de las opciones: ");
    }//Fin de mostrarMenu
    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        //revisamos la opcion digitada a travez de un switch
        switch(opcion){
            case 1 -> {//Agregar una persona a la lista
                System.out.print("1.Ingrese el nombre:");
                var nombre = entrada.nextLine();
                System.out.print("2.Ingrese su telefono:");
                var tel = entrada.nextLine();
                System.out.print("3.Ingrese su email: ");
                var email = entrada.nextLine();
                //Creamos el objeto persona
                var persona = new Persona (nombre,tel,email);
                //Agregamos la persona a la lista
                personas.add(persona);
                System.out.println("La lista tienen: "+personas.size()+" elementos");
            }//Fin caso 1
            case 2 ->{//Listamos a las personas
                System.out.println("Listado de personas: ");
                //Mejoras con lambda y el metodo de referencia
                //personas.forEach((persona)-> System.out.println(persona));
                personas.forEach(System.out::println);
            }//Fin caso 2
            case 3 ->{
                System.out.println("Saliendo del programa");
                salir = true;
            }//Fin caso 3
            default -> System.out.println("Opcion incorrecta "+opcion);
        }//Fin Switch
        return salir;
    }//Fin del metodo ejecutarOperacion
}//Fin de la clase ListarPersonasApp
