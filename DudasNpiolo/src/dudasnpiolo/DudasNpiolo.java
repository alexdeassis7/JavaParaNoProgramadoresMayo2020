package dudasnpiolo;

import java.util.Scanner;

public class DudasNpiolo {

    public static void main(String[] args) {
         //definimos e inicializamos     
        int num1 = 0, num2 = 0, resultado = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos datos al usuario
        System.out.println("Ingrese el numero 1");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el numero 2");
        num2 = teclado.nextInt();
        //procesamiento de la info 
         resultado = num1 + num2 ;
       //mostramos la info 
        System.out.println("El resultado de la suma es " + resultado);    
        
        
    }

}
