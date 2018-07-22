package Back;

import static Back.gameMaker.Player;
import java.util.ArrayList;
import Front.*;
import java.awt.Color;
import java.io.File;
import java.util.Scanner; 
import main.Main;

public class startTime {
    Scanner input;
    Scanner input1;
  public void sudenlyLoad(ArrayList<vehicles> Vehicles,players[] Players)
    {
        try{
            input=new Scanner(new File("src\\file\\car.txt"));
            input1=new Scanner(new File("src\\file\\player.txt"));
            String temp="";
            while(input.hasNext())
            {
                temp=input.next();
                char[] a=temp.toCharArray();
                if(a[a.length-1]=='1'){
                    Vehicles.add(new bus(temp));
                }
                else if(a[a.length-1]=='2')
                {
                    Vehicles.add(new car(temp));
                }
                else if(a[a.length-1]=='3')
                {
                    Vehicles.add(new minibus(temp));
                }
                else if(a[a.length-1]=='4')
                {
                    Vehicles.add(new minicar(temp));
                }
                temp="";
            }
            while(input1.hasNext())
            {
                temp=input1.next();
                char[] Temp=temp.toCharArray();
                String a="";
                int x = 0,y = 0,flag=0;
                for (int i = 0; i < Temp.length; i++) {
                    if(flag==0)
                    {
                        if(Temp[i]!=',')
                        {
                            a+=Temp[i];
                        }
                        else
                        {
                            x=(int )Double.parseDouble(a);
                            a="";
                            i++;
                            flag++;
                        }
                    }
                    if(flag==1)
                    {
                        if(Temp[i]!=',')
                        {
                            a+=Temp[i];
                        }
                        else
                        {
                            y=(int )Double.parseDouble(a);
                            a="";
                            i++;
                            flag++;
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    if(setingPlus.getPlacePlayer()[i]==-1){
                       setingPlus.getPlaceYPlayer()[i]=y;
                       setingPlus.getPlacePlayer()[i]=x;
                       break;
                    }
                }
                temp="";
            }
        }
        catch(Exception e){
            System.out.println(e);}
    }
    Scanner inputTime;
    public int normalloadV(int time,int i,ArrayList<vehicles> Vehicles )
    {
        int timeV=0;
        try{
            inputTime=new Scanner(new File("src\\file\\timeV.txt"));
            input=new Scanner(new File("src\\file\\vehicles.txt"));
            for (int j = 0; j <= i; j++) {
                timeV=inputTime.nextInt();
            }
            if(Math.abs(timeV-time)<=19)
            {
                String temp = null;
                for (int j = 0; j <= i; j++) {
                    temp=input.next();
                }
                char[] a=temp.toCharArray();
                if(a[a.length-1]=='1'){
                    Vehicles.add(new bus(temp));
                }
                else if(a[a.length-1]=='2')
                {
                    Vehicles.add(new car(temp));
                }
                else if(a[a.length-1]=='3')
                {
                    Vehicles.add(new minibus(temp));
                }
                else if(a[a.length-1]=='4')
                {
                    Vehicles.add(new minicar(temp));
                }
                i++;
                return i;
            }
            else
            {
            }
            return i;
        }
        catch(Exception e){
            System.out.println(e);
            return i;
        }
    }
    public int normalLoadP(int time,int i,players[] Players ){
        int timeP=0;
        try{
            inputTime=new Scanner(new File("src\\file\\timeP.txt"));
            input=new Scanner(new File("src\\file\\players.txt"));
            for (int j = 0; j <= i; j++) {
                timeP=inputTime.nextInt();
            }
            if(Math.abs(timeP-time)<=15)
            {
                String temp=null;
                
                for (int j = 0; j <= i; j++) {
                    temp=input.next();
                }
                
                char[] a=temp.toCharArray();
                int n=Integer.parseInt(a[0]+"");
                switch(a[1])
                {
                    case 'w':
                        move.moveup(Players[n]);
                        break;
                    case 's':
                        move.movedown(Players[n]);
                        break;
                    case 'a':
                        move.moveright(Players[n]);
                        break;
                    case 'd':
                        move.moveleft(Players[n]);
                        break;
                }
                i++;
                return i;
            }
            return i;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return i;
        }
    }
}