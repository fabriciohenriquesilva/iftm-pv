/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import logic.ManipuladorDeString;

/**
 *
 * @author IFTM
 */
public class StringServiceView extends javax.swing.JFrame {

    /**
     * Creates new form StringServiceView
     */
    private final ManipuladorDeString stringManipulator;
    
    public StringServiceView() {
        initComponents();
        stringManipulator = new ManipuladorDeString();
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
        lblTexto = new javax.swing.JLabel();
        tfdTexto = new javax.swing.JTextField();
        btnInverterTexto = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        tfdResultado = new javax.swing.JTextField();
        btnTamanhoTexto = new javax.swing.JButton();
        btnPalindromo = new javax.swing.JButton();
        btnNumeroVogais = new javax.swing.JButton();
        btnNumeroConsoantes = new javax.swing.JButton();
        btnCriptografar = new javax.swing.JButton();
        btnDescriptografar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTexto.setText("Escreva seu texto aqui:");

        btnInverterTexto.setText("Inverter Texto");
        btnInverterTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInverterTextoActionPerformed(evt);
            }
        });

        lblResultado.setText("Resultado:");

        tfdResultado.setEditable(false);

        btnTamanhoTexto.setText("Tamanho");
        btnTamanhoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamanhoTextoActionPerformed(evt);
            }
        });

        btnPalindromo.setText("?? Pal??ndromo?");
        btnPalindromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalindromoActionPerformed(evt);
            }
        });

        btnNumeroVogais.setText("Quantidade de vogais");
        btnNumeroVogais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroVogaisActionPerformed(evt);
            }
        });

        btnNumeroConsoantes.setText("Quantidade de Consoantes");
        btnNumeroConsoantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroConsoantesActionPerformed(evt);
            }
        });

        btnCriptografar.setText("Criptografar");
        btnCriptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriptografarActionPerformed(evt);
            }
        });

        btnDescriptografar.setText("Descriptografar");
        btnDescriptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescriptografarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblResultado)
                                .addComponent(lblTexto))
                            .addComponent(btnInverterTexto))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnTamanhoTexto)
                                .addGap(29, 29, 29)
                                .addComponent(btnPalindromo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfdTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCriptografar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumeroVogais, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNumeroConsoantes, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDescriptografar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTexto)
                    .addComponent(tfdTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultado)
                    .addComponent(tfdResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInverterTexto)
                    .addComponent(btnTamanhoTexto)
                    .addComponent(btnPalindromo))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNumeroVogais)
                    .addComponent(btnNumeroConsoantes))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDescriptografar)
                    .addComponent(btnCriptografar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInverterTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInverterTextoActionPerformed
        stringManipulator.setTexto(tfdTexto.getText());
        String resultado = stringManipulator.inverterTexto();
        tfdResultado.setText(resultado);
    }//GEN-LAST:event_btnInverterTextoActionPerformed

    private void btnTamanhoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamanhoTextoActionPerformed
        stringManipulator.setTexto(tfdTexto.getText());
        int resultado = stringManipulator.tamanhoDoTexto();
        tfdResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btnTamanhoTextoActionPerformed

    private void btnPalindromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalindromoActionPerformed
        stringManipulator.setTexto(tfdTexto.getText());
        boolean ehPalindromo = stringManipulator.ehPalindromo();
        
        String resultado = ehPalindromo ? "O texto ?? um pal??ndromo" : "O texto n??o ?? um pal??ndromo";
        tfdResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btnPalindromoActionPerformed

    private void btnNumeroVogaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroVogaisActionPerformed
        stringManipulator.setTexto(tfdTexto.getText());
        int numeroDeVogais = stringManipulator.numeroDeVogais();
        tfdResultado.setText(String.valueOf(numeroDeVogais));
    }//GEN-LAST:event_btnNumeroVogaisActionPerformed

    private void btnNumeroConsoantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroConsoantesActionPerformed
        stringManipulator.setTexto(tfdTexto.getText());
        int qtdeConsoantes = stringManipulator.numeroDeConsoantes();
        tfdResultado.setText(String.valueOf(qtdeConsoantes));
    }//GEN-LAST:event_btnNumeroConsoantesActionPerformed

    private void btnCriptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriptografarActionPerformed
        stringManipulator.setTexto(tfdTexto.getText());
        int chave = definirValorDaChaveCriptografica();
        String resultado = stringManipulator.criptografar(chave);
        tfdResultado.setText(resultado);
    }//GEN-LAST:event_btnCriptografarActionPerformed

    private void btnDescriptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescriptografarActionPerformed
        stringManipulator.setTexto(tfdTexto.getText());
        int chave = definirValorDaChaveCriptografica();
        String resultado = stringManipulator.descriptografar(chave);
        tfdResultado.setText(resultado);
    }//GEN-LAST:event_btnDescriptografarActionPerformed

    private int definirValorDaChaveCriptografica(){
        int chave = 0;
        String resposta = JOptionPane.showInputDialog(rootPane, "Digite um valor n??merico e inteiro para a chave de criptografia", "Chave de Criptografia", JOptionPane.QUESTION_MESSAGE);
        
        try {
            chave = Integer.parseInt(resposta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "A chave deve ser um valor numerico e inteiro", "Chave inv??lida", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        
        return chave;
    }
    
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
            java.util.logging.Logger.getLogger(StringServiceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringServiceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringServiceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringServiceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringServiceView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriptografar;
    private javax.swing.JButton btnDescriptografar;
    private javax.swing.JButton btnInverterTexto;
    private javax.swing.JButton btnNumeroConsoantes;
    private javax.swing.JButton btnNumeroVogais;
    private javax.swing.JButton btnPalindromo;
    private javax.swing.JButton btnTamanhoTexto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JTextField tfdResultado;
    private javax.swing.JTextField tfdTexto;
    // End of variables declaration//GEN-END:variables
}
