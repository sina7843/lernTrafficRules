package main;

import Back.aI;
import Back.gameMaker;
import Back.setingPlus;

public class Thread8 extends Thread{
    public void run()
    {
        while(Main.y)
        {
            try{
                if(setingPlus.PlayerAI[0]){
                aI AI=new aI(gameMaker.Player[0]);
                }
                if(setingPlus.PlayerAI[1]){
                    aI AI=new aI(gameMaker.Player[1]);
                }
                if(setingPlus.PlayerAI[2]){
                    aI AI=new aI(gameMaker.Player[2]);
                }
                    Thread8.sleep(75);
                }
                catch(Exception e)
                {
                
                }
            
        }
    }
    
}
