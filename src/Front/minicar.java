package Front;

import Back.seting;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import main.Main;

public class minicar extends vehicles implements Serializable{
   private final Random random;
   String path="src\\image\\minicar";
    public minicar(String text){
        char[] temp=text.toCharArray();
        String Temp="";
        int speed=0,startx=0,starty=0,flag=0;
        random=new Random();
         switch(random.nextInt(3)){
            case 0:
                path+="\\1";
                break;
            case 1:
                path+="\\2";
            case 2:
                path+="\\3";
        }
        if(seting.getGamespeed()==0)
        {
            path+="\\big";
        }
        else if(seting.getGamespeed()==1)
        {
            path+="\\medium";
        }
        else if(seting.getGamespeed()==2)
        {
            path+="\\small";
        }
        path+="\\"+seting.getLinenumber()+"\\"+seting.getLinenumber();
        for (int i = 0; i < temp.length; i++) {
            if(flag==0){
                if(temp[i]!=',')
                {
                    Temp+=temp[i];
                }
                else
                {
                    startx=(int)Double.parseDouble(Temp);
                    Temp="";
                    flag++;
                    i++;
                }
            }
            if(flag==1){
                if(temp[i]!=',')
                {
                    Temp+=temp[i];
                }
                else
                {
                    starty=(int)Double.parseDouble(Temp);
                    Temp="";
                    flag++;
                    i++;
                }
            }
            if(flag==2){
                if(temp[i]!=',')
                {
                    Temp+=temp[i];
                }
                else
                {
                    speed=(int)Double.parseDouble(Temp);
                    Temp="";
                    flag++;
                    i++;
                }
            }
        }
        if(speed<0)
        {
            path+="-";
        }
        super.setSpeedx(speed);
        super.setPoints(startx, starty);
        super.setFill(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
        super.setBorders(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
        initComponents();
        try {
                img=ImageIO.read(new File(path+".png"));
            } catch (IOException ex) {
                Logger.getLogger(bus.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
   public minicar(int Starty,int Speed,Color Fill,Color Borders){
       random=new Random();
        switch(random.nextInt(2)){
            case 0:
                path+="\\1";
                break;
            case 1:
                path+="\\2";
        }
        if(seting.getGameSize()==0)
        {
            path+="\\big";
        }
        else if(seting.getGameSize()==1)
        {
            path+="\\medium";
        }
        else if(seting.getGameSize()==2)
        {
            path+="\\small";
        }
        path+="\\"+seting.getLinenumber()+"\\"+seting.getLinenumber();
       super.setSpeedx(Speed);
       if(Speed>0)
        {
            super.setPoints(0, Starty+(Main.HeightFrame/(8*(seting.getLinenumber()+1))));
        }
        else{
           path+="-";
            super.setPoints(Main.WidthFrame, Starty+(Main.HeightFrame/(8*(seting.getLinenumber()+1))));
        }
       super.setFill(Fill);
       super.setBorders(Borders);
       initComponents();
       try {
                img=ImageIO.read(new File(path+".png"));
            } catch (IOException ex) {
                Logger.getLogger(bus.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
   @Override
    public String toString() {
        return super.getXPoints()+","+super.getYPoints()+","+super.getSpeedx()+",4\n";
    }
   @Override
    public void draw(Graphics g) {
        super.setLenghtX(3*(Main.HeightFrame/(8*(seting.getLinenumber()+1))));
        super.setLenghtY(3*(Main.HeightFrame/(16*(seting.getLinenumber()+1))));        
        g.setColor(super.getFill());
        g.fillRoundRect(super.getXPoints(), super.getYPoints(), super.getLenghtX(), super.getLenghtY(), 15, 15);
        g.setColor(super.getBorders());
        g.fillRoundRect(super.getXPoints()+(super.getLenghtX()/4), super.getYPoints()+(super.getLenghtY()/4), super.getLenghtX()/2, super.getLenghtY()/2, 10, 10);
        g.setColor(Color.BLACK);
        g.fillRect(super.getXPoints()+(1000*super.getLenghtX()/5333),super.getYPoints()-(super.getLenghtY()/8),super.getLenghtX()/5,super.getLenghtY()/7);
        g.fillRect(super.getXPoints()+(10*super.getLenghtX()/16),super.getYPoints()-(super.getLenghtY()/8),super.getLenghtX()/5,super.getLenghtY()/7);
        g.fillRect(super.getXPoints()+(1000*super.getLenghtX()/5333),super.getYPoints()+super.getLenghtY(),super.getLenghtX()/5,super.getLenghtY()/7);
        g.fillRect(super.getXPoints()+(10*super.getLenghtX()/16),super.getYPoints()+super.getLenghtY(),super.getLenghtX()/5,super.getLenghtY()/7);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    Image img=null;
    @Override
    public void drawPic(Graphics g) {
        super.setLenghtX(3*(Main.HeightFrame/(8*(seting.getLinenumber()+1))));
        super.setLenghtY(3*(Main.HeightFrame/(16*(seting.getLinenumber()+1))));        
        try {
            g.drawImage(img, super.getXPoints(), super.getYPoints(), super.getLenghtX(), super.getLenghtY(), null);
        } catch (Exception ex) {
            Logger.getLogger(bus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
