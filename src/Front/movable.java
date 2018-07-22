package Front;
import java.io.Serializable;
import main.Main;
public class movable extends shapes implements Serializable{
    private int speedx=0,speedy=0;
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
