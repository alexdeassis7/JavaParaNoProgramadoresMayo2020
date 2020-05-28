/*2)	Llenar dos vectores A y B de 45 elementos cada uno, 
sumar el elemento uno del vector A con el elemento uno del vector B y 
así sucesivamente hasta 45, almacenar el resultado en un vector C, 
e imprimir el vector resultante por pantalla..
 */
package clase4ejereextras2;

import java.util.Arrays;

public class Clase4EjereExtras2 {

    public static void main(String[] args) {
        //creamos los 3 vectores
        int[] vectorA = new int[45];
        int[] vectorB = new int[45];
        int[] vectorC = new int[45];
        //definimos el rango de los numeros aleatorios 
        int max = 100;
        int min = 1;
        int range = max - min + 1;

        //cargamos vertores a y b con random 
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) (Math.random() * range) + min;
            vectorB[i] = (int) (Math.random() * range) + min;
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("VECTOR A"+Arrays.toString(vectorA));
        System.out.println("VECTOR B"+Arrays.toString(vectorB));
        System.out.println("VECTOR C"+Arrays.toString(vectorC));

    }

}
