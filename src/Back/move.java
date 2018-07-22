/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Front.players;
import main.Main;

/**
 *
 * @author ACER
 */
public class move {
    public static void move()
    {
       for (int i = 0; i < Main.Vehicles.size(); i++) {
       Main.Vehicles.get(i).setPoints((int) (Main.Vehicles.get(i).getXPoints()+Main.Vehicles.get(i).getSpeedx()),
                                      (int) (Main.Vehicles.get(i).getYPoints()+Main.Vehicles.get(i).getSpeedy()));
       if(Main.Vehicles.get(i).getXPoints()>Main.WidthFrame||Main.Vehicles.get(i).getXPoints()<-200)
       {
           Main.Vehicles.remove(i);
       }
       }
    }
    public static void moveup(players Player)
    {
        Player.setPoints(Player.getXPoints(), (int) (Player.getYPoints()+Player.getSpeedy()));
        if(Player.getYPoints()<20)
        {
            Main.win=true;
        }
    }
    public static void movedown(players Player)
    {        Player.setPoints(Player.getXPoints(), (int) (Player.getYPoints()-Player.getSpeedy()));
        
    }
    public static void moveright(players Player)
    {        
        Player.setPoints((int) (Player.getXPoints()+Player.getSpeedx()), Player.getYPoints());
        
    }
    public static void moveleft(players Player)
    {        Player.setPoints((int) (Player.getXPoints()-Player.getSpeedx()), Player.getYPoints());
        
    }    
}