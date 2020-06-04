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
                mostrarResultado(sumar(), "suma");
                break;
            case 2:
                System.out.println("usted ah seleccionado la opcion de restar");
                solicitarNumerosAlUsuario();
                mostrarResultado(restar(), "resta");
                break;
            case 3:
                System.out.println("usted ah seleccionado la opcion de Multiplicar");
                solicitarNumerosAlUsuario();
                mostrarResultado(multiplicar(), "multiplicacion");
                break;
            case 4:
                System.out.println("usted ah seleccionado la opcion de Dividir");
                solicitarNumerosAlUsuario();
                mostrarResultado(dividir(), "division");
                break;
            default:
                System.out.println("La opcion " + opcionIngresada + " No es una opcion Valida!");
        }
        System.out.println("Fin de la app");

    }

    //PROCEDIMIENTO 
    public static void mostrarMenuDeopciones() {
        System.out.println("Bienvenido a la Calculadora con Sub Algoritmos");
        System.out.println("Ingrese la opcion de la operacion a realizar");
        System.out.print(" 1. SUMAR \n 2. RESTAR \n 3. MULTIPLICAR \n 4. DIVIDIR \n");
        opcionIngresada = teclado.nextInt();
    }

    //PROCEDIMIENTO 
    public static void solicitarNumerosAlUsuario() {
        System.out.println("ingrese el numero uno ");
        numero1 = teclado.nextFloat();
        System.out.println("ingrese el numero dos ");
        numero2 = teclado.nextFloat();
    }

    //FUNCION 
    public static float sumar() {
        float resultado = 0;
        resultado = numero1 + numero2;
        return resultado;
    }
    //FUNCION 

    public static float restar() {
        float resultado = 0;
        resultado = numero1 - numero2;
        return resultado;
    }
    //FUNCION 

    public static float multiplicar() {
        float resultado = 0;
        resultado = numero1 * numero2;
        return resultado;
    }
    //FUNCION 

    public static float dividir() {
        float resultado = 0;
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            mostrarError("No se podes Dividir Por Cero En los numeros Reales ");
        }
        return resultado;

    }

    //PROCEDIMIENTO
    public static void mostrarError(String mensajeAmostrar) {
        System.out.println(mensajeAmostrar);
    }

    //PROCEDIMIENTO
    public static void mostrarResultado(float result, String operacionAritmetica) {
        System.out.println("el resultado de la " + operacionAritmetica + " es : " + result);
    }

}
