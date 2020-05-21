
package clase3ejercicio5;

import java.util.Scanner;
/*
5)	Leer 15 números negativos y convertirlos a positivos e imprimir dichos números.*/

public class Clase3ejercicio5 {

    public static void main(String[] args) {
       int numero = 0;
         int convertido=0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.println("ingrese el numero " + (i + 1));
            numero = teclado.nextInt();
            convertido=numero*-1;
            System.out.println(convertido);
            
        }
    }
    
}
    