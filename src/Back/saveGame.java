package Back;

import Front.players;
import Front.vehicles;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class saveGame implements Serializable{
    Formatter out;
    Formatter out1;
    Scanner input;
    Scanner input1;
    public void normalSaveV(int time,vehicles Vehicles) 
    {
        try{
            FileWriter f = new FileWriter("src\\file\\vehicles.txt", true);
            FileWriter f1 = new FileWriter("src\\file\\timeV.txt", true);
            out=new Formatter(f);
            out1 =new Formatter(f1);
            out.format("%s",Vehicles);
            out1.format("%d ",time);
            out.close();
            out1.close();
        }
        catch(IOException e){
            System.out.println(e);}
    }
    public void normalSaveP(int time,int i,char aim){
        try{
            FileWriter f = new FileWriter("src\\file\\players.txt", true);
            FileWriter f1 = new FileWriter("src\\file\\timeP.txt", true);
            out=new Formatter(f);
            out1 =new Formatter(f1);
            out.format("%s",i+""+aim+"\n");
            out1.format("%d ",time);
            out.close();
            out1.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void suddenlySave(ArrayList<vehicles> Vehicles,players[] Players) {
        try{
            out=new Formatter("src\\file\\car.txt");
            out1 =new Formatter("src\\file\\player.txt");
            Vehicles.stream().forEach((Vehicle) -> {
                out.format("%s",Vehicle);
            });
            for (players Player : Players) {
                out1.format("%s", Player);
            }
            out.close();
            out1.close();
        }
        catch(IOException e){}
    }
}
