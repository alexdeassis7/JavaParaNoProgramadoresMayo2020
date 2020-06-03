/*          Problema planteado :
calcular el promedio de 3 notas de un alumno y la 
definicion  de la condicion final de acuerdo al promedio  */
package clase5;
import java.util.Scanner;
public class Clase5 {
    public static void main(String[] args) {
        
        float nota1 = 0 , nota2 = 0 , nota3 = 0 , promedio = 0 ;
        String condicionAlumno = "";
        Scanner teclado = new Scanner(System.in);
        //solicitamos los datos al usuario 
        System.out.println("Ingrese la nota 1");
        nota1 = teclado.nextFloat();
        System.out.println("Ingrese la nota 2");
        nota2 = teclado.nextFloat();
        System.out.println("Ingrese la nota 3");
        nota3 = teclado.nextFloat();   
        //Calculamos el promedio 
        promedio = ( nota1 + nota2 + nota3 ) / 3 ;
        //vemos la condicion del alumno
        if( promedio >= 7 ){
            condicionAlumno = "Aprobado";
        }else{
            condicionAlumno = "desaprobado";
        }
        //mostramos los resultados obtenidos 
        System.out.println("Las notas del Alumno son : " + nota1+" - " + nota2 + " - " + nota3 );
        System.out.println("El promedio del alumno es :" + promedio );
        System.out.println("La condicion del Alumno es :" + condicionAlumno);
            
        
       
    }    
}
