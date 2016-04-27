
import java.awt.*;
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
public class vennQuizPanel extends javax.swing.JPanel {

    String name;
    int scoreCount, failCount;
    int elapsedSeconds = 30;

    Timer Vtimer = new Timer(1000, new TimerListener());

    class TimerListener implements ActionListener {

        public void actionPerformed(ActionEvent evt) {
            elapsedSeconds--;
            vennTimer.setText(String.valueOf(elapsedSeconds));
            if (elapsedSeconds == 0) {
                Vtimer.stop();
                vennTimer.setVisible(false);
                LayoutManager layout = getParent().getLayout();
                if (layout instanceof CardLayout) {
                    CardLayout cl = (CardLayout) layout;
                    cl.show(getParent(), "quizOverview");
                }
                JOptionPane.showMessageDialog(null, "Time is up. The Quiz is over.");
                //Quiz Component Reset
                scoreLbl.setText("");
                failLbl.setText("");
                scoreCount = 0;
                failCount = 0;
                startQuizBtn.setVisible(true);
                preStartTF.setVisible(true);
                preQuizIcon.setVisible(true);
                questionTitle1.setVisible(false);
                questionTitle2.setVisible(false);
                questionTitle3.setVisible(false);
                questionTitle4.setVisible(false);
                questionTitle5.setVisible(false);
                vennDiagram.setVisible(false);
                checkIcon.setVisible(false);
                failIcon.setVisible(false);
                answersLbl.setVisible(false);
                Ques1radioBtn1.setVisible(false);
                Ques1radioBtn2.setVisible(false);
                Ques1radioBtn3.setVisible(false);
                nxtQuesBtn1.setVisible(false);
                nxtQuesBtn2.setVisible(false);
                nxtQuesBtn3.setVisible(false);
                nxtQuesBtn4.setVisible(false);
                quizFinishBtn.setVisible(false);
                ques1Ans1.setVisible(false);
                ques1Ans2.setVisible(false);
                ques1Ans3.setVisible(false);
                ques2Ans1.setVisible(false);
                ques2Ans2.setVisible(false);
                ques2Ans3.setVisible(false);
                ques3Ans1.setVisible(false);
                ques3Ans2.setVisible(false);
                ques3Ans3.setVisible(false);
                ques4Ans1.setVisible(false);
                ques4Ans2.setVisible(false);
                ques4Ans3.setVisible(false);
                ques5Ans1.setVisible(false);
                ques5Ans2.setVisible(false);
                ques5Ans3.setVisible(false);

            }
        }

    }

    /**
     * Creates new form vennQuizPanel
     */
    public vennQuizPanel() {
        initComponents();
        scoreCount = 0;
        failCount = 0;

        //startQuizBtn Icon changes on hover
        startQuizBtn.setRolloverIcon(new ImageIcon("GUIImages\\MathsPanelGUI\\startQuizBtnHoverPressed.png"));
        startQuizBtn.setSelectedIcon(new ImageIcon("GUIImages\\MathsPanelGUI\\startQuizBtnHoverPressed.png"));

        //Back Icon changes on hover
        backBtn.setRolloverIcon(new ImageIcon("GUIImages\\miniBackBtnHoverPressed.png"));
        backBtn.setSelectedIcon(new ImageIcon("GUIImages\\miniBackBtnHoverPressed.png"));

        //miniCloseBtn Icon changes on hover
        miniCloseBtn.setRolloverIcon(new ImageIcon("GUIImages\\miniCloseBtnHoverPressed.png"));
        miniCloseBtn.setSelectedIcon(new ImageIcon("GUIImages\\miniCloseBtnHoverPressed.png"));

        //radioBtn Icons change on hover
        Ques1radioBtn1.setRolloverIcon(new ImageIcon("GUIIMages\\MathsPanelGUI\\radioBtnHoverPressed.png"));
        Ques1radioBtn1.setSelectedIcon(new ImageIcon("GUIIMages\\MathsPanelGUI\\radioBtnHoverPressed.png"));
        Ques1radioBtn2.setRolloverIcon(new ImageIcon("GUIIMages\\MathsPanelGUI\\radioBtnHoverPressed.png"));
        Ques1radioBtn2.setSelectedIcon(new ImageIcon("GUIIMages\\MathsPanelGUI\\radioBtnHoverPressed.png"));
        Ques1radioBtn3.setRolloverIcon(new ImageIcon("GUIIMages\\MathsPanelGUI\\radioBtnHoverPressed.png"));
        Ques1radioBtn3.setSelectedIcon(new ImageIcon("GUIIMages\\MathsPanelGUI\\radioBtnHoverPressed.png"));

        //Initial Quiz Element Visiblities 
        questionTitle1.setVisible(false);
        questionTitle2.setVisible(false);
        questionTitle3.setVisible(false);
        questionTitle4.setVisible(false);
        questionTitle5.setVisible(false);
        vennDiagram.setVisible(false);
        checkIcon.setVisible(false);
        failIcon.setVisible(false);
        answersLbl.setVisible(false);
        Ques1radioBtn1.setVisible(false);
        Ques1radioBtn2.setVisible(false);
        Ques1radioBtn3.setVisible(false);
        nxtQuesBtn1.setVisible(false);
        nxtQuesBtn2.setVisible(false);
        nxtQuesBtn3.setVisible(false);
        nxtQuesBtn4.setVisible(false);
        quizFinishBtn.setVisible(false);
        ques1Ans1.setVisible(false);
        ques1Ans2.setVisible(false);
        ques1Ans3.setVisible(false);
        ques2Ans1.setVisible(false);
        ques2Ans2.setVisible(false);
        ques2Ans3.setVisible(false);
        ques3Ans1.setVisible(false);
        ques3Ans2.setVisible(false);
        ques3Ans3.setVisible(false);
        ques4Ans1.setVisible(false);
        ques4Ans2.setVisible(false);
        ques4Ans3.setVisible(false);
        ques5Ans1.setVisible(false);
        ques5Ans2.setVisible(false);
        ques5Ans3.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        preQuizIcon = new javax.swing.JLabel();
        preStartTF = new javax.swing.JTextArea();
        vennDiagram = new javax.swing.JLabel();
        answersLbl = new javax.swing.JLabel();
        questionTitle5 = new javax.swing.JLabel();
        questionTitle4 = new javax.swing.JLabel();
        questionTitle3 = new javax.swing.JLabel();
        questionTitle2 = new javax.swing.JLabel();
        questionTitle1 = new javax.swing.JLabel();
        ques5Ans3 = new javax.swing.JLabel();
        ques5Ans2 = new javax.swing.JLabel();
        ques5Ans1 = new javax.swing.JLabel();
        ques4Ans3 = new javax.swing.JLabel();
        ques4Ans2 = new javax.swing.JLabel();
        ques4Ans1 = new javax.swing.JLabel();
        ques3Ans3 = new javax.swing.JLabel();
        ques3Ans2 = new javax.swing.JLabel();
        ques3Ans1 = new javax.swing.JLabel();
        ques2Ans3 = new javax.swing.JLabel();
        ques2Ans2 = new javax.swing.JLabel();
        ques2Ans1 = new javax.swing.JLabel();
        ques1Ans3 = new javax.swing.JLabel();
        ques1Ans2 = new javax.swing.JLabel();
        ques1Ans1 = new javax.swing.JLabel();
        vennTimer = new javax.swing.JLabel();
        failLbl = new javax.swing.JLabel();
        failIcon = new javax.swing.JLabel();
        scoreLbl = new javax.swing.JLabel();
        checkIcon = new javax.swing.JLabel();
        quizFinishBtn = new javax.swing.JButton();
        nxtQuesBtn4 = new javax.swing.JButton();
        nxtQuesBtn3 = new javax.swing.JButton();
        nxtQuesBtn2 = new javax.swing.JButton();
        nxtQuesBtn1 = new javax.swing.JButton();
        startQuizBtn = new javax.swing.JButton();
        miniCloseBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        Ques1radioBtn1 = new javax.swing.JRadioButton();
        Ques1radioBtn2 = new javax.swing.JRadioButton();
        Ques1radioBtn3 = new javax.swing.JRadioButton();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        preQuizIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/preQuizIcon.png"))); // NOI18N
        add(preQuizIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        preStartTF.setBackground(new java.awt.Color(0, 51, 102));
        preStartTF.setColumns(20);
        preStartTF.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        preStartTF.setForeground(new java.awt.Color(255, 255, 255));
        preStartTF.setRows(5);
        preStartTF.setText("You have 30 seconds to complete \nthis quiz on Venn Diagrams.\n\nThere are 5 Questions.");
        preStartTF.setCaretColor(new java.awt.Color(0, 51, 102));
        preStartTF.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        add(preStartTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 310, 320, -1));

        vennDiagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/vennQuizDiagram.png"))); // NOI18N
        add(vennDiagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        answersLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        answersLbl.setForeground(new java.awt.Color(255, 255, 255));
        answersLbl.setText("Answers");
        add(answersLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        questionTitle5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        questionTitle5.setForeground(new java.awt.Color(255, 255, 255));
        questionTitle5.setText("Q5. What is \"A u b - C\" ?");
        add(questionTitle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        questionTitle4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        questionTitle4.setForeground(new java.awt.Color(255, 255, 255));
        questionTitle4.setText("Q4. What is \"A - B n C\" ?");
        add(questionTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        questionTitle3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        questionTitle3.setForeground(new java.awt.Color(255, 255, 255));
        questionTitle3.setText("Q3. What is 'A n B u C' ?");
        add(questionTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        questionTitle2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        questionTitle2.setForeground(new java.awt.Color(255, 255, 255));
        questionTitle2.setText("Q2. What is 'A u B' ?");
        add(questionTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        questionTitle1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        questionTitle1.setForeground(new java.awt.Color(255, 255, 255));
        questionTitle1.setText("Q1. What is \"A n B\" ?");
        add(questionTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        ques5Ans3.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques5Ans3.setForeground(new java.awt.Color(255, 255, 255));
        ques5Ans3.setText("{1, 2, 3, 4, 8, 9, 10}");
        add(ques5Ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        ques5Ans2.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques5Ans2.setForeground(new java.awt.Color(255, 255, 255));
        ques5Ans2.setText("{1, 2, 3, 8, 9, 10}");
        add(ques5Ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        ques5Ans1.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques5Ans1.setForeground(new java.awt.Color(255, 255, 255));
        ques5Ans1.setText("{1, 2, 3, 6, 7, 8, 9, 10}");
        add(ques5Ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        ques4Ans3.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques4Ans3.setForeground(new java.awt.Color(255, 255, 255));
        ques4Ans3.setText("{1, 3, 4}");
        add(ques4Ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        ques4Ans2.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques4Ans2.setForeground(new java.awt.Color(255, 255, 255));
        ques4Ans2.setText("{1, 3, 4, 5, 6, 7}");
        add(ques4Ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        ques4Ans1.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques4Ans1.setForeground(new java.awt.Color(255, 255, 255));
        ques4Ans1.setText("{1, 3, 4, 7}");
        add(ques4Ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        ques3Ans3.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques3Ans3.setForeground(new java.awt.Color(255, 255, 255));
        ques3Ans3.setText("{2, 4, 5, 9}");
        add(ques3Ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        ques3Ans2.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques3Ans2.setForeground(new java.awt.Color(255, 255, 255));
        ques3Ans2.setText("{2, 5, 9}");
        add(ques3Ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        ques3Ans1.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques3Ans1.setForeground(new java.awt.Color(255, 255, 255));
        ques3Ans1.setText("{2, 4, 5, 6, 7, 9}");
        add(ques3Ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        ques2Ans3.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques2Ans3.setForeground(new java.awt.Color(255, 255, 255));
        ques2Ans3.setText("{1, 2, 3, 8, 9, 10}");
        add(ques2Ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        ques2Ans2.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques2Ans2.setForeground(new java.awt.Color(255, 255, 255));
        ques2Ans2.setText("{1, 2, 3, 7, 8, 9, 10}");
        add(ques2Ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        ques2Ans1.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques2Ans1.setForeground(new java.awt.Color(255, 255, 255));
        ques2Ans1.setText("{1, 2, 3, 7, 9}");
        add(ques2Ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        ques1Ans3.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques1Ans3.setForeground(new java.awt.Color(255, 255, 255));
        ques1Ans3.setText("{2, 4, 7, 9}");
        add(ques1Ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        ques1Ans2.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques1Ans2.setForeground(new java.awt.Color(255, 255, 255));
        ques1Ans2.setText("{2, 7, 9}");
        add(ques1Ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        ques1Ans1.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        ques1Ans1.setForeground(new java.awt.Color(255, 255, 255));
        ques1Ans1.setText("{2, 9}");
        add(ques1Ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        vennTimer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        vennTimer.setForeground(new java.awt.Color(255, 255, 255));
        add(vennTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, -1, -1));

        failLbl.setBackground(new java.awt.Color(255, 255, 255));
        failLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        failLbl.setForeground(new java.awt.Color(255, 255, 255));
        add(failLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, 30));

        failIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/quizFail.png"))); // NOI18N
        add(failIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, -1, -1));

        scoreLbl.setBackground(new java.awt.Color(255, 255, 255));
        scoreLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scoreLbl.setForeground(new java.awt.Color(255, 255, 255));
        add(scoreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 552, -1, 30));

        checkIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/quizCheck.png"))); // NOI18N
        add(checkIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        quizFinishBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/quizFinishBtnDefault.png"))); // NOI18N
        quizFinishBtn.setContentAreaFilled(false);
        quizFinishBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quizFinishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizFinishBtnActionPerformed(evt);
            }
        });
        add(quizFinishBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 200, 50));

        nxtQuesBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/nxtQuesBtnDefault.png"))); // NOI18N
        nxtQuesBtn4.setContentAreaFilled(false);
        nxtQuesBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nxtQuesBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtQuesBtn4ActionPerformed(evt);
            }
        });
        add(nxtQuesBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 200, 50));

        nxtQuesBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/nxtQuesBtnDefault.png"))); // NOI18N
        nxtQuesBtn3.setContentAreaFilled(false);
        nxtQuesBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nxtQuesBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtQuesBtn3ActionPerformed(evt);
            }
        });
        add(nxtQuesBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 200, 50));

        nxtQuesBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/nxtQuesBtnDefault.png"))); // NOI18N
        nxtQuesBtn2.setContentAreaFilled(false);
        nxtQuesBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nxtQuesBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtQuesBtn2ActionPerformed(evt);
            }
        });
        add(nxtQuesBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 200, 50));

        nxtQuesBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/nxtQuesBtnDefault.png"))); // NOI18N
        nxtQuesBtn1.setContentAreaFilled(false);
        nxtQuesBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nxtQuesBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtQuesBtn1ActionPerformed(evt);
            }
        });
        add(nxtQuesBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 200, 50));

        startQuizBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/startQuizBtnDefault.png"))); // NOI18N
        startQuizBtn.setContentAreaFilled(false);
        startQuizBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startQuizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startQuizBtnActionPerformed(evt);
            }
        });
        add(startQuizBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 200, 50));

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

        buttonGroup1.add(Ques1radioBtn1);
        Ques1radioBtn1.setContentAreaFilled(false);
        Ques1radioBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/radioBtnDefault.png"))); // NOI18N
        add(Ques1radioBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 50));

        buttonGroup1.add(Ques1radioBtn2);
        Ques1radioBtn2.setContentAreaFilled(false);
        Ques1radioBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/radioBtnDefault.png"))); // NOI18N
        add(Ques1radioBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 50));

        buttonGroup1.add(Ques1radioBtn3);
        Ques1radioBtn3.setContentAreaFilled(false);
        Ques1radioBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/radioBtnDefault.png"))); // NOI18N
        add(Ques1radioBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/Background.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void miniCloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniCloseBtnActionPerformed
        // TODO add your handling code here:
        File f = new File("understanding.txt");
        f.delete();

        System.exit(0);
    }//GEN-LAST:event_miniCloseBtnActionPerformed

    private void startQuizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startQuizBtnActionPerformed
        // TODO add your handling code here:
        scoreLbl.setText("");
        failLbl.setText("");
        scoreCount = 0;
        failCount = 0;
        questionTitle1.setVisible(true);
        vennDiagram.setVisible(true);
        checkIcon.setVisible(true);
        failIcon.setVisible(true);
        startQuizBtn.setVisible(false);
        preStartTF.setVisible(false);
        preQuizIcon.setVisible(false);
        backBtn.setVisible(false);
        answersLbl.setVisible(true);
        Ques1radioBtn1.setVisible(true);
        Ques1radioBtn2.setVisible(true);
        Ques1radioBtn3.setVisible(true);
        nxtQuesBtn1.setVisible(true);
        ques1Ans1.setVisible(true);
        ques1Ans2.setVisible(true);
        ques1Ans3.setVisible(true);
        Vtimer.start();
        vennTimer.setVisible(true);
        elapsedSeconds = 30;
    }//GEN-LAST:event_startQuizBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "vennDiagrams");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void nxtQuesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtQuesBtn1ActionPerformed
        // TODO add your handling code here:
        if (Ques1radioBtn1.isSelected()) {
            scoreCount++;
            scoreLbl.setText(String.valueOf(scoreCount));
            questionTitle1.setVisible(false);
            nxtQuesBtn1.setVisible(false);
            ques1Ans1.setVisible(false);
            ques1Ans2.setVisible(false);
            ques1Ans3.setVisible(false);
            questionTitle2.setVisible(true);
            nxtQuesBtn2.setVisible(true);
            ques2Ans1.setVisible(true);
            ques2Ans2.setVisible(true);
            ques2Ans3.setVisible(true);
        } else if (Ques1radioBtn2.isSelected()) {
            failCount++;
            failLbl.setText(String.valueOf(failCount));
            questionTitle1.setVisible(false);
            nxtQuesBtn1.setVisible(false);
            ques1Ans1.setVisible(false);
            ques1Ans2.setVisible(false);
            ques1Ans3.setVisible(false);
            questionTitle2.setVisible(true);
            nxtQuesBtn2.setVisible(true);
            ques2Ans1.setVisible(true);
            ques2Ans2.setVisible(true);
            ques2Ans3.setVisible(true);

        } else if (Ques1radioBtn3.isSelected()) {
            failCount++;
            failLbl.setText(String.valueOf(failCount));
            questionTitle1.setVisible(false);
            nxtQuesBtn1.setVisible(false);
            ques1Ans1.setVisible(false);
            ques1Ans2.setVisible(false);
            ques1Ans3.setVisible(false);
            questionTitle2.setVisible(true);
            nxtQuesBtn2.setVisible(true);
            ques2Ans1.setVisible(true);
            ques2Ans2.setVisible(true);
            ques2Ans3.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "You must pick a choice to continue");
        }
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_nxtQuesBtn1ActionPerformed

    private void nxtQuesBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtQuesBtn2ActionPerformed
        // TODO add your handling code here:
        if (Ques1radioBtn1.isSelected()) {
            failCount++;
            failLbl.setText(String.valueOf(failCount));
            questionTitle2.setVisible(false);
            nxtQuesBtn2.setVisible(false);
            ques2Ans1.setVisible(false);
            ques2Ans2.setVisible(false);
            ques2Ans3.setVisible(false);
            questionTitle3.setVisible(true);
            nxtQuesBtn3.setVisible(true);
            ques3Ans1.setVisible(true);
            ques3Ans2.setVisible(true);
            ques3Ans3.setVisible(true);
        } else if (Ques1radioBtn2.isSelected()) {
            scoreCount++;
            scoreLbl.setText(String.valueOf(scoreCount));
            questionTitle2.setVisible(false);
            nxtQuesBtn2.setVisible(false);
            ques2Ans1.setVisible(false);
            ques2Ans2.setVisible(false);
            ques2Ans3.setVisible(false);
            questionTitle3.setVisible(true);
            nxtQuesBtn3.setVisible(true);
            ques3Ans1.setVisible(true);
            ques3Ans2.setVisible(true);
            ques3Ans3.setVisible(true);

        } else if (Ques1radioBtn3.isSelected()) {
            failCount++;
            failLbl.setText(String.valueOf(failCount));
            questionTitle2.setVisible(false);
            nxtQuesBtn2.setVisible(false);
            ques2Ans1.setVisible(false);
            ques2Ans2.setVisible(false);
            ques2Ans3.setVisible(false);
            questionTitle3.setVisible(true);
            nxtQuesBtn3.setVisible(true);
            ques3Ans1.setVisible(true);
            ques3Ans2.setVisible(true);
            ques3Ans3.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "You must pick a choice to continue");
        }
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_nxtQuesBtn2ActionPerformed

    private void nxtQuesBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtQuesBtn3ActionPerformed
        // TODO add your handling code here:
        if (Ques1radioBtn1.isSelected()) {
            scoreCount++;
            scoreLbl.setText(String.valueOf(scoreCount));
            questionTitle3.setVisible(false);
            nxtQuesBtn3.setVisible(false);
            ques3Ans1.setVisible(false);
            ques3Ans2.setVisible(false);
            ques3Ans3.setVisible(false);
            questionTitle4.setVisible(true);
            nxtQuesBtn4.setVisible(true);
            ques4Ans1.setVisible(true);
            ques4Ans2.setVisible(true);
            ques4Ans3.setVisible(true);
        } else if (Ques1radioBtn2.isSelected()) {
            failCount++;
            failLbl.setText(String.valueOf(failCount));
            questionTitle3.setVisible(false);
            nxtQuesBtn3.setVisible(false);
            ques3Ans1.setVisible(false);
            ques3Ans2.setVisible(false);
            ques3Ans3.setVisible(false);
            questionTitle2.setVisible(true);
            nxtQuesBtn4.setVisible(true);
            ques4Ans1.setVisible(true);
            ques4Ans2.setVisible(true);
            ques4Ans3.setVisible(true);

        } else if (Ques1radioBtn3.isSelected()) {
            failCount++;
            failLbl.setText(String.valueOf(failCount));
            questionTitle3.setVisible(false);
            nxtQuesBtn3.setVisible(false);
            ques3Ans1.setVisible(false);
            ques3Ans2.setVisible(false);
            ques3Ans3.setVisible(false);
            questionTitle4.setVisible(true);
            nxtQuesBtn4.setVisible(true);
            ques4Ans1.setVisible(true);
            ques4Ans2.setVisible(true);
            ques4Ans3.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "You must pick a choice to continue");
        }
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_nxtQuesBtn3ActionPerformed

    private void nxtQuesBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtQuesBtn4ActionPerformed
        // TODO add your handling code here:
        if (Ques1radioBtn1.isSelected()) {
            failCount++;
            failLbl.setText(String.valueOf(failCount));
            questionTitle4.setVisible(false);
            nxtQuesBtn4.setVisible(false);
            ques4Ans1.setVisible(false);
            ques4Ans2.setVisible(false);
            ques4Ans3.setVisible(false);
            questionTitle5.setVisible(true);
            quizFinishBtn.setVisible(true);
            ques2Ans1.setVisible(true);
            ques2Ans2.setVisible(true);
            ques2Ans3.setVisible(true);

        } else if (Ques1radioBtn2.isSelected()) {
            failCount++;
            failLbl.setText(String.valueOf(failCount));
            questionTitle4.setVisible(false);
            nxtQuesBtn4.setVisible(false);
            ques4Ans1.setVisible(false);
            ques4Ans2.setVisible(false);
            ques4Ans3.setVisible(false);
            questionTitle5.setVisible(true);
            quizFinishBtn.setVisible(true);
            ques5Ans1.setVisible(true);
            ques5Ans2.setVisible(true);
            ques5Ans3.setVisible(true);

        } else if (Ques1radioBtn3.isSelected()) {
            scoreCount++;
            scoreLbl.setText(String.valueOf(scoreCount));
            questionTitle4.setVisible(false);
            nxtQuesBtn4.setVisible(false);
            ques4Ans1.setVisible(false);
            ques4Ans2.setVisible(false);
            ques4Ans3.setVisible(false);
            questionTitle5.setVisible(true);
            quizFinishBtn.setVisible(true);
            ques5Ans1.setVisible(true);
            ques5Ans2.setVisible(true);
            ques5Ans3.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "You must pick a choice to continue");
        }
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_nxtQuesBtn4ActionPerformed

    private void quizFinishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizFinishBtnActionPerformed
        // TODO add your handling code here:
        if (Ques1radioBtn1.isSelected()) {
            failCount++;
            failLbl.setText(String.valueOf(failCount));
            questionTitle5.setVisible(false);
            quizFinishBtn.setVisible(false);
            ques4Ans1.setVisible(false);
            ques4Ans2.setVisible(false);
            ques4Ans3.setVisible(false);
            Vtimer.stop();

            vennTimer.setVisible(false);
            //Quiz Component Reset
            scoreLbl.setText("");
            failLbl.setText("");
            startQuizBtn.setVisible(true);
            preStartTF.setVisible(true);
            preQuizIcon.setVisible(true);
            questionTitle1.setVisible(false);
            questionTitle2.setVisible(false);
            questionTitle3.setVisible(false);
            questionTitle4.setVisible(false);
            questionTitle5.setVisible(false);
            vennDiagram.setVisible(false);
            checkIcon.setVisible(false);
            failIcon.setVisible(false);
            answersLbl.setVisible(false);
            Ques1radioBtn1.setVisible(false);
            Ques1radioBtn2.setVisible(false);
            Ques1radioBtn3.setVisible(false);
            nxtQuesBtn1.setVisible(false);
            nxtQuesBtn2.setVisible(false);
            nxtQuesBtn3.setVisible(false);
            nxtQuesBtn4.setVisible(false);
            quizFinishBtn.setVisible(false);
            ques1Ans1.setVisible(false);
            ques1Ans2.setVisible(false);
            ques1Ans3.setVisible(false);
            ques2Ans1.setVisible(false);
            ques2Ans2.setVisible(false);
            ques2Ans3.setVisible(false);
            ques3Ans1.setVisible(false);
            ques3Ans2.setVisible(false);
            ques3Ans3.setVisible(false);
            ques4Ans1.setVisible(false);
            ques4Ans2.setVisible(false);
            ques4Ans3.setVisible(false);
            ques5Ans1.setVisible(false);
            ques5Ans2.setVisible(false);
            ques5Ans3.setVisible(false);

            buttonGroup1.clearSelection();

            LayoutManager layout = getParent().getLayout();
            if (layout instanceof CardLayout) {
                CardLayout cl = (CardLayout) layout;
                cl.show(getParent(), "quizOverview");
            }
        } else if (Ques1radioBtn2.isSelected()) {
            scoreCount++;
            scoreLbl.setText(String.valueOf(scoreCount));
            questionTitle4.setVisible(false);
            nxtQuesBtn1.setVisible(false);
            ques4Ans1.setVisible(false);
            ques4Ans2.setVisible(false);
            ques4Ans3.setVisible(false);

            vennTimer.setVisible(false);
            //Quiz Component Reset
            scoreLbl.setText("");
            failLbl.setText("");
            startQuizBtn.setVisible(true);
            preStartTF.setVisible(true);
            preQuizIcon.setVisible(true);
            questionTitle1.setVisible(false);
            questionTitle2.setVisible(false);
            questionTitle3.setVisible(false);
            questionTitle4.setVisible(false);
            questionTitle5.setVisible(false);
            vennDiagram.setVisible(false);
            checkIcon.setVisible(false);
            failIcon.setVisible(false);
            answersLbl.setVisible(false);
            Ques1radioBtn1.setVisible(false);
            Ques1radioBtn2.setVisible(false);
            Ques1radioBtn3.setVisible(false);
            nxtQuesBtn1.setVisible(false);
            nxtQuesBtn2.setVisible(false);
            nxtQuesBtn3.setVisible(false);
            nxtQuesBtn4.setVisible(false);
            quizFinishBtn.setVisible(false);
            ques1Ans1.setVisible(false);
            ques1Ans2.setVisible(false);
            ques1Ans3.setVisible(false);
            ques2Ans1.setVisible(false);
            ques2Ans2.setVisible(false);
            ques2Ans3.setVisible(false);
            ques3Ans1.setVisible(false);
            ques3Ans2.setVisible(false);
            ques3Ans3.setVisible(false);
            ques4Ans1.setVisible(false);
            ques4Ans2.setVisible(false);
            ques4Ans3.setVisible(false);
            ques5Ans1.setVisible(false);
            ques5Ans2.setVisible(false);
            ques5Ans3.setVisible(false);

            buttonGroup1.clearSelection();

            Vtimer.stop();
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof CardLayout) {
                CardLayout cl = (CardLayout) layout;
                cl.show(getParent(), "quizOverview");
            }
        } else if (Ques1radioBtn3.isSelected()) {
            failCount++;
            failLbl.setText(String.valueOf(failCount));
            questionTitle4.setVisible(false);
            nxtQuesBtn1.setVisible(false);
            ques4Ans1.setVisible(false);
            ques4Ans2.setVisible(false);
            ques4Ans3.setVisible(false);

            vennTimer.setVisible(false);
            //Quiz Component Reset
            scoreLbl.setText("");
            failLbl.setText("");
            startQuizBtn.setVisible(true);
            preStartTF.setVisible(true);
            preQuizIcon.setVisible(true);
            questionTitle1.setVisible(false);
            questionTitle2.setVisible(false);
            questionTitle3.setVisible(false);
            questionTitle4.setVisible(false);
            questionTitle5.setVisible(false);
            vennDiagram.setVisible(false);
            checkIcon.setVisible(false);
            failIcon.setVisible(false);
            answersLbl.setVisible(false);
            Ques1radioBtn1.setVisible(false);
            Ques1radioBtn2.setVisible(false);
            Ques1radioBtn3.setVisible(false);
            nxtQuesBtn1.setVisible(false);
            nxtQuesBtn2.setVisible(false);
            nxtQuesBtn3.setVisible(false);
            nxtQuesBtn4.setVisible(false);
            quizFinishBtn.setVisible(false);
            ques1Ans1.setVisible(false);
            ques1Ans2.setVisible(false);
            ques1Ans3.setVisible(false);
            ques2Ans1.setVisible(false);
            ques2Ans2.setVisible(false);
            ques2Ans3.setVisible(false);
            ques3Ans1.setVisible(false);
            ques3Ans2.setVisible(false);
            ques3Ans3.setVisible(false);
            ques4Ans1.setVisible(false);
            ques4Ans2.setVisible(false);
            ques4Ans3.setVisible(false);
            ques5Ans1.setVisible(false);
            ques5Ans2.setVisible(false);
            ques5Ans3.setVisible(false);

            buttonGroup1.clearSelection();

            Vtimer.stop();
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof CardLayout) {
                CardLayout cl = (CardLayout) layout;
                cl.show(getParent(), "quizOverview");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must pick a choice to continue");
        }

    }//GEN-LAST:event_quizFinishBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton Ques1radioBtn1;
    public javax.swing.JRadioButton Ques1radioBtn2;
    public javax.swing.JRadioButton Ques1radioBtn3;
    public javax.swing.JLabel answersLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel checkIcon;
    private javax.swing.JLabel failIcon;
    public javax.swing.JLabel failLbl;
    private javax.swing.JButton miniCloseBtn;
    public javax.swing.JButton nxtQuesBtn1;
    public javax.swing.JButton nxtQuesBtn2;
    public javax.swing.JButton nxtQuesBtn3;
    public javax.swing.JButton nxtQuesBtn4;
    private javax.swing.JLabel preQuizIcon;
    private javax.swing.JTextArea preStartTF;
    public javax.swing.JLabel ques1Ans1;
    public javax.swing.JLabel ques1Ans2;
    public javax.swing.JLabel ques1Ans3;
    public javax.swing.JLabel ques2Ans1;
    public javax.swing.JLabel ques2Ans2;
    public javax.swing.JLabel ques2Ans3;
    public javax.swing.JLabel ques3Ans1;
    public javax.swing.JLabel ques3Ans2;
    public javax.swing.JLabel ques3Ans3;
    public javax.swing.JLabel ques4Ans1;
    public javax.swing.JLabel ques4Ans2;
    public javax.swing.JLabel ques4Ans3;
    public javax.swing.JLabel ques5Ans1;
    public javax.swing.JLabel ques5Ans2;
    public javax.swing.JLabel ques5Ans3;
    public javax.swing.JLabel questionTitle1;
    public javax.swing.JLabel questionTitle2;
    public javax.swing.JLabel questionTitle3;
    public javax.swing.JLabel questionTitle4;
    public javax.swing.JLabel questionTitle5;
    public javax.swing.JButton quizFinishBtn;
    public javax.swing.JLabel scoreLbl;
    public javax.swing.JButton startQuizBtn;
    public javax.swing.JLabel vennDiagram;
    private javax.swing.JLabel vennTimer;
    // End of variables declaration//GEN-END:variables
}
