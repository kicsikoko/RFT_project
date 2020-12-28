/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rft_calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author kovac
 */
public class index extends javax.swing.JFrame {
    
    double firstnum, secondnum, result;
    String operation;
    double answer;

    /**
     * Creates new form index
     */
    public index() {
        initComponents();
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
        btn_torles = new javax.swing.JButton();
        btn_het = new javax.swing.JButton();
        btn_negy = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_nyolc = new javax.swing.JButton();
        btn_ot = new javax.swing.JButton();
        btn_egy = new javax.swing.JButton();
        btn_ketto = new javax.swing.JButton();
        btn_nulla = new javax.swing.JButton();
        btn_osszeadas = new javax.swing.JButton();
        btn_kilenc = new javax.swing.JButton();
        btn_hat = new javax.swing.JButton();
        btn_harom = new javax.swing.JButton();
        btn_tizedespont = new javax.swing.JButton();
        btn_egyenlo = new javax.swing.JButton();
        btn_szorzas = new javax.swing.JButton();
        btn_osztas = new javax.swing.JButton();
        btn_kivonas = new javax.swing.JButton();
        btn_szazalekszamitas = new javax.swing.JButton();
        negativ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        value = new javax.swing.JTextField();
        szamitas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btn_torles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_torles.setText("Del");
        btn_torles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_torlesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_torles);
        btn_torles.setBounds(30, 130, 60, 40);

        btn_het.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_het.setText("7");
        btn_het.setToolTipText("");
        btn_het.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_het);
        btn_het.setBounds(30, 180, 60, 40);

        btn_negy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_negy.setText("4");
        btn_negy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_negyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_negy);
        btn_negy.setBounds(30, 230, 60, 40);

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear);
        btn_clear.setBounds(100, 130, 60, 40);

        btn_nyolc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_nyolc.setText("8");
        btn_nyolc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nyolcActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nyolc);
        btn_nyolc.setBounds(100, 183, 60, 40);

        btn_ot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ot.setText("5");
        btn_ot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_otActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ot);
        btn_ot.setBounds(100, 233, 60, 40);

        btn_egy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_egy.setText("1");
        btn_egy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_egyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_egy);
        btn_egy.setBounds(30, 280, 60, 40);

        btn_ketto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ketto.setText("2");
        btn_ketto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kettoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ketto);
        btn_ketto.setBounds(100, 280, 60, 40);

        btn_nulla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_nulla.setText("0");
        btn_nulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nullaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nulla);
        btn_nulla.setBounds(30, 330, 60, 40);

        btn_osszeadas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_osszeadas.setText("+");
        btn_osszeadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_osszeadasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_osszeadas);
        btn_osszeadas.setBounds(240, 280, 60, 40);

        btn_kilenc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_kilenc.setText("9");
        btn_kilenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kilencActionPerformed(evt);
            }
        });
        jPanel1.add(btn_kilenc);
        btn_kilenc.setBounds(170, 183, 60, 40);

        btn_hat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_hat.setText("6");
        btn_hat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hatActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hat);
        btn_hat.setBounds(170, 233, 60, 40);

        btn_harom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_harom.setText("3");
        btn_harom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_haromActionPerformed(evt);
            }
        });
        jPanel1.add(btn_harom);
        btn_harom.setBounds(170, 280, 60, 40);

        btn_tizedespont.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_tizedespont.setText(".");
        btn_tizedespont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tizedespontActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tizedespont);
        btn_tizedespont.setBounds(100, 330, 60, 40);

        btn_egyenlo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_egyenlo.setText("=");
        btn_egyenlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_egyenloActionPerformed(evt);
            }
        });
        jPanel1.add(btn_egyenlo);
        btn_egyenlo.setBounds(170, 330, 60, 40);

        btn_szorzas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_szorzas.setText("*");
        jPanel1.add(btn_szorzas);
        btn_szorzas.setBounds(240, 130, 60, 40);

        btn_osztas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_osztas.setText("/");
        btn_osztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_osztasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_osztas);
        btn_osztas.setBounds(240, 180, 60, 40);

        btn_kivonas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_kivonas.setText("-");
        btn_kivonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kivonasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_kivonas);
        btn_kivonas.setBounds(240, 230, 60, 40);

        btn_szazalekszamitas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_szazalekszamitas.setText("%");
        btn_szazalekszamitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_szazalekszamitasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_szazalekszamitas);
        btn_szazalekszamitas.setBounds(170, 130, 60, 40);

        negativ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        negativ.setText("-/+");
        negativ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativActionPerformed(evt);
            }
        });
        jPanel1.add(negativ);
        negativ.setBounds(240, 330, 60, 40);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 350, 390);

        value.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(value);
        value.setBounds(30, 20, 270, 60);

        szamitas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(szamitas);
        szamitas.setBounds(34, 84, 260, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nullaActionPerformed
         // btn_nulla értékének beállítása
         String nulla = value.getText()+ btn_nulla.getText();
         value.setText(nulla);
    }//GEN-LAST:event_btn_nullaActionPerformed

    private void btn_egyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_egyActionPerformed
        // btn_egy értékének beállítása
        String egy = value.getText()+ btn_egy.getText();
         value.setText(egy);
    }//GEN-LAST:event_btn_egyActionPerformed

    private void btn_kettoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kettoActionPerformed
        // btn_ketto értékének beállítása
        String ketto = value.getText()+ btn_ketto.getText();
         value.setText(ketto);
    }//GEN-LAST:event_btn_kettoActionPerformed

    private void btn_haromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_haromActionPerformed
        // btn_harom értékének beállítása
        String harom = value.getText()+ btn_harom.getText();
         value.setText(harom);
    }//GEN-LAST:event_btn_haromActionPerformed

    private void btn_negyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_negyActionPerformed
        // btn_negy értékének beállítása
        String negy = value.getText()+ btn_negy.getText();
         value.setText(negy);
    }//GEN-LAST:event_btn_negyActionPerformed

    private void btn_otActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_otActionPerformed
        // btn_ot értékének beállítása
        String ot = value.getText()+ btn_ot.getText();
         value.setText(ot);
    }//GEN-LAST:event_btn_otActionPerformed

    private void btn_hatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hatActionPerformed
        // btn_hat értékének beállítása
        String hat = value.getText()+ btn_hat.getText();
         value.setText(hat);
    }//GEN-LAST:event_btn_hatActionPerformed

    private void btn_hetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hetActionPerformed
        // btn_het értékének beállítása
        String het = value.getText()+ btn_het.getText();
         value.setText(het);
    }//GEN-LAST:event_btn_hetActionPerformed

    private void btn_nyolcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nyolcActionPerformed
        // btn_egy értékének beállítása
        String nyolc = value.getText()+ btn_nyolc.getText();
         value.setText(nyolc);
    }//GEN-LAST:event_btn_nyolcActionPerformed

    private void btn_kilencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kilencActionPerformed
        // btn_kilenc értékének beállítása
        String kilenc = value.getText()+ btn_kilenc.getText();
         value.setText(kilenc);
    }//GEN-LAST:event_btn_kilencActionPerformed

    private void btn_torlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_torlesActionPerformed
        // btn_torles beállítása
        String torol = null;
        if (value.getText().length()>0) {
            StringBuilder st = new StringBuilder(value.getText());
            st.deleteCharAt(value.getText().length()-1);
            torol = st.toString();
            value.setText(torol);
            szamitas.setText(null);
        }
    }//GEN-LAST:event_btn_torlesActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        value.setText(null);
        szamitas.setText(null);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_szazalekszamitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_szazalekszamitasActionPerformed
        // TODO add your handling code here:
        try{
            firstnum = Double.parseDouble(value.getText());
            value.setText(""); //when the operand is clicked the value will be set to none or empty
            operation = "%";
        }catch(NumberFormatException o){
            JOptionPane.showMessageDialog(null, "Enter a valid number", "Just Numbers", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_szazalekszamitasActionPerformed

    private void btn_osszeadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_osszeadasActionPerformed
       try{
           double firstnum = Double.parseDouble(value.getText());
           value.setText("");
           operation="+";
           
       }catch(NumberFormatException o){
           JOptionPane.showMessageDialog(null, "Enter a Valid Number", "Just numbers", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btn_osszeadasActionPerformed

    private void btn_osztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_osztasActionPerformed
        try{
        firstnum = Double.parseDouble(value.getText());
        value.setText("");
        operation = "/";
        }catch (NumberFormatException o){
            JOptionPane.showMessageDialog(null, "Enter a Valid Number", "Just Numbers", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_osztasActionPerformed

    private void btn_egyenloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_egyenloActionPerformed
        try{
           String answer;
            secondnum=Double.parseDouble(value.getText());
            if(operation == "+"){
                result= firstnum+secondnum;
                value.setText(""+result);
                szamitas.setText(firstnum + " + " + secondnum + " = " + result);
            }
            else if (operation == "%"){
                result = firstnum % secondnum;
                value.setText(""+result);
                szamitas.setText(firstnum + " % " + secondnum + " = " + result);
            }
            else if (operation == "-"){
                result = firstnum - secondnum;
                value.setText(""+result);
                szamitas.setText(firstnum + " - " + secondnum + " = " + result);
            }
            else if (operation == "/"){
                result = firstnum / secondnum;
                value.setText(""+result);
                szamitas.setText(firstnum + " / " + secondnum + " = " + result);
            }
            else if (operation == "*"){
                result = firstnum * secondnum;
                value.setText(""+result);
                szamitas.setText(firstnum + " * " + secondnum + " = " + result);
            }
            
            
       }catch(NumberFormatException o){
           JOptionPane.showMessageDialog(null, "Enter a Valid Number", "Just numbers", JOptionPane.INFORMATION_MESSAGE);
       }
        
                           
    }//GEN-LAST:event_btn_egyenloActionPerformed

    private void btn_kivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kivonasActionPerformed
        try{
            firstnum = Double.parseDouble(value.getText());
            value.setText("");
            operation = "-";
        }
        catch(NumberFormatException o){
            JOptionPane.showMessageDialog(null, "Enter a Valid Number", "Just Numbers", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_kivonasActionPerformed

    private void btn_tizedespontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tizedespontActionPerformed
        // TODO add your handling code here:
        String pont = value.getText() + btn_tizedespont.getText();
        value.setText(pont);
    }//GEN-LAST:event_btn_tizedespontActionPerformed

    private void negativActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativActionPerformed
        // TODO add your handling code here:
        try {
            double pozORneg = Double.parseDouble(String.valueOf(value.getText()));
            pozORneg = pozORneg * (-1);
            value.setText(String.valueOf(pozORneg));
            szamitas.setText("-" + firstnum);
        } catch(NumberFormatException o) {
            JOptionPane.showMessageDialog(null, "Enter a Valid Number", "Just Numbers", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_negativActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_egy;
    private javax.swing.JButton btn_egyenlo;
    private javax.swing.JButton btn_harom;
    private javax.swing.JButton btn_hat;
    private javax.swing.JButton btn_het;
    private javax.swing.JButton btn_ketto;
    private javax.swing.JButton btn_kilenc;
    private javax.swing.JButton btn_kivonas;
    private javax.swing.JButton btn_negy;
    private javax.swing.JButton btn_nulla;
    private javax.swing.JButton btn_nyolc;
    private javax.swing.JButton btn_osszeadas;
    private javax.swing.JButton btn_osztas;
    private javax.swing.JButton btn_ot;
    private javax.swing.JButton btn_szazalekszamitas;
    private javax.swing.JButton btn_szorzas;
    private javax.swing.JButton btn_tizedespont;
    private javax.swing.JButton btn_torles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton negativ;
    private javax.swing.JLabel szamitas;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
