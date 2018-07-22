package main;

import Back.aI;
import Back.gameMaker;
import Back.saveGame;
import Back.seting;
import Back.setingPlus;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread3 extends Thread{
    int Time=0;
    gameMaker GameMaker=new gameMaker();
    saveGame s=new saveGame();
    @Override
    public void run()
    {
        while(Main.y)
        {
            try {
            GameMaker.carMaker();
            s.normalSaveV(Time,Main.Vehicles.get(Main.Vehicles.size()-1));
                Thread3.sleep(7500/(2*seting.getLinenumber()));
            } catch (Exception ex) {
            }
            finally{
                Time+=7500/(2*seting.getLinenumber());
            }
        }
    }
}
