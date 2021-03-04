/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermultithread;

/**
 *
 * @author teruzzi.luca
 */
public class Somme implements Runnable{
    private int i;
     boolean b;
    public Somme(int i) {
        this.i=i;
         b=true;
    }

    @Override
    public void run() {
        while(b){
            ServerMultiThread.m=ServerMultiThread.m+i;
            b=false;
        }
        
    }
    
}
