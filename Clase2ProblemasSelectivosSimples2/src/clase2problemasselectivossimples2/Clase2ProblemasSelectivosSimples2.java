/*2) En un almacén se hace un 20% de descuento a los clientes cuya compra supere los $1000 
Cuál será la cantidad que pagara una persona por su compra?, mostrar por pantalla el 
total que pagara por la compra
 */
package clase2problemasselectivossimples2;

import java.util.Scanner;

public class Clase2ProblemasSelectivosSimples2 {

    public static void main(String[] args) {
        //definimos las variables de trabajo
        float compra = 0, descuento = 0, totalApagar = 0;
        Scanner teclado = new Scanner(System.in);
        //locicitamos datos al usuario
        System.out.println("ingrese el valor de su compra");
        compra = teclado.nextFloat();
        //procesamos la informacion
        if (compra > 1000) {
            descuento = compra * 0.20f;
            System.out.println("Obtubo un descuento de " + descuento);
        } else {
            System.out.println("no tiene descuento ");
        }
        totalApagar = compra - descuento;
        //mostramos los resultados
        System.out.println("el total a pagar por su compra es de " + totalApagar);

    }

}
