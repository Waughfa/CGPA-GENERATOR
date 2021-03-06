/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpagenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author waugh
 */
public class MainHub extends javax.swing.JFrame {

    /**
     * Creates new form MainHub
     */
    int dept, semester;
    String s1[] = new String[]{"CSE", "CE", "EEE", "ME", "TE", "IPE", "ARCH"};
    String s2[] = new String[]{"1st Year 1st Semester", "1st Year 2nd Semester", "2nd Year 1st Semester", "2nd Year 2nd Semester", "3rd Year 1st Semester", "3rd Year 2nd Semester", "4th Year 1st Semester", "4th Year 2nd Semester", "5th Year 1st Semester", "5th Year 2nd Semester"};
    Connection con = null;

    public MainHub() {
        try {
            initComponents();
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 190, 108, 32));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setText("Department: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 327, 108, 32));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 258, 108, 32));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("Semester:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 399, 108, 32));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 185, 32));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 258, 185, 38));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "CSE", "CE", "EEE", "ME", "TE", "IPE", "ARCH" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 333, 143, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester", "1st Year 1st Semester", "1st Year 2nd Semester", "2nd Year 1st Semester", "2nd Year 2nd Semester", "3rd Year 1st Semester", "3rd Year 2nd Semester", "4th Year 1st Semester", "4th Year 2nd Semester", "5th Year 1st Semester", "5th Year 2nd Semester" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 405, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picbg/Bg2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        dept = jComboBox1.getSelectedIndex();
    }//GEN-LAST:event_jComboBox1ActionPerformed
    public boolean checkid(String id) {
        PreparedStatement st;

        ResultSet rs;
        boolean usernameexist = false;
        String query = "SELECT * FROM STUDENT_INFO WHERE ID=?";
        try {

            st = con.prepareStatement(query);
            st.setString(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                usernameexist = true;
            }
        } catch (SQLException ex) {
            // Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usernameexist;
    }
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        semester = jComboBox2.getSelectedIndex();
        String Name = jTextField1.getText();
        String ID = jTextField2.getText();
        int row = -1;
        if (Name.equals("") || ID.equals(""))
            JOptionPane.showMessageDialog(null, "One or more fields are Empty", "Error", JOptionPane.INFORMATION_MESSAGE);
        else if (ID.length() != 9) {
            JOptionPane.showMessageDialog(null, "Invalid ID", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else if (checkid(ID)) {
            if (dept == 0 && semester == 0) {
                JOptionPane.showMessageDialog(null, "Please Select Department and Semester Properly", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else if (dept != 7 && semester == 9 || dept != 7 && semester == 10) {
                JOptionPane.showMessageDialog(null, "Please Select ARCH Department for Your Semester", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else if (dept == 1) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        CseoneoneHub obj1 = new CseoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        CseonetwoHub obj2 = new CseonetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        CsetwooneHub obj3 = new CsetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        CsetwotwoHub obj4 = new CsetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        CsethreeoneHub obj5 = new CsethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        CsethreetwoHub obj6 = new CsethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        CsefouroneHub obj7 = new CsefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        CsefourtwoHub obj8 = new CsefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;
                }
            } else if (dept == 2) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        CeoneoneHub obj1 = new CeoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        CeonetwoHub obj2 = new CeonetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        CetwooneHub obj3 = new CetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        CetwotwoHub obj4 = new CetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        CethreeoneHub obj5 = new CethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        CethreetwoHub obj6 = new CethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        CefouroneHub obj7 = new CefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        CefourtwoHub obj8 = new CefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;

                }
            } else if (dept == 3) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        eeeoneoneHub obj1 = new eeeoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        eeeonetwoHub obj2 = new eeeonetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        eeetwooneHub obj3 = new eeetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        eeetwotwoHub obj4 = new eeetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        eeethreeoneHub obj5 = new eeethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        eeethreetwoHub obj6 = new eeethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        eeefouroneHub obj7 = new eeefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        eeefourtwoHub obj8 = new eeefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;

                }
            } else if (dept == 4) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        MeoneoneHub obj1 = new MeoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        MeonetwoHub obj2 = new MeonetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        MetwooneHub obj3 = new MetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        MetwotwoHub obj4 = new MetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        MethreeoneHub obj5 = new MethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        MethreetwoHub obj6 = new MethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        MefouroneHub obj7 = new MefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        MefourtwoHub obj8 = new MefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;

                }
            } else if (dept == 5) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        TeoneoneHub obj1 = new TeoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        Teonetwo obj2 = new Teonetwo(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        TetwooneHub obj3 = new TetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        TetwotwoHub obj4 = new TetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        TethreeoneHub obj5 = new TethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        TethreetwoHub obj6 = new TethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        TefouroneHub obj7 = new TefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        TefourtwoHub obj8 = new TefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;

                }
            } else if (dept == 6) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        IpeoneoneHub obj1 = new IpeoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        IpeonetwoHub obj2 = new IpeonetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        IpetwooneHub obj3 = new IpetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        IpetwotwoHub obj4 = new IpetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        IpethreeoneHub obj5 = new IpethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        IpethreetwoHub obj6 = new IpethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        IpefouroneHub obj7 = new IpefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        IpefourtwoHub obj8 = new IpefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;
                }
            } else if (dept == 7) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        ArchioneoneHub obj1 = new ArchioneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        ArchionetwoHub obj2 = new ArchionetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        ArchitwooneHub obj3 = new ArchitwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        ArchitwotwoHub obj4 = new ArchitwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        ArchithreeoneHub obj5 = new ArchithreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        ArchithreetwoHub obj6 = new ArchithreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        ArchifouroneHub obj7 = new ArchifouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    case 8:
                        this.setVisible(false);
                        ArchifourtwoHub obj8 = new ArchifourtwoHub(ID);
                        obj8.setVisible(true);
                        break;
                    case 9:
                        this.setVisible(false);
                        ArchifiveoneHub obj9 = new ArchifiveoneHub(ID);
                        obj9.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        ArchifivetwoHub obj10 = new ArchifivetwoHub(ID);
                        obj10.setVisible(true);
                        break;
                }
            }

            try {
                String sql3 = "UPDATE STUDENT_INFO SET NAME = '" + Name + "', DEPARTMENT = '" + s1[dept - 1] + "', SEMESTER = '" + s2[semester - 1] + "' WHERE ID= '" + ID + "'";
                Statement st = con.createStatement();
                row = st.executeUpdate(sql3);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Insertion Error. Row Affected" + row, JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            if (dept == 0 && semester == 0) {
                JOptionPane.showMessageDialog(null, "Please Select Department and Semester Properly", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else if (dept != 7 && semester == 9 || dept != 7 && semester == 10) {
                JOptionPane.showMessageDialog(null, "Please Select ARCH Department for Your Semester", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else if (dept == 1) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        CseoneoneHub obj1 = new CseoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        CseonetwoHub obj2 = new CseonetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        CsetwooneHub obj3 = new CsetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        CsetwotwoHub obj4 = new CsetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        CsethreeoneHub obj5 = new CsethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        CsethreetwoHub obj6 = new CsethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        CsefouroneHub obj7 = new CsefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        CsefourtwoHub obj8 = new CsefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;
                }
            } else if (dept == 2) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        CeoneoneHub obj1 = new CeoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        CeonetwoHub obj2 = new CeonetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        CetwooneHub obj3 = new CetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        CetwotwoHub obj4 = new CetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        CethreeoneHub obj5 = new CethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        CethreetwoHub obj6 = new CethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        CefouroneHub obj7 = new CefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        CefourtwoHub obj8 = new CefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;

                }
            } else if (dept == 3) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        eeeoneoneHub obj1 = new eeeoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        eeeonetwoHub obj2 = new eeeonetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        eeetwooneHub obj3 = new eeetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        eeetwotwoHub obj4 = new eeetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        eeethreeoneHub obj5 = new eeethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        eeethreetwoHub obj6 = new eeethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        eeefouroneHub obj7 = new eeefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        eeefourtwoHub obj8 = new eeefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;

                }
            } else if (dept == 4) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        MeoneoneHub obj1 = new MeoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        MeonetwoHub obj2 = new MeonetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        MetwooneHub obj3 = new MetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        MetwotwoHub obj4 = new MetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        MethreeoneHub obj5 = new MethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        MethreetwoHub obj6 = new MethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        MefouroneHub obj7 = new MefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        MefourtwoHub obj8 = new MefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;

                }
            } else if (dept == 5) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        TeoneoneHub obj1 = new TeoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        Teonetwo obj2 = new Teonetwo(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        TetwooneHub obj3 = new TetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        TetwotwoHub obj4 = new TetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        TethreeoneHub obj5 = new TethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        TethreetwoHub obj6 = new TethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        TefouroneHub obj7 = new TefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        TefourtwoHub obj8 = new TefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;

                }
            } else if (dept == 6) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        IpeoneoneHub obj1 = new IpeoneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        IpeonetwoHub obj2 = new IpeonetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        IpetwooneHub obj3 = new IpetwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        IpetwotwoHub obj4 = new IpetwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        IpethreeoneHub obj5 = new IpethreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        IpethreetwoHub obj6 = new IpethreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        IpefouroneHub obj7 = new IpefouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        IpefourtwoHub obj8 = new IpefourtwoHub(ID);
                        obj8.setVisible(true);
                        break;
                }
            } else if (dept == 7) {
                switch (semester) {
                    case 1:
                        this.setVisible(false);
                        ArchioneoneHub obj1 = new ArchioneoneHub(ID);
                        obj1.setVisible(true);
                        break;
                    case 2:
                        this.setVisible(false);
                        ArchionetwoHub obj2 = new ArchionetwoHub(ID);
                        obj2.setVisible(true);
                        break;
                    case 3:
                        this.setVisible(false);
                        ArchitwooneHub obj3 = new ArchitwooneHub(ID);
                        obj3.setVisible(true);
                        break;
                    case 4:
                        this.setVisible(false);
                        ArchitwotwoHub obj4 = new ArchitwotwoHub(ID);
                        obj4.setVisible(true);
                        break;
                    case 5:
                        this.setVisible(false);
                        ArchithreeoneHub obj5 = new ArchithreeoneHub(ID);
                        obj5.setVisible(true);
                        break;
                    case 6:
                        this.setVisible(false);
                        ArchithreetwoHub obj6 = new ArchithreetwoHub(ID);
                        obj6.setVisible(true);
                        break;
                    case 7:
                        this.setVisible(false);
                        ArchifouroneHub obj7 = new ArchifouroneHub(ID);
                        obj7.setVisible(true);
                        break;
                    case 8:
                        this.setVisible(false);
                        ArchifourtwoHub obj8 = new ArchifourtwoHub(ID);
                        obj8.setVisible(true);
                        break;
                    case 9:
                        this.setVisible(false);
                        ArchifiveoneHub obj9 = new ArchifiveoneHub(ID);
                        obj9.setVisible(true);
                        break;
                    default:
                        this.setVisible(false);
                        ArchifivetwoHub obj10 = new ArchifivetwoHub(ID);
                        obj10.setVisible(true);
                        break;
                }
            }
            String sql = "INSERT INTO STUDENT_INFO (NAME,ID,DEPARTMENT,SEMESTER) VALUES (?,?,?,?)";
            try {
                System.out.println("");

                PreparedStatement ps = con.prepareCall(sql);
                ps.setString(1, Name);
                ps.setString(2, ID);
                ps.setString(3, s1[dept - 1]);
                ps.setString(4, s2[semester - 1]);

                row = ps.executeUpdate();
                //JOptionPane.showMessageDialog(null, "Data insertion Successful" + row, "info", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Insertion Error. Row Affected" + row, JOptionPane.INFORMATION_MESSAGE);

            }
    }//GEN-LAST:event_jComboBox2ActionPerformed
    }

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
            java.util.logging.Logger.getLogger(MainHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
