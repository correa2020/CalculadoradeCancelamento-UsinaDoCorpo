package cancellationcalculation;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Display extends javax.swing.JFrame {

    public Display() {
        initComponents();
        campValue5.setText(String.valueOf("0"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        campValue1 = new javax.swing.JTextField();
        campValue3 = new javax.swing.JTextField();
        campValue2 = new javax.swing.JTextField();
        campValue4 = new javax.swing.JTextField();
        text2 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        textPara3 = new javax.swing.JLabel();
        textPara4 = new javax.swing.JLabel();
        textPara5 = new javax.swing.JLabel();
        textPara6 = new javax.swing.JLabel();
        dayValue = new javax.swing.JTextField();
        utilizedDays = new javax.swing.JTextField();
        valueUtilized = new javax.swing.JTextField();
        returnedValue = new javax.swing.JTextField();
        result = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        text5 = new javax.swing.JLabel();
        campValue6 = new javax.swing.JTextField();
        textPara7 = new javax.swing.JLabel();
        returnedFine = new javax.swing.JTextField();
        campValue5 = new javax.swing.JTextField();
        text6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usina do Corpo");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(579, 550));
        setPreferredSize(new java.awt.Dimension(579, 550));
        setResizable(false);

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 51, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CALCULADORA DE CANCELAMENTO (USINA)");

        text1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("DATA INICIAL:");

        text3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("VALOR DO PLANO:");

        campValue1.setBackground(new java.awt.Color(204, 204, 204));
        campValue1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue1ActionPerformed(evt);
            }
        });

        campValue3.setBackground(new java.awt.Color(204, 204, 204));
        campValue3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue3ActionPerformed(evt);
            }
        });

        campValue2.setBackground(new java.awt.Color(204, 204, 204));
        campValue2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue2ActionPerformed(evt);
            }
        });

        campValue4.setBackground(new java.awt.Color(204, 204, 204));
        campValue4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue4ActionPerformed(evt);
            }
        });

        text2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("DATA DO CANCELAMENTO:");

        text4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("VALOR DO MENSAL VIGENTE:");

        textPara3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textPara3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPara3.setText("VALOR DO DIA:");

        textPara4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textPara4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPara4.setText("VALOR UTILIZADO");

        textPara5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textPara5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPara5.setText("VALOR A SER DEVOLVIDO:");

        textPara6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textPara6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPara6.setText("DIAS UTILIZADOS:");

        dayValue.setBackground(new java.awt.Color(255, 51, 0));
        dayValue.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dayValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayValueActionPerformed(evt);
            }
        });

        utilizedDays.setBackground(new java.awt.Color(255, 51, 0));
        utilizedDays.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        utilizedDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilizedDaysActionPerformed(evt);
            }
        });

        valueUtilized.setBackground(new java.awt.Color(255, 51, 0));
        valueUtilized.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        valueUtilized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueUtilizedActionPerformed(evt);
            }
        });

        returnedValue.setBackground(new java.awt.Color(255, 51, 0));
        returnedValue.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        returnedValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnedValueActionPerformed(evt);
            }
        });

        result.setBackground(new java.awt.Color(242, 113, 49));
        result.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        result.setText("CALCULAR");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(242, 113, 49));
        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("LIMPAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        text5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        text5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text5.setText("ATESTADO (SE TIVER):");

        campValue6.setBackground(new java.awt.Color(204, 204, 204));
        campValue6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue6ActionPerformed(evt);
            }
        });

        textPara7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textPara7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPara7.setText("VALOR DA MULTA");

        returnedFine.setBackground(new java.awt.Color(255, 51, 0));
        returnedFine.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        returnedFine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnedFineActionPerformed(evt);
            }
        });

        campValue5.setBackground(new java.awt.Color(204, 204, 204));
        campValue5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue5ActionPerformed(evt);
            }
        });

        text6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        text6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text6.setText("PORCENTUAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(text3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campValue4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(text4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(text1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(text2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campValue5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campValue6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(result)
                                .addGap(18, 18, 18)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textPara3)
                                    .addComponent(textPara4)
                                    .addComponent(textPara6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textPara5)
                                        .addComponent(textPara7, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dayValue)
                                    .addComponent(utilizedDays)
                                    .addComponent(valueUtilized)
                                    .addComponent(returnedFine)
                                    .addComponent(returnedValue, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(title)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campValue1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campValue2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(text4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campValue4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campValue3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campValue6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campValue5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(utilizedDays, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dayValue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(valueUtilized, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(returnedFine, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(returnedValue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textPara3)
                        .addGap(18, 18, 18)
                        .addComponent(textPara6)
                        .addGap(18, 18, 18)
                        .addComponent(textPara4)
                        .addGap(18, 18, 18)
                        .addComponent(textPara7)
                        .addGap(18, 18, 18)
                        .addComponent(textPara5)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1303, 1303, 1303))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue1ActionPerformed

    private void campValue4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue4ActionPerformed

    private void campValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue2ActionPerformed

    private void campValue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue3ActionPerformed

    private void dayValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayValueActionPerformed

    private void utilizedDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilizedDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utilizedDaysActionPerformed

    private void valueUtilizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueUtilizedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueUtilizedActionPerformed

    private void returnedValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnedValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnedValueActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed

        try {
            CalculationResume calculation = new CalculationResume();
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            
            DateFormat dateFormat = new SimpleDateFormat ("dd/MM/yyyy");
            dateFormat.setLenient(false);
            
            Date initialDate = dateFormat.parse(campValue1.getText());
            Date finalDate = dateFormat.parse(campValue2.getText());
            double monthPrice = Double.parseDouble(campValue3.getText().replace("," , "."));
            double planPrice = Double.parseDouble(campValue4.getText().replace("," , "."));
            double medicalCertificate = Double.parseDouble(campValue5.getText().replace("," , "."));
            double fine = Double.parseDouble(campValue6.getText().replace("," , "."));
            
            calculation.subtrationDate(initialDate, finalDate, medicalCertificate);
            calculation.dayValue(monthPrice);
            calculation.valueUtilized();
            calculation.returnedFine(planPrice, fine);
            calculation.returnedValue(monthPrice, planPrice);
 
            
            dayValue.setText(String.valueOf(decimalFormat.format(calculation.getDayValue())));
            utilizedDays.setText(String.valueOf(decimalFormat.format(calculation.getDiffDate())));
            valueUtilized.setText(String.valueOf(decimalFormat.format(calculation.getValueUtilized())));
            returnedFine.setText(String.valueOf(decimalFormat.format(calculation.getValueFine())));
            returnedValue.setText(String.valueOf(decimalFormat.format(calculation.getValueReturned())));
            
        } catch (ParseException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resultActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        dayValue.setText(String.valueOf(""));
        utilizedDays.setText(String.valueOf(""));
        valueUtilized.setText(String.valueOf(""));
        returnedFine.setText(String.valueOf(""));
        returnedValue.setText(String.valueOf(""));
        campValue1.setText(String.valueOf(""));
        campValue2.setText(String.valueOf(""));
        campValue3.setText(String.valueOf(""));
        campValue4.setText(String.valueOf(""));
        campValue5.setText(String.valueOf("0"));
        campValue6.setText(String.valueOf(""));
    }//GEN-LAST:event_clearActionPerformed

    private void campValue6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue6ActionPerformed

    private void returnedFineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnedFineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnedFineActionPerformed

    private void campValue5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue5ActionPerformed

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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campValue1;
    private javax.swing.JTextField campValue2;
    private javax.swing.JTextField campValue3;
    private javax.swing.JTextField campValue4;
    private javax.swing.JTextField campValue5;
    private javax.swing.JTextField campValue6;
    private javax.swing.JButton clear;
    private javax.swing.JTextField dayValue;
    private javax.swing.JButton result;
    private javax.swing.JTextField returnedFine;
    private javax.swing.JTextField returnedValue;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel textPara3;
    private javax.swing.JLabel textPara4;
    private javax.swing.JLabel textPara5;
    private javax.swing.JLabel textPara6;
    private javax.swing.JLabel textPara7;
    private javax.swing.JLabel title;
    private javax.swing.JTextField utilizedDays;
    private javax.swing.JTextField valueUtilized;
    // End of variables declaration//GEN-END:variables
}
