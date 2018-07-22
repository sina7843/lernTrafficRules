package main;

import java.awt.Menu;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread2 extends Thread{
    @Override
    public void run()
    {
        while(Main.y){
        Main.pannel.repaint();
        try {
            Thread2.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
