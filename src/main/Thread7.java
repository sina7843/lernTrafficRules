/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Back.gameMaker;
import Back.startTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Thread7 extends Thread{
    
    int time,i1=0,i2=0;
    @Override
    public void run()
    {
        while(Main.y)
        {
        try {
        startTime s=new startTime();
        i1=s.normalLoadP(time, i1, gameMaker.Player);
        i2=s.normalloadV(time, i2, Main.Vehicles);
        Thread7.sleep(10);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        finally{
            time+=10;
        }
        }
    }
    
}
