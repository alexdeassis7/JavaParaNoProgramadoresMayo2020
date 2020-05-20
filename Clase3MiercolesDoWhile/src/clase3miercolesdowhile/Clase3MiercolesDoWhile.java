package clase3miercolesdowhile;
//reaalilzar un  algoritmo que permita mostrar todos los numeros 
//pares del 0 al 100 

public class Clase3MiercolesDoWhile {

    public static void main(String[] args) {
        int contadorWhile = 0, contadorDoWhile = 0;
        System.out.println("Do While");
        do {
            //acciones a ejecutar dentro del cuerpo del Do-while 
            System.out.println(contadorDoWhile);
            contadorDoWhile += 2;
        } while (contadorDoWhile <= 100);

        System.out.println("While");
        while (contadorWhile <= 100) {
            System.out.println(contadorWhile);
            contadorWhile += 2;
        }

    }

}
