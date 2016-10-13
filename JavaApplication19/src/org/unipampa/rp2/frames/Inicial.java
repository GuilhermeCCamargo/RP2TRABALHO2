/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.frames;

import org.unipampa.rp2.listaimoveis.Lista;

/**
 *
 * @author yuryalencar
 */
public class Inicial extends javax.swing.JFrame {

    private Lista listaSalaComercial = new Lista("SalasComerciais");
    private Lista ListaApartamento = new Lista("Apartamentos");
    private Lista listaCasa = new Lista("Casas");
    private Lista listaTerreno = new Lista("Terrenos");
    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RP2 - Imobiliária");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImovel = new javax.swing.JLabel();
        jButtonSalaComercial = new javax.swing.JButton();
        jButtonApartamento = new javax.swing.JButton();
        jButtonCasa = new javax.swing.JButton();
        jButtonTerreno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelImovel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelImovel.setText("Imóveis");

        jButtonSalaComercial.setText("Sala Comercial");
        jButtonSalaComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalaComercialActionPerformed(evt);
            }
        });

        jButtonApartamento.setText("Apartamento");
        jButtonApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApartamentoActionPerformed(evt);
            }
        });

        jButtonCasa.setText("Casa");
        jButtonCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCasaActionPerformed(evt);
            }
        });

        jButtonTerreno.setText("Terreno");
        jButtonTerreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerrenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabelImovel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSalaComercial, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(jButtonApartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTerreno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelImovel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalaComercial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonApartamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonTerreno)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalaComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalaComercialActionPerformed
        // TODO add your handling code here:
        listaSalaComercial.lerArquivo();
        new FrameSalaComercial(this.listaSalaComercial).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSalaComercialActionPerformed

    private void jButtonApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApartamentoActionPerformed
        FrameApartamento open = new FrameApartamento(this.ListaApartamento);
        open.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonApartamentoActionPerformed

    private void jButtonCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCasaActionPerformed
        this.listaCasa.lerArquivo();
        new FrameCasa(this.listaCasa).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCasaActionPerformed

    private void jButtonTerrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerrenoActionPerformed
        // TODO add your handling code here:
        new FrameTerreno(this.listaTerreno).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonTerrenoActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApartamento;
    private javax.swing.JButton jButtonCasa;
    private javax.swing.JButton jButtonSalaComercial;
    private javax.swing.JButton jButtonTerreno;
    private javax.swing.JLabel jLabelImovel;
    // End of variables declaration//GEN-END:variables
}
