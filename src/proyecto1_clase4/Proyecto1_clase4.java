
package proyecto1_clase4;

import java.util.Scanner;
public class Proyecto1_clase4 {

    public static void main(String[] args) {
        // Declarar variables
        int n1 ,n2 ,suma;
        Scanner lectura = new Scanner (System.in);
        // Entrada de Datos
        System.out.print ("Ingresar Numero 1:");
        n1=lectura.nextInt();
        System.out.print ("Ingresar Numero 2:");
        n2=lectura.nextInt();
        // proceso de datos
        suma = n1+n2;
        //Salida de datos
        System.out.println("La Suma de los datos es:" +suma);
        
        
    }
    
    
}
