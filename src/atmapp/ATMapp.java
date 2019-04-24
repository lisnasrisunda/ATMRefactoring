/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;

/**
 *
 * @author lenovo
 */
public class ATMapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ATMProcessingFacade theATM = null;
        ATMProcessingFacade theATM = new ATMProcessingFacade();
        theATM.menu();
    }
}
