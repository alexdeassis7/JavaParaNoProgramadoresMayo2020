/*Uso de estrucutras Repetitivas  */
package clase3miercoles;
//crear un algoritmo que permita realizar 3 veces lo siguiente :
//ingresar dos numeros calcular la suma e informar el resultado

import java.util.Scanner;

public class Clase3miercoles {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float numero1 = 0, numero2 = 0;
        int contador = 0;

        while (contador < 3) {
            //cuerpo del bucle while 
            System.out.println("ingrese el numero 1");
            numero1 = teclado.nextFloat();
            System.out.println("ingrese el numero 2");
            numero2 = teclado.nextFloat();
            System.out.println("Resultado es : " + (numero1 + numero2));
            contador++;
        }
    }

}

/**
 * System.out.println("ingrese el numero 1"); numero1 = teclado.nextFloat();
 *
 * System.out.println("ingrese el numero 2"); numero2 = teclado.nextFloat();
 *
 * System.out.println("Resultado es : " + (numero1 + numero2));
 *
 * System.out.println("ingrese el numero 1"); numero1 = teclado.nextFloat();
 *
 * System.out.println("ingrese el numero 2"); numero2 = teclado.nextFloat();
 *
 * System.out.println("Resultado es : " + (numero1 + numero2));
 */
