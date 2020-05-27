package clase6arrays;

import java.util.Scanner;

/*calcular la temperatura media del mes de Agosto y la suma de todas las temperaturas del mes 
(la temperatura de cada dia debera ser ingresada por el usuario)*/
public class Clase6Arrays {

    public static void main(String[] args) {
        int diasAgosto = 31;
        //DEFINIMOS e INICIALIZAMOS UN ARRAY DE DATOS FLOAT
        float[] temperaturasAgosto = new float[diasAgosto];
        float sumaDeTemperaturas = 0; //variable de tipo acumulador 
        Scanner teclado = new Scanner(System.in);

        //System.out.println("temperaturasAgosto.length =" + temperaturasAgosto.length);
        //Recorremos el array con un for para setearle datos (temperaturas)
        for (int subIndice = 0; subIndice < temperaturasAgosto.length; subIndice++) {
            System.out.println("Por favor ingrese la temperatura del dia " + (subIndice + 1));
            temperaturasAgosto[subIndice] = teclado.nextFloat();
            sumaDeTemperaturas += temperaturasAgosto[subIndice];//acumulamos todas las temperaturas en una variable 
        }
        System.out.println("Suma de temperaturas de agosto es igual a :" + sumaDeTemperaturas);
        //calculamos el promedio de las temperaturas
        float promedioTemperaturas = sumaDeTemperaturas / temperaturasAgosto.length;

        System.out.println("La temperatura promedio de agosto fue de : " + promedioTemperaturas);

        System.out.println("***************** MOSTRAMOS EL ARRAY *******************");
        for (int i = 0; i < temperaturasAgosto.length; i++) {
            System.out.print(temperaturasAgosto[i] + " - ");
        }
    }
}
