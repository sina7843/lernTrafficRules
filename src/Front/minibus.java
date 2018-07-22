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

public class minibus extends vehicles implements Serializable{
    private final Random random;
    String path="src\\image\\minicar\\1";
    public minibus(String text){
        char[] temp=text.toCharArray();
        String Temp="";
        int speed=0,startx=0,starty=0,flag=0;
        random=new Random();
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
    public minibus(int StartY,int Speed,Color Fill,Color Borders ) {
        random=new Random();
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
            super.setPoints(0, StartY+(Main.HeightFrame/(8*(seting.getLinenumber()+1))));
        }
        else{
            path+="-";
            super.setPoints(Main.WidthFrame, StartY+(Main.HeightFrame/(8*(seting.getLinenumber()+1))));
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
        return super.getXPoints()+","+super.getYPoints()+","+super.getSpeedx()+",3\n";
    }
    @Override
    public void draw(Graphics g) {
        super.setLenghtX(3*(Main.HeightFrame/(4*(seting.getLinenumber()+1))));
        super.setLenghtY(5*(Main.HeightFrame/(16*(seting.getLinenumber()+1))));
        
        g.setColor(super.getFill());
        //khode mashin
        g.fillRoundRect(super.getXPoints(), super.getYPoints(), super.getLenghtX(), super.getLenghtY(),5,5);
        if(super.getSpeedx()>0){
        g.fillRoundRect(super.getXPoints()+(1000*super.getLenghtX()/1285), super.getYPoints()+(super.getLenghtY()/9), super.getLenghtX()-(100*super.getLenghtX()/225), 4*(super.getLenghtY()/5),20,20);
        g.setColor(Color.cyan);
        g.fillRect(super.getXPoints()+super.getLenghtX(), super.getYPoints()+(super.getLenghtY()/9), super.getLenghtX()-(1000*super.getLenghtX()/1058), 4*(super.getLenghtY()/5));
        }
        else
        {
            g.fillRoundRect(super.getXPoints()-(super.getLenghtX()/3),  super.getYPoints()+(super.getLenghtY()/9),super.getLenghtX()-(100*super.getLenghtX()/225), 4*(super.getLenghtY()/5),20,20);
            g.setColor(Color.cyan);
            g.fillRect(super.getXPoints()-(super.getLenghtX()/18), super.getYPoints()+(super.getLenghtY()/9),super.getLenghtX()-(1000*super.getLenghtX()/1058), 4*(super.getLenghtY()/5));
        }
        
        
        //vasat
        g.setColor(super.getBorders());
        g.fillRect(super.getXPoints()+(super.getLenghtX()/3), super.getYPoints()+(super.getLenghtY()/3), 2*super.getLenghtX()/5-4, 2*super.getLenghtY()/5-4);
        //چرخ
        g.setColor(Color.BLACK);
        g.fillRect(super.getXPoints()+(super.getLenghtX()/6),super.getYPoints()-(1000*super.getLenghtY()/9129),super.getLenghtX()/5,super.getLenghtY()/11);
        g.fillRect(super.getXPoints()+(1000*super.getLenghtX()/1578),super.getYPoints()-(1000*super.getLenghtY()/9129),super.getLenghtX()/5,super.getLenghtY()/11);
        g.fillRect(super.getXPoints()+(super.getLenghtX()/6),super.getYPoints()+(1000*super.getLenghtY()/985),super.getLenghtX()/5,super.getLenghtY()/11);
        g.fillRect(super.getXPoints()+(1000*super.getLenghtX()/1578),super.getYPoints()+(1000*super.getLenghtY()/985),super.getLenghtX()/5,super.getLenghtY()/11);
    }
    Image img=null;
    @Override
    public void drawPic(Graphics g) {
        super.setLenghtX(3*(Main.HeightFrame/(4*(seting.getLinenumber()+1))));
        super.setLenghtY(5*(Main.HeightFrame/(16*(seting.getLinenumber()+1))));
        try {
            g.drawImage(img, super.getXPoints(), super.getYPoints(), super.getLenghtX(), super.getLenghtY(), null);
        } catch (Exception ex) {
            Logger.getLogger(bus.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
