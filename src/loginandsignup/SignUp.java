
package loginandsignup;


public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Frame = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        FullName = new javax.swing.JLabel();
        FullName_TextField = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        Email_textfield = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        Passwordfield = new javax.swing.JPasswordField();
        SignUp_btn = new javax.swing.JButton();
        IHaveAcc = new javax.swing.JLabel();
        Password1 = new javax.swing.JLabel();
        Passwordfield1 = new javax.swing.JPasswordField();
        Right = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");
        setPreferredSize(new java.awt.Dimension(800, 600));

        Frame.setBackground(new java.awt.Color(255, 255, 255));
        Frame.setPreferredSize(new java.awt.Dimension(800, 600));
        Frame.setLayout(null);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));

        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));

        Header.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Header.setForeground(new java.awt.Color(2, 10, 83));
        Header.setText("Sign Up");

        FullName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FullName.setText("Full name");

        FullName_TextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FullName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullName_TextFieldActionPerformed(evt);
            }
        });

        Email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Email.setText("Email");

        Email_textfield.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Email_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_textfieldActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Password.setText("Password");

        Passwordfield.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordfieldActionPerformed(evt);
            }
        });

        SignUp_btn.setBackground(new java.awt.Color(2, 10, 83));
        SignUp_btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SignUp_btn.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_btn.setText("Sign Up");

        IHaveAcc.setText("I have an account");
        IHaveAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IHaveAccMouseClicked(evt);
            }
        });

        Password1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Password1.setText("Confirm Password");

        Passwordfield1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Passwordfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Passwordfield1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Password)
                                    .addComponent(Password1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(FullName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FullName_TextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(Email_textfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IHaveAcc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SignUp_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Passwordfield1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Passwordfield, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(Header)))
                .addGap(66, 66, 66))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Header)
                .addGap(19, 19, 19)
                .addComponent(FullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FullName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addComponent(Email_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Passwordfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SignUp_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IHaveAcc)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        Frame.add(Left);
        Left.setBounds(400, 0, 420, 600);

        Right.setBackground(new java.awt.Color(204, 204, 204));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));
        Right.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo3.png"))); // NOI18N
        Right.add(jLabel6);
        jLabel6.setBounds(120, 150, 150, 150);

        jLabel7.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        jLabel7.setText("<html><pre style=\"font-family: Broadway; font-size: 15px; color: #020a53;\" >DNHS Enrollment Management \n                       System</pre></html>");
        Right.add(jLabel7);
        jLabel7.setBounds(30, 320, 420, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/7777.jpg"))); // NOI18N
        Right.add(jLabel5);
        jLabel5.setBounds(0, 0, 400, 600);

        Frame.add(Right);
        Right.setBounds(0, 0, 400, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Email_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_textfieldActionPerformed

    private void PasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordfieldActionPerformed

    private void FullName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullName_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullName_TextFieldActionPerformed

    private void Passwordfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Passwordfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Passwordfield1ActionPerformed

    private void IHaveAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IHaveAccMouseClicked
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        LoginFrame.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_IHaveAccMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JTextField Email_textfield;
    private javax.swing.JPanel Frame;
    private javax.swing.JLabel FullName;
    private javax.swing.JTextField FullName_TextField;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel IHaveAcc;
    private javax.swing.JPanel Left;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Password1;
    private javax.swing.JPasswordField Passwordfield;
    private javax.swing.JPasswordField Passwordfield1;
    private javax.swing.JPanel Right;
    private javax.swing.JButton SignUp_btn;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
