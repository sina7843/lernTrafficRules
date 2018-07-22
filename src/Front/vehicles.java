package Front;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author ACER
 */
public abstract  class vehicles extends movable implements Serializable{
    public vehicles(){
        initComponents();
    }
    private int LenghtX =0;
    private int lenghtY =0;
    public void setLenghtX(int LenghtX) {
        this.LenghtX = LenghtX;
    }
    public void setLenghtY(int lenghtY) {
        this.lenghtY = lenghtY;
    }
    public int getLenghtY() {
        return lenghtY;
    }
    public int getLenghtX() {
        return LenghtX;
    }
    public abstract void draw(Graphics g);
    public abstract void drawPic(Graphics g);
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
}
