package clase5calculadoraconsubalgoritmos;

import java.util.Scanner;

public class Clase5CalculadoraConSubAlgoritmos {
    //Defino atributos (Variable Globales)
    static Scanner teclado = new Scanner(System.in);
    static int opcionIngresada = 0;
    static float numero1 = 0, numero2 = 0;

    public static void main(String[] args) {
        System.out.println("Inicio de la app");
        mostrarMenuDeopciones();
        
        switch (opcionIngresada) {
            case 1:
                System.out.println("usted ah seleccionado la opcion de sumar ");
                solicitarNumerosAlUsuario();
                break;
            case 2:
                System.out.println("usted ah seleccionado la opcion de restar");
                solicitarNumerosAlUsuario();
                break;
            case 3:
                System.out.println("usted ah seleccionado la opcion de Multiplicar");
                solicitarNumerosAlUsuario();
                break;
            case 4:
                System.out.println("usted ah seleccionado la opcion de Dividir");
                solicitarNumerosAlUsuario();
                break;
            default:
                System.out.println("La opcion " + opcionIngresada + " No es una opcion Valida!");
        }
        System.out.println("Fin de la app");

    }

    public static void mostrarMenuDeopciones() {
        System.out.println("Bienvenido a la Calculadora con Sub Algoritmos");
        System.out.println("Ingrese la opcion de la operacion a realizar");
        System.out.print(" 1. SUMAR \n 2. RESTAR \n 3. MULTIPLICAR \n 4. DIVIDIR");
        opcionIngresada = teclado.nextInt();
    }

    public static void solicitarNumerosAlUsuario() {
        System.out.println("ingrese el numero uno ");
        numero1 = teclado.nextFloat();
        System.out.println("ingrese el numero dos ");
        numero2 = teclado.nextFloat();
    }

}
