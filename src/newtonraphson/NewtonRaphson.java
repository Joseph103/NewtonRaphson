/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonraphson;

import Interface.Interface;

/**
 *
 * @author Core i5
 */
public class NewtonRaphson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewtonRaphsonFormula nfr= new NewtonRaphsonFormula();
        Interface ventana = new Interface(nfr);
        ventana.setVisible(true);
    }
    
}
