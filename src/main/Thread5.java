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
import javazoom.jl.player.*;

/**
 *
 * @author ACER
 */
public class Thread5 extends Thread{
    @Override
    public void run()
    {
        Player player=null;
             try {
            File file=new File("src\\music\\JanHammerCrockettesTheme");
            FileInputStream fis=new FileInputStream(file); 
            BufferedInputStream bis=new BufferedInputStream(fis);
            try{
            player=new Player(bis);
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
