package Front;

import Back.seting;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import main.Main;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class car extends vehicles implements Serializable{
    String path="src\\image\\car";
    private final Random random;
    public car(String text){
        char[] temp=text.toCharArray();
        String Temp="";
        int speed=0,startx=0,starty=0,flag=0;
        random=new Random();
        switch(random.nextInt(5))
        {
            case 0:
                path+="1";
                break;
            case 1:
                path+="2";
                break;
            case 2:
                path+="3";
                break;
             case 3:
                path+="4";
                break;
             case 4:
                path+="5";
                break;    
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
    public car(int Starty,int Speed,Color Fill,Color Borders) {
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
        super.setFill(Fill);
        super.setBorders(Borders);
        super.setSpeedx(Speed);
        if(Speed>0)
        {
            super.setPoints(-200, Starty+(Main.HeightFrame/(8*(seting.getLinenumber()+1))));
        }
        else{
            path+="-";
            super.setPoints(Main.WidthFrame, Starty+(Main.HeightFrame/(8*(seting.getLinenumber()+1))));
        }
        try {
                img=ImageIO.read(new File(path+".png"));
            } catch (IOException ex) {
                Logger.getLogger(bus.class.getName()).log(Level.SEVERE, null, ex);
            }
        initComponents();
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public String toString() {
        return super.getXPoints()+","+super.getYPoints()+","+super.getSpeedx()+",2\n";
    }
    @Override
    public void draw(Graphics g) {
        super.setLenghtX((Main.HeightFrame/(2*(seting.getLinenumber()+1))));
        super.setLenghtY((Main.HeightFrame/(4*(seting.getLinenumber()+1))));
        
        int[] ma={super.getXPoints()+(10*super.getLenghtX()/78) , super.getXPoints()+(1000*super.getLenghtX()/3666) , super.getXPoints()+(1000*super.getLenghtX()/3666) , super.getXPoints()+(10*super.getLenghtX()/78)};
        int[] mb={super.getYPoints()+(100*super.getLenghtY()/785) , super.getYPoints()+(10*super.getLenghtY()/55) , super.getYPoints()+super.getLenghtY()-(10*super.getLenghtY()/55), super.getYPoints()+super.getLenghtY()-(100*super.getLenghtY()/785)};
        
        int[] mc={super.getXPoints()+(3*super.getLenghtX()/5)+(10*super.getLenghtX()/78) , super.getXPoints()+(3*super.getLenghtX()/5)+(1000*super.getLenghtX()/3666)  , super.getXPoints()+(3*super.getLenghtX()/5)+(1000*super.getLenghtX()/3666) , super.getXPoints()+(3*super.getLenghtX()/5)+(10*super.getLenghtX()/78)};
        int[] md={super.getYPoints()+(10*super.getLenghtY()/55) , super.getYPoints()+(100*super.getLenghtY()/785)   , super.getYPoints()+super.getLenghtY()-(100*super.getLenghtY()/785) , super.getYPoints()+super.getLenghtY()-(10*super.getLenghtY()/55)};
        
        int[] me={super.getXPoints()+(100*super.getLenghtX()/647) , super.getXPoints()+super.getLenghtX()-(100*super.getLenghtX()/647)  , super.getXPoints()+super.getLenghtX()-(100*super.getLenghtX()/314) , super.getXPoints()+(100*super.getLenghtX()/314)};
        int[] mf={super.getYPoints()+(100*super.getLenghtY()/1833) , super.getYPoints()+(100*super.getLenghtY()/1833)  , super.getYPoints()+(1000*super.getLenghtY()/6875) , super.getYPoints()+(1000*super.getLenghtY()/6875)};
        
        
        int[] mg={super.getXPoints()+(100*super.getLenghtX()/314) , super.getXPoints()+super.getLenghtX()-(100*super.getLenghtX()/314)  , super.getXPoints()+super.getLenghtX()-(100*super.getLenghtX()/647), super.getXPoints()+(100*super.getLenghtX()/647)};
        int[] mh={super.getYPoints()+super.getLenghtY()-(1000*super.getLenghtY()/6111) , super.getYPoints()+super.getLenghtY()-(1000*super.getLenghtY()/6111)  , super.getYPoints()+super.getLenghtY()-(100*super.getLenghtY()/1375) , super.getYPoints()+super.getLenghtY()-(100*super.getLenghtY()/1375)};
        
          
        g.setColor(super.getFill());
        //khode mashin
        g.fillRoundRect(super.getXPoints(), super.getYPoints(), super.getLenghtX(), super.getLenghtY(),23,10);
       
        
        //p vasat
        g.setColor(super.getBorders());
        g.fillRect(super.getXPoints()+(super.getLenghtX()/3), super.getYPoints()+(super.getLenghtY()/5), 2*super.getLenghtX()/5-4, 3*super.getLenghtY()/5);
        g.setColor(Color.BLACK);
        g.fillRect(super.getXPoints()+(1000*super.getLenghtX()/7333),super.getYPoints()-(super.getLenghtY()/11),super.getLenghtX()/5,super.getLenghtY()/7);
        g.fillRect(super.getXPoints()+super.getLenghtX()-(1000*super.getLenghtX()/2666),super.getYPoints()-(super.getLenghtY()/11),super.getLenghtX()/5,super.getLenghtY()/7);
        g.fillRect(super.getXPoints()+(1000*super.getLenghtX()/7333),super.getYPoints()+super.getLenghtY(),super.getLenghtX()/5,super.getLenghtY()/7);
        g.fillRect(super.getXPoints()+super.getLenghtX()-(1000*super.getLenghtX()/2666),super.getYPoints()+super.getLenghtY(),super.getLenghtX()/5,super.getLenghtY()/7);
       //p aghab
        g.fillPolygon(ma, mb, 4);
        //p jolo
        g.fillPolygon(mc, md, 4);
        //p bala
        g.fillPolygon(me, mf, 4);
        //p payin
        g.fillPolygon(mg, mh, 4);
    }
    Image img=null;
    @Override
    public void drawPic(Graphics g) {
        super.setLenghtX((Main.HeightFrame/(2*(seting.getLinenumber()+1))));
        super.setLenghtY((Main.HeightFrame/(4*(seting.getLinenumber()+1))));
        try {
            g.drawImage(img, super.getXPoints(), super.getYPoints(), super.getLenghtX(), super.getLenghtY(), null);
        } catch (Exception ex) {
            Logger.getLogger(bus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
