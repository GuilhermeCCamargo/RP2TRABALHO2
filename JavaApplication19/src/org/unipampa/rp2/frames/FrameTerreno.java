/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.frames;

import java.util.List;
import javax.print.attribute.standard.JobKOctets;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.unipampa.rp2.tiposimoveis.Terreno;
import org.unipampa.rp2.listaimoveis.Lista;
import org.unipampa.rp2.tiposimoveis.Imovel;

/**
 *
 * @author Vanderlan Mengotti
 */
public class FrameTerreno extends javax.swing.JFrame {

    Lista listaTerreno;

    /**
     * Creates new form FrameTerreno
     */
    public FrameTerreno(Lista listaTerreno) {
        initComponents();
        this.listaTerreno = listaTerreno;
        this.setLocationRelativeTo(null);
        this.setTitle("Imobiliária - Terreno");
        
        jButtonDetalhe.setEnabled(false);

        jTabbedPaneGuias.setEnabledAt(1, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneGuias = new javax.swing.JTabbedPane();
        jPanelCadastrar = new javax.swing.JPanel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonBuscarC = new javax.swing.JButton();
        jTextFieldCodBusc = new javax.swing.JTextField();
        jScrollPaneLista = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButtonVoltar = new javax.swing.JButton();
        jButtonDetalhe = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelLog = new javax.swing.JLabel();
        jTextFieldLog = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabelDesc = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelAreaTotal = new javax.swing.JLabel();
        jTextFieldAtotal = new javax.swing.JTextField();
        jLabelDimençaoF = new javax.swing.JLabel();
        jTextFieldDimencaoF = new javax.swing.JTextField();
        jLabelDimencaoL = new javax.swing.JLabel();
        jTextFieldDimencaoL = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonVoltando = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");

        jButtonBuscarC.setText("Buscar Por Código");
        jButtonBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCActionPerformed(evt);
            }
        });

        jTextFieldCodBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodBuscKeyTyped(evt);
            }
        });

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPaneLista.setViewportView(jList1);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonDetalhe.setText("Detalhes");
        jButtonDetalhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastrarLayout = new javax.swing.GroupLayout(jPanelCadastrar);
        jPanelCadastrar.setLayout(jPanelCadastrarLayout);
        jPanelCadastrarLayout.setHorizontalGroup(
            jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonBuscarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                        .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDetalhe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonIncluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneLista, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCadastrarLayout.setVerticalGroup(
            jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscarC)
                    .addComponent(jTextFieldCodBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                        .addComponent(jButtonIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonDetalhe))
                    .addComponent(jScrollPaneLista, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButtonVoltar)
                .addContainerGap())
        );

        jTabbedPaneGuias.addTab("Cadastrar", jPanelCadastrar);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));

        jLabelNumero.setText("Número");

        jTextFieldNumero.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        jTextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroKeyTyped(evt);
            }
        });

        jLabelLog.setText("Logradouro");

        jTextFieldLog.setDisabledTextColor(new java.awt.Color(0, 0, 204));

        jLabelBairro.setText("Bairro");

        jTextFieldBairro.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });

        jLabelCidade.setText("Cidade");

        jTextFieldCidade.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });

        jLabelValor.setText("Valor");

        jTextFieldValor.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });
        jTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyTyped(evt);
            }
        });

        jLabelDesc.setText("Descrição");

        jTextFieldDescricao.setToolTipText("");
        jTextFieldDescricao.setDisabledTextColor(new java.awt.Color(0, 0, 204));

        jLabelAreaTotal.setText("Área Total");

        jTextFieldAtotal.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        jTextFieldAtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAtotalKeyTyped(evt);
            }
        });

        jLabelDimençaoF.setText("Dimenção (Frente)");

        jTextFieldDimencaoF.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        jTextFieldDimencaoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDimencaoFActionPerformed(evt);
            }
        });
        jTextFieldDimencaoF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDimencaoFKeyTyped(evt);
            }
        });

        jLabelDimencaoL.setText("Dimenção (Lado)");

        jTextFieldDimencaoL.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        jTextFieldDimencaoL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDimencaoLKeyTyped(evt);
            }
        });

        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonVoltando.setText("VOLTAR");
        jButtonVoltando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltandoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLog)
                                    .addComponent(jLabelCidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCidade)
                                    .addComponent(jTextFieldLog)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelAreaTotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldAtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelDimençaoF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldDimencaoF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(129, 129, 129))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDimencaoL)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDimencaoL, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabelDesc)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonVoltando, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLog)
                    .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDesc)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAreaTotal)
                    .addComponent(jTextFieldAtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDimençaoF)
                    .addComponent(jTextFieldDimencaoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDimencaoL)
                            .addComponent(jTextFieldDimencaoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVoltando)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPaneGuias.addTab("Incluir", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneGuias)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneGuias)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        jTabbedPaneGuias.setSelectedIndex(1);
        jTabbedPaneGuias.setEnabledAt(1, true);
        jTabbedPaneGuias.setEnabledAt(0, false);
        ativarCampos();
        limparCampos();
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCActionPerformed
        // TODO add your handling code here:
        if (jTextFieldCodBusc.getText().trim().equals("")) {
            listar();
        } else {
            busca(Integer.parseInt(jTextFieldCodBusc.getText().trim()));
        }

    }//GEN-LAST:event_jButtonBuscarCActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Inicial voltar = new Inicial();
        voltar.setVisible(true);// Deixar Visível
        this.dispose();// fechar
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jTextFieldDimencaoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDimencaoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDimencaoFActionPerformed

    private void jButtonVoltandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltandoActionPerformed
        // TODO add your handling code here:
        jTabbedPaneGuias.setSelectedIndex(0);
        jTabbedPaneGuias.setEnabledAt(0, true);
        jTabbedPaneGuias.setEnabledAt(1, false);
    }//GEN-LAST:event_jButtonVoltandoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        if (jTextFieldAtotal.getText().trim().equals("") || jTextFieldBairro.getText().trim().equals("")
                || jTextFieldCidade.getText().trim().equals("") || jTextFieldDescricao.getText().trim().equals("")
                || jTextFieldDimencaoF.getText().trim().equals("") || jTextFieldDimencaoL.getText().trim().equals("")
                || jTextFieldLog.getText().trim().equals("") || jTextFieldNumero.getText().trim().equals("")
                || jTextFieldValor.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário o preenchimento de todos os campos");
        } else {
            Terreno t = new Terreno(Integer.parseInt(jTextFieldNumero.getText()),
                    Double.parseDouble(jTextFieldValor.getText()), jTextFieldCidade.getText(),
                    jTextFieldDescricao.getText(), jTextFieldLog.getText(), Double.parseDouble(jTextFieldAtotal.getText()),
                    jTextFieldBairro.getText(), Double.parseDouble(jTextFieldDimencaoF.getText()), Double.parseDouble(jTextFieldDimencaoL.getText()));

            listaTerreno.incluir(t);
            limparCampos();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldNumeroKeyTyped

    private void jTextFieldValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, isDouble(jTextFieldValor));
    }//GEN-LAST:event_jTextFieldValorKeyTyped

    private void jTextFieldAtotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAtotalKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, isDouble(jTextFieldAtotal));
    }//GEN-LAST:event_jTextFieldAtotalKeyTyped

    private void jTextFieldDimencaoFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDimencaoFKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, isDouble(jTextFieldDimencaoF));
    }//GEN-LAST:event_jTextFieldDimencaoFKeyTyped

    private void jTextFieldDimencaoLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDimencaoLKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, isDouble(jTextFieldDimencaoL));
    }//GEN-LAST:event_jTextFieldDimencaoLKeyTyped

    private void jTextFieldCodBuscKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodBuscKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldCodBuscKeyTyped

    private void jButtonDetalheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalheActionPerformed
        // TODO add your handling code here:
        jTabbedPaneGuias.setSelectedIndex(1);
        jTabbedPaneGuias.setEnabledAt(0, false);
        jTabbedPaneGuias.setEnabledAt(1, true);
        preencherCampos(Integer.parseInt(jList1.getSelectedValue().toString()));
        desativarCampos();
    }//GEN-LAST:event_jButtonDetalheActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        if(jList1.isSelectionEmpty()){
            jButtonDetalhe.setEnabled(false);
        }else{
            jButtonDetalhe.setEnabled(true);
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    private void preencherCampos(int cod){
        Terreno imovel = (Terreno) listaTerreno.consultar(cod);
        jTextFieldCidade.setText(imovel.getCidade());
        jTextFieldAtotal.setText(String.valueOf(imovel.getAreaTotal()));
        jTextFieldBairro.setText(imovel.getBairro());
        jTextFieldDescricao.setText(imovel.getDescricao());
        jTextFieldDimencaoF.setText(String.valueOf(imovel.getDimensaoFrente()));
        jTextFieldDimencaoL.setText(String.valueOf(imovel.getDimensaoLado()));
        jTextFieldLog.setText(imovel.getLogradouro());
        jTextFieldNumero.setText(String.valueOf(imovel.getNumero()));
        jTextFieldValor.setText(String.valueOf(imovel.getValor()));
    }
    
    public void limparCampos() {
        jTextFieldAtotal.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldDescricao.setText("");
        jTextFieldDimencaoF.setText("");
        jTextFieldDimencaoL.setText("");
        jTextFieldNumero.setText("");
        jTextFieldValor.setText("");
        jTextFieldLog.setText("");
    }

    public void listar() {
        DefaultListModel modelo = new DefaultListModel();
        List<Imovel> modelo1 = listaTerreno.getLista();
        for (Imovel imovel : modelo1) {
            modelo.addElement(imovel.toString());
        }
        jList1.setModel(modelo);
    }

    public void busca(int codigo) {
        DefaultListModel modelo = new DefaultListModel();
        Imovel modelo1 = listaTerreno.consultar(codigo);
        if (modelo1 == null) {
            JOptionPane.showMessageDialog(null, "Imóvel não encontrado");
        } else {
            modelo.addElement(modelo1.toString());
            jList1.setModel(modelo);
        }
    }

    /**
     * Metodo para verificar um campo de texto, verifica se já possui um char ==
     * '.' para campos double
     *
     * @param campo - javax.swing.JTextField, ou seja, o campo que deseja fazer
     * a verificação
     * @return - true caso o campo ainda possa colocar o '.' e false caso
     * contrário
     */
    public boolean isDouble(javax.swing.JTextField campo) {
        boolean isDouble = true;
        String aux = campo.getText();
        for (int i = 0; i < aux.length(); i++) {
            if (aux.charAt(i) == '.') {
                isDouble = false;
                break;
            }
        }
        return isDouble;
    }

    public void desativarCampos() {
        jTextFieldAtotal.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jTextFieldDescricao.setEnabled(false);
        jTextFieldDimencaoF.setEnabled(false);
        jTextFieldDimencaoL.setEnabled(false);
        jTextFieldLog.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldValor.setEnabled(false);
        jButtonSalvar.setVisible(false);
    }

    public void ativarCampos() {
        jTextFieldAtotal.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldDescricao.setEnabled(true);
        jTextFieldDimencaoF.setEnabled(true);
        jTextFieldDimencaoL.setEnabled(true);
        jTextFieldLog.setEnabled(true);
        jTextFieldNumero.setEnabled(true);
        jTextFieldValor.setEnabled(true);
        jButtonSalvar.setVisible(true);
    }

    public void soNumeros(java.awt.event.KeyEvent evt, boolean isDouble) {
        char c = evt.getKeyChar();
        if (isDouble) {
            if (Character.isDigit(c) || c == '.') {

            } else {
                evt.consume();
            }
        } else {
            if (Character.isDigit(c)) {

            } else {
                evt.consume();
            }
        }
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
            java.util.logging.Logger.getLogger(FrameTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTerreno(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarC;
    private javax.swing.JButton jButtonDetalhe;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltando;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelAreaTotal;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelDesc;
    private javax.swing.JLabel jLabelDimencaoL;
    private javax.swing.JLabel jLabelDimençaoF;
    private javax.swing.JLabel jLabelLog;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastrar;
    private javax.swing.JScrollPane jScrollPaneLista;
    private javax.swing.JTabbedPane jTabbedPaneGuias;
    private javax.swing.JTextField jTextFieldAtotal;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCodBusc;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldDimencaoF;
    private javax.swing.JTextField jTextFieldDimencaoL;
    private javax.swing.JTextField jTextFieldLog;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}