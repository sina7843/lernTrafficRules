/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author ACER
 */
public class Thread6 extends Thread{
    @Override
    public void run()
    {
        try {
            File file=new File("src\\music\\09 City Skyline_Radion");
            FileInputStream fis=new FileInputStream(file); 
            BufferedInputStream bis=new BufferedInputStream(fis);
            try{
            Player player=new Player(bis);
            player.play();
            }
            catch(JavaLayerException ex){
                System.out.println(ex);
            }
        }
            catch (IOException ex) {
            Logger.getLogger(Thread5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            }
    
    }
