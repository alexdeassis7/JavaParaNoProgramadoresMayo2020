/*1)Calcular el promedio de 50 valores almacenados en un Vector.
Determinar además cuantos son mayores que el promedio, imprimir el promedio,
y una lista de valores mayores que el promedio . */
package clase4.ejer.extras.pkg1;

import java.util.Arrays;

public class Clase4EjerExtras1 {

    public static void main(String[] args) {
        //definimos e inicialimos un vector 
        int[] miVector = new int[10];
        //definimos un vector 
        int[] listaMayoresAlPromedio;
        //definimos el rango de los numeros aleatorios 
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int acumulador = 0, contadorMayoresAlPromedio = 0;

        float promedio = 0; //variable donde alojaremos el promedio de los valores del array 
        //cargamos el vector con numeros aleatorios generados por Math.Random
        for (int indice = 0; indice < miVector.length; indice++) {
            //casteamos el double que nos retorna Math.random
            miVector[indice] = (int) (Math.random() * range) + min;
            acumulador += miVector[indice];
        }
        promedio = acumulador / miVector.length;
        //mostramos el vector cargado 
        for (int indice = 0; indice < miVector.length; indice++) {
            //contamos cuantos valores son mayores al promedio 
            if (miVector[indice] > promedio) {
                contadorMayoresAlPromedio++;
            }
            System.out.println("miVector [" + indice + "] = " + miVector[indice]);
        }
        listaMayoresAlPromedio = new int[contadorMayoresAlPromedio];
        int j = 0;
        for (int i = 0; i < miVector.length; i++) {
            if (miVector[i] > promedio) {
                listaMayoresAlPromedio[j] = miVector[i];
                j++;
            }
        }   
        
        System.out.println("acumulador = " + acumulador);
        System.out.println("promedio :" + promedio);
        System.out.println("en el Array tenemos " + contadorMayoresAlPromedio + " Valores mayores al " + promedio);
        System.out.println(" lista de mayores al promedio " + Arrays.toString(listaMayoresAlPromedio));;
    }

}
