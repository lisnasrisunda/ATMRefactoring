/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;
import controller.ControllerImpl;
import controller.Screen;
import controller.Keypad;
/**
 *
 * @author lenovo
 */
public class ATMProcessingFacade {
    Keypad keypad = new Keypad();
    private ControllerImpl screen;
   // private ControllerImpl keypad;
    
    public ATMProcessingFacade(){
       screen = new Screen() {};
       keypad = new Keypad() {};
    }
    
    public void menu(){
        screen.displayMenu();
    }
}