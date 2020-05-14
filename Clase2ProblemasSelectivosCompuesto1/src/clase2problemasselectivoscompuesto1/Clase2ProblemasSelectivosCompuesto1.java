/*1)	Leer dos números: si son iguales que los multiplique, si el primero es 
mayor que el segundo que los reste y si no que los sume.
 */
package clase2problemasselectivoscompuesto1;

import java.util.Scanner;

public class Clase2ProblemasSelectivosCompuesto1 {

    public static void main(String[] args) {
        float num1 = 0, num2 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el num 1 ");
        num1 = teclado.nextFloat();

        System.out.println("ingrese el num 2 ");
        num2 = teclado.nextFloat();

        if (num1 == num2) {
            System.out.println("Resultado " + (num1 * num2));
        } else if (num1 > num2) {
            System.out.println("Resultado " + (num1 - num2));
        } else {
            System.out.println("Resultado " + (num1 + num2));
        }

    }

}
