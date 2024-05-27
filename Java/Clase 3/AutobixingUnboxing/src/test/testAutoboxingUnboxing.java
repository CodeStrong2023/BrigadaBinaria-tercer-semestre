package test;

public class testAutoboxingUnboxing {
    public static void main(String[] args) {
        int enteroPrim = 15;//Tipo primitivo
        Integer entero = 10;//Tipo object
        System.out.println("enteroPrim = " +enteroPrim );
        System.out.println("entero = " + entero.byteValue());
        
        int entero2 = entero;//unboxing
    }
}   
