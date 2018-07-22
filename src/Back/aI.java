package Back;

import Front.players;
import java.util.Random;

public class aI {
    public static final Random random =new Random(); 
    public aI(players U){
        int n=random.nextInt(101);
        if(n<=80)
        {
            move.moveup(U);
            U.up();
        }
        else if(n<=82)
        {
            move.movedown(U);
            U.up();
        }
        else if(n<=98)
        {
            move.moveleft(U);
            U.up();
        }
        else if(n<=100)
        {
            move.moveright(U);
            U.up();
        }
        
    }
}
