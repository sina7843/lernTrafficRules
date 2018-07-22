package Front;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;
public class shapes extends javax.swing.JPanel implements Serializable{
     public shapes() {
        initComponents();
    }
    private Point Points=new Point(0,0);
    private Color Fill=new Color(0,0,0);
    private Color Borders=new Color(0,0,0);
    public void setPoints(int x,int y)
    {
        this.Points.x=x;
        this.Points.y=y;
    }
    public int getXPoints()
    {
        return this.Points.x;
    }
    public int getYPoints()
    {
        return this.Points.y;
    }
    public void setFill(Color fill) {
        this.Fill = fill;
    }
    public void setBorders(Color border) {
        this.Borders = border;
    }
    public Color getFill() {
        return Fill;
    }
    public Color getBorders() {
        return Borders;
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
}
