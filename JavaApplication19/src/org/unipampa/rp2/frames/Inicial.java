/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.frames;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private Lista listaChacara = new Lista ("Chacaras");
    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RP2 - Imobiliária");
        
        try {
            Lista.startCodigo();
        } catch (IOException ex) {
            Logger.getLogger(Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jButtonChacara = new javax.swing.JButton();
        jLabelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelImovel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelImovel.setText("Imobiliária - RP II");

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

        jButtonChacara.setText("Chácara");
        jButtonChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChacaraActionPerformed(evt);
            }
        });

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/unipampa/rp2/imagens/ico_busca.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonSalaComercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonApartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonTerreno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonChacara, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabelImovel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelImagem)
                        .addGap(21, 21, 21)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelImovel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelImagem)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalaComercial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonApartamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonTerreno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonChacara)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalaComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalaComercialActionPerformed
        // TODO add your handling code here:
        this.listaSalaComercial.lerArquivo();
        new FrameSalaComercial(this.listaSalaComercial).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSalaComercialActionPerformed

    private void jButtonApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApartamentoActionPerformed
        FrameApartamento2 open = new FrameApartamento2(this.ListaApartamento);
        open.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonApartamentoActionPerformed

    private void jButtonCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCasaActionPerformed
        new FrameCasa(this.listaCasa).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCasaActionPerformed

    private void jButtonTerrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerrenoActionPerformed
        // TODO add your handling code here:
        this.listaCasa.lerArquivo();
        new FrameTerreno(this.listaTerreno).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonTerrenoActionPerformed

    private void jButtonChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChacaraActionPerformed
        // TODO add your handling code here:
        this.listaChacara.lerArquivo();
        new FrameChacara(this.listaChacara).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonChacaraActionPerformed

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
    private javax.swing.JButton jButtonChacara;
    private javax.swing.JButton jButtonSalaComercial;
    private javax.swing.JButton jButtonTerreno;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelImovel;
    // End of variables declaration//GEN-END:variables
}
