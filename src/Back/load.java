package Back;

import Front.players;
import Front.vehicles;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class load {
    ObjectInputStream out,out2;
    public void resumeGame(ArrayList<vehicles> Vehicles,ArrayList<players> Players)
    {
        try{
            out=new ObjectInputStream(new FileInputStream("src\\file\\car.txt"));
            while(true){
                Vehicles.add((vehicles)out.readObject());
            }
        }
        catch(IOException | ClassNotFoundException e){}
        try{
            out2=new ObjectInputStream(new FileInputStream("src\\file\\player.txt"));
            while(true){
                Players.add((players)out2.readObject());
            }
        }
        catch(IOException | ClassNotFoundException e){}
    }
}
