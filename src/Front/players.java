package Front;

import Back.seting;
import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import main.Main;
public class players extends man implements Serializable{
    int i=0;
    public players(int StartX,int StartY,Color Fill,Color Borders) {
        System.out.println(StartY);
        super.setPoints(StartX, StartY);
        super.setFill(Fill);
        super.setBorders(Borders);
        super.setSpeedx(5);
        initComponents();
    }

    @Override
    public String toString() {
        return super.getXPoints()+","+super.getYPoints()+",\n";
    }
    
    public void up()
    {
        i++;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void draw(Graphics g) 
    {
        super.setLenghtX((Main.HeightFrame/(8*(seting.getLinenumber()+1))));
        super.setLenghtY((Main.HeightFrame/(8*(seting.getLinenumber()+1))));
        super.setSpeedy(-(Main.HeightFrame/(40*(seting.getLinenumber()+1))));
        //super.setPoints(500,40);
        if(i%4==1){
            //kafshe rast
            g.setColor(new Color(204,86,8));
            g.fillRoundRect(super.getXPoints()+(1000*super.getLenghtX()/1785) , super.getYPoints()-(4*super.getLenghtY()/12), 2*super.getLenghtX()/5 , super.getLenghtY()/2,10,10);
        
            //kafshe chap
            g.setColor(new Color(204,86,8));
            g.fillRoundRect(super.getXPoints()+(super.getLenghtX()/25) , super.getYPoints()+(19*super.getLenghtY()/21), 2*super.getLenghtX()/5 , super.getLenghtY()/2,10,10);
                
            //paye rast
            g.setColor(super.getBorders());
            g.fillRect(super.getXPoints()+(super.getLenghtX()/2) , super.getYPoints()-(super.getXPoints()/85), 9*super.getLenghtX()/16 , super.getLenghtY()/2);
            //paye chap        
            g.fillRect(super.getXPoints() , super.getYPoints()+(19*super.getLenghtY()/25), 9*super.getLenghtX()/16 , super.getLenghtY()/2);
        }
        else if(i%4==3)
        {
            //kafshe rast
            g.setColor(new Color(204,86,8));
            g.fillRoundRect( super.getXPoints()+(1000*super.getLenghtX()/1785), super.getYPoints()+(19*super.getLenghtY()/21), 2*super.getLenghtX()/5 , super.getLenghtY()/2,10,10);
        
            //kafshe chap
            g.setColor(new Color(204,86,8));
            g.fillRoundRect(super.getXPoints()+(super.getLenghtX()/25) ,super.getYPoints()-(4*super.getLenghtY()/12) , 2*super.getLenghtX()/5 , super.getLenghtY()/2,10,10);
                
            //paye rast
            g.setColor(super.getBorders());
            g.fillRect(super.getXPoints(), super.getYPoints()-(super.getXPoints()/85), 9*super.getLenghtX()/16 , super.getLenghtY()/2);
            //paye chap        
            g.fillRect(super.getXPoints()+(super.getLenghtX()/2)  , super.getYPoints()+(19*super.getLenghtY()/25), 9*super.getLenghtX()/16 , super.getLenghtY()/2);
        
        }
        //daste rast
        g.setColor(Color.BLACK);
        g.fillRoundRect(super.getXPoints()+8*super.getLenghtX()/7 , super.getYPoints()+(4*super.getLenghtX()/9), 3*super.getLenghtX()/6 , super.getLenghtY()/4,10,10);
        g.fillRoundRect(super.getXPoints()+18*super.getLenghtX()/13 , super.getYPoints()+(super.getLenghtX()/9), super.getLenghtX()/4 , 1*super.getLenghtY()/2,10,10);
                 
        //daste chap        
        g.fillRoundRect(super.getXPoints()-(5*super.getLenghtX()/7) , super.getYPoints()+(4*super.getLenghtX()/9), 3*super.getLenghtX()/6 , super.getLenghtY()/4,10,10);
        g.fillRoundRect(super.getXPoints()-(9*super.getLenghtX()/13) , super.getYPoints()+(super.getLenghtX()/9), super.getLenghtX()/4 , 1*super.getLenghtY()/2,10,10);
        
        //badan
        g.setColor(super.getFill());        
        g.fillRoundRect(super.getXPoints()-(1000*super.getLenghtX()/2941) , super.getYPoints()+(1000*super.getLenghtX()/3125), 5*super.getLenghtX()/3 , super.getLenghtY()/2,10,10);
     
        //sar
        g.setColor(Color.BLACK);
        g.fillOval(super.getXPoints(), super.getYPoints()+(super.getLenghtY()/10), super.getLenghtX() , super.getLenghtY());
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
