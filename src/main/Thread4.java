/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import Back.accident;
import java.awt.Color;
import java.awt.Menu;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ACER
 */
public class Thread4 extends Thread{
    @Override
    public void run()
    {
        while(true)
        {
        try{    
            if((accident.accident()||Main.win))
            {
                break;
            }
            accident.antiAccident();
            try {
            Thread4.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        }
        if(Main.win)
        {
            Main.pannel.jLabel1.setForeground(Color.green);
            Main.pannel.jLabel1.setText("      YOU Win");
            Main.pannel.jLabel2.setForeground(Color.green);
            Main.pannel.jLabel2.setText("Game  Over");
        }
        else{
            Main.pannel.jLabel1.setText("YOU LOOOSE");
            Main.pannel.jLabel2.setForeground(Color.red);
            Main.pannel.jLabel2.setText("Game  Over");
        }
        Main.y=false;
        }
    }
