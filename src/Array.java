/**
La clase debe tener un atributo tipo String y un atributo tipo array que almacene cinco valores numéricos.
El atributo tipo String almacenará el nombre del participante.

El atributo tipo array almacenará las calificaciones de cinco materias del participante.
Deberán escribirse tres métodos:

Un método calculará el promedio de las cinco calificaciones. (Recibe el array con las calificaciones y regresa un
valor numérico).

Otro método obtendrá la calificación final del participante a partir del promedio y asignará la calificación de
acuerdo a la siguiente tabla (Recibe como parámetro el promedio y regresa un caracter):
**/
import java.util.Scanner;

public class Array {
    public void cargarValores(){
        /**Obtención de datos**/
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre del Alumno: ");
        String nombre = teclado.toString();
        System.out.print ("Ingrese Primer Calificación: ");
        int c1 = teclado.nextInt();
        System.out.print("Ingrese la Segunda Calificación: ");
        int c2 = teclado.nextInt();
        System.out.print("Ingrese la Tercer Calificación: ");
        int c3 = teclado.nextInt();
        System.out.print("Ingrese la Cuarta Calificaión: ");
        int c4 = teclado.nextInt();
        System.out.print("Ingrese la Quinta Calificación: ");
        int c5 = teclado.nextInt();
        int promedioCalif = promCalif(c1,c2,c3,c4,c5);

    }
    public int promCalif(int calif1, int calif2, int calif3, int calif4, int calif5){
        int sumCalif = calif1 + calif2 + calif3 + calif4 + calif5;
        int sumCalif1 = sumCalif;
        float prom=sumCalif1/5;
        float arregloCalf = prom;
        return (int) prom;
    }
    public void arregloCalif(int promedio){
        String[] calificaciones = {"F","E","D","C","B","A"};


    }

    public static void main (String[] args){









    }
}
