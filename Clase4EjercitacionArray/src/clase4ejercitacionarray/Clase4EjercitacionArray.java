/*

 */
package clase4ejercitacionarray;

import java.util.Arrays;

public class Clase4EjercitacionArray {

    public static void main(String[] args) {
        
        int[] miArray = {2, 8, 9, 8, 56, 5, 0, 5, 5, 6, 5, 6};

        System.out.println("length " + miArray.length);

        for (int i = 0; i < miArray.length; i++) {
            System.out.println("miArray [" + i + "] =" + miArray[i]);
        }

        Arrays.sort(miArray); //ordename el array llamado miarray
        System.out.println("ORDENANDOOOO");

        for (int i = 0; i < miArray.length; i++) {
            System.out.println("miArray [" + i + "] =" + miArray[i]);
        }

        int[] array1 = {1, 5, 6};

        int[] array2 = {1, 5, 6};
        
        System.out.println("Son iguales ??? " + Arrays.equals(array1, array2));

        System.out.println("ToString " + Arrays.toString(array2));

    }

}
