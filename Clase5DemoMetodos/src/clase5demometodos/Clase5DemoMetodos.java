package clase5demometodos;

import java.util.Scanner;

public class Clase5DemoMetodos {

    public static void main(String[] args) {
        System.out.println("Inicio del app");
        //invocamos al procedimiento ejecutar()
        //ejecutar();
        //invocamos al procedimiento ejecutarConUnParametro()
        //ejecutarConUnParametro(233);
          //invocamos al procedimiento ejecutarConDosParametro()
        //ejecutarConDosParametro(50,100);
        //Invocamos a la funcion CalcularIva()
        int precioProducto = 0 ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto al cual desea calcular el IVA");
        precioProducto = teclado.nextInt();
        
        double precioDelIva = calcularIva(precioProducto);
        System.out.println("el precio del IVA es de :" + precioDelIva);
        
        System.out.println("Fin del app");
    }        
    //definimos una funcion que recibe un parametro y nos permite calcular el iva de un producto 
    public static double calcularIva(int valor){        
        double  porcentaje =  0.21;
        double  resultado =  valor * porcentaje;        
        return resultado ;
    }
    
    
    
    
    
    
    
    
    //definimos un metodo de tipo Procedimiento sin parametros 
    public static void ejecutar() {
        for (int i = 1; i < 11; i++) {
            System.out.println("i = " + i);
        }
    }
    //definimos un metodo de tipo Procedimiento con un parametros 
    public static void ejecutarConUnParametro(int maximo ) {
        for (int i = 1; i <= maximo; i++) {
            System.out.println("i = " + i);
        }
    }
    //definimos un metodo de tipo Procedimiento con un parametros 
    public static void ejecutarConDosParametro(int minimo ,int maximo ) {
        for (int i = minimo; i <= maximo; i++) {
            System.out.println("i = " + i);
        }
    }
}
