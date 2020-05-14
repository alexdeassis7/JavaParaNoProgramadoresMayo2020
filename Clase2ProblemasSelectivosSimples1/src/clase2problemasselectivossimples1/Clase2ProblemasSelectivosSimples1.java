/** 1) Determinar si un alumno aprueba un curso de programación,
 * sabiendo que aprobara si su promedio de tres calificaciones
 * es mayor o igual a 7; reprueba en caso contrario. */
package clase2problemasselectivossimples1;

import java.util.Scanner;

public class Clase2ProblemasSelectivosSimples1 {
   
    public static void main(String[] args) {
        //DEFINO MIS VARIABLES DE TRABAJO
        float nota1 = 0, nota2 = 0, nota3 = 0 , promedio = 0;
        Scanner teclado = new Scanner(System.in);        
        //solicicitamos datos al usuario 
        System.out.println("ingrese la nota 1");
        nota1= teclado.nextFloat();
        System.out.println("ingrese la nota 2");
        nota2= teclado.nextFloat();
        System.out.println("ingrese la nota 3");
        nota3= teclado.nextFloat();
        //procesamos la informacion 
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("su promedio fue de : " + promedio);
        if(promedio >= 7){
            System.out.println("Alumno Aprobado!!!!");
        }else{
            System.out.println("Alumno REEEEEEEEEEEEEEEEEeprobado!!!!");
        }        
        System.out.println("fin del programa");      
       
        
    }

}
