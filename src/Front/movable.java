package Front;

import java.awt.Point;
import java.util.ArrayList;
public class movable extends shapes implements Runnable {
    private int speedx,speedy;
    public static ArrayList<Point> mover=new ArrayList<>();
    @Override
    public void run(){
        move(super.getXPoints(),super.getWidth(),super.getYPoints(),super.getHeight(),speedx,speedy);
    }
    public void move(int startx,int endx,int starty,int endy,int speedx,int speedy){
        Point now = new Point();
        now.x=startx;
        now.y=starty;
        mover.add(Points);
        if(startx<=endx&&starty<=endy){
            move(startx+speedx,endx,starty+speedy,endy,speedx,speedy);
        }
    }
    public float getSpeedx() {
        return speedx;
    }
    public void setSpeedx(int speedx) {
        this.speedx = speedx;
    }
    public float getSpeedy() {
        return speedy;
    }
    public void setSpeedy(int speedy) {
        this.speedy = speedy;
    }
    public movable() {
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