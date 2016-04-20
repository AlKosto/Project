
package calculator;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Currency extends javax.swing.JFrame {

    Double r;
    Double in;

    public Currency() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B1 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        Bage = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        Btamperature = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bok = new javax.swing.JButton();
        cbfrom = new javax.swing.JComboBox();
        B4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        BP = new javax.swing.JButton();
        Bbinari = new javax.swing.JButton();
        cbto = new javax.swing.JComboBox();
        Bs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        Bcrre = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        B7 = new javax.swing.JButton();
        bclr = new javax.swing.JButton();
        tf2 = new javax.swing.JTextField();
        lr = new javax.swing.JLabel();
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

        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        Bage.setText("Age");
        Bage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BageActionPerformed(evt);
            }
        });

        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        Btamperature.setText("Temperature");
        Btamperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtamperatureActionPerformed(evt);
            }
        });

        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel1.setText("To");

        bok.setText("OK");
        bok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bokActionPerformed(evt);
            }
        });

        cbfrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bangladeshi Taka", "Indian Rupee", "Singapore Dollar", "US Dollar" }));
        cbfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbfromActionPerformed(evt);
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

        Bbinari.setText("Binari");
        Bbinari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbinariActionPerformed(evt);
            }
        });

        cbto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Algerian Dinar", "Australian Dollar", "Bangladeshi Taka", "Brazilian Real", "British Pound", "Canadian Dollar", "Chinese Offshore", "Chinese Yuan", "Euros", "Hong Kong Dollar", "Indian Rupee", "Iraqi Dinars", "Pakistani Rupee", "Singapure Dollar", "Sri Lankan Rupee", "US dollar" }));
        cbto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtoActionPerformed(evt);
            }
        });

        Bs.setText("Scientific");
        Bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel2.setText("From");

        tf1.setBackground(new java.awt.Color(199, 214, 240));
        tf1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Bcrre.setText("Normal");
        Bcrre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcrreActionPerformed(evt);
            }
        });

        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("TonnyBanglaOMJ", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setText("Currency Convater");

        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        bclr.setText("CLR");
        bclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclrActionPerformed(evt);
            }
        });

        tf2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf2.setForeground(new java.awt.Color(0, 0, 153));

        lr.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btamperature, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf2)
                            .addComponent(lr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bcrre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bage, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bbinari, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bs, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(206, 206, 206)
                                .addComponent(cbto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bok, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bclr)))
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(206, 206, 206)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bbinari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Bage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcrre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btamperature, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(bok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bclr))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(606, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        String entervalue = tf1.getText() + B1.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B1ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        String entervalue = tf1.getText() + B0.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B0ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        String entervalue = tf1.getText() + B8.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B8ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        String entervalue = tf1.getText() + B3.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B3ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        String entervalue = tf1.getText() + B9.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B9ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        String entervalue = tf1.getText() + B4.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B4ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        String entervalue = tf1.getText() + B6.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B6ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        String entervalue = tf1.getText() + B2.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B2ActionPerformed

    private void BPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPActionPerformed
        String entervalue = tf1.getText() + BP.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_BPActionPerformed

    private void BbinariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbinariActionPerformed
         Binari ob1= new Binari();
        this.setVisible(false);
        ob1.setVisible(true);
    }//GEN-LAST:event_BbinariActionPerformed

    private void cbtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtoActionPerformed

    private void BsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsActionPerformed
        // TODO add your handling code here:
        Scientific ob1= new Scientific();
        this.setVisible(false);
        ob1.setVisible(true);
    }//GEN-LAST:event_BsActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        String entervalue = tf1.getText() + B5.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B5ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        String entervalue = tf1.getText() + B7.getText();
        tf1.setText(entervalue);
    }//GEN-LAST:event_B7ActionPerformed

    private void BtamperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtamperatureActionPerformed
        Temperature obb= new Temperature();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BtamperatureActionPerformed

    private void BcrreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcrreActionPerformed
        calculator obb= new calculator();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BcrreActionPerformed

    private void BageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BageActionPerformed
        Age obb= new Age();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BageActionPerformed

    private void cbfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbfromActionPerformed

    private void bclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclrActionPerformed
        tf1.setText("");
        tf2.setText("");
        lr.setText("");
    }//GEN-LAST:event_bclrActionPerformed

    private void bokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bokActionPerformed
        if(cbfrom.getSelectedItem()=="Bangladeshi Taka"){
            if(cbto.getSelectedItem()=="Algerian Dinar"){
                in= Double.parseDouble(tf1.getText());
                r=in*1.39;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1.39");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Australian Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.01657275439177991382167;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0165727");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Bangladeshi Taka"){
                in= Double.parseDouble(tf1.getText());
                r=in;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Brazilian Real"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0452;
     
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0452");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="British Pound"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.009;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.009");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Canadian Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0164;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0164");
                tf2.setText("Result");
            }
            
            if(cbto.getSelectedItem()=="Chinese Offshore"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.083;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.083");
                tf2.setText("Result");
            }
            
            if(cbto.getSelectedItem()=="Chinese Yuan"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0829;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0829");
                tf2.setText("Result");
            }
            
            if(cbto.getSelectedItem()=="Euros"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.01134;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.01134");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Hong Kong Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0993;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0993");
                tf2.setText("Result");
            }
            
            if(cbto.getSelectedItem()=="Indian Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.85333;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.85333");
                tf2.setText("Result");
            }
            
            if(cbto.getSelectedItem()=="Iraqi Dinars"){
                in= Double.parseDouble(tf1.getText());
                r=in*14.22222;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"14.22222");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Pakistani Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*1.33333;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1.33333");
                tf2.setText("Result");
            }
            
            if(cbto.getSelectedItem()=="Singapure Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.01737;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.01737");
                tf2.setText("Result");
            }
            
            if(cbto.getSelectedItem()=="Sri Lankan Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*1.85507;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1.85507");
                tf2.setText("Result");
            }
            
            if(cbto.getSelectedItem()=="US dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0128;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0128");
                tf2.setText("Result");
            }
            
        }
        
        
        
        
        
        
        
        
        if(cbfrom.getSelectedItem()=="Indian Rupee"){
            if(cbto.getSelectedItem()=="Algerian Dinar"){
                in= Double.parseDouble(tf1.getText());
                r=in*1.63;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1.63");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Australian Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0194;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0194");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Bangladeshi Taka"){
                in= Double.parseDouble(tf1.getText());
                r=in*1.1718;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1.1718");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Brazilian Real"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.053;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.053");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="British Pound"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0105;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0105");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Canadian Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0192;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0192");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Chinese Offshore"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0972;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0972");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Chinese Yuan"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0971;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0971");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Euros"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0132;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0132");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Hong Kong Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.1163;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0.1163");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Indian Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*1;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Iraqi Dinars"){
                in= Double.parseDouble(tf1.getText());
                r=in*16.6666;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"16.666");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Pakistani Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*1.5625;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1.5625");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Singapure Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.0203;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.0203");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Sri Lankan Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*2.1739;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"2.1739");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="US dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.015;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.015");
                tf2.setText("Result");
            }
            
        }
        
        
        
        
        
        
        if(cbfrom.getSelectedItem()=="Singapore Dollar"){
            if(cbto.getSelectedItem()=="Algerian Dinar"){
                in= Double.parseDouble(tf1.getText());
                r=in*80.0652;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"80.0652");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Australian Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.9536;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.9536");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Bangladeshi Taka"){
                in= Double.parseDouble(tf1.getText());
                r=in*57.5468;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"57.5468");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Brazilian Real"){
                in= Double.parseDouble(tf1.getText());
                r=in*2.6037;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"2.6037");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="British Pound"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.5186;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.5186");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Canadian Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.9441;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.9441");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Chinese Offshore"){
                in= Double.parseDouble(tf1.getText());
                r=in*4.7769;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"4.7769");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Chinese Yuan"){
                in= Double.parseDouble(tf1.getText());
                r=in*4.7707;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"4.7707");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Euros"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.6528;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.6528");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Hong Kong Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*5.7145;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"5.7145");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Indian Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*49.1066;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"49.1066");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Iraqi Dinars"){
                in= Double.parseDouble(tf1.getText());
                r=in*818.4444;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"818.4444");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Pakistani Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*76.7291;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"76.7291");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Singapure Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Sri Lankan Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*106.7536;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"106.7536");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="US dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.7366;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.7366");
                tf2.setText("Result");
            }
            
        }
        
        
        
        
        
        
        if(cbfrom.getSelectedItem()=="US Dollar"){
            if(cbto.getSelectedItem()=="Algerian Dinar"){
                in= Double.parseDouble(tf1.getText());
                r=in*108.6956;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"108.6956");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Australian Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*1.2946;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1.2946");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Bangladeshi Taka"){
                in= Double.parseDouble(tf1.getText());
                r=in*78.125;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"78.125");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Brazilian Real"){
                in= Double.parseDouble(tf1.getText());
                r=in*3.5348;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"3.5348");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="British Pound"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.7014;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.7014");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Canadian Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*1.2817;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1.2817");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Chinese Offshore"){
                in= Double.parseDouble(tf1.getText());
                r=in*6.485;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"6.485");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Chinese Yuan"){
                in= Double.parseDouble(tf1.getText());
                r=in*6.4766;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"6.4766");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Euros"){
                in= Double.parseDouble(tf1.getText());
                r=in*0.8863;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"0.8863");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Hong Kong Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*7.7579;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"7.7579");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Indian Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*66.6666;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"66.6666");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Iraqi Dinars"){
                in= Double.parseDouble(tf1.getText());
                r=in*1111.1111;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1111.1111");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Pakistani Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*104.1666;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"104.166");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Singapure Dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in*1.3575;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1.3575");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="Sri Lankan Rupee"){
                in= Double.parseDouble(tf1.getText());
                r=in*144.9275;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"144.9275");
                tf2.setText("Result");
            }
            if(cbto.getSelectedItem()=="US dollar"){
                in= Double.parseDouble(tf1.getText());
                r=in;
                tf1.setText(String.valueOf(r));
                lr.setText(" 1="+"1");
                tf2.setText("Result");
            }
            
        }
    }//GEN-LAST:event_bokActionPerformed

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
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Currency().setVisible(true);
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
    private javax.swing.JButton Btamperature;
    private javax.swing.JButton bclr;
    private javax.swing.JButton bok;
    private javax.swing.JComboBox cbfrom;
    private javax.swing.JComboBox cbto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel lr;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
