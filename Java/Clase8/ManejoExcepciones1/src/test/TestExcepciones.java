package test;

import aritmetica.Aritmetical;
import excepciones.OperacionExepcion;

public class TestExcepciones {
//
    public static void main(String[] args) {
        int resultado = 0;
        try {
//            resultado = 10 / 0;

            resultado = Aritmetical.division(10, 0);
            System.out.println("resultado = " + resultado);
        } catch (OperacionExepcion e) {
            System.out.println("Ocurrio una excepcion");
            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out); 
        } finally {
            System.out.println("Se realizo la division");
        }
    }
}
