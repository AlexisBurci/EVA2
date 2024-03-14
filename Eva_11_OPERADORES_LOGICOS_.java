/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_11_operadores_logicos_;

/**
 *
 * @author invitado
 */
public class Eva_11_OPERADORES_LOGICOS_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean Dinero, clima;
        Dinero = false;
        clima = false;
        System.out.println("1. NO HAY DINERO NI BUEN CLIMA");
        if ((Dinero == false) && (clima == false))
        System.out.println("NO SE ARMA COMPA");
       else
                System.out.println("Valiendo barriga");
        System.out.println("2.  HAY DINERO No BUEN CLIMA");
        if ((Dinero == true) && (clima == false))
        System.out.println("NO SE ARMA COMPA");
       else
                System.out.println("Valiendo barriga");
        
        System.out.println("3. NO HAY DINERO pero BUEN CLIMA");
        if ((Dinero == false) && (clima == true))
        System.out.println("NO SE ARMA COMPA");
       else
                System.out.println("Valiendo barriga");
        System.out.println("4.  HAY DINERO Y BUEN CLIMA");
        if ((Dinero == true) && (clima == true))
        System.out.println("NO SE ARMA COMPA");
       else
                System.out.println("Vamonos compa!!!!");
                
    }
    
}
