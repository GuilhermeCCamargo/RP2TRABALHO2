/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.frames;

import org.unipampa.rp2.tiposimoveis.Tipo;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.unipampa.rp2.listaimoveis.Lista;
import org.unipampa.rp2.tiposimoveis.Imovel;
import org.unipampa.rp2.tiposimoveis.Casa;

public class FrameCasa extends javax.swing.JFrame {

    private Lista listaCasa;
    private List<Imovel> casa;
    /**
     * Construtor que inicia a classe
     * Desabilita a 2 aba(indice 1)
     * Inser as opções na comboBox
     * @param listaCasa 
     */
    public FrameCasa(Lista listaCasa) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.setTitle("Imobiliária - Casa");

        this.listaCasa = listaCasa;

        jTabbedPane4.setEnabledAt(1, false);
        jTabbedPane4.setEnabledAt(0, true);

        for (Tipo t : Tipo.values()) {
            jComboBoxTipo.addItem(t.getTipo());
        }

    }
    /**
     * Retorna true caso consiga preencher os campos com o objeto do codigo
     * selecionado e false caso contrário
     * @param cod
     * @return 
     */
    public boolean preencherCampos(int cod) {

        Casa c = (Casa) listaCasa.consultar(cod);
        if (c != null) {
            jTextFieldNumero.setText(String.valueOf(c.getNumero()));
            jTextFieldBairro.setText(c.getBairro());
            jTextFieldCidade.setText(c.getCidade());
            jTextFieldDescricao.setText(c.getDescricao());
            jTextFieldAreaTotal.setText(String.valueOf(c.getAreaTotal()));
            jTextFieldValor.setText(String.valueOf(c.getValor()));
            jTextFieldLogradouro.setText(c.getLogradouro());
            jTextFieldAC.setText(String.valueOf(c.getAreaConstruida()));
            jTextFieldNQ.setText(String.valueOf(c.getnQuartos()));
            jTextFieldNVG.setText(String.valueOf(c.getnVagasGaragem()));
            jTextFieldAnoC.setText(String.valueOf(c.getAnoConstrucao()));
            
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "ERRO 03 - Imóvel não encontrado");
            return false;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jListCasa = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonBuscarCasa = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListFrameCasa = new javax.swing.JList<>();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanelImovel = new javax.swing.JPanel();
        jLabelLogradouro = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelAreaTotal = new javax.swing.JLabel();
        jTextFieldAreaTotal = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelAC = new javax.swing.JLabel();
        jTextFieldAC = new javax.swing.JTextField();
        jLabelNQ = new javax.swing.JLabel();
        jTextFieldNQ = new javax.swing.JTextField();
        jLabelAnoC = new javax.swing.JLabel();
        jLabelNVG = new javax.swing.JLabel();
        jTextFieldNVG = new javax.swing.JTextField();
        jTextFieldAnoC = new javax.swing.JTextField();
        jButtonVoltarAdicionar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        jScrollPane1.setViewportView(jListCasa);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código: ");

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jButtonBuscarCasa.setText("Buscar");
        jButtonBuscarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCasaActionPerformed(evt);
            }
        });

        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListFrameCasa);

        jButtonEditar.setText("Editar");

        jButtonExcluir.setText("Excluir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jButtonBuscarCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarCasa))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Consultar", jPanel2);

        jPanelImovel.setPreferredSize(new java.awt.Dimension(360, 128));

        jLabelLogradouro.setText(" Logradouro:");

        jTextFieldLogradouro.setAutoscrolls(false);
        jTextFieldLogradouro.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelNumero.setText("Número:");
        jLabelNumero.setToolTipText("");

        jTextFieldNumero.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelBairro.setText(" Bairro:");

        jTextFieldBairro.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelCidade.setText(" Cidade:");

        jTextFieldCidade.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelDescricao.setText("Descrição:");

        jTextFieldDescricao.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelAreaTotal.setText(" Área Total (m²):");

        jTextFieldAreaTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelValor.setText(" Valor (R$):");

        jTextFieldValor.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTipo.setText("Tipo:");

        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jLabelAC.setText("Área Construída:");

        jTextFieldAC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldACActionPerformed(evt);
            }
        });

        jLabelNQ.setText("Número de Quartos:");

        jTextFieldNQ.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNQActionPerformed(evt);
            }
        });

        jLabelAnoC.setText("Ano de Construção");

        jLabelNVG.setText("Número de Vagas na Garagem:");

        jTextFieldNVG.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNVG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNVGActionPerformed(evt);
            }
        });

        jTextFieldAnoC.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jButtonVoltarAdicionar.setText("Voltar");
        jButtonVoltarAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAdicionarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelImovelLayout = new javax.swing.GroupLayout(jPanelImovel);
        jPanelImovel.setLayout(jPanelImovelLayout);
        jPanelImovelLayout.setHorizontalGroup(
            jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImovelLayout.createSequentialGroup()
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelImovelLayout.createSequentialGroup()
                                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelBairro)
                                            .addComponent(jLabelLogradouro)
                                            .addComponent(jLabelDescricao))
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImovelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImovelLayout.createSequentialGroup()
                                                .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImovelLayout.createSequentialGroup()
                                                .addComponent(jLabelAreaTotal)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jTextFieldBairro))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelNumero)
                                            .addComponent(jLabelCidade))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldNumero)
                                            .addComponent(jTextFieldCidade)))
                                    .addComponent(jTextFieldDescricao)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImovelLayout.createSequentialGroup()
                                        .addComponent(jTextFieldAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118)
                                        .addComponent(jLabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImovelLayout.createSequentialGroup()
                                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldAC, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelImovelLayout.createSequentialGroup()
                                                .addComponent(jLabelNQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldNQ))
                                            .addGroup(jPanelImovelLayout.createSequentialGroup()
                                                .addComponent(jLabelAnoC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldAnoC))))))
                            .addGroup(jPanelImovelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelNVG)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNVG, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelImovelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabelAC)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImovelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltarAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)))
                .addContainerGap())
        );
        jPanelImovelLayout.setVerticalGroup(
            jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImovelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero))
                .addGap(5, 5, 5)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAreaTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNQ, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnoC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNVG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNVG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonVoltarAdicionar))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImovel, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanelImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Dados", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed

    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jTextFieldACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldACActionPerformed

    private void jTextFieldNVGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNVGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNVGActionPerformed
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        Casa casa = new Casa(Integer.parseInt(jTextFieldNumero.getText().trim()),
                Double.parseDouble(jTextFieldValor.getText().trim()),
                jTextFieldLogradouro.getText().trim(),
                Tipo.verificarTipo(jComboBoxTipo.getSelectedItem().toString()),
                Double.parseDouble(jTextFieldAC.getText().trim()),
                Integer.parseInt(jTextFieldNQ.getText()),
                Integer.parseInt(jTextFieldNVG.getText()),
                Integer.parseInt(jTextFieldAnoC.getText()),
                jTextFieldCidade.getText(), jTextFieldBairro.getText());

        listaCasa.incluir(casa);

        limparCampos();
        JOptionPane.showMessageDialog(null, "Imóvel cadastrado com sucesso!");

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        ativarCampos();
        limparCampos();
        jTabbedPane4.setEnabledAt(0, false);
        jTabbedPane4.setEnabledAt(1, true);
        jTabbedPane4.setSelectedIndex(1);

    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonVoltarAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAdicionarActionPerformed
        jTabbedPane4.setEnabledAt(0, true);
        jTabbedPane4.setEnabledAt(1, false);
        jTabbedPane4.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonVoltarAdicionarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Inicial voltar = new Inicial();
        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonBuscarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCasaActionPerformed
        // TODO add your handling code here:
        if (jTextFieldCodigo.getText().trim().equals("")) {
            listar(-1);
        } else {
            listar(Integer.parseInt(jTextFieldCodigo.getText().trim()));
        }
    }//GEN-LAST:event_jButtonBuscarCasaActionPerformed

    private void jTextFieldNQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNQActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        String aux="";
        boolean error = false;
        aux = JOptionPane.showInputDialog("Insira o código do objeto que deseja buscar: ");
        
        if(aux == null){
        } else if (aux.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "ERRO 01 - Insira um valor");
        } else {
            for (int i = 0; i < aux.length(); i++) {
                if (!(Character.isDigit(aux.charAt(i)))) {
                    error = true;
                    break;
                }
            }

            if (error) {
                JOptionPane.showMessageDialog(null, "ERRO 02 - Insira somente número inteiros");
            } else {
                if(preencherCampos(Integer.parseInt(aux))){
                    desativarCampos();
                    jTabbedPane4.setSelectedIndex(1);
                    jTabbedPane4.setEnabledAt(1, true);
                    jTabbedPane4.setEnabledAt(0, false);
                }
            }
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    /**
     * Main para teste unitário 
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
            java.util.logging.Logger.getLogger(FrameCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCasa(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarCasa;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonVoltarAdicionar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAC;
    private javax.swing.JLabel jLabelAnoC;
    private javax.swing.JLabel jLabelAreaTotal;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNQ;
    private javax.swing.JLabel jLabelNVG;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JList<String> jListCasa;
    private javax.swing.JList<String> jListFrameCasa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelImovel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextFieldAC;
    private javax.swing.JTextField jTextFieldAnoC;
    private javax.swing.JTextField jTextFieldAreaTotal;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNQ;
    private javax.swing.JTextField jTextFieldNVG;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Recebe o codigo e adiciona a lista a monografia selecionada 
     * 
     * @param cod 
     */
    public void listar(int cod) {
        DefaultListModel listModel = new DefaultListModel();
        this.casa = listaCasa.getLista();//Atribui a lista da classe Lista a variável
        if (cod == -1) {
            //Percorre a lista e insere os resultados em listModel(Lista padrão)
            for (Imovel home : casa) {
                listModel.addElement(home.toString());
            }

        } else {

            Imovel home = listaCasa.consultar(cod);
            if (home != null) {
                listModel.addElement(home.toString());
            }

        }

        jListFrameCasa.setModel(listModel);//Mudar a lista
    }
    /**
     * Apenas limpa todos os campos
     */
    public void limparCampos() {
        jTextFieldNumero.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldDescricao.setText("");
        jTextFieldAreaTotal.setText("");
        jTextFieldValor.setText("");
        jTextFieldLogradouro.setText("");
        jTextFieldAC.setText("");
        jTextFieldNQ.setText("");
        jTextFieldNVG.setText("");
        jTextFieldAnoC.setText("");

    }
    /**
     * Apenas ativa todos os campos 
     */
    public void ativarCampos() {
        jTextFieldNumero.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldDescricao.setEnabled(true);
        jTextFieldAreaTotal.setEnabled(true);
        jTextFieldValor.setEnabled(true);
        jTextFieldLogradouro.setEnabled(true);
        jTextFieldAC.setEnabled(true);
        jTextFieldNQ.setEnabled(true);
        jTextFieldNVG.setEnabled(true);
        jTextFieldAnoC.setEnabled(true);

        jButtonSalvar.setVisible(true);
    }
    /**
     * Apenas destiva todos os campos
     */
    public void desativarCampos() {
        jTextFieldNumero.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jTextFieldDescricao.setEnabled(false);
        jTextFieldAreaTotal.setEnabled(false);
        jTextFieldValor.setEnabled(false);
        jTextFieldLogradouro.setEnabled(false);
        jTextFieldAC.setEnabled(false);
        jTextFieldNQ.setEnabled(false);
        jTextFieldNVG.setEnabled(false);
        jTextFieldAnoC.setEnabled(false);

        jButtonSalvar.setVisible(false);
    }

}
