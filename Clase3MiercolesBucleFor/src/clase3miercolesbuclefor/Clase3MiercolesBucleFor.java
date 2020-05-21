/** Calcular el promedio de un alumno que tiene 7 calificaciones
 * en la materia analisis matematico 2 */
package clase3miercolesbuclefor;

import java.util.Scanner;

public class Clase3MiercolesBucleFor {

    public static void main(String[] args) {
        //Variables de trabajo 
        float nota = 0, promedio = 0, sumaAcumulador = 0;
        Scanner teclado = new Scanner(System.in);

        for (int contador = 0 ; contador < 7; contador++ ) {
            //solicitamos nota al usuario 
            System.out.println("ingrese la nota " + (contador + 1));
            nota = teclado.nextFloat();
            //acumulamos todas las notas 
            sumaAcumulador += nota;
        }
        promedio = sumaAcumulador / 7;
        System.out.println("el promedio de sus notas es : " + promedio);
        System.out.println("sumaAcumulador =" + sumaAcumulador);

    }

}
