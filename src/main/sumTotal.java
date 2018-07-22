package main;

import Back.Pause;
import Back.aI;
import Back.gameMaker;
import Back.move;
import Back.saveGame;
import Back.seting;
import Back.setingPlus;
import Front.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class sumTotal extends javax.swing.JPanel {
   int time=0;
    public sumTotal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    @Override
    public void paintComponent(Graphics g)
    {
        time+=10;
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        try{
            Main.HighWays.stream().forEach((HighWay) -> {
                HighWay.draw(g);
            });
            for (crossLine CrossLine : gameMaker.CrossLine) {
                if(CrossLine.getXPoints()!=-1){
                    CrossLine.draw(g);
                }
            }
       
            gameMaker.SideWalk1.draw(g);
            gameMaker.GaurdRail.draw(g);
            gameMaker.SideWalk2.draw(g);
            if(seting.isPic())
            {
               Main.Vehicles.stream().forEach((Vehicle) -> {
                        Vehicle.drawPic(g);
                });
            }
            else{
            Main.Vehicles.stream().forEach((Vehicle) -> {
                    Vehicle.draw(g);
            });
            }
       
            for (players Player : gameMaker.Player) {
                if (Player.getXPoints() != -1) {
                    Player.draw(g);
                }
            }
        
            for (bridge Bridge : gameMaker.Bridge) {
                if(Bridge.getXPoints()!=-1){
                     Bridge.draw(g);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    saveGame s=new saveGame();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Wide Latin", 3, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Wide Latin", 3, 70)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Pause.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(!setingPlus.PlayerAI[0]){
            if (evt.getKeyCode() == KeyEvent.VK_UP) {
                move.moveup(gameMaker.Player[0]);
                gameMaker.Player[0].up();
                s.normalSaveP(time,0, 'w');
            }
            else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
                move.movedown(gameMaker.Player[0]);
                gameMaker.Player[0].up();
                s.normalSaveP(time,0, 's');
            }
            else if(evt.getKeyCode() == KeyEvent.VK_RIGHT)
            {
                if(gameMaker.Player[0].getXPoints()>-1){
                    move.moveright(gameMaker.Player[0]);
                    gameMaker.Player[0].up();
                    s.normalSaveP(time,0, 'a');
                }
            }
            else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
                if(gameMaker.Player[0].getXPoints()>-1){
                    move.moveleft(gameMaker.Player[0]);
                    gameMaker.Player[0].up();
                    s.normalSaveP(time,0, 'd');
                }
            }
        }
        if(!setingPlus.PlayerAI[1]){
            if(evt.getKeyCode() == 87){
                move.moveup(gameMaker.Player[1]);
                gameMaker.Player[1].up();
                s.normalSaveP(time,1, 'w');
            }
            else if(evt.getKeyCode() == 83){
                move.movedown(gameMaker.Player[1]);
                gameMaker.Player[1].up();
                s.normalSaveP(time,1, 's');
            }
            else if(evt.getKeyCode() == 68){
                if(gameMaker.Player[1].getXPoints()>-1){
                    move.moveright(gameMaker.Player[1]);
                    gameMaker.Player[1].up();
                    s.normalSaveP(time,1, 'a');
                }
            }
            else if(evt.getKeyCode() == 65){
                if(gameMaker.Player[1].getXPoints()>-1){
                    move.moveleft(gameMaker.Player[1]);
                    gameMaker.Player[1].up();
                    s.normalSaveP(time,1, 'd');
                }
            }
        }
        if(!setingPlus.PlayerAI[2]){
            if(evt.getKeyCode() == 98){
                move.movedown(gameMaker.Player[2]);
                gameMaker.Player[2].up();
                s.normalSaveP(time,2, 's');
            }
            else if(evt.getKeyCode() == 104){
                move.moveup(gameMaker.Player[2]);
                gameMaker.Player[2].up();
                s.normalSaveP(time,2, 'w');
            }
            else if(evt.getKeyCode() == 100){
                if(gameMaker.Player[2].getXPoints()>-1){
                    move.moveleft(gameMaker.Player[2]);
                    gameMaker.Player[2].up();
                    s.normalSaveP(time,2, 'd');
                }
            }
            else if(evt.getKeyCode() == 102){
                if(gameMaker.Player[2].getXPoints()>-1){
                    move.moveright(gameMaker.Player[2]);
                    gameMaker.Player[2].up();
                    s.normalSaveP(time,2, 'a');
                }
            }
        }
            else if(evt.getKeyCode()==80){
                JFrame a=new JFrame();
            Pause p=new Pause(a);
            a.add(p);
            a.setSize(210, 190);
            a.setLocation(916, 424);
            a.setVisible(true);
            }
            
    }//GEN-LAST:event_formKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame a=new JFrame();
        Pause p=new Pause(a);
        a.add(p);
        a.setSize(210, 190);
        a.setLocation(916, 424);
        a.setVisible(true);        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
