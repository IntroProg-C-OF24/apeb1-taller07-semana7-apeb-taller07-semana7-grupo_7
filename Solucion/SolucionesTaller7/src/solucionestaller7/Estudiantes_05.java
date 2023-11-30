/*
 Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo. 
Presentar el siguiente reporte
Con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 */
package solucionestaller7;
import java.util.Scanner;
public class Estudiantes_05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre ="";
        double promedio;
        int cont;
        promedio=0;
        cont=1;
        while (cont <= 4){
            System.out.println("Ingrese el nombre del estudiante");
            nombre = teclado.next();
            System.out.println("ingrese el promedio del ciclo");
            promedio = teclado.nextDouble();    
            if (promedio <=10 && promedio>=7)
                System.out.println(nombre + "|" + promedio + "|" + "Aprobado");
            else
                System.out.println(nombre + "|" + promedio + "|" + "Reprobado");  
            cont = cont+1;
        }         
    }
    
}
