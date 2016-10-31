/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.frames;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.unipampa.rp2.listaimoveis.Lista;
import org.unipampa.rp2.tiposimoveis.Chacara;
import org.unipampa.rp2.tiposimoveis.Imovel;

/**
 *
 * @author Windows 7 Home Basic
 */
public class FrameChacara extends javax.swing.JFrame {

    private Lista listaChacara;
    private List<Imovel> xacara;
    private int cod;

    /**
     * Creates new form FrameChacara
     *
     * @param listaChacara
     */
    public FrameChacara(Lista listaChacara) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Imobiliária - Chacára");
        this.listaChacara = listaChacara;
        this.listaChacara.lerArquivo();
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);

    }

    /**
     * Método para preencher os campos quando for editar uma chacara
     *
     * @param cod - inteiro que está no jList
     */
    private int getCod(String cod) {
        int end = 0;
        for (int i = 9; i < cod.length(); i++) {
            if (cod.charAt(i) == '-') {
                end = i - 1;
                break;
            }
        }

        cod = cod.substring(8, end);
        return Integer.parseInt(cod);
    }

    public boolean preencherCampos(int chacara) {
        Chacara cha = (Chacara) listaChacara.consultar(chacara);

        if (cha == null) {
            JOptionPane.showMessageDialog(null, "Imovel não encontrado!");
            return false;
        } else {
            jTextFieldBairroEdit.setText(cha.getBairro());
            jTextFieldAnoEdit.setText(String.valueOf(cha.getAno()));
            jTextFieldAreaEdit.setText(String.valueOf(cha.getAreaConstruida()));
            jTextFieldCidadeEdit.setText(cha.getCidade());
            jTextFieldDistanciaEdit.setText(String.valueOf(cha.getDistanciaCidade()));
            jTextFieldQuartosEdit.setText(String.valueOf(cha.getNroQuartos()));
            jTextFieldLogradouroEdit.setText(cha.getLogradouro());
            jTextFieldNumeroEdit.setText(String.valueOf(cha.getNumero()));
            jTextFieldValorEdit.setText(String.valueOf(cha.getValor()));
            jTextFieldDescEdit.setText(cha.getDescricao());
            jTextFieldAreaTotalEdit.setText(String.valueOf(cha.getAreaTotal()));
            return true;
        }
    }
    public void desativarCampos(){
        jTextFieldBairroEdit.setEnabled(false);
            jTextFieldAnoEdit.setEnabled(false);
            jTextFieldAreaEdit.setEnabled(false);
            jTextFieldCidadeEdit.setEnabled(false);
            jTextFieldDistanciaEdit.setEnabled(false);
            jTextFieldQuartosEdit.setEnabled(false);
            jTextFieldLogradouroEdit.setEnabled(false);
            jTextFieldNumeroEdit.setEnabled(false);
            jTextFieldValorEdit.setEnabled(false);
            jTextFieldDescEdit.setEnabled(false);
            jTextFieldAreaTotalEdit.setEnabled(false);
    }
    
    public void ativarCampos(){
        jTextFieldBairroEdit.setEnabled(true);
            jTextFieldAnoEdit.setEnabled(true);
            jTextFieldAreaEdit.setEnabled(true);
            jTextFieldCidadeEdit.setEnabled(true);
            jTextFieldDistanciaEdit.setEnabled(true);
            jTextFieldQuartosEdit.setEnabled(true);
            jTextFieldLogradouroEdit.setEnabled(true);
            jTextFieldNumeroEdit.setEnabled(true);
            jTextFieldValorEdit.setEnabled(true);
            jTextFieldDescEdit.setEnabled(true);
            jTextFieldAreaTotalEdit.setEnabled(true);
    }

    /**
     * Método para listar todos os dados dentro da jList
     */
    public void listar(int cod) {
        DefaultListModel listChacara = new DefaultListModel();

        if (cod == -1) {
            this.xacara = listaChacara.getLista();
            for (Imovel imovel : xacara) {
                listChacara.addElement(imovel.toString());
            }
        } else {
            Imovel imovel = listaChacara.consultar(cod);
            listChacara.addElement(imovel.toString());
        }

        jListChacaraLista.setModel(listChacara);
    }

    /**
     * Método usado para limpar todos os campos, tanto após uma inclusão quanto
     * após uma edição.
     */
    private void limpar() {
        jTextFieldLogradouro.setText("");
        jTextFieldAno.setText("");
        jTextFieldArea.setText("");
        jTextFieldCampo.setText("");
        jTextFieldDistancia.setText("");
        jTextFieldNumero.setText("");
        jTextFieldQuartos.setText("");
        jTextFieldValor.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldDesc.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldCampo = new javax.swing.JTextField();
        jComboBoxOpcoes = new javax.swing.JComboBox<>();
        jButtonPesqConfirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListChacaraLista = new javax.swing.JList<>();
        jButtonBotaoPesq2 = new javax.swing.JButton();
        jButtonEditarChacara = new javax.swing.JButton();
        jButtonExcluirChacara = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldDistancia = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldArea = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        jTextFieldQuartos = new javax.swing.JTextField();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldDesc = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelAraTotal = new javax.swing.JLabel();
        jTextFieldAreaTotal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldDistanciaEdit = new javax.swing.JTextField();
        jTextFieldValorEdit = new javax.swing.JTextField();
        jTextFieldAreaEdit = new javax.swing.JTextField();
        jTextFieldAnoEdit = new javax.swing.JTextField();
        jTextFieldQuartosEdit = new javax.swing.JTextField();
        jTextFieldLogradouroEdit = new javax.swing.JTextField();
        jTextFieldNumeroEdit = new javax.swing.JTextField();
        jTextFieldCidadeEdit = new javax.swing.JTextField();
        jTextFieldBairroEdit = new javax.swing.JTextField();
        jTextFieldDescEdit = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButtonSave1 = new javax.swing.JButton();
        jButtonVoltardeta = new javax.swing.JButton();
        jLabelAreaTotalEdit = new javax.swing.JLabel();
        jTextFieldAreaTotalEdit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCampoActionPerformed(evt);
            }
        });
        jTextFieldCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoKeyTyped(evt);
            }
        });

        jComboBoxOpcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Valor", "Bairro" }));
        jComboBoxOpcoes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOpcoesItemStateChanged(evt);
            }
        });

        jButtonPesqConfirm.setText("BUSCAR");
        jButtonPesqConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesqConfirmActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListChacaraLista);

        jButtonBotaoPesq2.setText("CONSULTAR DETALHES");
        jButtonBotaoPesq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBotaoPesq2ActionPerformed(evt);
            }
        });

        jButtonEditarChacara.setText("EDITAR CHACARA");
        jButtonEditarChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarChacaraActionPerformed(evt);
            }
        });

        jButtonExcluirChacara.setText("EXCLUIR CHACARA");
        jButtonExcluirChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirChacaraActionPerformed(evt);
            }
        });

        jButton1.setText("ORDENAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonIncluir.setText("Incluir Chacara");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
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
                        .addComponent(jComboBoxOpcoes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonBotaoPesq2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluirChacara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditarChacara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesqConfirm))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesqConfirm))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBotaoPesq2)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonEditarChacara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluirChacara)
                        .addGap(39, 39, 39)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonIncluir)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar", jPanel1);

        jLabel1.setText("CADASTRO DE CHACÁRA");

        jLabel2.setText("Distância da cidade (em KM)");

        jLabel3.setText("Valor da chácara (R$)");

        jLabel4.setText("Área Construida (m²)");

        jLabel5.setText("Ano de Construção");

        jLabel6.setText("Nº de Quartos");

        jLabel7.setText("Logradouro");

        jLabel8.setText("Número");

        jLabel9.setText("Cidade");

        jLabel10.setText("Bairro");

        jLabel11.setText("Descrição");

        jTextFieldDistancia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDistanciaFocusLost(evt);
            }
        });
        jTextFieldDistancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDistanciaKeyTyped(evt);
            }
        });

        jTextFieldValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValorFocusLost(evt);
            }
        });
        jTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyTyped(evt);
            }
        });

        jTextFieldArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldAreaFocusLost(evt);
            }
        });
        jTextFieldArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAreaKeyTyped(evt);
            }
        });

        jTextFieldAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnoKeyTyped(evt);
            }
        });

        jTextFieldQuartos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuartosKeyTyped(evt);
            }
        });

        jTextFieldLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLogradouroActionPerformed(evt);
            }
        });

        jTextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroKeyTyped(evt);
            }
        });

        jButtonSave.setText("SALVAR CADASTRO");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelAraTotal.setText("Area Total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(138, 138, 138)
                        .addComponent(jButtonSave))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabelAraTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(jTextFieldValor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jTextFieldAreaTotal))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAraTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButton2))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel2);

        jLabel13.setText("DETALHES DA CHÁCARA");

        jTextFieldDistanciaEdit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDistanciaEditFocusLost(evt);
            }
        });
        jTextFieldDistanciaEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDistanciaEditKeyTyped(evt);
            }
        });

        jTextFieldValorEdit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValorEditFocusLost(evt);
            }
        });
        jTextFieldValorEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorEditKeyTyped(evt);
            }
        });

        jTextFieldAreaEdit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldAreaEditFocusLost(evt);
            }
        });
        jTextFieldAreaEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAreaEditKeyTyped(evt);
            }
        });

        jTextFieldAnoEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnoEditKeyTyped(evt);
            }
        });

        jTextFieldQuartosEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuartosEditKeyTyped(evt);
            }
        });

        jTextFieldNumeroEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroEditKeyTyped(evt);
            }
        });

        jLabel14.setText("Distância da cidade (em KM)");

        jLabel15.setText("Valor da Chacára (R$)");

        jLabel16.setText("Área Construida (m²)");

        jLabel17.setText("Ano de Construção");

        jLabel18.setText("Nº de Quartos");

        jLabel19.setText("Logradouro");

        jLabel20.setText("Número");

        jLabel21.setText("Cidade");

        jLabel22.setText("Bairro");

        jLabel23.setText("Descrição");

        jButtonSave1.setText("SALVAR EDIÇÃO");
        jButtonSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave1ActionPerformed(evt);
            }
        });

        jButtonVoltardeta.setText("VOLTAR");
        jButtonVoltardeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltardetaActionPerformed(evt);
            }
        });

        jLabelAreaTotalEdit.setText("Area Total");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jButtonVoltardeta))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLogradouroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCidadeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldAreaEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addComponent(jTextFieldValorEdit, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldDistanciaEdit, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldQuartosEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                        .addComponent(jTextFieldAnoEdit, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jTextFieldNumeroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldDescEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(jTextFieldBairroEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(jTextFieldAreaTotalEdit))
                                    .addComponent(jButtonSave1, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelAreaTotalEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDistanciaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAreaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuartosEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogradouroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumeroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCidadeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBairroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAreaTotalEdit)
                    .addComponent(jTextFieldAreaTotalEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave1)
                    .addComponent(jButtonVoltardeta))
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Detalhes", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesqConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesqConfirmActionPerformed
        // TODO add your handling code here:
        String indice = jComboBoxOpcoes.getSelectedItem().toString();
        switch (indice) {
            case "Codigo":
                if (jTextFieldCampo.getText().trim().equals("")) {
                    listarCodigo(-1);
                } else {
                    listarCodigo(Integer.parseInt(jTextFieldCampo.getText().trim()));
                }
                break;
            case "Valor":
                if (jTextFieldCampo.getText().trim().equals("")) {
                    listarValor(-1);
                } else {
                    listarValor(Double.parseDouble(jTextFieldCampo.getText().trim()));
                }
                break;
            case "Bairro":
                listarBairro(jTextFieldCampo.getText().trim());
                break;
        }

        /*if (jTextFieldCampo.getText().trim().equals("")) {
            listarCodigo(-1);
        } else {
            listarCodigo(Integer.parseInt(jTextFieldCampo.getText().trim()));
        }*/
    }//GEN-LAST:event_jButtonPesqConfirmActionPerformed

    private void jButtonEditarChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarChacaraActionPerformed
        String cod = JOptionPane.showInputDialog("Informe o código");
        boolean error = false;
        if (cod == null) {
            error = true;
        } else if (cod.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um código!");
            error = true;
        } else {
            for (int i = 0; i < cod.length(); i++) {
                if (!(Character.isDigit(cod.charAt(i)))) {
                    JOptionPane.showMessageDialog(null, "Informe apenas números inteiros.");
                    error = true;
                    break;
                }
            }
        }
        if (!error) {
            preencherCampos(Integer.parseInt(cod));
            this.cod = Integer.parseInt(cod);
            jTabbedPane1.setEnabledAt(0, false);
            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setSelectedIndex(2);
            jButtonSave1.setVisible(true);
            jTabbedPane1.setSelectedIndex(2);
        }

    }//GEN-LAST:event_jButtonEditarChacaraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] textMessages = {"Código", "Valor", "Área", "Cancelar"};
        int x = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Ordenação",
                JOptionPane.WHEN_IN_FOCUSED_WINDOW, JOptionPane.QUESTION_MESSAGE,
                null, textMessages, null);

        List<Imovel> aux = null;
        boolean troca = false;
        DefaultListModel lista = new DefaultListModel();
        switch (x) {
            case 0:
                aux = listaChacara.ordenarCodigo();
                troca = true;
                break;
            case 1:
                aux = listaChacara.ordenarValor();
                troca = true;
                break;
            case 2:
                aux = listaChacara.ordenarArea();
                troca = true;
                break;
        }
        if (troca) {
            for (Imovel imovel : aux) {
                lista.addElement(imovel.toString());
            }
        }
        jListChacaraLista.setModel(lista);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLogradouroActionPerformed

    private void jButtonBotaoPesq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBotaoPesq2ActionPerformed
        String cod = JOptionPane.showInputDialog("Informe o código");
        boolean error = false;
        if (cod == null) {
            error = true;
        } else if (cod.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um código!");
            error = true;
        } else {
            for (int i = 0; i < cod.length(); i++) {
                if (!(Character.isDigit(cod.charAt(i)))) {
                    JOptionPane.showMessageDialog(null, "Informe apenas números inteiros.");
                    error = true;
                    break;
                }
            }
        }
        if (!error) {
            if (preencherCampos(Integer.parseInt(cod))) {
                jTabbedPane1.setEnabledAt(0, false);
                jTabbedPane1.setEnabledAt(2, true);
                jTabbedPane1.setSelectedIndex(2);
                jButtonSave1.setVisible(false);
            }

        }
    }//GEN-LAST:event_jButtonBotaoPesq2ActionPerformed

    private void jButtonExcluirChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirChacaraActionPerformed
        // TODO add your handling code here:
        String aux;
        boolean error = false;

        aux = JOptionPane.showInputDialog("Insira o código da Chacára que você deseja excluir: ");

        if (aux != null) {
            if (!(aux.trim().equals(""))) {
                for (int i = 0; i < aux.length(); i++) {
                    if (!(Character.isDigit(aux.charAt(i)))) {
                        JOptionPane.showMessageDialog(null, "Informe apenas números inteiros.");
                        error = true;
                        break;
                    }
                }

                if (!error) {
                    if (!(listaChacara.excluir(Integer.parseInt(aux)))) {
                        JOptionPane.showMessageDialog(null, "Imóvel não encontrado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Imóvel deletado com sucesso.");
                        listaChacara.escreverArquivo();
                    }
                    try {
                        Lista.startCodigo();
                    } catch (IOException ex) {
                        Logger.getLogger(FrameChacara.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Informe um número inteiro para prosseguir.");
            }

        }
    }//GEN-LAST:event_jButtonExcluirChacaraActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        if (jTextFieldNumero.getText().equals("")
                || jTextFieldValor.getText().equals("")
                || jTextFieldBairro.getText().equals("")
                || jTextFieldQuartos.getText().equals("")
                || jTextFieldArea.getText().equals("")
                || jTextFieldAno.getText().equals("")
                || jTextFieldDistancia.getText().equals("")
                || jTextFieldLogradouro.getText().equals("")
                || jTextFieldDesc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe todos os campos!");
        } else {
            Chacara cha = new Chacara(Integer.parseInt(jTextFieldNumero.getText().trim()),
                    Double.parseDouble(jTextFieldValor.getText().trim()),
                    jTextFieldCidade.getText().trim(),
                    jTextFieldBairro.getText().trim(),
                    Integer.parseInt(jTextFieldQuartos.getText().trim()),
                    Double.parseDouble(jTextFieldArea.getText().trim()),
                    Integer.parseInt(jTextFieldAno.getText().trim()),
                    Double.parseDouble(jTextFieldDistancia.getText().trim()),
                    jTextFieldLogradouro.getText().trim(),
                    jTextFieldDesc.getText().trim());
            cha.setAreaTotal(Double.parseDouble(jTextFieldAreaTotal.getText()));
            if (listaChacara.incluir(cha) == false) {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar.");
            } else {
                JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
                try {
                    listaChacara.gravarUltimoCod(cha.getCod());
                } catch (IOException ex) {
                    Logger.getLogger(FrameChacara.class.getName()).log(Level.SEVERE, null, ex);
                }
                listaChacara.escreverArquivo();
            }
            limpar();
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(0, true);
            jTabbedPane1.setSelectedIndex(0);
        }


    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(0, true);
        limpar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave1ActionPerformed
        if (jTextFieldNumeroEdit.getText().equals("")
                || jTextFieldValorEdit.getText().equals("")
                || jTextFieldBairroEdit.getText().equals("")
                || jTextFieldQuartosEdit.getText().equals("")
                || jTextFieldAreaEdit.getText().equals("")
                || jTextFieldAnoEdit.getText().equals("")
                || jTextFieldDistanciaEdit.getText().equals("")
                || jTextFieldLogradouroEdit.getText().equals("")
                || jTextFieldDescEdit.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe todos os campos!");
        } else {
            double areaConstruida;
            double distanciaCidade;
            int ano;
            int numero;
            int nroQuartos;
            String cidade;
            String bairro;
            String descricao;
            String logradouro;
            double valor;

            areaConstruida = Double.parseDouble(jTextFieldAreaEdit.getText().trim());
            distanciaCidade = Double.parseDouble(jTextFieldDistanciaEdit.getText().trim());
            ano = Integer.parseInt(jTextFieldAnoEdit.getText().trim());
            numero = Integer.parseInt(jTextFieldNumeroEdit.getText().trim());
            nroQuartos = Integer.parseInt(jTextFieldQuartosEdit.getText().trim());
            cidade = jTextFieldCidadeEdit.getText().trim();
            bairro = jTextFieldBairroEdit.getText().trim();
            descricao = jTextFieldDescEdit.getText().trim();
            logradouro = jTextFieldLogradouroEdit.getText().trim();
            valor = Double.parseDouble(jTextFieldValorEdit.getText().trim());
            double areaTotal=Double.parseDouble(jTextFieldAreaTotalEdit.getText().trim());
            Chacara a = (Chacara) listaChacara.consultar(cod);

            try {
                Chacara objeto = a.clone();
                objeto.setAreaConstruida(TOP_ALIGNMENT);
                objeto.setDistanciaCidade(distanciaCidade);
                objeto.setAno(ano);
                objeto.setNumero(numero);
                objeto.setNroQuartos(nroQuartos);
                objeto.setCidade(cidade);
                objeto.setBairro(bairro);
                objeto.setDescricao(descricao);
                objeto.setLogradouro(logradouro);
                objeto.setValor(valor);
                objeto.setAreaTotal(areaTotal);
                if (listaChacara.editar(cod, objeto)) {
                    JOptionPane.showMessageDialog(null, "Imóvel editado com sucesso.");
                    listaChacara.escreverArquivo();
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Objeto não pode ser editado.");
                    limpar();

                }
                //Chacara objeto = new Chacara(numero, valor, cidade, bairro, nroQuartos, areaConstruida, ano, distanciaCidade, logradouro, descricao);
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(FrameChacara.class.getName()).log(Level.SEVERE, null, ex);
            }

            int codigo;
            codigo = cod;

        }
        cod = -1;
    }//GEN-LAST:event_jButtonSave1ActionPerformed

    private void jTextFieldDistanciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDistanciaKeyTyped
        soDouble(evt, jTextFieldDistancia.getText());
    }//GEN-LAST:event_jTextFieldDistanciaKeyTyped

    private void jTextFieldValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyTyped
        soDouble(evt, jTextFieldValor.getText());
    }//GEN-LAST:event_jTextFieldValorKeyTyped

    private void jTextFieldAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAreaKeyTyped
        soDouble(evt, jTextFieldArea.getText());
    }//GEN-LAST:event_jTextFieldAreaKeyTyped

    private void jTextFieldAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnoKeyTyped
        soNumeros(evt);
    }//GEN-LAST:event_jTextFieldAnoKeyTyped

    private void jTextFieldQuartosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuartosKeyTyped
        soNumeros(evt);
    }//GEN-LAST:event_jTextFieldQuartosKeyTyped

    private void jTextFieldNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroKeyTyped
        soNumeros(evt);
    }//GEN-LAST:event_jTextFieldNumeroKeyTyped

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        jTabbedPane1.setEnabledAt(1, true);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonVoltardetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltardetaActionPerformed
        jTabbedPane1.setEnabledAt(2, false);
        jTabbedPane1.setEnabledAt(0, true);
        jTabbedPane1.setSelectedIndex(0);
        jButtonSave1.setVisible(true);
    }//GEN-LAST:event_jButtonVoltardetaActionPerformed

    private void jComboBoxOpcoesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOpcoesItemStateChanged
        jTextFieldCampo.setText("");
    }//GEN-LAST:event_jComboBoxOpcoesItemStateChanged

    private void jTextFieldCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoKeyTyped
        if (jTextFieldCampo.getText().equals(".")) {
            jTextFieldCampo.setText("");
        } else if (jComboBoxOpcoes.getSelectedItem().toString().equals("Codigo")) {
            soNumeros(evt);
        } else if (jComboBoxOpcoes.getSelectedItem().toString().equals("Valor")) {
            soDouble(evt, jTextFieldCampo.getText());
        }
    }//GEN-LAST:event_jTextFieldCampoKeyTyped

    private void jTextFieldDistanciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDistanciaFocusLost
        if (jTextFieldDistancia.getText().equals(".")) {
            jTextFieldDistancia.setText("");
        }
    }//GEN-LAST:event_jTextFieldDistanciaFocusLost

    private void jTextFieldValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorFocusLost
        if (jTextFieldValor.getText().equals(".")) {
            jTextFieldValor.setText("");
        }
    }//GEN-LAST:event_jTextFieldValorFocusLost

    private void jTextFieldAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAreaFocusLost
        if (jTextFieldArea.getText().equals(".")) {
            jTextFieldArea.setText("");
        }
    }//GEN-LAST:event_jTextFieldAreaFocusLost

    private void jTextFieldDistanciaEditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDistanciaEditFocusLost
        if (jTextFieldDistanciaEdit.getText().equals(".")) {
            jTextFieldDistanciaEdit.setText("");
        }
    }//GEN-LAST:event_jTextFieldDistanciaEditFocusLost

    private void jTextFieldValorEditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorEditFocusLost
        if (jTextFieldValorEdit.getText().equals(".")) {
            jTextFieldValorEdit.setText("");
        }
    }//GEN-LAST:event_jTextFieldValorEditFocusLost

    private void jTextFieldAreaEditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAreaEditFocusLost
        if (jTextFieldAreaEdit.getText().equals(".")) {
            jTextFieldAreaEdit.setText("");
        }
    }//GEN-LAST:event_jTextFieldAreaEditFocusLost

    private void jTextFieldDistanciaEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDistanciaEditKeyTyped
        soDouble(evt, jTextFieldDistanciaEdit.getText());
    }//GEN-LAST:event_jTextFieldDistanciaEditKeyTyped

    private void jTextFieldValorEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorEditKeyTyped
        soDouble(evt, jTextFieldValorEdit.getText());
    }//GEN-LAST:event_jTextFieldValorEditKeyTyped

    private void jTextFieldAreaEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAreaEditKeyTyped
        soDouble(evt, jTextFieldAreaEdit.getText());
    }//GEN-LAST:event_jTextFieldAreaEditKeyTyped

    private void jTextFieldAnoEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnoEditKeyTyped
        soNumeros(evt);
    }//GEN-LAST:event_jTextFieldAnoEditKeyTyped

    private void jTextFieldQuartosEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuartosEditKeyTyped
        soNumeros(evt);
    }//GEN-LAST:event_jTextFieldQuartosEditKeyTyped

    private void jTextFieldNumeroEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroEditKeyTyped
        soNumeros(evt);
    }//GEN-LAST:event_jTextFieldNumeroEditKeyTyped

    private void jTextFieldCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCampoActionPerformed

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
            java.util.logging.Logger.getLogger(FrameChacara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameChacara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameChacara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameChacara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameChacara(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBotaoPesq2;
    private javax.swing.JButton jButtonEditarChacara;
    private javax.swing.JButton jButtonExcluirChacara;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonPesqConfirm;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSave1;
    private javax.swing.JButton jButtonVoltardeta;
    private javax.swing.JComboBox<String> jComboBoxOpcoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAraTotal;
    private javax.swing.JLabel jLabelAreaTotalEdit;
    private javax.swing.JList<String> jListChacaraLista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldAnoEdit;
    private javax.swing.JTextField jTextFieldArea;
    private javax.swing.JTextField jTextFieldAreaEdit;
    private javax.swing.JTextField jTextFieldAreaTotal;
    private javax.swing.JTextField jTextFieldAreaTotalEdit;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldBairroEdit;
    private javax.swing.JTextField jTextFieldCampo;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCidadeEdit;
    private javax.swing.JTextField jTextFieldDesc;
    private javax.swing.JTextField jTextFieldDescEdit;
    private javax.swing.JTextField jTextFieldDistancia;
    private javax.swing.JTextField jTextFieldDistanciaEdit;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldLogradouroEdit;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldNumeroEdit;
    private javax.swing.JTextField jTextFieldQuartos;
    private javax.swing.JTextField jTextFieldQuartosEdit;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldValorEdit;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        DefaultListModel modelList = new DefaultListModel();

        List<Imovel> imovel = listaChacara.getLista();

        for (Imovel imovel1 : imovel) {
            modelList.addElement(imovel1.toString());
        }
        jListChacaraLista.setModel(modelList);
    }

    private void listarCodigo(int cod) {
        DefaultListModel listModel = new DefaultListModel();

        Imovel xa = listaChacara.consultar(cod);
        if (cod == -1) {
            listar();
        } else if (xa == null) {
            JOptionPane.showMessageDialog(null, "Imóvel não encontrado!");
        } else {
            listModel.addElement(xa.toString());
            jListChacaraLista.setModel(listModel);
        }

    }

    /**
     * Método para pesquisar a partir do valor
     *
     * @param valor
     */
    private void listarValor(double valor) {
        DefaultListModel listModel = new DefaultListModel();

        List<Imovel> aux = listaChacara.pesquisaValor(valor);
        if (valor == -1) {
            listar();
        } else if (aux == null) {
            JOptionPane.showMessageDialog(null, "Nenhum imóvel não encontrado!");
        } else {
            for (Imovel imovel : aux) {
                listModel.addElement(imovel.toString());
            }
            jListChacaraLista.setModel(listModel);
        }

    }

    /**
     * Método para pesquisar a partir do bairro
     *
     * @param bairro - String para a busca(bairro)
     */
    private void listarBairro(String bairro) {
        DefaultListModel listModel = new DefaultListModel();

        List<Imovel> chac = listaChacara.pesquisaBairro(bairro);
        if (bairro.equals("")) {
            listar();
        } else if (chac == null) {
            JOptionPane.showMessageDialog(null, "Nenhum imóvel não encontrado!");
        } else {
            for (Imovel imovel : chac) {
                listModel.addElement(imovel.toString());
            }
            jListChacaraLista.setModel(listModel);
        }

    }

    public void soNumeros(java.awt.event.KeyEvent evt) {
        char aux = evt.getKeyChar();
        if (!Character.isDigit(aux)) {
            evt.consume();
        }
    }

    public void soDouble(java.awt.event.KeyEvent evt, String text) {
        char aux = evt.getKeyChar();
        int tem = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                tem++;
                break;
            }
        }

        if (aux == '.') {
            if (tem != 0) {
                evt.consume();
            }
        } else if (!Character.isDigit(aux)) {
            evt.consume();
        }
    }
}
