/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;
import controller.ControllerImpl;
import controller.Screen;
/**
 *
 * @author lenovo
 */
public class ATMProcessingFacade {
    //Keypad keypad = new Keypad();
    private ControllerImpl screen;
    
    public ATMProcessingFacade(){
        screen = new Screen();
    }
    
    public void menu(){
        screen.displayMenu();
    }
}