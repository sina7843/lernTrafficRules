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

public class bus extends vehicles implements Serializable{
    String path="src\\image\\bus";
    private final Random random;    
    public bus(String text){
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
        char[] temp=text.toCharArray();
        String Temp="";
        int speed=0,startx=0,starty=0,flag=0;
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
       public bus(int StartY,int Speed,Color Fill,Color Borders) {
           random=new Random();
           switch(random.nextInt(2)){
            case 0:
                path+="\\1";
                break;
            case 1:
                path+="\\2";
            }
           System.out.println();
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
            super.setFill(Fill);
            super.setBorders(Borders);
            if(Speed>0)
            {
                super.setPoints(0, StartY+(Main.HeightFrame/(8*(seting.getLinenumber()+1))));
            }
            else{
                path+="-";
                super.setPoints(Main.WidthFrame, StartY+(Main.HeightFrame/(8*(seting.getLinenumber()+1))));
            }
            initComponents();
            try {
                img=ImageIO.read(new File(path+".png"));
            } catch (IOException ex) {
                Logger.getLogger(bus.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        return super.getXPoints()+","+super.getYPoints()+","+super.getSpeedx()+",1\n";
    }
    @Override
    public void draw(Graphics g) {
        super.setLenghtX(2*(Main.HeightFrame/(2*(seting.getLinenumber()+1))));
        super.setLenghtY((Main.HeightFrame/(4*(seting.getLinenumber()+1))));
        g.setColor(super.getFill());
        g.fillRoundRect(super.getXPoints(), super.getYPoints(), super.getLenghtX(), super.getLenghtY(), 15, 15);
        g.setColor(new Color(60,100,50));        
        g.fillRoundRect(super.getXPoints()+(super.getLenghtX()/4), super.getYPoints()+(super.getLenghtY()/4), super.getLenghtX()/2, super.getLenghtY()/2, 5, 5);
        g.setColor(super.getBorders());
        g.fillRoundRect(super.getXPoints()+(super.getLenghtX()/2), super.getYPoints()+(super.getLenghtY()/4), super.getLenghtX()/20, super.getLenghtY()/2, 0, 0);
        g.setColor(Color.BLACK);
        g.fillRect(super.getXPoints()+(super.getLenghtX()/9),super.getYPoints()+super.getLenghtY(),super.getLenghtX()/8,super.getLenghtY()/7);
        g.fillRect(super.getXPoints()+(1000*super.getLenghtX()/1384),super.getYPoints()+super.getLenghtY(),super.getLenghtX()/8,super.getLenghtY()/7);
        g.fillRect(super.getXPoints()+(super.getLenghtX()/9),super.getYPoints()-5,super.getLenghtX()/8,super.getLenghtY()/10);
        g.fillRect(super.getXPoints()+(1000*super.getLenghtX()/1384),super.getYPoints()-5,super.getLenghtX()/8,super.getLenghtY()/10);    
    } 
    Image img=null;
    @Override
    public void drawPic(Graphics g) {
        super.setLenghtX(2*(Main.HeightFrame/(2*(seting.getLinenumber()+1))));
        super.setLenghtY((Main.HeightFrame/(4*(seting.getLinenumber()+1))));
        try {
            g.drawImage(img, super.getXPoints(), super.getYPoints(), super.getLenghtX(), super.getLenghtY(), null);
        } catch (Exception ex) {
            Logger.getLogger(bus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
