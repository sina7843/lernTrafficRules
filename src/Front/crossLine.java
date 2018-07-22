package Front;

import java.awt.Color;
import java.awt.Graphics;
import main.Main;

public class crossLine extends manualFix {
    public crossLine(int StartX,int StartY) {
        super.setPoints(StartX, StartY);
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
    super.setLenghtX(200);
    super.setLenghtY(Main.WidthFrame);
    for(int i=0;i<super.getLenghtY();i+=25)
    {
        if(i%50==0){
        g.setColor(Color.WHITE);
        }
        else{
            g.setColor(Color.orange);
        }
        g.fillRect(super.getXPoints(), super.getYPoints()+i, super.getLenghtX(), 25);     
    }    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
