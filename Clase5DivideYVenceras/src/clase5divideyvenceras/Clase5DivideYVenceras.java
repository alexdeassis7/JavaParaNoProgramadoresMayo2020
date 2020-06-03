/*          Problema planteado :
Mediante metodos calcular el promedio de 3 notas de un alumno y la 
definicion  de la condicion final de acuerdo al promedio  */
package clase5divideyvenceras;
import java.util.Scanner;

public class Clase5DivideYVenceras {
    //Atributos de la Clase (Variable Global)
    static float nota1 = 0 , nota2 =0 , nota3 = 0, promedio = 0 ; 
    static String condicionAlumno = "";
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        solicitarNotas();
        calcularPromedio();
        validarCondicion();
        mostrarResultados();
        
    }
   
    //METODO1 : solicita los datos al usuario 
    public static void solicitarNotas(){
        System.out.println("Ingrese la nota 1");
        nota1 = teclado.nextFloat();
        System.out.println("Ingrese la nota 2");
        nota2 = teclado.nextFloat();
        System.out.println("Ingrese la nota 3");
        nota3 = teclado.nextFloat();    
    }    
    //METODO 2 :Calcula el promedio
    public static void calcularPromedio(){
       promedio = ( nota1 + nota2 + nota3 ) / 3 ; 
    }
    //METODO 3 :validamos la condicion del alumno
    //Aprobado o desaprobado 
    public static void validarCondicion(){
       if( promedio >= 7 ){
            condicionAlumno = "Aprobado";
        }else{
            condicionAlumno = "desaprobado";
        }  
    }
    //METODO 4 :mostramos los resultados obtenidos 
    public static void mostrarResultados(){
        System.out.println("Las notas del Alumno son : " + nota1 + " - " + nota2 + " - " + nota3 );
        System.out.println("El promedio del alumno es :" + promedio );
        System.out.println("La condicion del Alumno es :" + condicionAlumno);
         
    }
    
}
