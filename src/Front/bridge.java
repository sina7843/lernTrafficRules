package Front;
import java.awt.Color;
import java.awt.Graphics;
import main.Main;
public class bridge extends manualFix {
    public bridge(int Startx) {
        super.setPoints(Startx,100);
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
    public void draw(Graphics g)
    {
        super.setLenghtX(160);
        super.setLenghtY(720);
        for(int i=0;i<super.getLenghtX();i+=25)
        {
                //pelle down               
                //g.fillRect(super.getXPoints()+(super.getLenghtX()/4)-i , super.getXPoints()+(11*super.getLenghtY()/12)+2*i/15 , super.getLenghtX()/7 , super.getLenghtY()/4);
                if(i%2==0)
                {
                g.setColor(new Color(34,6,17));
                g.fillRect(super.getXPoints()+(3*super.getLenghtX()/5)+i , super.getYPoints()+(29*super.getLenghtY()/24)+2*i/25 , super.getLenghtX()/7 , super.getLenghtY()/4);
                //pelle up
                g.fillRect(super.getXPoints()+(13*super.getLenghtX()/49)-i , super.getYPoints()-(15*super.getLenghtY()/47)-2*i/25 , super.getLenghtX()/7 , super.getLenghtY()/4);
                }
                else
                {                    
                g.setColor(Color.BLACK);
                g.fillRect(super.getXPoints()+(3*super.getLenghtX()/5)+i , super.getYPoints()+(29*super.getLenghtY()/24)+2*i/25 , super.getLenghtX()/7 , super.getLenghtY()/4);
                //pelle up
                g.fillRect(super.getXPoints()+(13*super.getLenghtX()/49)-i , super.getYPoints()-(15*super.getLenghtY()/47)-2*i/25 , super.getLenghtX()/7 , super.getLenghtY()/4);
                } 
    }
        g.setColor(new Color(34,6,17));
        g.fillRect(super.getXPoints()+super.getLenghtX()/4, super.getYPoints()+84*super.getLenghtY()/83, super.getLenghtX()/2, super.getLenghtY()/3);
        g.fillRect(super.getXPoints()+super.getLenghtX()/4, super.getYPoints()-3*super.getLenghtY()/9, super.getLenghtX()/2, super.getLenghtY()/3);
        
        g.setColor(Color.BLACK);
        g.drawRect(super.getXPoints()+(1000*super.getLenghtX()/9970), super.getYPoints(), 78*super.getLenghtX()/100+(1000*super.getLenghtX()/53333) , super.getLenghtY()+(super.getLenghtY()/90));
        g.setColor(Color.yellow);
        g.fillRect(super.getXPoints()+(1000*super.getLenghtX()/9270), super.getYPoints()+(super.getLenghtY()/320), 78*super.getLenghtX()/100+(super.getLenghtX()/80) , super.getLenghtY()+(super.getLenghtY()/120));
        
            
        g.setColor(new Color(153,2,111));
        for(int i=0;i<super.getLenghtY();i+=40)
        {            
        int[] mf=new int[4];
        int[] me={super.getXPoints()+(100000*super.getLenghtX()/941176) , super.getXPoints()+(100000*super.getLenghtX()/111888)  , super.getXPoints()+(100*super.getLenghtX()/128) , super.getXPoints()+(100000*super.getLenghtX()/457142)};
        
        if(i%80==0){
         mf[2]=super.getYPoints()+(900*super.getLenghtY()/106666)+i;
         mf[3]=super.getYPoints()+(900*super.getLenghtY()/106666)+i;
         mf[1]=super.getYPoints()+(super.getLenghtY()/16)+i;
         mf[0]=super.getYPoints()+(super.getLenghtY()/16)+i;   
        }
        else
        {
         mf[0]=super.getYPoints()+(1000*super.getLenghtY()/106666)+i;
         mf[1]=super.getYPoints()+(1000*super.getLenghtY()/106666)+i;
         mf[2]=super.getYPoints()+(super.getLenghtY()/16)+i;
         mf[3]=super.getYPoints()+(super.getLenghtY()/16)+i;
        }            
        g.fillPolygon(me, mf, 4); 
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    }
}
