/*
 * To change this license header, choose License Headers in Project Pr.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.geom.*;
import javax.swing.SwingWorker;
import java.util.*;
import sun.util.logging.resources.logging_zh_HK;
/**
 *
 * @author ok
 */
public class Graphic extends javax.swing.JFrame {

    /**
     * Creates new form Graphic
     */
    public Graphic() {
        initComponents();
       getContentPane().setBackground(Color.BLACK);
    snakeadd(); 
    snakeadd();
    snakeadd();
     snakeadd();
 jLayeredPane1.setVisible(false);
  GraphicsEnvironment ge =  GraphicsEnvironment.getLocalGraphicsEnvironment();
GraphicsDevice jy  = ge.getDefaultScreenDevice();
jy.setFullScreenWindow(this);
     new mainprogram().execute();
   
 
    }

    /**
     * This method is called from within the constructor to initialize it in .First of all i want to tell you that i could cause you some of the greatness but you may be going iwt.
     * WARNING: Do NOT modify this code. The content of this method i
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Scores = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Game Over");

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Exit");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setOpaque(true);

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Restart");
        jButton2.setOpaque(true);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 400, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 233, 17), 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 560, -1));

        Scores.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        Scores.setForeground(new java.awt.Color(255, 0, 0));
        Scores.setText("0");
        getContentPane().add(Scores, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 90, 30));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("SCORE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Snake");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 130, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 141, 47));
        jLabel2.setText("M.H GAMES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int x = 100;
int y =100;
 final int size = 16;
boolean running= true;
boolean  left, up , down = false;
boolean right = true;
ArrayList<playingarea> snake = new ArrayList<playingarea>();
playingarea pl;

class mainprogram extends SwingWorker<Void,Void>{

        @Override
        protected Void doInBackground() throws Exception {
           
            while(running){


repaint();}

            
        return null;
        }
        }

void check(){
int no=0 ;
    for(int i = 0; i<snake.size()-1;i++){
 
 if(i>4){
 no+=5;
 }
        if(eaten(snake.get(snake.size()-1).getRect(),snake.get(i).getRect())){
 running = false;
 jLayeredPane1.setVisible(true);
 
 repaint();
 return ;
 
 }
 
 }
    Scores.setText(String.valueOf(no));

}
    
 //Rectangle2D rect ;
 void snakeadd(){
 
 if(snake.size()==0){
 pl = new playingarea(x,y,size,size);
 }
 else{
     int fx = 0 , fy = 0;
     if(right){
     fx = snake.get(0).getX()-20;
     fy=snake.get(0).getY();
     
     }
     if(left){
     fx = snake.get(0).getX()+20;
     fy=snake.get(0).getY();
     
     }
     if(up){
     fx = snake.get(0).getX();
     fy=snake.get(0).getY()+20;
     
     }
     if(down){
     fx = snake.get(0).getX();
     fy=snake.get(0).getY()-20;
     
     }
     
     
     pl = new playingarea(fx,fy,size,size);
 
 }
   
 snake.add(0, pl);
 }
 
@Override
public void paint(java.awt.Graphics fs){

    
    int i = snake.size()-1;
   if(i>4){
   check();
   }
    super.paint(fs);

    
    Graphics2D g1 = (Graphics2D)fs;  

int fx =snake.get(i).getX();
int fy =snake.get(i).getY();
g1.setColor(Color.GREEN);
if(right){

    int tx = snake.get(i).getX()+size;

    if(tx>jPanel1.getWidth()-5){
    tx=5;
}    
snake.get(i).setX(tx);


}
if(left){
    int tx = snake.get(i).getX()-size;
if(tx<5){tx=jPanel1.getWidth()-5;}    
snake.get(i).setX(tx);
    
}
if(up){
    System.out.println(jPanel1.getY());
   int ty = snake.get(i).getY()-size;
if(ty<75){
  
    ty= jPanel1.getY()+jPanel1.getHeight();} 
    snake.get(i).setY(ty);
}
if(down){
   int ty = snake.get(i).getY()+size;
if(ty>jPanel1.getY()+jPanel1.getHeight()){
    System.out.println("height");
    ty=75;} 
    snake.get(i).setY(ty);
}


snake.get(i).draw(g1,Color.GREEN);

apple(g1);




for(int u = snake.size()-2;u>=0;u--){

int ex = snake.get(u).getX();
int ey = snake.get(u).getY();

snake.get(u).setX(fx);
snake.get(u).setY(fy);
fx = ex;
fy = ey;
snake.get(u).draw(g1,Color.RED);
}


try{
Thread.sleep(100);
}catch(InterruptedException e ){}


}


int so=0;
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
System.out.println(evt.getY());

   //   repaint();  
    }//GEN-LAST:event_formMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged


        
// TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged
 boolean eaten(Rectangle2D rd , Rectangle2D re){
 return  rd.intersects(re);
 
 }
    
    Rectangle2D rectangle ;
    void apple(Graphics2D gd){
  java.util.Random r = new Random();
  int ty;
  int tx;
  gd.setColor(Color.BLUE);
  if(rectangle== null||eaten(snake.get(snake.size()-1).getRect(),rectangle)){
 
    ty=  r.nextInt((jPanel1.getHeight()-jPanel1.getY())-75)+75;
  
    tx=  r.nextInt((jPanel1.getWidth()-5)-5)+5;
    System.out.println("X: " + tx);
    System.out.println("Y: " + ty);
  
if(rectangle!=null&&eaten(snake.get(snake.size()-1).getRect(),rectangle)){
 
      snakeadd();
  }
  
  rectangle  =  new Rectangle2D.Double(tx, ty, size, size);
  }
 
  gd.fill(rectangle);

 }
    
    
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if(evt.getKeyCode()==39&&!left){//right
right = true;

up =false;
down = false;
} 
        
      if(evt.getKeyCode()==37&&!right){//left

left = true;
up =false;
down = false;

} 
           if(evt.getKeyCode()==40&&!up){//down
right = false;
left = false;
up =false;
down = true;

} 
                      if(evt.getKeyCode()==38&&!down){//up
right = false;
left = false;
up =true;
//down = false;

} 
           
    }//GEN-LAST:event_formKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
new Graphic().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Scores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
