/*4) Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si 
este se le asigna como un porcentaje de su salario mensual que depende de su antigüedad 
en la empresa de acuerdo con la siguiente tabla

Tiempo	Utilidad
Menos de 1 año                          5% del salario
1 año o más y menos de 2 años   	7% del salario
2 años o más y menos de 5 años          10% del salario
5 años o más y menos de 10 años         15% del salario
10 años o mas                           20% del salario
 */
package clase2problemasselectivocompuesto4;
import java.util.Scanner;
public class Clase2ProblemasSelectivoCompuesto4 {
    public static void main(String[] args) {
        int antiguedad = 0;
        float salarioMensual = 0, utilidad = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese por favor su salario mensual");
        salarioMensual = teclado.nextFloat();
        System.out.println("ingrese por favor su antiguedad");
        antiguedad = teclado.nextInt();
        if (antiguedad < 1) {
            utilidad = salarioMensual * 0.05f;
        } else if (antiguedad >= 1 && antiguedad < 2) {
            utilidad = salarioMensual * 0.07f;
        } else if (antiguedad >= 2 && antiguedad < 5) {
            utilidad = salarioMensual * 0.10f;
        } else if (antiguedad >= 5 && antiguedad < 10) {
            utilidad = salarioMensual * 0.15f;
        } else {
            utilidad = salarioMensual * 0.20f;
        }
        System.out.println("Su bono anual sera de " + utilidad);
    }

}
