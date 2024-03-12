/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8;

/**
 *
 * @author invitado
 */
public class Eva2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda;
        moneda = Math.random();
        System.out.println("El valor de la moneda =" + moneda);
        if(moneda > 0.5)
            System.out.println("CARA");
        else 
            System.out.println("CRUZ");
    }
    
}
