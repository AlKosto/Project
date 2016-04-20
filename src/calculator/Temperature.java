
package calculator;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Temperature extends javax.swing.JFrame {
    Double v;
    Double v1;
    public Temperature() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bcrre = new javax.swing.JButton();
        Bbinari = new javax.swing.JButton();
        Bs = new javax.swing.JButton();
        Bage = new javax.swing.JButton();
        cbFrom = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cbTo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        B0 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        BP = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        bEqual = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        Bs1 = new javax.swing.JButton();
        tf2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu25 = new javax.swing.JMenu();
        jMenu73 = new javax.swing.JMenu();
        jMenu137 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bcrre.setText("Currency");
        Bcrre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcrreActionPerformed(evt);
            }
        });

        Bbinari.setText("Binari");
        Bbinari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbinariActionPerformed(evt);
            }
        });

        Bs.setText("Scientific");
        Bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsActionPerformed(evt);
            }
        });

        Bage.setText("Age");
        Bage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BageActionPerformed(evt);
            }
        });

        cbFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celsius (C)", "Fahrenheit (F)", "Kalvin (K)" }));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel1.setText("To");

        cbTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celsius (C)", "Fahrenheit (F)", "Kalvin (K)" }));
        cbTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbToActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel2.setText("From");

        tf1.setBackground(new java.awt.Color(199, 218, 220));
        tf1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setFont(new java.awt.Font("TonnyBanglaOMJ", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setText("Temperature Convater");

        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        BP.setText(".");
        BP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPActionPerformed(evt);
            }
        });

        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        bEqual.setText("=");
        bEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEqualActionPerformed(evt);
            }
        });

        bClear.setText("CLR");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        Bs1.setText("Normal");
        Bs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bs1ActionPerformed(evt);
            }
        });

        tf2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu2.setText("File");

        jMenu7.setText("Sign Out");
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

        jMenu13.setText("Website");
        jMenu13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu13ItemStateChanged(evt);
            }
        });

        jMenu14.setText("Gitehub");
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenu14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu14ItemStateChanged(evt);
            }
        });
        jMenu14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu14ActionPerformed(evt);
            }
        });

        jMenu15.setText("https://github.com/AlKosto/Project");
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        jMenu15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu15ItemStateChanged(evt);
            }
        });
        jMenu15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu15ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenu15);

        jMenu13.add(jMenu14);

        jMenu16.setText("Youtoub");
        jMenu16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu16ItemStateChanged(evt);
            }
        });

        jMenu17.setText("Human Life Cycle");
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
        jMenu16.add(jMenu17);

        jMenu18.setText("Convater");
        jMenu18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu18MouseClicked(evt);
            }
        });
        jMenu18.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu18ItemStateChanged(evt);
            }
        });
        jMenu16.add(jMenu18);

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
        jMenu16.add(jMenu25);

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
        jMenu16.add(jMenu73);

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
        jMenu16.add(jMenu137);

        jMenu13.add(jMenu16);

        jMenuBar1.add(jMenu13);

        jMenu19.setText("Help");
        jMenu19.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu19ItemStateChanged(evt);
            }
        });

        jMenu20.setText("Help for Calcululeto and Convater");
        jMenu20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu20MouseClicked(evt);
            }
        });
        jMenu20.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu20ItemStateChanged(evt);
            }
        });
        jMenu19.add(jMenu20);

        jMenu21.setText("Help for Life Cycle of Human");
        jMenu21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu21MouseClicked(evt);
            }
        });
        jMenu21.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu21ItemStateChanged(evt);
            }
        });
        jMenu21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu21ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenu21);

        jMenuBar1.add(jMenu19);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(206, 206, 206)
                            .addComponent(cbTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(2, 2, 2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bClear)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Bs1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bcrre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bage, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bbinari, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bs, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(206, 206, 206)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(tf1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bbinari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bcrre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Bs1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bClear))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(606, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsActionPerformed
        
        Scientific ob1= new Scientific();
        this.setVisible(false);
        ob1.setVisible(true);
    }//GEN-LAST:event_BsActionPerformed

    private void BbinariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbinariActionPerformed
        Binari obb= new Binari();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BbinariActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        String entervalue = tf1.getText() + B0.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B0ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        String entervalue = tf1.getText() + B3.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B3ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        String entervalue = tf1.getText() + B2.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B2ActionPerformed

    private void BPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPActionPerformed
        String entervalue = tf1.getText() + BP.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_BPActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        String entervalue = tf1.getText() + B4.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B4ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        String entervalue = tf1.getText() + B6.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B6ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        String entervalue = tf1.getText() + B5.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B5ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        String entervalue = tf1.getText() + B7.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B7ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        String entervalue = tf1.getText() + B1.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B1ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        String entervalue = tf1.getText() + B8.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        String entervalue = tf1.getText() + B9.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B9ActionPerformed

    private void cbToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbToActionPerformed

    private void Bs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bs1ActionPerformed
        // TODO add your handling code here:
        calculator ob= new calculator();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_Bs1ActionPerformed

    private void BcrreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcrreActionPerformed
        Currency obb= new Currency();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BcrreActionPerformed

    private void BageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BageActionPerformed
        Age obb= new Age();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BageActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        tf1.setText("");
        tf2.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void bEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEqualActionPerformed
        if(cbFrom.getSelectedItem()=="Celsius (C)"){
            if(cbTo.getSelectedItem()=="Fahrenheit (F)"){
               Double c =Double.parseDouble(tf1.getText());
                v=(9/5)*c+32;
                tf2.setText("Result");
                tf1.setText(String.valueOf(v));
            }
            if(cbTo.getSelectedItem()=="Celsius (C)"){
                Double c =Double.parseDouble(tf1.getText());
                v=c;
                tf2.setText("Result");
                tf1.setText(String.valueOf(v));
            }
            
            if(cbTo.getSelectedItem()=="Kalvin (K)"){
                Double c =Double.parseDouble(tf1.getText());
                v=c+273.15;
                tf2.setText("Result");
                tf1.setText(String.valueOf(v));
            }
        }
        
        
        
        
        if(cbFrom.getSelectedItem()=="Fahrenheit (F)"){
            if(cbTo.getSelectedItem()=="Fahrenheit (F)"){
               Double c =Double.parseDouble(tf1.getText());
                v=c;
                tf2.setText("Result");
                tf1.setText(String.valueOf(v));
            }
            if(cbTo.getSelectedItem()=="Celsius (C)"){
                Double c =Double.parseDouble(tf1.getText());
                v=(c-32)/1.8;
                v1=v;
                tf2.setText("Result");
                tf1.setText(String.valueOf(v));
            }
            
            if(cbTo.getSelectedItem()=="Kalvin (K)"){
                Double c =Double.parseDouble(tf1.getText());
                v1=(c-32)/1.8;
                v=v1+273.15;
                tf2.setText("Result");
                tf1.setText(String.valueOf(v));
            }
        }
        
        
        
        
        if(cbFrom.getSelectedItem()=="Kalvin (K)"){
            if(cbTo.getSelectedItem()=="Fahrenheit (F)"){
               Double c =Double.parseDouble(tf1.getText());
                v=(c-273.15);
                Double p=(9/5)*v+32;
                tf2.setText("Result");
                tf1.setText(String.valueOf(v));
            }
            if(cbTo.getSelectedItem()=="Celsius (C)"){
                Double c =Double.parseDouble(tf1.getText());
                v=c-273.15;
                tf2.setText("Result");
                tf1.setText(String.valueOf(v));
            }
            
            if(cbTo.getSelectedItem()=="Kalvin (K)"){
                Double c =Double.parseDouble(tf1.getText());
                v=c;
                tf2.setText("Result");
                tf1.setText(String.valueOf(v));
            }
        }
    }//GEN-LAST:event_bEqualActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        LoginPage ob = new LoginPage();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ItemStateChanged

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        String url="https://www.www.github.com/AlKosto/LifeCycleOfHuman";

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Age.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu15MouseClicked

    private void jMenu15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu15ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu15ItemStateChanged

    private void jMenu15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu15ActionPerformed

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked

    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu14ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu14ItemStateChanged

    private void jMenu14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu14ActionPerformed

    private void jMenu17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu17MouseClicked
        String url="https://m.youtube.com/watch?v=l9ZX01Omxag";

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Age.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu17MouseClicked

    private void jMenu17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu17ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu17ItemStateChanged

    private void jMenu18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu18MouseClicked
        String url="https://m.youtube.com/results?q=convater%20by%20java&sm=12";

        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Age.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu18MouseClicked

    private void jMenu18ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu18ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu18ItemStateChanged

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

    private void jMenu16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu16ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu16ItemStateChanged

    private void jMenu13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu13ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu13ItemStateChanged

    private void jMenu20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu20MouseClicked
        try                                      //try statement
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:/Users/I-S/Desktop/Necessay tools/src/help/1.docx");

        } catch (Exception e)                    //catch any exceptions here
        {
            JOptionPane.showMessageDialog(null,"Error");  //print the error
        }
    }//GEN-LAST:event_jMenu20MouseClicked

    private void jMenu20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu20ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu20ItemStateChanged

    private void jMenu21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu21MouseClicked
        try                                      //try statement
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:/Users/I-S/Desktop/Necessay tools/src/help/2.docx");

        } catch (Exception e)                    //catch any exceptions here
        {
            JOptionPane.showMessageDialog(null,"Error");  //print the error
        }
    }//GEN-LAST:event_jMenu21MouseClicked

    private void jMenu21ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu21ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu21ItemStateChanged

    private void jMenu21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu21ActionPerformed
        try                                      //try statement
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"/src/help/1.docx");

        } catch (Exception e)                    //catch any exceptions here
        {
            JOptionPane.showMessageDialog(null,"Error");  //print the error
        }
    }//GEN-LAST:event_jMenu21ActionPerformed

    private void jMenu19ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu19ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu19ItemStateChanged

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
            java.util.logging.Logger.getLogger(Temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temperature().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BP;
    private javax.swing.JButton Bage;
    private javax.swing.JButton Bbinari;
    private javax.swing.JButton Bcrre;
    private javax.swing.JButton Bs;
    private javax.swing.JButton Bs1;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bEqual;
    private javax.swing.JComboBox cbFrom;
    private javax.swing.JComboBox cbTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu137;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu73;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
