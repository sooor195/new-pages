/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A.P.P;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO_M
 */
public class Admin_Doctors extends javax.swing.JFrame {
Connection con =javaConnect.connectdb();
  PreparedStatement ps = null;
    ResultSet rs = null;

    
      
   public Admin_Doctors() {
        initComponents();
        javaConnect.connectdb();
        getContentPane().setBackground(Color.white);

    }
   public void showtable(){
         String ln,fn,un,sp, pn;
         try{
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
     model.setRowCount(0);
      ps=con.prepareStatement("SELECT * FROM Doctors");
      rs=ps.executeQuery();
      while (rs.next()){
     fn=rs.getString("First_Name");
     ln=rs.getString("Last_Name");
     un=rs.getString("User_Name");
   
  sp=rs.getString("Specialty");
     pn=rs.getInt("Phone_Number")+"";
     String tb[] ={fn,ln,un,sp,pn};
     DefaultTableModel tblm=(DefaultTableModel) jTable1.getModel();
     tblm.addRow(tb);
    }
    } catch (SQLException ex) {
        Logger.getLogger(Patient_page.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    public void getSpecialty(String s){
       if(s.equals("Dentist"))
            jComboBox1.setSelectedIndex(0);
        else if(s.equals("Dermatolog"))
            jComboBox1.setSelectedIndex(1);
        else if(s.equals("Neurosurge"))
            jComboBox1.setSelectedIndex(2);
        else if(s.equals("Psychiatry"))
              jComboBox1.setSelectedIndex(3);
        else if(s.equals("Pediatrics"))
              jComboBox1.setSelectedIndex(4);
        else if(s.equals("Optometry"))
              jComboBox1.setSelectedIndex(5);
        else if(s.equals("Ophthalmol"))
              jComboBox1.setSelectedIndex(6);
        else if(s.equals("Radiology"))
              jComboBox1.setSelectedIndex(7);
        else if(s.equals("Plastic"))
              jComboBox1.setSelectedIndex(8);
        else if(s.equals("General"))
             jComboBox1.setSelectedIndex(9);
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        phonenum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        add = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Doctors = new javax.swing.JMenu();
        Patients = new javax.swing.JMenu();
        Appointments = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("On-Care ");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A/P/P/logo.png"))); // NOI18N

        jLabel17.setText("Username");

        jLabel7.setText("First Name");

        jLabel8.setText("Last Name");

        jLabel9.setText("Specialty");

        jLabel10.setText("Phone No");

        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnameKeyPressed(evt);
            }
        });

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnameKeyPressed(evt);
            }
        });

        phonenum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonenumKeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "First name", "Second name", "Specialty", "Phone No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Remove");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Modify");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel11.setText("Password");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dentist", "Dermatolog", "Neurosurge", "Psychiatry", "Pediatrics", "Optometry", "Ophthalmol", "Radiology", "Plastic ", "General" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Manage Doctors");

        Doctors.setText("Doctors ");
        Doctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorsMouseClicked(evt);
            }
        });
        jMenuBar1.add(Doctors);

        Patients.setText("Patients ");
        Patients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientsMouseClicked(evt);
            }
        });
        jMenuBar1.add(Patients);

        Appointments.setText("Appointments");
        Appointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppointmentsMouseClicked(evt);
            }
        });
        jMenuBar1.add(Appointments);

        jMenu1.setText("Log Out");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(2, 2, 2)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(phonenum, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)))
                .addComponent(jLabel6)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(phonenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel10)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(jButton9)
                    .addComponent(jButton8))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
      String fn,Ln,pa,sp,un=username.getText();
      int phone;
      if (username.getText().isEmpty()||fname.getText().isEmpty()||lname.getText().isEmpty()||phonenum.getText().isEmpty()||password.getText().isEmpty())
         JOptionPane.showMessageDialog(this,"All fields are required, please make sure to fill it out");
        else{
          try{
          ps=con.prepareStatement("SELECT User_Name FROM Doctors WHERE User_Name=?");
          ps.setString(1,un);
          rs=ps.executeQuery();
           if (rs.next()){
           JOptionPane.showMessageDialog(this,"this user name is used please enter another one");
           }
           else {
        un=(username.getText());
        fn=fname.getText();
        Ln=lname.getText();
        phone=Integer.parseInt(phonenum.getText());
        sp= jComboBox1.getItemAt( jComboBox1.getSelectedIndex());
        pa =password.getText();
        try{
            ps=con.prepareStatement("INSERT INTO Doctors(User_Name,First_Name,Last_Name,Specialty,Phone_Number) VALUES(?,?,?,?,?)");
            ps.setString(1,un);
            ps.setString(2, fn);
            ps.setString(3, Ln);
            ps.setString(4, sp);
            ps.setInt(5, phone);
             ps.execute();
            ps=con.prepareStatement("INSERT INTO Log_in_emp (User_Name,Password) VALUES(?,?)");
             ps.setString(1,un);
             ps.setString(2,pa);
           ps.execute();
           JOptionPane.showMessageDialog(this,"Record added successfully");
           showtable();
       } catch (SQLException ex) {
          Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
      }}}catch (SQLException ex) {
          Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
      }}
    }//GEN-LAST:event_addActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
//remove button  
        String username =jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2).toString();
    try {
        ps=con.prepareStatement("DELETE FROM Doctors where User_Name=?");
         ps.setString(1, username);
         ps.execute();
         JOptionPane.showMessageDialog(this,"Record deleted successfully");
          showtable();
    } catch (SQLException ex) {
        Logger.getLogger(Admin_Doctors.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
  //modify button
  String fn,Ln,sp,un;
      int phone;
      if (username.getText().isEmpty()||fname.getText().isEmpty()||lname.getText().isEmpty()||phonenum.getText().isEmpty())
         JOptionPane.showMessageDialog(this,"All fields are required, please make sure to fill it out");
        else{
        un=username.getText();
        fn=fname.getText();
        Ln=lname.getText();
        phone=Integer.parseInt(phonenum.getText());
        sp= jComboBox1.getItemAt( jComboBox1.getSelectedIndex());
try {
     ps=con.prepareStatement("UPDATE Doctors SET First_Name=?,Last_Name=?,Specialty=?,Phone_Number=? where User_Name=?");
        ps.setString(1,fn );
        ps.setString(2,Ln);
        ps.setString(3, sp);
        ps.setInt(4, phone);
        ps.setString(5,un);
        ps.execute();
        JOptionPane.showMessageDialog(this,"information updated");
    } catch (Exception ex) { 
        Logger.getLogger(Patient_page.class.getName()).log(Level.SEVERE, null, ex);
    }}
            
    }//GEN-LAST:event_jButton9ActionPerformed

    private void DoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorsMouseClicked
           
    }//GEN-LAST:event_DoctorsMouseClicked

    private void PatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientsMouseClicked
     dispose();
     Admin_Patient d=new Admin_Patient ();
     d.setVisible(true);
    }//GEN-LAST:event_PatientsMouseClicked

    private void AppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointmentsMouseClicked
        dispose();
     Admin_Appointments a=new Admin_Appointments();
     a.setVisible(true);
    }//GEN-LAST:event_AppointmentsMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
                 showtable();

    }//GEN-LAST:event_formWindowGainedFocus

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
  
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
               
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int row ;
        row=jTable1.getSelectedRow();
        if (row<0)
         row+=1;
        String sp,un =jTable1.getModel().getValueAt(row, 2).toString();
         try{
      ps=con.prepareStatement("SELECT * FROM Doctors WHERE User_Name=?");
      ps.setString(1, un);
      rs=ps.executeQuery();
      if(rs.next()){
     username.setText(rs.getString("User_Name"));
     fname.setText(rs.getString("First_Name"));
     lname.setText(rs.getString("Last_Name"));
     sp=rs.getString("Specialty");
     getSpecialty(sp);
     phonenum.setText(rs.getString("Phone_Number"));
     this.setVisible(true);}
    }
    catch (SQLException ex) {
        Logger.getLogger(Patient_page.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyPressed
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
            fname.setEditable(true);
        else
             fname.setEditable(false);
    }//GEN-LAST:event_fnameKeyPressed

    private void lnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyPressed
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
            lname.setEditable(true);
        else
             lname.setEditable(false);
    }//GEN-LAST:event_lnameKeyPressed

    private void phonenumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenumKeyPressed
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        if(Character.isDigit(c)||Character.isWhitespace(c)||Character.isISOControl(c))
            phonenum.setEditable(true);
        else
             phonenum.setEditable(false);
    }//GEN-LAST:event_phonenumKeyPressed

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
            java.util.logging.Logger.getLogger(Admin_Doctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Doctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Doctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Doctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Doctors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Appointments;
    private javax.swing.JMenu Doctors;
    private javax.swing.JMenu Patients;
    private javax.swing.JButton add;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phonenum;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
