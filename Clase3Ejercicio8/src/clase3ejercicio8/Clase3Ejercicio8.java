/* 8)	Simular el comportamiento de un reloj digital, 
imprimiendo la hora, minutos y segundos de un día desde 
las 0:00:00 hasta las 23:59:59
 */
package clase3ejercicio8;
public class Clase3Ejercicio8 {
    //Ejemplo de for anidados 
    public static void main(String[] args) {
        for (int hs = 0; hs < 24; hs++) {//for que controla las horas
            for (int min = 0; min < 60; min++) {//for que controla los minutos                
                for (int seg = 0; seg < 60; seg++) {//for que controla los Segundos                     
                    System.out.println(hs + " : " + min + " : " + seg);
                    
                }
            }

        }

    }

}
