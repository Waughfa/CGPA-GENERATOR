/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpagenerator;

/**
 *
 * @author waugh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Meoneone extends javax.swing.JFrame {

    /**
     * Creates new form Csetwoone
     */
    int calculation;
    double ans, totalcredit, sum;
    String str1;
    Connection con = null;
    double arrcredit[] = new double[9];
    double arrgrade[] = new double[9];

    public Meoneone() {
        try {
            initComponents();
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Student", "WAUGHFA", "WAUGHFA");
        } catch (SQLException ex) {
            // Logger.getLogger(EnterPassword.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Connection Error", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public Meoneone(String ID) {
        try {
            initComponents();
            str1 = ID;
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Student", "WAUGHFA", "WAUGHFA");
        } catch (SQLException ex) {
            // Logger.getLogger(EnterPassword.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Connection Error", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void arithmetic_operation() {
        for (int i = 0; i < 9; i++) {
            totalcredit += arrcredit[i];
            sum = sum + (arrcredit[i] * arrgrade[i]);
        }
        ans = sum / totalcredit;
        jTextField6.setText(String.format(" %.3f", ans) + " / 4.00");
        int row = -1;
        String answer = String.format(" %.3f", ans);
        try {
            String sql = "UPDATE STUDENT_INFO SET CGPA = '" + answer + "' WHERE ID = '" + str1 + "'";
            Statement st = con.createStatement();
            row = st.executeUpdate(sql);
            //JOptionPane.showMessageDialog(null, "Data insertion Successful" + row, "info", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Insertion Error. Row Affected" + row, JOptionPane.INFORMATION_MESSAGE);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldhumgrade = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextFieldeeelabgrade = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextFieldmathgrade = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextFieldsdgrade = new javax.swing.JTextField();
        jTextFieldeeecredit = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextFielddsgrade = new javax.swing.JTextField();
        jTextFieldhumcredit = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextFielddldgrade = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextFielddslabgrade = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabelcredits = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextFieldsdcredit = new javax.swing.JTextField();
        jTextFielddscredit = new javax.swing.JTextField();
        jTextFieldeeelabcredit = new javax.swing.JTextField();
        jTextFieldmathcredit = new javax.swing.JTextField();
        jTextFielddldcredit = new javax.swing.JTextField();
        jTextFielddslabcredit = new javax.swing.JTextField();
        jLabelgrade = new javax.swing.JLabel();
        jTextFielddldlabcredit = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabelsubjects = new javax.swing.JLabel();
        jTextFielddldlabgrade = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextFieldeeegrade = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldhumgrade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldhumgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldhumgradeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldhumgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 502, 83, 40));

        jTextField11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField11.setText("English Language Sessional");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 270, 382, 40));

        jTextFieldeeelabgrade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldeeelabgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldeeelabgradeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldeeelabgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 444, 83, 40));

        jTextField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField2.setText("Critical Thinking and Communication");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 212, 382, 40));

        jTextFieldmathgrade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldmathgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldmathgradeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldmathgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 554, 83, 40));

        jTextField12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField12.setText("Mathematics-I");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 386, 382, 40));

        jTextFieldsdgrade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldsdgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsdgradeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldsdgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 96, 83, 40));

        jTextFieldeeecredit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldeeecredit.setText("3.0");
        jTextFieldeeecredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldeeecreditActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldeeecredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 386, 83, 40));

        jTextField3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField3.setText("Machine Shop Practice-I");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 328, 382, 40));

        jTextFielddsgrade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFielddsgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddsgradeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielddsgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 154, 83, 40));

        jTextFieldhumcredit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldhumcredit.setText("3.0");
        jTextFieldhumcredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldhumcreditActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldhumcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 502, 83, 40));

        jTextField13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField13.setText("Physics");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 502, 382, 40));

        jTextFielddldgrade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFielddldgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddldgradeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielddldgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 270, 83, 40));

        jTextField4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField4.setText("Introduction to Mechanical and Industrial Engineering");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 444, -1, 40));

        jTextFielddslabgrade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFielddslabgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddslabgradeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielddslabgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 212, 83, 40));

        jTextField5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField5.setText("Physics Sessional");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 554, 382, 40));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Calculate CGPA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 280, -1, 37));

        jLabelcredits.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelcredits.setForeground(new java.awt.Color(51, 204, 255));
        jLabelcredits.setText("Credit");
        getContentPane().add(jLabelcredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 55, 62, 23));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 335, 172, 37));

        jTextFieldsdcredit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldsdcredit.setText("3.0");
        jTextFieldsdcredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsdcreditActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldsdcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 96, 83, 40));

        jTextFielddscredit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFielddscredit.setText("1.5");
        jTextFielddscredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddscreditActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielddscredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 154, 83, 40));

        jTextFieldeeelabcredit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldeeelabcredit.setText("3.0");
        jTextFieldeeelabcredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldeeelabcreditActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldeeelabcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 444, 83, 40));

        jTextFieldmathcredit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldmathcredit.setText("1.5");
        jTextFieldmathcredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldmathcreditActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldmathcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 554, 83, 40));

        jTextFielddldcredit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFielddldcredit.setText("1.5");
        jTextFielddldcredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddldcreditActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielddldcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 270, 83, 40));

        jTextFielddslabcredit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFielddslabcredit.setText("3.0");
        jTextFielddslabcredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddslabcreditActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielddslabcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 212, 83, 40));

        jLabelgrade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelgrade.setForeground(new java.awt.Color(51, 204, 255));
        jLabelgrade.setText("Grade");
        getContentPane().add(jLabelgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 55, 62, 23));

        jTextFielddldlabcredit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFielddldlabcredit.setText("1.5");
        jTextFielddldlabcredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddldlabcreditActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielddldlabcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 328, 83, 40));

        jTextField6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 212, 222, 39));

        jLabelsubjects.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelsubjects.setForeground(new java.awt.Color(51, 204, 255));
        jLabelsubjects.setText("Subjects");
        getContentPane().add(jLabelsubjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, 62, 23));

        jTextFielddldlabgrade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFielddldlabgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddldlabgradeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielddldlabgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 328, 83, 40));

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField1.setText("Chemistry");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, 382, 40));

        jTextFieldeeegrade.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTextFieldeeegrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldeeegradeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldeeegrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 386, 83, 40));

        jTextField10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField10.setText("Chemistry Sessional");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 154, 382, 40));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 547, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picbg/Bg2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldhumgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldhumgradeActionPerformed
        //arrgrade[7] = Double.parseDouble(jTextFieldhumgrade.getText());
    }//GEN-LAST:event_jTextFieldhumgradeActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextFieldeeelabgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldeeelabgradeActionPerformed
        //arrgrade[6] = Double.parseDouble(jTextFieldeeelabgrade.getText());
    }//GEN-LAST:event_jTextFieldeeelabgradeActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextFieldmathgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldmathgradeActionPerformed
        //arrgrade[8] = Double.parseDouble(jTextFieldmathgrade.getText());
    }//GEN-LAST:event_jTextFieldmathgradeActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextFieldsdgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsdgradeActionPerformed
        //arrgrade[0] = Double.parseDouble(jTextFieldsdgrade.getText());
    }//GEN-LAST:event_jTextFieldsdgradeActionPerformed

    private void jTextFieldeeecreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldeeecreditActionPerformed
        //arrcredit[5] = Double.parseDouble(jTextFieldeeecredit.getText());
    }//GEN-LAST:event_jTextFieldeeecreditActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextFielddsgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddsgradeActionPerformed
        //arrgrade[1] = Double.parseDouble(jTextFielddsgrade.getText());
    }//GEN-LAST:event_jTextFielddsgradeActionPerformed

    private void jTextFieldhumcreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldhumcreditActionPerformed
        //arrcredit[7] = Double.parseDouble(jTextFieldhumcredit.getText());
    }//GEN-LAST:event_jTextFieldhumcreditActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextFielddldgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddldgradeActionPerformed
        //arrgrade[3] = Double.parseDouble(jTextFielddldgrade.getText());
    }//GEN-LAST:event_jTextFielddldgradeActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextFielddslabgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddslabgradeActionPerformed
        //arrgrade[2] = Double.parseDouble(jTextFielddslabgrade.getText());
    }//GEN-LAST:event_jTextFielddslabgradeActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            arrcredit[0] = Double.parseDouble(jTextFieldsdcredit.getText());
            arrcredit[1] = Double.parseDouble(jTextFielddscredit.getText());
            arrcredit[2] = Double.parseDouble(jTextFielddslabcredit.getText());
            arrcredit[3] = Double.parseDouble(jTextFielddldcredit.getText());
            arrcredit[4] = Double.parseDouble(jTextFielddldlabcredit.getText());
            arrcredit[5] = Double.parseDouble(jTextFieldeeecredit.getText());
            arrcredit[6] = Double.parseDouble(jTextFieldeeelabcredit.getText());
            arrcredit[7] = Double.parseDouble(jTextFieldhumcredit.getText());
            arrcredit[8] = Double.parseDouble(jTextFieldmathcredit.getText());
            arrgrade[0] = Double.parseDouble(jTextFieldsdgrade.getText());
            arrgrade[1] = Double.parseDouble(jTextFielddsgrade.getText());
            arrgrade[2] = Double.parseDouble(jTextFielddslabgrade.getText());
            arrgrade[3] = Double.parseDouble(jTextFielddldgrade.getText());
            arrgrade[4] = Double.parseDouble(jTextFielddldlabgrade.getText());
            arrgrade[5] = Double.parseDouble(jTextFieldeeegrade.getText());
            arrgrade[6] = Double.parseDouble(jTextFieldeeelabgrade.getText());
            arrgrade[7] = Double.parseDouble(jTextFieldhumgrade.getText());
            arrgrade[8] = Double.parseDouble(jTextFieldmathgrade.getText());
            arithmetic_operation();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextFieldsdgrade.setText("");
        jTextFielddsgrade.setText("");
        jTextFielddslabgrade.setText("");
        jTextFielddldgrade.setText("");
        jTextFielddldlabgrade.setText("");
        jTextFieldeeegrade.setText("");
        jTextFieldeeelabgrade.setText("");
        jTextFieldhumgrade.setText("");
        jTextFieldmathgrade.setText("");
        jTextField6.setText("");
        totalcredit = 0;
        sum = 0;
        ans = 0;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldsdcreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsdcreditActionPerformed
        //arrcredit[0] = Double.parseDouble(jTextFieldsdcredit.getText());
    }//GEN-LAST:event_jTextFieldsdcreditActionPerformed

    private void jTextFielddscreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddscreditActionPerformed
        //arrcredit[1] = Double.parseDouble(jTextFielddscredit.getText());
    }//GEN-LAST:event_jTextFielddscreditActionPerformed

    private void jTextFieldeeelabcreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldeeelabcreditActionPerformed
        //arrcredit[6] = Double.parseDouble(jTextFieldeeelabcredit.getText());
    }//GEN-LAST:event_jTextFieldeeelabcreditActionPerformed

    private void jTextFieldmathcreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldmathcreditActionPerformed
        //arrcredit[8] = Double.parseDouble(jTextFieldmathcredit.getText());
    }//GEN-LAST:event_jTextFieldmathcreditActionPerformed

    private void jTextFielddldcreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddldcreditActionPerformed
        //arrcredit[3] = Double.parseDouble(jTextFielddldcredit.getText());
    }//GEN-LAST:event_jTextFielddldcreditActionPerformed

    private void jTextFielddslabcreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddslabcreditActionPerformed
        //arrcredit[2] = Double.parseDouble(jTextFielddslabcredit.getText());
    }//GEN-LAST:event_jTextFielddslabcreditActionPerformed

    private void jTextFielddldlabcreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddldlabcreditActionPerformed
        //arrcredit[4] = Double.parseDouble(jTextFielddldlabcredit.getText());
    }//GEN-LAST:event_jTextFielddldlabcreditActionPerformed

    private void jTextFielddldlabgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddldlabgradeActionPerformed
        //arrgrade[4] = Double.parseDouble(jTextFielddldlabgrade.getText());
    }//GEN-LAST:event_jTextFielddldlabgradeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextFieldeeegradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldeeegradeActionPerformed
        //arrgrade[5] = Double.parseDouble(jTextFieldeeegrade.getText());
    }//GEN-LAST:event_jTextFieldeeegradeActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        MeoneoneHub obj = new MeoneoneHub(str1);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Meoneone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meoneone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meoneone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meoneone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meoneone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelcredits;
    private javax.swing.JLabel jLabelgrade;
    private javax.swing.JLabel jLabelsubjects;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextFielddldcredit;
    private javax.swing.JTextField jTextFielddldgrade;
    private javax.swing.JTextField jTextFielddldlabcredit;
    private javax.swing.JTextField jTextFielddldlabgrade;
    private javax.swing.JTextField jTextFielddscredit;
    private javax.swing.JTextField jTextFielddsgrade;
    private javax.swing.JTextField jTextFielddslabcredit;
    private javax.swing.JTextField jTextFielddslabgrade;
    private javax.swing.JTextField jTextFieldeeecredit;
    private javax.swing.JTextField jTextFieldeeegrade;
    private javax.swing.JTextField jTextFieldeeelabcredit;
    private javax.swing.JTextField jTextFieldeeelabgrade;
    private javax.swing.JTextField jTextFieldhumcredit;
    private javax.swing.JTextField jTextFieldhumgrade;
    private javax.swing.JTextField jTextFieldmathcredit;
    private javax.swing.JTextField jTextFieldmathgrade;
    private javax.swing.JTextField jTextFieldsdcredit;
    private javax.swing.JTextField jTextFieldsdgrade;
    // End of variables declaration//GEN-END:variables
}
