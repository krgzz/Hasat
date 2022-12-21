/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.hasat.frame;

import io.github.hasat.card.Card;
import io.github.hasat.database.MySQL;
import io.github.hasat.user.User;
import io.github.hasat.user.UserManager;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author hakan
 */
public class RemoveCardFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form RegisterFrame
     */
    public RemoveCardFrame() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        if (!UserManager.isUserExists()) {
            dispose();
            
            new LoginFrame().setVisible(true);
            
            return;
        }
        
        User user = UserManager.getUser();
        
        List<Card> cards = user.getCards();
        
        for (Card card : cards) {
            cardTypes.addItem(card.getCardID());
        }
        
        cardNameText.setText(user.getCardByID(cardTypes.getItemAt(0)).getCardName());
        
        cardTypes.addItemListener((ItemEvent item) -> {
            if (item.getStateChange() == ItemEvent.SELECTED) {
                cardNameText.setText(user.getCardByID(cardTypes.getItemAt(cardTypes.getSelectedIndex())).getCardName());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        backButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        changeSettingsButton = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        cardNumberLabel = new javax.swing.JLabel();
        newMailLabel = new javax.swing.JLabel();
        cardTypes = new javax.swing.JComboBox<>();
        cardNameText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HASAT Ulaşım");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/bus.png")).getImage());
        setResizable(false);

        panel.setBackground(new java.awt.Color(2, 44, 74));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/newbus.png"))); // NOI18N
        logoLabel.setText("HASAT Ulaşım");
        logoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));
        panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 430, 11));

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
        panel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, 80));

        warningLabel.setBackground(new java.awt.Color(2, 44, 74));
        warningLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 255, 255));
        warningLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        warningLabel.setOpaque(true);
        panel.add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 196, 200, 170));

        changeSettingsButton.setBackground(new java.awt.Color(2, 44, 74));
        changeSettingsButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        changeSettingsButton.setForeground(new java.awt.Color(255, 255, 255));
        changeSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/remove.png"))); // NOI18N
        changeSettingsButton.setText("Kart Sil");
        changeSettingsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        changeSettingsButton.setFocusPainted(false);
        changeSettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeSettingsButtonMouseEntered(evt);
            }
        });
        changeSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSettingsButtonActionPerformed(evt);
            }
        });
        panel.add(changeSettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 430, 80));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 10, 470));

        cardNumberLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        cardNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardNumberLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/card.png"))); // NOI18N
        cardNumberLabel.setText("Kart:");
        panel.add(cardNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        newMailLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        newMailLabel.setForeground(new java.awt.Color(255, 255, 255));
        newMailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/hasat/images/text.png"))); // NOI18N
        newMailLabel.setText("Kart Adı:");
        panel.add(newMailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        cardTypes.setBackground(new java.awt.Color(2, 44, 74));
        cardTypes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cardTypes.setForeground(new java.awt.Color(255, 255, 255));
        cardTypes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panel.add(cardTypes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 430, 40));

        cardNameText.setEditable(false);
        cardNameText.setBackground(new java.awt.Color(2, 44, 74));
        cardNameText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        cardNameText.setForeground(new java.awt.Color(255, 255, 255));
        cardNameText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        cardNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNameTextKeyTyped(evt);
            }
        });
        panel.add(cardNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 430, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        
        new ProfileFrame().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void changeSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSettingsButtonActionPerformed
        User user = UserManager.getUser();
        
        if (user == null) {
            dispose();
            
            new LoginFrame().setVisible(true);
            
            return;
        }
        
        List<Card> cards = user.getCards();
        
        if (cards.isEmpty()) {
            warningLabel.setBackground(new Color(99,16,1));
            warningLabel.setText("<html>&nbsp;● Hiç kartınız<br>&nbsp;bulunmamakta! (0/3)</html>");
            return;
        }
       
        warningLabel.setBackground(new Color(1,95,24));
        warningLabel.setText("<html>&nbsp;● Kartınız başarıyla<br>&nbsp;silindis!<br><br>&nbsp;Yönlendiriliyorsunuz...</html>");
                
        String cardID = cardTypes.getItemAt(cardTypes.getSelectedIndex());
        
        for (Card card : cards) {
            if (card.getCardID().equals(cardID)) {
                cards.remove(card);
                
                MySQL.deleteCard(card);
                
                break;
            }
        }
                                
        ActionListener action = (ActionEvent ae) -> {
            dispose();

            new CardsFrame().setVisible(true);
        };

        Timer t = new Timer(3000, action);

        t.setRepeats(false);
        t.start();
    }//GEN-LAST:event_changeSettingsButtonActionPerformed

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_backButtonMouseEntered

    private void changeSettingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeSettingsButtonMouseEntered
        changeSettingsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_changeSettingsButtonMouseEntered

    private void cardNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNameTextKeyTyped
        if (cardNameText.getText().length() > 30) {
            evt.consume();
            return;
        }

        cardNameText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_cardNameTextKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cardNameText;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JComboBox<String> cardTypes;
    private javax.swing.JButton changeSettingsButton;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel newMailLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
