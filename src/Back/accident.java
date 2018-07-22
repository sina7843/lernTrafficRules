package Back;

import main.Main;

public class accident { 
    public static void antiAccident()
    {
       //try{
        for (int i = 0; i < Main.Vehicles.size(); i++) {
            for (int j = 0; j < Main.Vehicles.size(); j++) {
                if(Main.Vehicles.get(i).getYPoints()==Main.Vehicles.get(j).getYPoints())
                {
                    if(18*Main.Vehicles.get(i).getSpeedx()+Main.Vehicles.get(i).getXPoints()<18*Main.Vehicles.get(j).getSpeedx()+Main.Vehicles.get(j).getXPoints())
                    {
                        if(18*Main.Vehicles.get(i).getSpeedx()+Main.Vehicles.get(i).getXPoints()+Main.Vehicles.get(i).getLenghtX()
                          >18*Main.Vehicles.get(j).getSpeedx()+Main.Vehicles.get(j).getXPoints())
                        {   int flag=0;
                            if (Main.Vehicles.get(i).getSpeedx()>0){
                                if(+Main.Vehicles.get(i).getYPoints()>((((5+(3*seting.getLinenumber()))*Main.HeightFrame)/(6*(seting.getLinenumber()+1))))+Main.HeightFrame/(4*(seting.getLinenumber()+1))){
                                    for (int k = 0; k < Main.Vehicles.size(); k++) {
                                        if(Main.Vehicles.get(i).getYPoints()-(Main.HeightFrame/(2*(seting.getLinenumber()+1)))==Main.Vehicles.get(k).getYPoints()){
                                            if(Main.Vehicles.get(i).getXPoints()<Main.Vehicles.get(k).getXPoints()){
                                                if(Main.Vehicles.get(i).getXPoints()+Main.Vehicles.get(i).getLenghtX()>Main.Vehicles.get(k).getXPoints())
                                                {
                                                    flag=1;
                                                }
                                            }
                                            else{
                                                if(Main.Vehicles.get(k).getXPoints()+Main.Vehicles.get(k).getLenghtX()>Main.Vehicles.get(i).getXPoints()){
                                                    flag=1;
                                                }   
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    flag=1;
                                }
                            if(flag==1){
                            Main.Vehicles.get(i).setSpeedx((int) Main.Vehicles.get(j).getSpeedx());
                            }
                            else
                            {
                                Main.Vehicles.get(i).setPoints(Main.Vehicles.get(i).getXPoints(), Main.Vehicles.get(i).getYPoints()-(Main.HeightFrame/(2*(seting.getLinenumber()+1))));
                            }
                            }
                            else{
                                if(Main.Vehicles.get(j).getYPoints()<(((3*seting.getLinenumber())-1)*Main.HeightFrame)/(6*(seting.getLinenumber()+1)))
                                {
                                    for (int k = 0; k < Main.Vehicles.size(); k++) {
                                        if(Main.Vehicles.get(j).getYPoints()+Main.HeightFrame/(2*(seting.getLinenumber()+1))==Main.Vehicles.get(k).getYPoints())
                                        {
                                            if(Main.Vehicles.get(j).getXPoints()<Main.Vehicles.get(k).getXPoints())
                                            {
                                                if(Main.Vehicles.get(j).getXPoints()+Main.Vehicles.get(j).getLenghtX()>Main.Vehicles.get(k).getXPoints())
                                                {
                                                    flag=1;
                                                }
                                            }
                                            else
                                            {
                                                //if(Main.Vehicles.get(k).getXPoints()+Main.Vehicles.get(k).getLenghtX()>Main.Vehicles.get(j).getYPoints())
                                                //{
                                                  //  flag=1;
                                                //}
                                            }
                                        }
                                    }
                                }
                                else{
                                    flag=1;
                                }
                                
                            if(flag==1){
                            Main.Vehicles.get(j).setSpeedx((int) Main.Vehicles.get(i).getSpeedx());
                            }
                            else
                            {
                                Main.Vehicles.get(j).setPoints(Main.Vehicles.get(j).getXPoints(), Main.Vehicles.get(j).getYPoints()+(Main.HeightFrame/(2*(seting.getLinenumber()+1))));
                            }
                            }
                        }
                    }
                }
            }
        }
    //}
    //catch (Exception e)
        //{
              
        //}
 }
    public static boolean accident()
    {
        return Main.Vehicles.stream().filter((Vehicle) -> (Vehicle.getYPoints() < gameMaker.Player[0].getYPoints()+gameMaker.Player[0].getLenghtY() && Vehicle.getYPoints() + Vehicle.getLenghtY() > gameMaker.Player[0].getYPoints())).filter((Vehicle) -> (Vehicle.getXPoints() < gameMaker.Player[0].getXPoints())).anyMatch((Vehicle) -> (Vehicle.getXPoints() + Vehicle.getLenghtX() > gameMaker.Player[0].getXPoints()))
             ||Main.Vehicles.stream().filter((Vehicle) -> (Vehicle.getYPoints() < gameMaker.Player[1].getYPoints()+gameMaker.Player[1].getLenghtY() && Vehicle.getYPoints() + Vehicle.getLenghtY() > gameMaker.Player[1].getYPoints())).filter((Vehicle) -> (Vehicle.getXPoints() < gameMaker.Player[1].getXPoints())).anyMatch((Vehicle) -> (Vehicle.getXPoints() + Vehicle.getLenghtX() > gameMaker.Player[1].getXPoints()))
             ||Main.Vehicles.stream().filter((Vehicle) -> (Vehicle.getYPoints() < gameMaker.Player[2].getYPoints()+gameMaker.Player[2].getLenghtY() && Vehicle.getYPoints() + Vehicle.getLenghtY() > gameMaker.Player[2].getYPoints())).filter((Vehicle) -> (Vehicle.getXPoints() < gameMaker.Player[2].getXPoints())).anyMatch((Vehicle) -> (Vehicle.getXPoints() + Vehicle.getLenghtX() > gameMaker.Player[2].getXPoints()));
        
    }
}
