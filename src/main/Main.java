package main;

import Back.*;
import java.util.*;
import Front.*;
import javax.swing.JFrame;

public class Main {
    public static ArrayList<vehicles> Vehicles=new ArrayList();
    public static ArrayList<highWay> HighWays=new ArrayList();
    public static boolean x=true;
    public static boolean y=true;
    public static boolean replay=false;
    public static boolean win=false;
    public static int WidthFrame;
    public static boolean z=true;
    public static boolean x2=true;
    public static int getWidthFrame() {
        return WidthFrame;
    }
    public static sumTotal pannel = new sumTotal();
    public static int getHeightFrame() {
        return HeightFrame;
    }
    public static int HeightFrame;
    public static void main(String args[]) throws InterruptedException{
        JFrame app=new JFrame();
        JFrame App=new JFrame();
        menu Menu=new menu();
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread4 t4=new Thread4();
        Thread5 t5=new Thread5();
        Thread6 t6=new Thread6();
        app.setSize(1980,1080);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setUndecorated(true);
        app.add(Menu);
        t5.start();
        app.setVisible(true);
        while(x2){
            app.setAlwaysOnTop(false);
        }
        App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App.setUndecorated(true);
        App.setResizable(false);
        App.add(pannel);
        gameMaker.backgroundMaker();
        if(seting.getGameSize()==2){
            App.setLocation(340, 12);
            App.setSize(1300, 1050);
        }
        else if(seting.getGameSize()==1)
        {
            App.setLocation(190, 8);
            App.setSize(1600, 1050);
        }
        else if(seting.getGameSize()==0)
        {
            App.setSize(1980, 1050);
            App.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        App.setVisible(true);
        
        t5.stop();
        t6.start();
        if(!replay)
        {
            Thread3 t3=new Thread3();
            t3.start();
            pannel.setFocusable(true);
        }
        else
        {
            Thread7 t7=new Thread7();
            t7.start();
        }
        if(setingPlus.PlayerAI[0]||setingPlus.PlayerAI[1]||setingPlus.PlayerAI[2])
        {
            Thread8 t8=new Thread8();
            t8.start();
        }
        t2.start();
        t1.start();
        t4.start();
        while(true)
        {
            if(!Main.y)
            {
                break;
            }
        }
    }
}

