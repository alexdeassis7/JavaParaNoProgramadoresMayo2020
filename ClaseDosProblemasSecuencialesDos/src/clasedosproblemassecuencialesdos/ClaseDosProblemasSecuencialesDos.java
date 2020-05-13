/*2)Una tienda ofrece un descuento del 15% sobre el total de la compra
y un cliente desea saber cuando debera pagar finalmente por su compra */
package clasedosproblemassecuencialesdos;

import java.util.Scanner;
public class ClaseDosProblemasSecuencialesDos {
    public static void main(String[] args) {
        
        //defino variables de trabajo
        float total_Compra = 0 , total_a_pagar = 0 ,descuento = 0;
        Scanner teclado = new Scanner(System.in);
        
        //solicitamos datos al user
        System.out.println("ingrese el total de la compra");
        total_Compra = teclado.nextFloat();
        //procesamos la informacion 
        descuento= total_Compra * 0.15f; 
        total_a_pagar = total_Compra - descuento ;
        //mostramos los resultados
        System.out.println(" el total a pagar por su compra con el 15% de descuento es de " + total_a_pagar);
        System.out.println("usted obtuvo un descuento de $ " + descuento );
       
       
    }
    
}
