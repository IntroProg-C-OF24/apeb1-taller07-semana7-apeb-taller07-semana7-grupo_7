/*
Generar e imprimir la siguiente serie: sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
package solucionestaller7;
import java.util.Scanner;
public class Sumatoria_07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont, numerador, denominador;
        cont = 1;
        numerador = 1;
        denominador = 0;
        System.out.print("Sumatoria = ");
        while (cont <= 10){
            denominador = (denominador + 1);
            if (denominador % 2 ==0)
                System.out.print(" +(" + numerador + "/" + denominador + ")");
            if (denominador % 2 !=0)
                System.out.print(" -(" + numerador + "/" + denominador + ")");
            cont = cont + 1; 
        } 
    } 
}
