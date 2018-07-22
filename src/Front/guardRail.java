package Front;

import java.awt.Color;
import java.awt.Graphics;
import main.Main;
public class guardRail extends manualFix {
    public guardRail() {
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
    public void draw(Graphics g) {
        super.setLenghtX(Main.WidthFrame);
          
        for(int i=0;i<super.getLenghtX();i+=32)
        { 
            if(i%64==0)
              {
                g.setColor(Color.YELLOW);
                g.fillRect(super.getXPoints()+i, super.getYPoints(), super.getLenghtX()/3, super.getLenghtY()/3);
              }
            else{
                g.setColor(Color.black);
                g.fillRect(super.getXPoints()+i, super.getYPoints(), super.getLenghtX()/3, super.getLenghtY()/3);
            }
        }
        g.setColor(new Color(0,123,29));
        g.fillRect(super.getXPoints(), super.getYPoints()+super.getLenghtY()/3, super.getLenghtX(), 4*super.getLenghtY()/3);
        for(int i=0;i<super.getLenghtX();i+=32)
        {            
            if(i%64==0)
            {
                g.setColor(Color.YELLOW);
                g.fillRect(super.getXPoints()+i, super.getYPoints()+4*super.getLenghtY()/3, super.getLenghtX()/3, super.getLenghtY()/3);
            }
            else{
                g.setColor(Color.black);
                g.fillRect(super.getXPoints()+i, super.getYPoints()+4*super.getLenghtY()/3, super.getLenghtX()/3, super.getLenghtY()/3);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
