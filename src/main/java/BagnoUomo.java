/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;


public class BagnoUomo extends Thread{
    
  
    
    synchronized void BagnoUomo(){
        System.out.println("l'uomo è entrato nel bagno");
        try {
            Thread.sleep(5000);
            
        } catch (InterruptedException ex) {
            
            Logger.getLogger(BagnoUomo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("l'uomo è uscito dal bagno");
    }
   
    
    
}

