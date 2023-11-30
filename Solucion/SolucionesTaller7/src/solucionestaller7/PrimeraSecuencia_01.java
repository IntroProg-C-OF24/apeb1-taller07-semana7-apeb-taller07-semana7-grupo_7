/*
Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
1/10
2/11
3/12
4/13
5/14
6/15
 */
package solucionestaller7;
import java.util.Scanner;
public class PrimeraSecuencia_01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numerador, denominador, cont;
        cont=1;
        numerador=1;
        denominador=10;
        while (cont <=6) {
            System.out.println(numerador + "/" + denominador);
            numerador= (numerador+1);
            denominador = (denominador+1);
            cont= cont+1;
        }                       
    } 
}
