package Front;

import java.awt.Color;
import java.awt.Graphics;
import main.Main;

public class sideWalk extends manualFix {


    public sideWalk() {
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
        
        g.setColor(new Color(121,82,18));
        g.fillRect(super.getXPoints(), super.getYPoints(), super.getLenghtX(), super.getLenghtY()+10);        
        for (int j = super.getYPoints(); j < super.getYPoints()+super.getLenghtY(); j+=20) {          
            for(int i=super.getXPoints();i<=super.getXPoints()+super.getLenghtX();i+=20)
            {
                g.setColor(new Color(204,204,204));
                g.drawLine(i, j+20, i+20, j);
                g.drawLine(i, j, i+20, j+20);
            }      
        }
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
