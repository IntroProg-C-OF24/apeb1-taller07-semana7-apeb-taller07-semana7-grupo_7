/*
Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
Calcular el valor a cancelar por la empresa para cada empleado.
 */
package solucionestaller7;
import java.util.Scanner;
public class Empleados_03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre="";
        int cont, numdias;
        double costodia, valorTotal;
        numdias = 0;
        costodia = 0;
        cont=1;
        while (cont <= 5) {
            System.out.println("ingrese el nombre");
            nombre = teclado.next();
            System.out.println("ingrese el numero de dias trabajados");
            numdias = teclado.nextInt();
            System.out.println("ingrese el costo del día de trabajo");
            costodia = teclado.nextDouble();
            valorTotal = (numdias*costodia);
            System.out.println(" | " + nombre + " | " + costodia + " | " + valorTotal + " | ");
            cont = cont+1;
        }
            
    }
}
