package MundoPCg;

import ar.com.system2023.mundopcg.*;

public class MundoPCg {
    public static void main(String[]args){
        
        Monitorg monitorgHP= new Monitorg ("HP",13);// Importar la clase
        Tecladog tecladogHP =new Tecladog("Bluetooth","HP");
        Ratong ratongHP= new Ratong("Bluetooth","HP");
        Computadorag computadoraHP = new Computadorag("computadora HP",monitorgHP, tecladogHP,ratongHP);
        //Creamos otros objetos de diferente marca
         Monitorg monitorGamer= new Monitorg ("Gemer",32);
        Tecladog tecladoGamer =new Tecladog("Bluetooth","Gamer");
        Ratong ratonGamer= new Ratong("Bluetooth","Gamer");
        Computadorag computadoraGamer = new Computadorag("computadora Gamer",monitorGamer,tecladoGamer,ratonGamer);
        
      Orden orden1 = new Orden();//Inicializamos el arreglo vacio
       Orden orden2 = new Orden();//Una nueva lista para el objeto orden2
       orden1.agregarcomputadora(computadoraHP);
       orden1.agregarcomputadora(computadoraGamer);
       orden1.mostrarOrden();
       
       Computadorag computadorasVarias =new Computadora("Computadora de diferentes marcas");
       orden2.agragarComputadora(computadorasVarias);
               
       orden1. mostrarOrden();
       orden2.mostrarOrden();
       
    }
        
}
