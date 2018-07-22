package main;
import Back.move;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Thread1 extends Thread{
    @Override
    public void run(){
    while(Main.y)
    {
        move.move();
        try {
            Thread1.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    }
   }
