/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Semaforo {
    int valore;

    public Semaforo(int v) {
       valore = v;
    }
    synchronized public void P(){
        while(valore==0){
            try { wait(); }
            catch(InterruptedException o){}
            
        }
        valore--;
        
    }
        synchronized public void V(){
            valore++;
            notify();
        }
