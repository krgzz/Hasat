/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.hasat.frame;

import io.github.hasat.database.MySQL;
import io.github.hasat.user.User;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author hakan
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        mailText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        surnameLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        phoneLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        passwordLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        surnameText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        errorPanel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HASAT Ulaşım");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/bus.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(2, 44, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/newbus.png"))); // NOI18N
        logoLabel.setText("HASAT Ulaşım");
        logoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        mailLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(255, 255, 255));
        mailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/mail.png"))); // NOI18N
        mailLabel.setText("E-Posta:");
        jPanel1.add(mailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        mailText.setBackground(new java.awt.Color(2, 44, 74));
        mailText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mailText.setForeground(new java.awt.Color(255, 255, 255));
        mailText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        mailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mailTextKeyTyped(evt);
            }
        });
        jPanel1.add(mailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 410, 38));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 520, 10));

        surnameLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        surnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        surnameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/name.png"))); // NOI18N
        surnameLabel.setText("Soyisim:");
        jPanel1.add(surnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, -1));

        phoneText.setBackground(new java.awt.Color(2, 44, 74));
        phoneText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        phoneText.setForeground(new java.awt.Color(255, 255, 255));
        phoneText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        phoneText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneTextKeyTyped(evt);
            }
        });
        jPanel1.add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 410, 38));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 520, 11));

        nameLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/name.png"))); // NOI18N
        nameLabel.setText("İsim:");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        nameText.setBackground(new java.awt.Color(2, 44, 74));
        nameText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        nameText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextKeyTyped(evt);
            }
        });
        jPanel1.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 410, 38));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 520, 10));

        phoneLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/phone.png"))); // NOI18N
        phoneLabel.setText("Telefon:");
        jPanel1.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 100, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 520, 11));

        passwordLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/password.png"))); // NOI18N
        passwordLabel.setText("Şifre:");
        jPanel1.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        passwordText.setBackground(new java.awt.Color(2, 44, 74));
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordTextKeyTyped(evt);
            }
        });
        jPanel1.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 410, 38));

        surnameText.setBackground(new java.awt.Color(2, 44, 74));
        surnameText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        surnameText.setForeground(new java.awt.Color(255, 255, 255));
        surnameText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        surnameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                surnameTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surnameTextKeyTyped(evt);
            }
        });
        jPanel1.add(surnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 410, 38));

        backButton.setBackground(new java.awt.Color(2, 44, 74));
        backButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/back.png"))); // NOI18N
        backButton.setText("Geri Dön");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        backButton.setFocusPainted(false);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 200, 80));

        errorPanel.setBackground(new java.awt.Color(2, 44, 74));
        errorPanel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        errorPanel.setForeground(new java.awt.Color(255, 255, 255));
        errorPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        errorPanel.setOpaque(true);
        jPanel1.add(errorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, 180));

        registerButton.setBackground(new java.awt.Color(2, 44, 74));
        registerButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/register.png"))); // NOI18N
        registerButton.setText("Kayıt Ol");
        registerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        registerButton.setFocusPainted(false);
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
        });
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 520, 80));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 10, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String mail = mailText.getText();
        String name = nameText.getText();
        String surname = surnameText.getText();
        String phone = phoneText.getText();
        String password = String.valueOf(passwordText.getPassword());
        
        if (mail.isEmpty()) {
            mailText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● E-Posta kısmını<br>&nbsp;doldurmalısınız!</html>");
            return;
        }
        
        if (!mail.contains("@") || mail.length() < 5) {
            mailText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● Geçerli bir E-Posta<br>&nbsp;girmelisiniz!</html>");
            return;
        }
        
        if (name.isEmpty()) {
            nameText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● İsim kısmını<br>&nbsp;doldurmalısınız!</html>");
            return;
        }
        
        if (name.length() < 3) {
            nameText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● Geçerli bir isim<br>&nbsp;girmelisiniz!</html>");
            return;
        }
        
        if (surname.isEmpty()) {
            surnameText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● Soyisim kısmını<br>&nbsp;doldurmalısınız!</html>");
            return;
        }
        
        if (surname.length() < 3) {
            surnameText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● Geçerli bir soyisim<br>&nbsp;girmelisiniz!</html>");
            return;
        }
        
        if (phone.isEmpty()) {
            phoneText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● Telefon kısmını<br>&nbsp;doldurmalısınız!</html>");
            return;
        }
        
        if (phone.length() != 10) {
            phoneText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● Geçerli bir telefon<br>&nbsp;girmelisiniz!</html>");
            return;
        }
        
        if (password.isEmpty()) {
            passwordText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● Şifre kısmını<br>&nbsp;doldurmalısınız!</html>");
            return;
        }
        
        if (password.length() < 4) {
            passwordText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● Geçerli bir şifre<br>&nbsp;girmelisiniz!</html>");
            return;
        }
        
        if (MySQL.isUserExists(mail)) {
            mailText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 49, 74)));
            errorPanel.setBackground(new Color(99,16,1));
            errorPanel.setText("<html>&nbsp;● Mail hesabı<br>&nbsp;kullanılıyor!</html>");
            return;
        }
        
        String time = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(System.currentTimeMillis()));
                                
        User user = new User(name, surname, mail, phone, password, time);
                                
        MySQL.createUser(user);
                                
        errorPanel.setBackground(new Color(1,95,24));
        errorPanel.setText("<html>&nbsp;● Hesabınız<br>&nbsp;başarıyla oluşturuldu!<br><br>&nbsp;&nbsp;● Yönlendiriliyorsunuz...</html>");
                                
        ActionListener action = (ActionEvent ae) -> {
            dispose();
                                    
            new LoginFrame().setVisible(true);
        };
                                
        Timer t = new Timer(3000, action);
                                
        t.setRepeats(false);
        t.start();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void mailTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTextKeyReleased
        mailText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_mailTextKeyReleased

    private void nameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyReleased
       nameText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_nameTextKeyReleased

    private void surnameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surnameTextKeyReleased
        surnameText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_surnameTextKeyReleased

    private void phoneTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTextKeyReleased
        phoneText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_phoneTextKeyReleased

    private void passwordTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyReleased
        passwordText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_passwordTextKeyReleased

    private void phoneTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTextKeyTyped
        String key = String.valueOf(evt.getKeyChar());
        
        try {
            Integer.parseInt(key);
        } catch (NumberFormatException e) {
            evt.consume();
            return;
        }
        
        if (phoneText.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_phoneTextKeyTyped

    private void mailTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTextKeyTyped
        if (mailText.getText().length() > 30) {
            evt.consume();
        }
    }//GEN-LAST:event_mailTextKeyTyped

    private void nameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyTyped
        if (nameText.getText().length() > 30) {
            evt.consume();
        }
    }//GEN-LAST:event_nameTextKeyTyped

    private void surnameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surnameTextKeyTyped
        if (surnameText.getText().length() > 30) {
            evt.consume();
        }
    }//GEN-LAST:event_surnameTextKeyTyped

    private void passwordTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyTyped
        if (String.valueOf(passwordText.getPassword()).length() > 20) {
            evt.consume();
        }
    }//GEN-LAST:event_passwordTextKeyTyped

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_backButtonMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel errorPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField mailText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField surnameText;
    // End of variables declaration//GEN-END:variables
}
