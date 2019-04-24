/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.*;
/**
 *
 * @author lenovo
 */
public abstract class Screen implements ControllerImpl{
    @Override
    public void displayAmount(String currency,double amount){
       System.out.printf(currency+"%,.2f", amount);
   }
   
   @Override
   public void displayMenu(){
        displayMessageLine("\nMain menu:");
        displayMessageLine("1 - Info Saldo");
        displayMessageLine("2 - Tarik Tunai");
        displayMessageLine("3 - Setor Tunai");
        displayMessageLine("4 - Transfer");
        displayMessageLine("5 - Pembayaran");
        displayMessageLine("0 - Keluar\n");
        displayMessage("Pilihan : ");
   }
   
   // display a message without a carriage return
   public void displayMessage(String message) {
      System.out.print(message); 
   } 
   
   // display a message with a carriage return
   public void displayMessageLine(String message) {
      System.out.println(message);   
   }
}
