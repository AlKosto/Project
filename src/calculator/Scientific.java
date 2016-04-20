
package calculator;
import java.awt.Color;
import java.io.IOException;
import java.math.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Scientific extends javax.swing.JFrame {
    private boolean zerodisp;
    private boolean decdisp;
    private boolean dg;
    private boolean sh;
    private byte op ;
    private Double ina;
    private Double inb;
    private Double out;
    
    public Scientific() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG1 = new javax.swing.ButtonGroup();
        display2 = new javax.swing.JTextField();
        Bage = new javax.swing.JButton();
        Btempareture = new javax.swing.JButton();
        Bcrre = new javax.swing.JButton();
        Bbinari = new javax.swing.JButton();
        Bs = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        eight = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        one = new javax.swing.JButton();
        three = new javax.swing.JButton();
        five = new javax.swing.JButton();
        four = new javax.swing.JButton();
        six = new javax.swing.JButton();
        two = new javax.swing.JButton();
        degrees = new javax.swing.JRadioButton();
        redians = new javax.swing.JRadioButton();
        zero = new javax.swing.JButton();
        decpoint = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        cleare = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        parcent = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        negative = new javax.swing.JButton();
        onebyx = new javax.swing.JButton();
        squared = new javax.swing.JButton();
        cubed = new javax.swing.JButton();
        squareroot = new javax.swing.JButton();
        cuberoot = new javax.swing.JButton();
        devide = new javax.swing.JButton();
        multiple = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        add = new javax.swing.JButton();
        negate = new javax.swing.JButton();
        shift = new javax.swing.JToggleButton();
        equals = new javax.swing.JButton();
        display1 = new javax.swing.JTextField();
        memorydisplay = new javax.swing.JTextField();
        memoryclear = new javax.swing.JButton();
        memoryread = new javax.swing.JButton();
        memorysave = new javax.swing.JButton();
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

        display2.setBackground(new java.awt.Color(199, 218, 220));
        display2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        display2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Bage.setText("Age");
        Bage.setToolTipText("");
        Bage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bage.setFocusable(false);
        Bage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BageActionPerformed(evt);
            }
        });

        Btempareture.setText("Temperature");
        Btempareture.setToolTipText("");
        Btempareture.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btempareture.setFocusable(false);
        Btempareture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtemparetureActionPerformed(evt);
            }
        });

        Bcrre.setText("Currency");
        Bcrre.setToolTipText("");
        Bcrre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bcrre.setFocusable(false);
        Bcrre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcrreActionPerformed(evt);
            }
        });

        Bbinari.setText("Binari");
        Bbinari.setToolTipText("");
        Bbinari.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bbinari.setFocusable(false);
        Bbinari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbinariActionPerformed(evt);
            }
        });

        Bs.setText("Normal");
        Bs.setToolTipText("");
        Bs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bs.setFocusable(false);
        Bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");
        jPanel1.setFocusable(false);

        eight.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eight.setText("8");
        eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        seven.setText("7");
        seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nine.setText("9");
        nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        one.setText("1");
        one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        three.setText("3");
        three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        five.setText("5");
        five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        four.setText("4");
        four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        six.setText("6");
        six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        two.setText("2");
        two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        BG1.add(degrees);
        degrees.setSelected(true);
        degrees.setText("Degree");
        degrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesActionPerformed(evt);
            }
        });

        BG1.add(redians);
        redians.setText("Readians");
        redians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rediansActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zero.setText("0");
        zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        decpoint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        decpoint.setText(".");
        decpoint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        decpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpointActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton2.setText("about");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset.setText("CE");
        reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        cleare.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cleare.setText("C");
        cleare.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cleare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleareActionPerformed(evt);
            }
        });

        pi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        pi.setText("PI");
        pi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(degrees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(redians)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cleare, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(degrees)
                    .addComponent(redians))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(decpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cleare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("");
        jPanel2.setFocusable(false);

        sin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        sin.setText("Sin");
        sin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cos.setText("Cos");
        cos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tan.setText("Tan");
        tan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        parcent.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        parcent.setText("%");
        parcent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        parcent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcentActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton20.setText("!");
        jButton20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        negative.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        negative.setText("+-");
        negative.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        negative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativeActionPerformed(evt);
            }
        });

        onebyx.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        onebyx.setText("1/x");
        onebyx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        onebyx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onebyxActionPerformed(evt);
            }
        });

        squared.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        squared.setText("squre");
        squared.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squaredActionPerformed(evt);
            }
        });

        cubed.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cubed.setText("cube");
        cubed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cubed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubedActionPerformed(evt);
            }
        });

        squareroot.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        squareroot.setText("squareroot");
        squareroot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squarerootActionPerformed(evt);
            }
        });

        cuberoot.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cuberoot.setText("cuberoot");
        cuberoot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuberoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuberootActionPerformed(evt);
            }
        });

        devide.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        devide.setText("/");
        devide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        devide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devideActionPerformed(evt);
            }
        });

        multiple.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        multiple.setText("*");
        multiple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleActionPerformed(evt);
            }
        });

        subtract.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        subtract.setText("-");
        subtract.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        add.setText("+");
        add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        negate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        negate.setText("+-");
        negate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateActionPerformed(evt);
            }
        });

        shift.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        shift.setText("SH");
        shift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiftMouseClicked(evt);
            }
        });
        shift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftActionPerformed(evt);
            }
        });

        equals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        equals.setText("=");
        equals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(onebyx, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(negative, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parcent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuberoot, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(negate, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(devide, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiple, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(onebyx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(negative, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parcent, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(squared, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cuberoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(squareroot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(negate, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(devide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        display1.setEditable(false);
        display1.setBackground(new java.awt.Color(199, 218, 220));
        display1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        display1.setText("0");
        display1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        memorydisplay.setBackground(new java.awt.Color(199, 218, 220));
        memorydisplay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        memorydisplay.setText("0");
        memorydisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        memorydisplay.setFocusable(false);

        memoryclear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        memoryclear.setText("MC");
        memoryclear.setToolTipText("");
        memoryclear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryclear.setFocusable(false);
        memoryclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryclearActionPerformed(evt);
            }
        });

        memoryread.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        memoryread.setText("MR");
        memoryread.setToolTipText("");
        memoryread.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryread.setFocusable(false);
        memoryread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryreadActionPerformed(evt);
            }
        });

        memorysave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        memorysave.setText("MS");
        memorysave.setToolTipText("");
        memorysave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memorysave.setFocusable(false);
        memorysave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memorysaveActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(memorydisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btempareture, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bcrre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bage, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bbinari, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bs, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(display2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(memoryread, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(memoryclear, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(memorysave, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(display1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memoryread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memoryclear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memorysave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memorydisplay, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bbinari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btempareture, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bcrre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(570, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsActionPerformed
        
        calculator ob= new calculator();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_BsActionPerformed

    private void BtemparetureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtemparetureActionPerformed
        Temperature obb= new Temperature();
        this.setVisible(false);
        obb.setVisible(true);
    }//GEN-LAST:event_BtemparetureActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(!zerodisp && !decdisp)
        {
            display1.setText(null);
        }
        String entervalue = display1.getText()+ eight.getText();
        display1.setText(entervalue);
        zerodisp=true;
    }//GEN-LAST:event_eightActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
         if(!zerodisp && !decdisp)
        {
            display1.setText(null);
        }
         String entervalue = display1.getText() + one.getText();
        display1.setText(entervalue);
        zerodisp=true;
    }//GEN-LAST:event_oneActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(!zerodisp && !decdisp)
        {
            display1.setText(null);
        }
        String entervalue = display1.getText() + zero.getText();
        display1.setText(entervalue);
    }//GEN-LAST:event_zeroActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(!zerodisp && !decdisp)
        {
            display1.setText(null);
        }
        String entervalue = display1.getText() + two.getText();
        display1.setText(entervalue);
        zerodisp=true;
    }//GEN-LAST:event_twoActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
         if(!zerodisp && !decdisp)
        {
            display1.setText(null);
        }
         String entervalue = display1.getText() + nine.getText();
        display1.setText(entervalue);
        zerodisp=true;
    }//GEN-LAST:event_nineActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
         if(!zerodisp && !decdisp)
        {
            display1.setText(null);
        }
         String entervalue = display1.getText() + four.getText();
        display1.setText(entervalue);
        zerodisp=true;
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
         if(!zerodisp && !decdisp)
        {
            display1.setText(null);
        }
         String entervalue = display1.getText() + five.getText();
        display1.setText(entervalue);
        zerodisp=true;
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
         if(!zerodisp && !decdisp)
        {
            display1.setText(null);
        }
         String entervalue = display1.getText() + six.getText();
        display1.setText(entervalue);
        zerodisp=true;
    }//GEN-LAST:event_sixActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
         if(!zerodisp && !decdisp)
        {
            display1.setText(null);
        }
         String entervalue = display1.getText() + three.getText();
        display1.setText(entervalue);
        zerodisp=true;
    }//GEN-LAST:event_threeActionPerformed

    private void decpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpointActionPerformed
        if(!decdisp)
        {
        String entervalue = display1.getText() + decpoint.getText();
        display1.setText(entervalue);
        decdisp=true;
        }
    }//GEN-LAST:event_decpointActionPerformed

    private void cleareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleareActionPerformed
        display1.setText("0");
        zerodisp= false;
        decdisp= false;
    }//GEN-LAST:event_cleareActionPerformed

    private void BbinariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbinariActionPerformed
         Binari ob1= new Binari();
        this.setVisible(false);
        ob1.setVisible(true);
    }//GEN-LAST:event_BbinariActionPerformed

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

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if(!zerodisp && !decdisp)
        {
            display1.setText(null);
        }
        String entervalue = display1.getText() + seven.getText();
        display1.setText(entervalue);
        zerodisp=true;
        
    }//GEN-LAST:event_sevenActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(op==0){
            ina= Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb=Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if (op==1) {
            ina=ina+inb;
        }
        if (op==2) {
            ina=ina-inb;
        }
        if (op==3) {
            ina=ina*inb;
        }
        if (op==4) {
            ina=ina/inb;
        }
        if (op==5) {
            ina=(ina*inb)/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina)+ "+");
        op=1;
        decdisp= false;
        zerodisp= false;
    }//GEN-LAST:event_addActionPerformed

    private void negateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negateActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out= inb* -1;
        
        if(out>-100000000&&out<100000000){
            display1.setText(String.valueOf(out));
        }
        else
            display1.setText("Error");
    }//GEN-LAST:event_negateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        display1.setText("0");
        display2.setText("");
        zerodisp= false;
        decdisp= false;
        ina = 0.0;
        inb = 0.0;
        out = 0.0;
    }//GEN-LAST:event_resetActionPerformed

    private void memoryreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryreadActionPerformed
        display1.setText(String.valueOf(memorydisplay.getText()));
    }//GEN-LAST:event_memoryreadActionPerformed

    private void memoryclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryclearActionPerformed
        memorydisplay.setText("0");
    }//GEN-LAST:event_memoryclearActionPerformed

    private void memorysaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memorysaveActionPerformed
        memorydisplay.setText(String.valueOf(display1.getText()));
    }//GEN-LAST:event_memorysaveActionPerformed

    private void onebyxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onebyxActionPerformed
        inb=Double.parseDouble(display1.getText());
        out= 1/inb;
        if(out>-100000000&&out<100000000){
            display1.setText(String.valueOf(out));
        }
        else{
            display1.setText("Error");
         }
        
        display2.setText("1/"+String.valueOf(inb));
        out =0.0;
        op=0;
    }//GEN-LAST:event_onebyxActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        display1.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_piActionPerformed

    private void squaredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squaredActionPerformed
        inb=Double.parseDouble(display1.getText());
        out= inb*inb;
        if(out>-100000000&&out<100000000){
            display1.setText(String.valueOf(out));
        }
        else{
            display2.setText("Error");
         }
        display2.setText(String.valueOf(inb)+"*"+String.valueOf(inb));
        out=0.0;
        op=0;
    }//GEN-LAST:event_squaredActionPerformed

    private void squarerootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squarerootActionPerformed
        inb=Double.parseDouble(display1.getText());
        out= Math.sqrt(inb);
        if(out>-100000000&&out<100000000){
            display1.setText(String.valueOf(out));
        }
        else{
            display2.setText("Error");
         }
        
        display2.setText("Squareroot "+String.valueOf(inb));
        out=0.0;
        op=0;
    }//GEN-LAST:event_squarerootActionPerformed

    private void cubedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubedActionPerformed
        inb=Double.parseDouble(display1.getText());
        out= inb*inb*inb;
        if(out>-100000000&&out<100000000){
            display1.setText(String.valueOf(out));
        }
        else{
            display2.setText("Error");
         }
        
        display2.setText(String.valueOf(inb)+"*"+String.valueOf(inb)+"*"+String.valueOf(inb));
        out=0.0;
        op=0;
    }//GEN-LAST:event_cubedActionPerformed

    private void cuberootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuberootActionPerformed
        inb=Double.parseDouble(display1.getText());
        out= Math.cbrt(inb);
        if(out>-100000000&&out<100000000){
            display1.setText(String.valueOf(out));
        }
        else{
            display2.setText("Error");
         }
        
        display2.setText("Cuberoot "+String.valueOf(inb));
        out=0.0;
        op=0;
    }//GEN-LAST:event_cuberootActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftActionPerformed
        
        
    }//GEN-LAST:event_shiftActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        inb= Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dg){
                display2.setText("sin("+ display1.getText()+")");
                inb= inb* 0.0174532925;
            }
            out= Math.sin(inb);
        }
        else{
            display2.setText("sinh("+display1.getText()+")");
            out= Math.sinh(inb);
        }
        display1.setText(String.valueOf(out));
        out=0.0;
        op=0;
    }//GEN-LAST:event_sinActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        inb= Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dg){
                display2.setText("cos("+ display1.getText()+")");
                inb= inb* 0.0174532925;
            }
            out= Math.cos(inb);
        }
        else{
            display2.setText("cosh("+display1.getText()+")");
            out= Math.cosh(inb);
        }
        display1.setText(String.valueOf(out));
        out=0.0;
        op=0;
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        inb= Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dg){
                display2.setText("tan("+ display1.getText()+")");
                inb= inb* 0.0174532925;
            }
            out= Math.tan(inb);
        }
        else{
            display2.setText("tanh("+display1.getText()+")");
            out= Math.tanh(inb);
        }
        display1.setText(String.valueOf(out));
        out=0.0;
        op=0;
    }//GEN-LAST:event_tanActionPerformed

    private void degreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesActionPerformed
        dg=false;
    }//GEN-LAST:event_degreesActionPerformed

    private void rediansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rediansActionPerformed
        dg=true;
    }//GEN-LAST:event_rediansActionPerformed

    private void shiftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftMouseClicked

        if(!sh){
            sh=true;
        }
        else sh=false;
    }//GEN-LAST:event_shiftMouseClicked

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        if(op==0){
            ina= Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb=Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if (op==1) {
            ina=ina+inb;
        }
        if (op==2) {
            ina=ina-inb;
        }
        if (op==3) {
            ina=ina*inb;
        }
        if (op==4) {
            ina=ina/inb;
        }
        if (op==5) {
            ina=(ina*inb)/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina)+ "-");
        op=2;
        decdisp= false;
        zerodisp= false;
    }//GEN-LAST:event_subtractActionPerformed

    private void multipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleActionPerformed
        if(op==0){
            ina= Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb=Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if (op==1) {
            ina=ina+inb;
        }
        if (op==2) {
            ina=ina-inb;
        }
        if (op==3) {
            ina=ina*inb;
        }
        if (op==4) {
            ina=ina/inb;
        }
        if (op==5) {
            ina=(ina*inb)/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina)+ "*");
        op=3;
        decdisp= false;
        zerodisp= false;
    }//GEN-LAST:event_multipleActionPerformed

    private void devideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devideActionPerformed
        if(op==0){
            ina= Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb=Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if (op==1) {
            ina=ina+inb;
        }
        if (op==2) {
            ina=ina-inb;
        }
        if (op==3) {
            ina=ina*inb;
        }
        if (op==4) {
            ina=ina/inb;
        }
        if (op==5) {
            ina=ina*inb/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina)+ "/");
        op=4;
        decdisp= false;
        zerodisp= false;
    }//GEN-LAST:event_devideActionPerformed

    private void parcentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcentActionPerformed
       ina= Double.parseDouble(String.valueOf(display1.getText()));
       display1.setText("0");
       display2.setText(String.valueOf(ina)+"%(");
       decdisp=false;
       zerodisp= false;
       op=5;
    }//GEN-LAST:event_parcentActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        inb= Double.parseDouble(String.valueOf(display1.getText()));
        if(op==0){
            out=inb;
            display2.setText(String.valueOf(inb));
        }
        if(op==1){
            out=ina+inb;
            display2.setText(display2.getText()+ String.valueOf(inb));
        }
        if(op==2){
            out=ina-inb;
            display2.setText(display2.getText()+ String.valueOf(inb));
        }
        if(op==3){
            out=ina*inb;
            display2.setText(display2.getText()+ String.valueOf(inb));
        }
        if(op==4){
            out=ina/inb;
            display2.setText(display2.getText()+ String.valueOf(inb));
        }
        if(op==5){
            out=ina*inb/100;
            display2.setText(display2.getText()+ String.valueOf(inb)+")");
        }
        if(out>-100000000&&out<100000000){
            display1.setText(String.valueOf(out));
        }
        else{
            display2.setText("Error");
         }
        
        
        ina=0.0;
        op=0;
        decdisp= false;
        zerodisp=false;
        inb=0.0;
        out=0.0;
        
        
    }//GEN-LAST:event_equalsActionPerformed

    private void negativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeActionPerformed
        Double kk =Double.parseDouble(display2.getText());
        kk=kk*-1;
        display2.setText(String.valueOf(kk));
    }//GEN-LAST:event_negativeActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        inb=Double.parseDouble(display1.getText());
        Double kosto=1.0;
        for(int i=1; i<=inb; i++){
            kosto=kosto*i;
        }
        out=kosto;
        if(out>-100000000&&out<100000000){
            display1.setText(String.valueOf(out));
        }
        else{
            display1.setText("Out of limit");
         }
        display2.setText(String.valueOf(inb)+"!");
        out=0.0;
        op=0;
    }//GEN-LAST:event_jButton20ActionPerformed

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
            java.util.logging.Logger.getLogger(Scientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display1 the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scientific().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG1;
    private javax.swing.JButton Bage;
    private javax.swing.JButton Bbinari;
    private javax.swing.JButton Bcrre;
    private javax.swing.JButton Bs;
    private javax.swing.JButton Btempareture;
    private javax.swing.JButton add;
    private javax.swing.JButton cleare;
    private javax.swing.JButton cos;
    private javax.swing.JButton cubed;
    private javax.swing.JButton cuberoot;
    private javax.swing.JButton decpoint;
    private javax.swing.JRadioButton degrees;
    private javax.swing.JButton devide;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton memoryclear;
    private javax.swing.JTextField memorydisplay;
    private javax.swing.JButton memoryread;
    private javax.swing.JButton memorysave;
    private javax.swing.JButton multiple;
    private javax.swing.JButton negate;
    private javax.swing.JButton negative;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton onebyx;
    private javax.swing.JButton parcent;
    private javax.swing.JButton pi;
    private javax.swing.JRadioButton redians;
    private javax.swing.JButton reset;
    private javax.swing.JButton seven;
    private javax.swing.JToggleButton shift;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton squared;
    private javax.swing.JButton squareroot;
    private javax.swing.JButton subtract;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
