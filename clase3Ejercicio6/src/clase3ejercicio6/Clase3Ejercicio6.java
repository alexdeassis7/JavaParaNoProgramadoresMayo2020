/*6)	 Suponga que se tiene un conjunto de calificaciones de un grupo de
40 alumnos. Realizar un algoritmo para calcular la calificación promedio y 
la calificación más baja de todo el grupo .
las calificaciones estan en el rango de cero a diez*/
package clase3ejercicio6;

import java.util.Scanner;

public class Clase3Ejercicio6 {

    public static void main(String[] args) {
        //Variable de trabajo
        float calificacion = 0, promedio = 0, calificacionMasBaja = 999, acumuladorNotas = 0;
        int CantidadAlumnos = 5;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < CantidadAlumnos; i++) {
            //solicitamos las calificaciones al usuario
            System.out.println("Ingrese la calificacion del alumno " + (i + 1));
            calificacion = teclado.nextFloat();
            //acumulamos las notas en una variable
            acumuladorNotas += calificacion;
            //buscamos la calificacion mas baja 
            if (calificacion < calificacionMasBaja) {
                calificacionMasBaja = calificacion;
            }
        }
        //calculamos el promedio 
        promedio = acumuladorNotas / CantidadAlumnos;
        System.out.println("promedio = " + promedio);
        System.out.println("Nota mas Baja  = " + calificacionMasBaja);

    }

}
