
import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.io.File;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renalyn
 */
public class plantPanel extends javax.swing.JPanel {
        private final ArrayList <plantJava> aList;
        private String name;
        private String question1;
        private String question2;
        private int count;
    /**
     * Creates new form plantPanel
     */
    public plantPanel() {
        initComponents();
        //ArrayList 
        aList = new ArrayList <>();
        name = new String();
        question1 = new String();
        question2 = new String();
        count = 0;
        
        
      
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plantLbl = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        addQBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        question1Lbl = new javax.swing.JLabel();
        question2Lbl = new javax.swing.JLabel();
        questionTF1 = new javax.swing.JTextField();
        questionTF2 = new javax.swing.JTextField();
        question3Lbl = new javax.swing.JLabel();
        miniCloseBtn = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plantLbl.setFont(new java.awt.Font("AR DELANEY", 0, 24)); // NOI18N
        plantLbl.setForeground(new java.awt.Color(0, 153, 153));
        plantLbl.setText("Plant Structure");
        add(plantLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("AR JULIAN", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 153, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("You can make your own questions to show your knowledge \nabout the structure of a plant. You can then add, display,\nsearch by name and delete your own questions after you gain\nmore knowledge about Plant Structures.\n");
        add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        addQBtn.setBackground(new java.awt.Color(0, 102, 102));
        addQBtn.setFont(new java.awt.Font("AR CARTER", 0, 18)); // NOI18N
        addQBtn.setForeground(new java.awt.Color(0, 51, 51));
        addQBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/addIcon.png"))); // NOI18N
        addQBtn.setContentAreaFilled(false);
        addQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQBtnActionPerformed(evt);
            }
        });
        add(addQBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 120, 100));

        displayBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/displayIcon.png"))); // NOI18N
        displayBtn.setContentAreaFilled(false);
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });
        add(displayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 120, 110));

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/searchIcon.png"))); // NOI18N
        searchBtn.setContentAreaFilled(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 120, 90));

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 220, 30));

        question1Lbl.setFont(new java.awt.Font("AR DELANEY", 0, 24)); // NOI18N
        question1Lbl.setForeground(new java.awt.Color(0, 153, 102));
        question1Lbl.setText("Name:");
        add(question1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 20));

        question2Lbl.setFont(new java.awt.Font("AR DELANEY", 0, 24)); // NOI18N
        question2Lbl.setForeground(new java.awt.Color(0, 153, 102));
        question2Lbl.setText("Question 1:");
        add(question2Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 30));

        questionTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTF1ActionPerformed(evt);
            }
        });
        add(questionTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 220, 30));
        add(questionTF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 220, 30));

        question3Lbl.setFont(new java.awt.Font("AR DELANEY", 0, 24)); // NOI18N
        question3Lbl.setForeground(new java.awt.Color(0, 153, 102));
        question3Lbl.setText("Question 2:");
        add(question3Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 140, 30));

        miniCloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/miniCloseBtnDefault.png"))); // NOI18N
        miniCloseBtn.setContentAreaFilled(false);
        miniCloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miniCloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniCloseBtnActionPerformed(evt);
            }
        });
        add(miniCloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        backBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/miniBackBtnDefault.png"))); // NOI18N
        backBtn1.setContentAreaFilled(false);
        backBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });
        add(backBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/background.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void addQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQBtnActionPerformed
        // Get question from textfield
        name = nameTF.getText();
        question1 = questionTF1.getText();
        question2 = questionTF2.getText();
        
        plantJava a = new plantJava();
        a.setName(name);
        a.setQuestion1(question1);
        a.setQuestion2(question2);
        
        aList.add(a);
        count++; 
    }//GEN-LAST:event_addQBtnActionPerformed
                                      
    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void questionTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionTF1ActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String searchName = JOptionPane.showInputDialog(null,"Please enter the name of what questions you want to search");
        
        for (int i = 0; i < aList.size(); i++){
            if(searchName.equalsIgnoreCase(aList.get(i).getName())){
                JOptionPane.showMessageDialog(null,"Name: " +aList.get(i).getName() +"\n Question 1: " +aList.get(i).getQuestion1() +"\n Question 2: " +aList.get(i).getQuestion2());
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        for (int i = 0; i < aList.size(); i++){
            JOptionPane.showMessageDialog(null, "Name: " +aList.get(i).getName() +"\n Question 1: " + aList.get(i).getQuestion1() + "\n Question 2: " +aList.get(i).getQuestion2());
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void miniCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniCloseBtnActionPerformed
        // TODO add your handling code here:
        File f = new File("understanding.txt");
        f.delete();

        System.exit(0);
    }//GEN-LAST:event_miniCloseBtnActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "biology");
        }
    }//GEN-LAST:event_backBtn1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addQBtn;
    private javax.swing.JButton backBtn1;
    private javax.swing.JLabel background;
    private javax.swing.JButton displayBtn;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton miniCloseBtn;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel plantLbl;
    private javax.swing.JLabel question1Lbl;
    private javax.swing.JLabel question2Lbl;
    private javax.swing.JLabel question3Lbl;
    private javax.swing.JTextField questionTF1;
    private javax.swing.JTextField questionTF2;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
