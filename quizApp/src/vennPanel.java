
import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Seán
 */
public class vennPanel extends javax.swing.JPanel {

    /**
     * Creates new form vennPanel
     */
    public vennPanel() {
        initComponents();
        //Back Icon changes on hover
        backBtn.setRolloverIcon(new ImageIcon("GUIImages\\miniBackBtnHoverPressed.png"));
        backBtn.setSelectedIcon(new ImageIcon("GUIImages\\miniBackBtnHoverPressed.png"));

        //Explanation Icon changes on hover
        explanationBtn.setRolloverIcon(new ImageIcon("GUIImages\\MathsPanelGUI\\explanationBtnHoverPressed.png"));
        explanationBtn.setSelectedIcon(new ImageIcon("GUIImages\\MathsPanelGUI\\explanationBtnHoverPressed.png"));

        //Quiz Icon changes on hover
        quizBtn.setRolloverIcon(new ImageIcon("GUIImages\\MathsPanelGUI\\quizBtnHoverPressed.png"));
        quizBtn.setSelectedIcon(new ImageIcon("GUIImages\\MathsPanelGUI\\quizBtnHoverPressed.png"));

        //miniCloseBtn Icon changes on hover
        miniCloseBtn.setRolloverIcon(new ImageIcon("GUIImages\\miniCloseBtnHoverPressed.png"));
        miniCloseBtn.setSelectedIcon(new ImageIcon("GUIImages\\miniCloseBtnHoverPressed.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miniCloseBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        vennExBanner = new javax.swing.JLabel();
        explanationBtn = new javax.swing.JButton();
        quizBtn = new javax.swing.JButton();
        optionTitle = new javax.swing.JLabel();
        vennFooter = new javax.swing.JLabel();
        background3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miniCloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/miniCloseBtnDefault.png"))); // NOI18N
        miniCloseBtn.setContentAreaFilled(false);
        miniCloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miniCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniCloseBtnActionPerformed(evt);
            }
        });
        add(miniCloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/miniBackBtnDefault.png"))); // NOI18N
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        vennExBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/venExBanner.png"))); // NOI18N
        add(vennExBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        explanationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/explanationBtnDefault.png"))); // NOI18N
        explanationBtn.setContentAreaFilled(false);
        explanationBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        explanationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explanationBtnActionPerformed(evt);
            }
        });
        add(explanationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 398, 100));

        quizBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/quizBtnDefault.png"))); // NOI18N
        quizBtn.setContentAreaFilled(false);
        quizBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizBtnActionPerformed(evt);
            }
        });
        add(quizBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 398, 100));

        optionTitle.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        optionTitle.setForeground(new java.awt.Color(255, 255, 255));
        optionTitle.setText("Select an Option");
        add(optionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        vennFooter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/vennFooter.png"))); // NOI18N
        add(vennFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, -1, -1));

        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/background3.png"))); // NOI18N
        add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
        //Quiz button asks for password input which is aquired through selecting rate5Btn, then navigates to Venn Quiz Panel
    private void quizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizBtnActionPerformed
        // TODO add your handling code here:
        String quizPass;
        quizPass = JOptionPane.showInputDialog(null, "Enter the quiz password");
        if (quizPass.equals("SetOperQuiz")) {
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof CardLayout) {
                CardLayout cl = (CardLayout) layout;
                cl.show(getParent(), "vennQuiz");
            }

        } else {
            JOptionPane.showMessageDialog(null, "You must click the rating scale of 5 in the explanation to acquire the password");
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof CardLayout) {
                CardLayout cl = (CardLayout) layout;
                cl.show(getParent(), "vennDiagrams");
            }
        }
    }//GEN-LAST:event_quizBtnActionPerformed
    //Navigates to the Venn Explanation Panel
    private void explanationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explanationBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "vennEx");
        }
    }//GEN-LAST:event_explanationBtnActionPerformed
    //Closes the application
    private void miniCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniCloseBtnActionPerformed
        // TODO add your handling code here:
        File f = new File("understanding.txt");
        f.delete();

        System.exit(0);
    }//GEN-LAST:event_miniCloseBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "maths");
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel background3;
    private javax.swing.JButton explanationBtn;
    private javax.swing.JButton miniCloseBtn;
    private javax.swing.JLabel optionTitle;
    private javax.swing.JButton quizBtn;
    private javax.swing.JLabel vennExBanner;
    private javax.swing.JLabel vennFooter;
    // End of variables declaration//GEN-END:variables

}
