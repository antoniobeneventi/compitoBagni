/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;



public class BagnoDonna extends Thread{
     synchronized void BagnoDonna(){
  
         System.out.println("la donna è entrata nel bagno");
        try {
            Thread.sleep(5000);
            
        } catch (InterruptedException ex) {
            
            Logger.getLogger(BagnoDonna.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("la donna è uscita dal bagno");
    }
   
}