/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ACER
 */
public class minicar extends vehicles {

    /**
     * Creates new form minicar
     */
    public minicar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

    @Override
    public void paint(Graphics g) {
        super.setLenghtX(80);
        super.setLenghtY(40);
        super.setPoints(40,40);
        g.setColor(Color.red);
        g.fillRoundRect(super.getXPoints(), super.getYPoints(), super.getLenghtX(), super.getLenghtY(), 25, 25);
        g.setColor(Color.BLACK);
        g.fillRoundRect(super.getXPoints()+(super.getLenghtX()/4), super.getYPoints()+(super.getLenghtY()/4), super.getLenghtX()/2, super.getLenghtY()/2, 25, 25);
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        paint(g);
    }
}
