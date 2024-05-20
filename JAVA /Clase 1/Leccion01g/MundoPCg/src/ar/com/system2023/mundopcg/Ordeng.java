package ar.com.system2023.mundopcg;

public class Ordeng {
     private final int idOrden;
     private Computadorag computadora[];//Arreglo de objetos 
     private static int contadorOrdenes;
     private static final int MAX_COMPUTADORA = 10;
     private int contadorComputadora;
     
     //Constructor vacio
     public Ordeng(){
         this.idOrden = ++Ordeng. contadorOrdenes;
         this.computadora= new Computadorag[Ordeng.MAX_COMPUTADORA];
          }
     
     //Metodo para agregar una nueva computadora al arreglo
     public void agregarComputadora(Computadorag computadora){
         if(this.contadorComputadora < Ordeng.MAX_COMPUTADORA)
             this.computadora[this.contadorComputadora++]= computadora;
     
     else{
    System.out.println("Has superado el limite:"+Ordeng.MAX_COMPUTADORA);}
}

         
         //Mostrar orden
         public void mostrarOrden(){
             System.out.println("Orden# :"+this.idOrden);
              System.out.println("Computadoras de la orden# :"+this.idOrden);
              for(int i =0; i <this.contadorComputadora;i++){
                  System.out.println(this.computadora[i]);
              }
         }
}
        
             
         
             

