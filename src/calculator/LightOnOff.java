package calculator;


import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LightOnOff extends javax.swing.JFrame {

    public LightOnOff() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPower = new javax.swing.JToggleButton();
        lImage = new javax.swing.JLabel();
        jCb = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu25 = new javax.swing.JMenu();
        jMenu73 = new javax.swing.JMenu();
        jMenu137 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbPower.setText("OFF");
        tbPower.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPowerActionPerformed(evt);
            }
        });

        lImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.gif"))); // NOI18N

        jCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Go Anywhere", "Normal", "Scientific", "Binari", "Age", "Currencey", "Temperature" }));
        jCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbActionPerformed(evt);
            }
        });

        jButton1.setText("More");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu2.setText("File");

        jMenu7.setText("Home");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu7);

        jMenu5.setText("Exit");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu1.setText("Help");
        jMenu1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu1ItemStateChanged(evt);
            }
        });

        jMenu8.setText("Help for Calcululeto and Convater");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu8ItemStateChanged(evt);
            }
        });
        jMenu1.add(jMenu8);

        jMenu9.setText("Help for Life Cycle of Human");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu9ItemStateChanged(evt);
            }
        });
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu9);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("Website");
        jMenu6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu6ItemStateChanged(evt);
            }
        });

        jMenu10.setText("Gitehub");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenu10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu10ItemStateChanged(evt);
            }
        });
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });

        jMenu12.setText("https://github.com/AlKosto/Project");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenu12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu12ItemStateChanged(evt);
            }
        });
        jMenu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu12ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenu12);

        jMenu6.add(jMenu10);

        jMenu11.setText("Youtoub");
        jMenu11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu11ItemStateChanged(evt);
            }
        });

        jMenu13.setText("Human Life Cycle");
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenu13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu13ItemStateChanged(evt);
            }
        });
        jMenu11.add(jMenu13);

        jMenu17.setText("Convater");
        jMenu17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu17MouseClicked(evt);
            }
        });
        jMenu17.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu17ItemStateChanged(evt);
            }
        });
        jMenu11.add(jMenu17);

        jMenu25.setText("Calculetor at java");
        jMenu25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu25MouseClicked(evt);
            }
        });
        jMenu25.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu25ItemStateChanged(evt);
            }
        });
        jMenu11.add(jMenu25);

        jMenu73.setText("Badside Smoking");
        jMenu73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu73MouseClicked(evt);
            }
        });
        jMenu73.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu73ItemStateChanged(evt);
            }
        });
        jMenu11.add(jMenu73);

        jMenu137.setText("Early Marriage in Bangladesh");
        jMenu137.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu137MouseClicked(evt);
            }
        });
        jMenu137.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu137ItemStateChanged(evt);
            }
        });
        jMenu11.add(jMenu137);

        jMenu6.add(jMenu11);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Exit");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu4ItemStateChanged(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(tbPower, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(jCb, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbPower, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lImage)
                .addGap(18, 18, 18)
                .addComponent(jCb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(466, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPowerActionPerformed
        if(tbPower.isSelected()){
            tbPower.setBackground(Color.red);
            tbPower.setText("ON");
            lImage.setIcon(new ImageIcon(getClass().getResource("/Images/2.jpg")));
        }
        else{
            tbPower.setBackground(Color.green);
            tbPower.setText("OFF");
            lImage.setIcon(new ImageIcon(getClass().getResource("/Images/1.gif")));
        }
    }//GEN-LAST:event_tbPowerActionPerformed

    private void jCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbActionPerformed
        if(jCb.getSelectedItem()=="Binari"){
        Binari obb= new Binari();
        this.setVisible(false);
        obb.setVisible(true);
    }
        if(jCb.getSelectedItem()=="Age"){
            Age obb= new Age();
        this.setVisible(false);
        obb.setVisible(true);
        }
        
        if(jCb.getSelectedItem()=="Currencey"){
            Currency obb= new Currency();
        this.setVisible(false);
        obb.setVisible(true);
        }
        if(jCb.getSelectedItem()=="Temperature"){
            Temperature obb= new Temperature();
        this.setVisible(false);
        obb.setVisible(true);
        }
        if(jCb.getSelectedItem()=="Scientific"){
            Scientific obb= new Scientific();
        this.setVisible(false);
        obb.setVisible(true);
        }
        if(jCb.getSelectedItem()=="Normal"){
        calculator ob= new calculator();
        this.setVisible(false);
        ob.setVisible(true);
        }
    }//GEN-LAST:event_jCbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try                                      //try statement
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:/Users/I-S/Desktop/Necessay tools/src/help/dumpan.docx");

        } catch (Exception e)                    //catch any exceptions here
        {
            JOptionPane.showMessageDialog(null,"Error");  //print the error
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        front ob = new front();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        try                                      //try statement
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:/Users/I-S/Desktop/Necessay tools/src/help/1.docx");

        } catch (Exception e)                    //catch any exceptions here
        {
            JOptionPane.showMessageDialog(null,"Error");  //print the error
        }
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu8ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu8ItemStateChanged

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        try                                      //try statement
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:/Users/I-S/Desktop/Necessay tools/src/help/2.docx");

        } catch (Exception e)                    //catch any exceptions here
        {
            JOptionPane.showMessageDialog(null,"Error");  //print the error
        }
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu9ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu9ItemStateChanged

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        try                                      //try statement
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"/src/help/1.docx");

        } catch (Exception e)                    //catch any exceptions here
        {
            JOptionPane.showMessageDialog(null,"Error");  //print the error
        }
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenu1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ItemStateChanged

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        String url="https://www.www.github.com/AlKosto/LifeCycleOfHuman";

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Age.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu12MouseClicked

    private void jMenu12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu12ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu12ItemStateChanged

    private void jMenu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu12ActionPerformed

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked

    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu10ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu10ItemStateChanged

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu10ActionPerformed

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        String url="https://m.youtube.com/watch?v=l9ZX01Omxag";

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Age.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jMenu13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu13ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu13ItemStateChanged

    private void jMenu17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu17MouseClicked
        String url="https://m.youtube.com/results?q=convater%20by%20java&sm=12";

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Age.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu17MouseClicked

    private void jMenu17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu17ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu17ItemStateChanged

    private void jMenu25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu25MouseClicked
        String url="https://m.youtube.com/results?q=Calculetor%20by%20java&sm=12";

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Age.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu25MouseClicked

    private void jMenu25ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu25ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu25ItemStateChanged

    private void jMenu73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu73MouseClicked
        String url="https://m.youtube.com/watch?v=l26f4f-V4jc";

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Age.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu73MouseClicked

    private void jMenu73ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu73ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu73ItemStateChanged

    private void jMenu137MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu137MouseClicked
        String url="https://m.youtube.com/results?q=stop%20early%20marge%20in%20Bangladesh&sm=12";

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Age.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu137MouseClicked

    private void jMenu137ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu137ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu137ItemStateChanged

    private void jMenu11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu11ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu11ItemStateChanged

    private void jMenu6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu6ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ItemStateChanged

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ItemStateChanged

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(LightOnOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LightOnOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LightOnOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LightOnOff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LightOnOff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCb;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu137;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu73;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lImage;
    private javax.swing.JToggleButton tbPower;
    // End of variables declaration//GEN-END:variables
}
