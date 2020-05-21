/*2)	Leer 10 números y obtener su cubo y su cuarta */
package clase3miercolesejerciciosextra2;

import java.util.Scanner;
public class Clase3MiercolesEjerciciosExtra2 {
    public static void main(String[] args) {
        //variables de trabajo 
        int numero = 0, cubo = 0, cuarta = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese el numero " + (i + 1));
            numero = teclado.nextInt();
            cubo = numero * numero * numero;
            cuarta = cubo * numero;
            System.out.println(numero + " al cubo es :" + cubo);
            System.out.println(numero + " a la cuarta es :" + cuarta);
        }

    }

}
