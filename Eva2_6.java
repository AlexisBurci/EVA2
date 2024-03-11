/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_6 {
    private static int num1;
    private static int num2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cual es el mayor entre 2 numeros
        //pidan al usuario 2 enteros
        System.out.println("¡Cual de los 2 valores es mayor?");
       Scanner captu;
        captu = new Scanner(System.in);
        System.out.println("Valor 1:");
        num1 = captu.nextInt();
        System.out.println("Valor 2:");
        num2 = captu.nextInt();
        if (num1 > num2)
        System.out.println(num1 + " es mayor");
        else{
            if(num1 == num2) //num 1 es igual a num 2
                System.out.println("El numero es igual");
            else
                
           System.out.println(num2 + " ES MAYOR");
            
        }
        
       
        
        
    }
    
}
