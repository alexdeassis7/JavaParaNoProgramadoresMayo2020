/*

 */
package clase2estrcuturascondicionales;

import java.util.Scanner;

public class Clase2EstrcuturasCondicionales {
    public static void main(String[] args) {
        //realizar un programa que determine si una persona es mayor o menor de edad
        int edad = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese su edad");
        edad = teclado.nextInt();

        if ( edad >= 18 ) {
            //cuerpo del if : acciones a ejecutar si la condicion se cumple (true)
            System.out.println("usted es mayor de edad");
        } else {
            //cuerpo de else : acciones a ejecutar si la condicion NO se cumple (False)
            System.out.println("Usted no es mayor de edad");
        }

    }

}
