package SolucionesAxel;
import java.util.Scanner;
public class GenerarSecuencia_2 {
    public static void main(String[] args) {
        //Axel Roman Torres :D
        Scanner teclado = new Scanner(System.in);
        int numerador, denominador, cont;
        cont=1;
        numerador=5;
        denominador=10;
        while (cont <=6) {
            System.out.println(numerador + "/" + denominador);
            numerador= (numerador+5);
            denominador = (denominador+2);
            cont= cont+1;
        }                       
    }
}