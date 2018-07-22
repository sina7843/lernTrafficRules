package Back;
 

import Front.*;
import java.awt.Color;
import java.util.Random;
import main.Main;
import static main.Main.HeightFrame;

public class gameMaker {
    int time=0;
     private final Random random=new Random();
     public void carMaker(){
         if(random.nextInt(10)<=seting.getTraffic()){
            int n=seting.getLinenumber();
            int y=random.nextInt(2*n);
            int v=random.nextInt(seting.getGamespeed()/12);
             for (int i = 0; i < n; i++) {
                 if(y==i||y==(2*n)-i-1)
                 {
                     v+=i+2;
                 }
             }
            
            int rand=random.nextInt(10);
             if(y<seting.getLinenumber())
            {
                v*=-1;
                y*=Main.HeightFrame/(2*(seting.getLinenumber()+1));
                y+=Main.HeightFrame/(3*(seting.getLinenumber()+1));
            }
            else{
               y*=Main.HeightFrame/(2*(seting.getLinenumber()+1));
               y+=2*Main.HeightFrame/(3*(seting.getLinenumber()+1));
            }
            
            if(rand<4){
                    Main.Vehicles.add(new car(y,v,
                    new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)),
                    new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))));
            }
            else if(rand<6&&rand>=4)
            {
                Main.Vehicles.add(new minicar(y,v,
                    new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)),
                    new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))));
            }
            else if(rand<8&&rand>=6)
            {
                Main.Vehicles.add(new bus(y,v,
                    new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)),
                    new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))));
            }
            else if(rand<=10&&rand>=8)
            {
                Main.Vehicles.add(new minibus(y,v,
                    new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)),
                    new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255))));
            }
         }
         time+=10;
     }
     public static crossLine[] CrossLine=new crossLine[3];
     public static sideWalk SideWalk1;
     public static guardRail GaurdRail;
     public static sideWalk SideWalk2;
     public static bridge[] Bridge=new bridge[3];
     public static players[] Player=new players[3];
     public static void backgroundMaker()
     {
         
         //خیابون
        int n=seting.getLinenumber();
        for (int i = 0; i < seting.getLinenumber(); i++) {
            Main.HighWays.add(new highWay((i*HeightFrame/(2*(n+1)))+(HeightFrame/(3*(n+1))),HeightFrame/(2*(n+1))));
        }
        for (int i =seting.getLinenumber(); i < 2*seting.getLinenumber(); i++) {
            Main.HighWays.add(new highWay((i*HeightFrame/(2*(n+1)))+(2*HeightFrame/(3*(n+1))),HeightFrame/(2*(n+1))));
        }
        //گاردریل
        GaurdRail=new guardRail();
        GaurdRail.setPoints(0, ((3*seting.getLinenumber())+2)*Main.HeightFrame/(6*(seting.getLinenumber()+1)));
        GaurdRail.setLenghtY(Main.HeightFrame/(4*(seting.getLinenumber()+1)));
        //خط عابر پیاده
        CrossLine[0]=new crossLine(setingPlus.getPlaceLineCross()[0],0);
        CrossLine[1]=new crossLine(setingPlus.getPlaceLineCross()[1],0);
        CrossLine[2]=new crossLine(setingPlus.getPlaceLineCross()[2],0);
        //پیاده رو
        SideWalk1=new sideWalk();
        SideWalk1.setPoints(0, 0);
        SideWalk1.setLenghtY((Main.HeightFrame/(3*(seting.getLinenumber()+1))));
        
        SideWalk2=new sideWalk();
        SideWalk2.setPoints(0,((3*seting.getLinenumber())+2)*Main.HeightFrame/(3*(seting.getLinenumber()+1)));
        SideWalk2.setLenghtY(Main.HeightFrame/(3*(seting.getLinenumber()+1)));
        //پل
        Bridge[0]=new bridge(setingPlus.getPlaceBridge()[0]);
        Bridge[1]=new bridge(setingPlus.getPlaceBridge()[1]);
        Bridge[2]=new bridge(setingPlus.getPlaceBridge()[2]);
        //آدم
        Player[0]=new players(setingPlus.getPlacePlayer()[0],setingPlus.getPlaceYPlayer()[0],new Color(255,0, 0),new Color(0,0,255));
        Player[1]=new players(setingPlus.getPlacePlayer()[1],setingPlus.getPlaceYPlayer()[1],new Color(0,255,255),new Color(255,255,255));
        Player[2]=new players(setingPlus.getPlacePlayer()[2],setingPlus.getPlaceYPlayer()[2],new Color(255,0,255),new Color(255,255,0));
     }
}
