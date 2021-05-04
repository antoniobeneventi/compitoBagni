/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
class GestioneSemaforo extends Thread {
     Semaforo Pieno;
     Semaforo Vuoto;
     int dato;
     int tanti=5;
     public GestioneSemaforo(Semaforo s1,Semaforo s2){
         Pieno=s1;
         Vuoto=s2;
     }
     public void run(){
         for(int k=0; k<tanti;k++){
             Pieno.P();
          
             System.out.println("Lettore:dato letto"+dato);
             Vuoto.V();
         }
     }
    
}
