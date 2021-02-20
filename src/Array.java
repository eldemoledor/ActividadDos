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
        private Scanner teclado;
        private String nombre;
        private int[] calif;
        private float promedio;
        private float sumaCalif;


    //Inicia Captura de Datos
    public void capturaDatos(){
        teclado = new Scanner(System.in);
        calif = new int [5];

        System.out.print("Ingrese el nombre del alumno: ");
        nombre = teclado.next();
        for (int i =0; i<=calif.length; i++){
            System.out.print("Ingrese la calficacion "+ i + ": "+calif[i]);
            calif[i] = teclado.nextInt();
            sumaCalif+=calif[i];
            promedio = sumaCalif/calif[i];
        }
    } //Fin captura de Datos.

    //Impresión de datos.
    public float imprimirDatos(int calif){

        return 0;
    }


    //public int cargarValores(){
        /**Obtención de datos*
        Scanner teclado = new Scanner(System.in);
        int calif[]
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
        //float arregloCalf = prom;
        return (int) prom;
    }
    public static String caalifFinal(int promedio){
        String rLetra;
        if (promedio <= 50){
            rLetra = "F";
        }else if (promedio <=60 ){
            rLetra= "E";
        }else  if (promedio<=70){
            rLetra = "D";
        }else if (promedio <=80){
            rLetra = "C";
        }else if (promedio <=90){
            rLetra= "B";
        }else{
            rLetra = "A";
        }
        return rLetra;
    }**/

    public static void main (String[] args){
        System.out.print("Ingrese nombre del Alumno: ");


    }

}