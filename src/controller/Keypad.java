/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Keypad{
    private Scanner input; // reads data from the command line
                         
   public Keypad() {
      input = new Scanner(System.in);    
   } 

   public int getInput(){
       try {
           return input.nextInt();
       }
       catch (Exception e){
           System.out.println("Hanya Bisa Dimasukan Angka !!!");
           flush();
           return -100;
       }
        
   }
   
   public void flush(){
    input.nextLine();
   }
   
   public String getInputString() {
      return input.next(); // user enters an integer
   }
}
