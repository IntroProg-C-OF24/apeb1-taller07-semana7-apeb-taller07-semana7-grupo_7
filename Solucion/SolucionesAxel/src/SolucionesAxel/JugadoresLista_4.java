package SolucionesAxel;
import java.util.Scanner;
public class JugadoresLista_4 {
    public static void main(String[] args) {
        //Axel Roman Torres :D
        int numJugador=0;
        double sumaEdad=0;
        double sumaAltura=0;
        boolean continuar=true;
        while (continuar){
        Scanner teclado = new Scanner(System.in);     
        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = teclado.nextLine();    
        System.out.println("Ingrese la posición que juega: ");
        String posicion = teclado.nextLine();    
        System.out.println("Ingrese la edad del jugador: ");
        int edad = teclado.nextInt();
        System.out.println("Ingrese la altura del jugador: ");
        double estatura = teclado.nextDouble();
        numJugador=numJugador + 1;
        System.out.println(numJugador + ". " + nombre + " -" + posicion + "-. "+"edad " + edad + ", estatura " + estatura);
        System.out.println("Desea continuar? (si/no)");
        String respuesta = teclado.next();
        if (respuesta.equals("no"))
            continuar=false;
        sumaEdad = sumaEdad + edad;
        sumaAltura = sumaAltura+estatura;
        }
        System.out.println("Promedio edades: " + sumaEdad/numJugador);
        System.out.println("Promedio de estaturas: " + sumaAltura/numJugador);
    }
}