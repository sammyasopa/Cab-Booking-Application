

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;



 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smiket
 */
public class Current_Booking extends javax.swing.JFrame {
    static Thread threa=new Thread();
    Timer t = null;
    int k=0;
    /**
     * Creates new form Current_Booking
     */
        public void dis()
{
    this.dispose();
}
    public Current_Booking() {
        initComponents();
        print.setText(""+Book1.namedriver+" is arriving Vehicle ID:"+Book1.vid+"");
        eta.setText("ETA is "+Book1.time+" mins Estimated Fare:"+Book1.etfare+" Distance:"+Integer.toString(Book1.c)+" kms");
        this.setLocationRelativeTo(null);
         currbookingpanel.setBackground(new Color(0,0,0,240));
         travellingfrom.setText(""+Book1.pp+" to "+Book1.dp+"");
         mobby.setText(Book1.mob);
          t = new Timer(1000,new ActionListener(){
                @Override
              
                public void actionPerformed(ActionEvent e) {
                   if(k==5){ t.stop();
                     t =null;
                     new Arrived().setVisible(true); 
                     dis();
                   }
                else{
                   k++;}
                }
            
            
            });
            t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currbookingpanel = new javax.swing.JPanel();
        print = new javax.swing.JLabel();
        eta = new javax.swing.JLabel();
        dis = new javax.swing.JLabel();
        travellingfrom = new javax.swing.JLabel();
        mobby = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(978, 649));
        setUndecorated(true);
        getContentPane().setLayout(null);

        currbookingpanel.setBackground(new java.awt.Color(0, 0, 0));
        currbookingpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        print.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        print.setForeground(new java.awt.Color(240, 240, 240));
        print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print.setText("fhdg");

        eta.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        eta.setForeground(new java.awt.Color(240, 240, 240));
        eta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eta.setText("jLabel1");

        dis.setFont(new java.awt.Font("Sylfaen", 2, 48)); // NOI18N
        dis.setForeground(new java.awt.Color(240, 240, 240));
        dis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dis.setText("Your Cab is Arriving");

        travellingfrom.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        travellingfrom.setForeground(new java.awt.Color(255, 255, 255));
        travellingfrom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        travellingfrom.setText("jLabel2");

        mobby.setFont(new java.awt.Font("LuzSans-Book", 1, 18)); // NOI18N
        mobby.setForeground(new java.awt.Color(255, 255, 255));
        mobby.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("LuzSans-Book", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Driver's Mobile No -");

        javax.swing.GroupLayout currbookingpanelLayout = new javax.swing.GroupLayout(currbookingpanel);
        currbookingpanel.setLayout(currbookingpanelLayout);
        currbookingpanelLayout.setHorizontalGroup(
            currbookingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
            .addComponent(eta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currbookingpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(currbookingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currbookingpanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(mobby)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currbookingpanelLayout.createSequentialGroup()
                        .addComponent(travellingfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        currbookingpanelLayout.setVerticalGroup(
            currbookingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currbookingpanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(dis)
                .addGap(18, 18, 18)
                .addComponent(print)
                .addGap(30, 30, 30)
                .addComponent(eta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(travellingfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(currbookingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobby)
                    .addComponent(jLabel2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(currbookingpanel);
        currbookingpanel.setBounds(180, 110, 570, 330);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Webp.net-resizeimage (2).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1090, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Current_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Current_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Current_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Current_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Current_Booking().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel currbookingpanel;
    public javax.swing.JLabel dis;
    private javax.swing.JLabel eta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mobby;
    private javax.swing.JLabel print;
    private javax.swing.JLabel travellingfrom;
    // End of variables declaration//GEN-END:variables
}
