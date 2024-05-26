package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5); //Llamamos el metodo y le pasamos argumentos
        variosParametros("Santiago",6,7,8);
    }
    private static void variosParametros(String nombre, int ...numeros){
        System.out.println("Nombres: "+nombre);
        imprimirNumeros(numeros);
    }
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);
        }
    }
}
