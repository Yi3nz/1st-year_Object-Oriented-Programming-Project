
import java.awt.CardLayout;
import java.awt.LayoutManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class combExamplesPanel extends javax.swing.JPanel {

    /**
     * Creates new form combExamplesPanel
     */
    public combExamplesPanel() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        DescriptiveStatistic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5,040");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("4! = 4 × 3 × 2 × 1 = 24");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/BackBtnDefault.png"))); // NOI18N
        backBtn.setContentAreaFilled(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 523, 100, 80));

        DescriptiveStatistic.setBackground(new java.awt.Color(102, 51, 255));
        DescriptiveStatistic.setFont(new java.awt.Font("Tekton Pro", 0, 44)); // NOI18N
        DescriptiveStatistic.setForeground(new java.awt.Color(153, 0, 204));
        DescriptiveStatistic.setText("Comb&Permut");
        add(DescriptiveStatistic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(" \t  The factorial function (symbol: !) just means to multiply ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("a series of descending natural numbers. Examples:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("1! = 1");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("but it helps simplify a lot of equations.");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("It may seem funny that multiplying no numbers together ");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("It is generally agreed that 0! = 1. ");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel23.setText("Note:");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("gets us 1, ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\05-04-2015\\重新來過呵呵\\quizApp\\GUIImages\\Statistic\\background.png")); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "combination");
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DescriptiveStatistic;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
