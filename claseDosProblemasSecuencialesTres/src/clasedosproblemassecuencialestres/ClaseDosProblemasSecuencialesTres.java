//3) Un maestro desea saber que porcentaje de hombres y que porcentaje de 
//mujeres hay en un grupo de estudiantes 
package clasedosproblemassecuencialestres;
import java.util.Scanner;
public class ClaseDosProblemasSecuencialesTres {

    public static void main(String[] args) {
        //definimos variables de trabajo
        int numHombres = 0, numMujeres = 0, totalAlumnos = 0;
        float porcentajeHombres = 0, porcentajeMujeres = 0;
        Scanner teclado = new Scanner(System.in);        
        //solicitamos los datos al usuario
        System.out.println("Ingrese el numero de mujeres");
        numMujeres = teclado.nextInt();
        System.out.println("Ingrese el numero de hombres");
        numHombres = teclado.nextInt();
        //procesamos la informacion 
        totalAlumnos = numHombres + numMujeres ;
        porcentajeHombres = numHombres *100 / totalAlumnos ;
        porcentajeMujeres = numMujeres *100 / totalAlumnos ;          
        //mostramosm los resultados
        System.out.println("el porcentaje de hombres es %" + porcentajeHombres);
        System.out.println("el porcentaje de Mujeres es %" + porcentajeMujeres);
        System.out.println("el total de alumnos es " + totalAlumnos);
                
    }

}
