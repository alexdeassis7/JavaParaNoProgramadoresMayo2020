//1)Suponga que un individuo desea invertir su capital en un banco y desea
//saber cuanto dinero ganara despues de un mes si el banco paga a razon de 2% mensual
package clasedosproblemassecuenciales;

import java.util.Scanner;

public class ClaseDosProblemasSecuenciales {

    public static void main(String[] args) {
        //definimos las variables de trabajo
        float capital = 0, interes = 0.02f, ganacia = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos los datos al usuario 
        System.out.println("ingres el capital que desea invertir ");
        capital = teclado.nextFloat();
        //procesamos la informacion 
        ganacia = capital * interes;
        //mostramos los resultados
        System.out.println("usted obtendra una ganancia de $" + ganacia + " por su capital invertido de " + capital);
        System.out.println("el total de dinero que tendra en su cuenta es de " + (capital + ganacia));

        //identacion = alt +shift + f
    }

}
