/*4)	Leer 20 números e imprimir cuantos son positivos ,
cuantos negativos y cuantos neutros */
package clase3ejercicio4;

import java.util.Scanner;

public class Clase3Ejercicio4 {

    public static void main(String[] args) {
        //defino mis variables de trabajo
        int contadorNegativos = 0, contadorNeutros = 0, contadorPositivos = 0, numeroIngresado = 0;
        Scanner teclado = new Scanner(System.in);

        for (int x = 0; x < 20; x++) {
            System.out.println("ingrese el numero " + (x + 1));
            numeroIngresado = teclado.nextInt();
            //validamos si el numero es positivo , negativo o cero
            if (numeroIngresado > 0) {
                contadorPositivos++;
            } else if (numeroIngresado < 0) {
                contadorNegativos++;
            } else {
                contadorNeutros++;
            }
        }
        System.out.println("positivos :" + contadorPositivos);
        System.out.println("negativos :" + contadorNegativos);
        System.out.println("Neutros :" + contadorNeutros);
    }

}
