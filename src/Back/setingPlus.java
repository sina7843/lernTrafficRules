/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import main.Main;
import main.menu;

/**
 *
 * @author ACER
 */
public class setingPlus extends javax.swing.JPanel {
    public static int[] placeBridge={-1,-1,-1};
    public static int[] placeLineCross={-1,-1,-1};
    public static int[] placePlayer={-1,-1,-1};
    public static int[] placeYPlayer={Main.HeightFrame-10,Main.HeightFrame-10,Main.HeightFrame-10};
    public static boolean[] PlayerAI={false,false,false};

    public static boolean[] getPlayerAI() {
        return PlayerAI;
    }

    public static void setPlayerAI(boolean x,boolean y,boolean z) {
        setingPlus.PlayerAI[0]=x;
        setingPlus.PlayerAI[1]=y;
        setingPlus.PlayerAI[2]=z;
    }
    

    public static int[] getPlaceBridge() {
        return placeBridge;
    }

    public static void setPlaceBridge(int x,int y,int z) {
        setingPlus.placeBridge[0] = x;
        setingPlus.placeBridge[1] = y;
        setingPlus.placeBridge[2] = z;
    }

    public static int[] getPlaceLineCross() {
        return placeLineCross;
    }

    public static void setPlaceLineCross(int x,int y,int z) {
        setingPlus.placeLineCross[0] = x;
        setingPlus.placeLineCross[1] = y;
        setingPlus.placeLineCross[2] = z;
    }

    public static int[] getPlaceYPlayer() {
        return placeYPlayer;
    }

    public static void setPlaceYPlayer(int[] placeYPlayer) {
        setingPlus.placeYPlayer = placeYPlayer;
    }

    public static int[] getPlacePlayer() {
        return placePlayer;
    }

    public static void setPlacePlayer(int x,int y,int z) {
        if(placePlayer[0]==-1){
        setingPlus.placePlayer[0] = x;
        }
        if(placePlayer[1]==-1){
        setingPlus.placePlayer[1] = y;
        }
        if(placePlayer[2]==-1){
        setingPlus.placePlayer[2] = z;
        }

    }
    Image img=null;
    JFrame app;
    public setingPlus(JFrame app) {
        setingPlus.load();
        this.app=app;
        try {
            img=ImageIO.read(new File("src\\image\\all-geras.png"));
        } catch (IOException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        
        lbl1.setText("plz choose number between 0 to"+Main.WidthFrame);
        jLabel11.setText("انتخاب کنید"+Main.WidthFrame+"تا0 لطفا یک عدد از ");
        if(seting.getLineCrossNumber()<3)
        {
            jTextField3.setEditable(false);
            if(seting.getLineCrossNumber()<2){
                jTextField2.setEditable(false);
            }
            if(seting.getLineCrossNumber()<1){
                jTextField1.setEditable(false);
            }
        }
        if(seting.getBridgeNumber()<3)
        {
            jTextField6.setEditable(false);
            if(seting.getBridgeNumber()<2){
                jTextField7.setEditable(false);
            }
            if(seting.getBridgeNumber()<1){
                jTextField5.setEditable(false);
            }
        }
         if(seting.getPlayerNumber()<3)
        {
            jTextField8.setEditable(false);
            if(seting.getPlayerNumber()<2){
                jTextField9.setEditable(false);
            }
            if(seting.getPlayerNumber()<1){
                jTextField10.setEditable(false);
            }
        }
        initComponents();
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jTextField1.setText(setingPlus.getPlaceLineCross()[0]+"");
        jTextField2.setText(setingPlus.getPlaceLineCross()[1]+"");
        jTextField3.setText(setingPlus.getPlaceLineCross()[2]+"");
        jTextField5.setText(setingPlus.getPlaceBridge()[0]+"");
        jTextField6.setText(setingPlus.getPlaceBridge()[1]+"");
        jTextField7.setText(setingPlus.getPlaceBridge()[2]+"");
        jTextField8.setText(setingPlus.getPlacePlayer()[0]+"");
        jTextField9.setText(setingPlus.getPlacePlayer()[1]+"");
        jTextField10.setText(setingPlus.getPlacePlayer()[2]+"");
        if(!setingPlus.getPlayerAI()[0])
        {
            jToggleButton1.setSelected(true);
            jToggleButton1.setText("CPU");
        }
        if(!setingPlus.getPlayerAI()[1])
        {
            jToggleButton2.setSelected(true);
            jToggleButton2.setText("CPU");
        }
        if(!setingPlus.getPlayerAI()[2])
        {
            jToggleButton3.setSelected(true);
            jToggleButton3.setText("CPU");
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }
    public static void Save(){
        try{
             Formatter OutPut=new Formatter("src\\File\\settingPlus.txt");
             OutPut.format("%d %d %d %d %d %d %d %d %d %d %d %d",setingPlus.getPlaceBridge()[0],setingPlus.getPlaceBridge()[1],setingPlus.getPlaceBridge()[2]
                                                       ,setingPlus.getPlaceLineCross()[0],setingPlus.getPlaceLineCross()[1],setingPlus.getPlaceLineCross()[2]
                                                       ,setingPlus.getPlacePlayer()[0],setingPlus.getPlacePlayer()[1],setingPlus.getPlacePlayer()[2]
                                                       ,(setingPlus.PlayerAI[0]?0:1),(setingPlus.PlayerAI[1]?0:1),(setingPlus.PlayerAI[2]?0:1));       
             OutPut.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void load(){
        try{
            Scanner InPut=new Scanner(new File("src\\File\\settingPlus.txt"));
            setingPlus.setPlaceBridge(InPut.nextInt(), InPut.nextInt(), InPut.nextInt());
            setingPlus.setPlaceLineCross(InPut.nextInt(), InPut.nextInt(), InPut.nextInt());
            setingPlus.setPlacePlayer(InPut.nextInt(), InPut.nextInt(), InPut.nextInt());
            setingPlus.setPlayerAI((InPut.nextInt() != 0), (InPut.nextInt() != 0), (InPut.nextInt() != 0));
        }
        catch(Exception e){}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();

        lbl1.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel2.setText("مکان عابر پیاده");

        jLabel3.setText("line cross location");

        jTextField1.setText("-1");

        jTextField2.setText("-1");

        jTextField3.setText("-1");

        jLabel7.setText("مکان پل ها");

        jLabel6.setText("bridges location");

        jTextField5.setText("-1");

        jTextField7.setText("-1");

        jTextField6.setText("-1");

        jLabel8.setText("مکان بازیکن ها");

        jTextField10.setText("-1");

        jTextField9.setText("-1");

        jTextField8.setText("-1");

        jLabel9.setText("player location");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok-png-new-svg-image-2000.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Setting");

        jLabel4.setText("کامپیوتر یا کاربر");

        jLabel5.setText("CPU or Player");

        jToggleButton1.setText("Player");
        jToggleButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jToggleButton1StateChanged(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Player");
        jToggleButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jToggleButton2StateChanged(evt);
            }
        });

        jToggleButton3.setText("PLayer");
        jToggleButton3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jToggleButton3StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1))
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11))
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))
                                .addGap(19, 19, 19)))
                        .addGap(1069, 1069, 1069)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(jLabel12))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int flag=0;
        int temp1=Integer.parseInt(jTextField1.getText());
        int temp2=Integer.parseInt(jTextField2.getText());
        int temp3=Integer.parseInt(jTextField3.getText());
        if(temp1>-2&&temp1<Main.WidthFrame&&temp2>-2&&temp2<Main.WidthFrame&&temp3>-2&&temp3<Main.WidthFrame)
        {
            this.setPlaceLineCross(temp1, temp2, temp3);
        }
        else
        {
            flag=1;
        }
        temp1=Integer.parseInt(jTextField7.getText());
        temp2=Integer.parseInt(jTextField5.getText());
        temp3=Integer.parseInt(jTextField6.getText());
        if(temp1>-2&&temp1<Main.WidthFrame&&temp2>-2&&temp2<Main.WidthFrame&&temp3>-2&&temp3<Main.WidthFrame)
        {
            this.setPlaceBridge(temp1, temp2, temp3);
        }
        else
        {
            flag=1;
        }
        temp1=Integer.parseInt(jTextField8.getText());
        temp2=Integer.parseInt(jTextField9.getText());
        temp3=Integer.parseInt(jTextField10.getText());
        if(jToggleButton1.isSelected())
        {
            PlayerAI[0]=true;
        }
        else
        {
            PlayerAI[0]=false;
        }
        if(jToggleButton2.isSelected())
        {
            PlayerAI[1]=true;
        }
        else
        {
            PlayerAI[1]=false;
        }
        if(jToggleButton3.isSelected())
        {
            PlayerAI[2]=true;
        }
        else
        {
            PlayerAI[2]=false;
        }
        if(temp1>-2&&temp1<Main.WidthFrame&&temp2>-2&&temp2<Main.WidthFrame&&temp3>-2&&temp3<Main.WidthFrame)
        {
            this.setPlacePlayer(temp1, temp2, temp3);
        }
        else
        {
            flag=1;
        }
        if(flag==1)
        {
            jLabel12.setText("ERROR WRONG INPUT");
            jLabel13.setText("خطا ورودی غلط");
        }
        else
        {
            app.setVisible(false);
        }
        setingPlus.Save();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jToggleButton1StateChanged
        if(jToggleButton1.isSelected())
        {
            jToggleButton1.setText("CPU");
        }
        else
        {
            jToggleButton1.setText("Player");
        }
    }//GEN-LAST:event_jToggleButton1StateChanged

    private void jToggleButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jToggleButton2StateChanged
        if(jToggleButton2.isSelected())
        {
            jToggleButton2.setText("CPU");
        }
        else
        {
            jToggleButton2.setText("Player");
        }
    }//GEN-LAST:event_jToggleButton2StateChanged

    private void jToggleButton3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jToggleButton3StateChanged
        if(jToggleButton3.isSelected())
        {
            jToggleButton3.setText("CPU");
        }
        else
        {
            jToggleButton3.setText("Player");
        }
    }//GEN-LAST:event_jToggleButton3StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel lbl1;
    // End of variables declaration//GEN-END:variables
}
