import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        String nombreAlumno;
        int [] calificaciones = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre del alumno: ");
        nombreAlumno = sc.nextLine();

        for(int i=0; i <= 4; i++){
            System.out.println("Captura la calificación de la materia " + (i+1)+": ");
            calificaciones[i] = sc.nextInt();
        }

        double promedio = promedio(calificaciones);
        String valor = calificacionFinal(promedio);
        resultados(nombreAlumno, calificaciones, promedio, valor);

    }

    public static double promedio(int [] calificacion){
        int suma=0;
        double prom=0;
        for (int i = 0; i < calificacion.length; i++) {
            suma += calificacion[i];
        }
        prom= suma/calificacion.length;
        return  prom;
    }

    public static String calificacionFinal(double prom){
        String v;
        if (prom<=50){
            v="F";
        }else if (prom<=60){
            v="E";
        }else if (prom<=70){
            v="D";
        }else if (prom<=80){
            v="C";
        }else if (prom<=90){
            v="B";
        }else {
            v="A";
        }

    return v;
    }

    public static void resultados(String nombre, int [] calificaciones, double promedio, String letra){
        System.out.println("Nombre del Estudiante: " + nombre);
        for(int i=0; i <= 4; i++){
            System.out.println("Calificación " + (i+1)+ ": " + calificaciones[i]);
        }
        System.out.println("Promedio: "+ promedio);
        System.out.println("Calificación: "+ letra);
    }
}


