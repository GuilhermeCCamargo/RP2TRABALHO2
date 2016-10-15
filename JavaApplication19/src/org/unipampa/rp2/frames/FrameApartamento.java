/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.frames;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.unipampa.rp2.listaimoveis.Lista;
import org.unipampa.rp2.tiposimoveis.Apartamento;
import org.unipampa.rp2.tiposimoveis.Imovel;

/**
 *
 * @author GuilhermeCCamargo
 */
public class FrameApartamento extends javax.swing.JFrame  {

    /**
     * Creates new form FrameApartamento
    */
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Lista listaapartamento;
    private List<Imovel> apartamento;
    private int codEdit = 0;
    private boolean isEdit = false;
//</editor-fold>   
    
    public FrameApartamento(Lista ListaApartamento) {
        initComponents();
        
         this.setLocationRelativeTo(null);
        this.setTitle("Imobiliária - Apartamento");
        
      
        this.listaapartamento = ListaApartamento;
       
        jTabbedPaneApartamento.setEnabledAt(0, true);
        
        listaapartamento.lerArquivo();
        
    }

    private FrameApartamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneApartamento = new javax.swing.JTabbedPane();
        jPanelApartamentoConsultar = new javax.swing.JPanel();
        jLabelConsultarCodigoApartamento = new javax.swing.JLabel();
        jTextFieldConsultarCodigoApartamento = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButtonConsultarVoltar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListListaApartamento = new javax.swing.JList<>();
        jLabelBemvindo = new javax.swing.JLabel();
        jLabelajuda = new javax.swing.JLabel();
        jLabeldia = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jPanelApartamentoAdicionar = new javax.swing.JPanel();
        jLabelAddLogradouro = new javax.swing.JLabel();
        jTextFieldAddLogradouro = new javax.swing.JTextField();
        jLabelAddNumero = new javax.swing.JLabel();
        jTextFieldAddApartamentoNum = new javax.swing.JTextField();
        jLabelAddBairro = new javax.swing.JLabel();
        jTextFieldAddBairro = new javax.swing.JTextField();
        jLabelAddCidade = new javax.swing.JLabel();
        jTextFieldAddCidade = new javax.swing.JTextField();
        jLabelAddAreaTotal = new javax.swing.JLabel();
        jTextFieldAddAreaTotal = new javax.swing.JTextField();
        jLabelAddValor = new javax.swing.JLabel();
        jTextFieldAddValor = new javax.swing.JTextField();
        jLabelAddValorCondominio = new javax.swing.JLabel();
        jTextFieldAddValorCondominio = new javax.swing.JTextField();
        jLabelAddEdificio = new javax.swing.JLabel();
        jTextFieldAddEdificio = new javax.swing.JTextField();
        jLabelAddAnoConstrucao = new javax.swing.JLabel();
        jTextFieldAddAnoConstrucao = new javax.swing.JTextField();
        jLabelAddAndar = new javax.swing.JLabel();
        jTextFieldAddAndar = new javax.swing.JTextField();
        jLabelAddApartamento = new javax.swing.JLabel();
        jTextFieldAddApartamento = new javax.swing.JTextField();
        jLabelAddQuartos = new javax.swing.JLabel();
        jTextFieldAddQuartos = new javax.swing.JTextField();
        jLabelAddVagasGaragem = new javax.swing.JLabel();
        jTextFieldAddVagasGaragem = new javax.swing.JTextField();
        jLabelAddDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAddDescricao = new javax.swing.JTextArea();
        jButtonAddVoltar = new javax.swing.JButton();
        jButtonAddAdicionar = new javax.swing.JButton();
        jLabelCamposObrigatorios = new javax.swing.JLabel();
        jPanelApartamentoEditar = new javax.swing.JPanel();
        jLabelEditarLogradouro = new javax.swing.JLabel();
        jTextFieldEditarLogradouro = new javax.swing.JTextField();
        jLabelEditarNumero = new javax.swing.JLabel();
        jTextFieldEditarNumero = new javax.swing.JTextField();
        jLabelEditarBairro = new javax.swing.JLabel();
        jTextFieldEditarBairro = new javax.swing.JTextField();
        jLabelEditarCidade = new javax.swing.JLabel();
        jTextFieldEditarCidade = new javax.swing.JTextField();
        jLabelEditarAreaTotal = new javax.swing.JLabel();
        jTextFieldEditarAreaTotal = new javax.swing.JTextField();
        jLabelEditarValor = new javax.swing.JLabel();
        jTextFieldEditarValor = new javax.swing.JTextField();
        jLabelEditarValorCondominio = new javax.swing.JLabel();
        jTextFieldEditarValorCondominio = new javax.swing.JTextField();
        jLabelEditarEdificio = new javax.swing.JLabel();
        jTextFieldEditarEdificio = new javax.swing.JTextField();
        jTextFieldEditarAnoConstrucao = new javax.swing.JTextField();
        jLabelEditarAnoConstruca = new javax.swing.JLabel();
        jLabelEditarAndar = new javax.swing.JLabel();
        jTextFieldEditarAndar = new javax.swing.JTextField();
        jLabelEditarApartamento = new javax.swing.JLabel();
        jTextFieldEditarApartamento = new javax.swing.JTextField();
        jLabelEditarQuartos = new javax.swing.JLabel();
        jTextFieldEditarQuartos = new javax.swing.JTextField();
        jLabelEditarVagasGaragem = new javax.swing.JLabel();
        jTextFieldEditarVagasGaragem = new javax.swing.JTextField();
        jLabelEditarDescricao = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaEditarDescricao = new javax.swing.JTextArea();
        jButtonEditarVoltar = new javax.swing.JButton();
        jButtonEditarSalvar = new javax.swing.JButton();
        jButtonEditarsalvar = new javax.swing.JButton();
        jLabelauxiliar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPaneApartamento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTabbedPaneApartamentoMouseMoved(evt);
            }
        });

        jPanelApartamentoConsultar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelApartamentoConsultarMouseMoved(evt);
            }
        });
        jPanelApartamentoConsultar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelApartamentoConsultarComponentShown(evt);
            }
        });

        jLabelConsultarCodigoApartamento.setText("Código:");

        jTextFieldConsultarCodigoApartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldConsultarCodigoApartamentoKeyTyped(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonConsultarVoltar.setText("Voltar");
        jButtonConsultarVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarVoltarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jListListaApartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListListaApartamentoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jListListaApartamento);

        jLabelBemvindo.setText("Seja Bem-vindo! ");

        jLabelajuda.setText("Digite o código do apartamento para fazer uma consulta");

        jLabeldia.setFont(new java.awt.Font("FreeMono", 2, 14)); // NOI18N
        jLabeldia.setText("Dia:");

        jLabelData.setFont(new java.awt.Font("FreeMono", 2, 14)); // NOI18N

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelApartamentoConsultarLayout = new javax.swing.GroupLayout(jPanelApartamentoConsultar);
        jPanelApartamentoConsultar.setLayout(jPanelApartamentoConsultarLayout);
        jPanelApartamentoConsultarLayout.setHorizontalGroup(
            jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                        .addGroup(jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonConsultarVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabelajuda))
                            .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addGroup(jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBemvindo)
                                    .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                                        .addComponent(jLabeldia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelConsultarCodigoApartamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldConsultarCodigoApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelApartamentoConsultarLayout.setVerticalGroup(
            jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBemvindo)
                .addGap(1, 1, 1)
                .addGroup(jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabeldia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelajuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonEditar)
                    .addComponent(jTextFieldConsultarCodigoApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConsultarCodigoApartamento)
                    .addComponent(jButtonExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButtonConsultarVoltar)
                .addContainerGap())
        );

        jTabbedPaneApartamento.addTab("Consultar", jPanelApartamentoConsultar);

        jLabelAddLogradouro.setText("* Logradouro:");

        jLabelAddNumero.setText("* Número:");

        jTextFieldAddApartamentoNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddApartamentoNumActionPerformed(evt);
            }
        });
        jTextFieldAddApartamentoNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddApartamentoNumKeyTyped(evt);
            }
        });

        jLabelAddBairro.setText("* Bairro:");

        jLabelAddCidade.setText("* Cidade:");

        jLabelAddAreaTotal.setText("* Área Total (m²):");

        jTextFieldAddAreaTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddAreaTotalKeyTyped(evt);
            }
        });

        jLabelAddValor.setText("Valor (R$):");

        jTextFieldAddValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddValorKeyTyped(evt);
            }
        });

        jLabelAddValorCondominio.setText("Valor do Condomínio (R$):");

        jTextFieldAddValorCondominio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddValorCondominioKeyTyped(evt);
            }
        });

        jLabelAddEdificio.setText("Edifício:");

        jTextFieldAddEdificio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddEdificioActionPerformed(evt);
            }
        });

        jLabelAddAnoConstrucao.setText("Ano de Construção:");

        jTextFieldAddAnoConstrucao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddAnoConstrucaoKeyTyped(evt);
            }
        });

        jLabelAddAndar.setText("* Andar:");

        jTextFieldAddAndar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddAndarKeyTyped(evt);
            }
        });

        jLabelAddApartamento.setText("Apartamento:");

        jTextFieldAddApartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddApartamentoKeyTyped(evt);
            }
        });

        jLabelAddQuartos.setText("* Quartos:");

        jTextFieldAddQuartos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddQuartosKeyTyped(evt);
            }
        });

        jLabelAddVagasGaragem.setText("* Vagas na garagem:");

        jTextFieldAddVagasGaragem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddVagasGaragemKeyTyped(evt);
            }
        });

        jLabelAddDescricao.setText("* Descrição:");

        jTextAreaAddDescricao.setColumns(20);
        jTextAreaAddDescricao.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAddDescricao);

        jButtonAddVoltar.setLabel("Voltar");
        jButtonAddVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddVoltarActionPerformed(evt);
            }
        });

        jButtonAddAdicionar.setLabel("Adicionar");
        jButtonAddAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAdicionarActionPerformed(evt);
            }
        });

        jLabelCamposObrigatorios.setForeground(new java.awt.Color(153, 0, 0));
        jLabelCamposObrigatorios.setText("Os campos com (*) são obrigatórios.");

        javax.swing.GroupLayout jPanelApartamentoAdicionarLayout = new javax.swing.GroupLayout(jPanelApartamentoAdicionar);
        jPanelApartamentoAdicionar.setLayout(jPanelApartamentoAdicionarLayout);
        jPanelApartamentoAdicionarLayout.setHorizontalGroup(
            jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoAdicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAddDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAddQuartos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAddAndar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAddCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAddNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAddLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAddValor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAddEdificio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAddLogradouro)
                    .addGroup(jPanelApartamentoAdicionarLayout.createSequentialGroup()
                        .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelApartamentoAdicionarLayout.createSequentialGroup()
                                .addComponent(jTextFieldAddApartamentoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelAddBairro))
                            .addComponent(jTextFieldAddCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAddBairro)
                            .addGroup(jPanelApartamentoAdicionarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(jLabelAddAreaTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAddAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelApartamentoAdicionarLayout.createSequentialGroup()
                        .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelApartamentoAdicionarLayout.createSequentialGroup()
                                .addComponent(jTextFieldAddValor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelAddValorCondominio))
                            .addGroup(jPanelApartamentoAdicionarLayout.createSequentialGroup()
                                .addComponent(jTextFieldAddEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelAddAnoConstrucao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAddValorCondominio, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jTextFieldAddAnoConstrucao)))
                    .addGroup(jPanelApartamentoAdicionarLayout.createSequentialGroup()
                        .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldAddQuartos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jTextFieldAddAndar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAddApartamento)
                            .addComponent(jLabelAddVagasGaragem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAddVagasGaragem, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jTextFieldAddApartamento))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelApartamentoAdicionarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCamposObrigatorios, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAddAdicionar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanelApartamentoAdicionarLayout.setVerticalGroup(
            jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoAdicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCamposObrigatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddLogradouro)
                    .addComponent(jTextFieldAddLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddNumero)
                    .addComponent(jTextFieldAddApartamentoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAddBairro)
                    .addComponent(jTextFieldAddBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddCidade)
                    .addComponent(jTextFieldAddCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAddAreaTotal)
                    .addComponent(jTextFieldAddAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddValor)
                    .addComponent(jTextFieldAddValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAddValorCondominio)
                    .addComponent(jTextFieldAddValorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddEdificio)
                    .addComponent(jTextFieldAddEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAddAnoConstrucao)
                    .addComponent(jTextFieldAddAnoConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAddAndar)
                    .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAddAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelAddApartamento)
                        .addComponent(jTextFieldAddApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddQuartos)
                    .addComponent(jTextFieldAddQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAddVagasGaragem)
                    .addComponent(jTextFieldAddVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAddDescricao)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelApartamentoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddAdicionar)
                    .addComponent(jButtonAddVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneApartamento.addTab("Adicionar", jPanelApartamentoAdicionar);

        jPanelApartamentoEditar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelApartamentoEditarMouseMoved(evt);
            }
        });

        jLabelEditarLogradouro.setText("* Logradouro:");

        jLabelEditarNumero.setText("* Número:");

        jLabelEditarBairro.setText("* Bairro:");

        jLabelEditarCidade.setText("* Cidade:");

        jLabelEditarAreaTotal.setText("* Área Total (m²):");

        jLabelEditarValor.setText("* Valor (R$):");

        jLabelEditarValorCondominio.setText("* Valor Condomínio (R$):");

        jLabelEditarEdificio.setText("Edifício:");

        jLabelEditarAnoConstruca.setText("Ano de Construção:");

        jLabelEditarAndar.setText("* Andar:");

        jLabelEditarApartamento.setText("* Apartamento:");

        jLabelEditarQuartos.setText("* Quartos:");

        jLabelEditarVagasGaragem.setText("* Vagas na Garagem:");

        jLabelEditarDescricao.setText("* Descrição:");

        jTextAreaEditarDescricao.setColumns(20);
        jTextAreaEditarDescricao.setRows(5);
        jScrollPane4.setViewportView(jTextAreaEditarDescricao);

        jButtonEditarVoltar.setText("Voltar");
        jButtonEditarVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarVoltarActionPerformed(evt);
            }
        });

        jButtonEditarSalvar.setText("Salvar");
        jButtonEditarSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarSalvarActionPerformed(evt);
            }
        });

        jButtonEditarsalvar.setText("Editar");
        jButtonEditarsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarsalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelApartamentoEditarLayout = new javax.swing.GroupLayout(jPanelApartamentoEditar);
        jPanelApartamentoEditar.setLayout(jPanelApartamentoEditarLayout);
        jPanelApartamentoEditarLayout.setHorizontalGroup(
            jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelEditarNumero)
                        .addComponent(jLabelEditarLogradouro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelEditarCidade)
                        .addComponent(jLabelEditarValor)
                        .addComponent(jLabelEditarEdificio)
                        .addComponent(jLabelEditarAndar)
                        .addComponent(jLabelEditarQuartos)
                        .addComponent(jLabelEditarDescricao)
                        .addComponent(jButtonEditarVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelauxiliar))
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldEditarLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                            .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldEditarCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                                    .addComponent(jTextFieldEditarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabelEditarBairro)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldEditarBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                            .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                                    .addGap(125, 125, 125)
                                    .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelEditarAreaTotal)
                                        .addComponent(jLabelEditarValorCondominio)
                                        .addComponent(jLabelEditarAnoConstruca)))
                                .addComponent(jTextFieldEditarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEditarEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEditarAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEditarValorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEditarAnoConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                            .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelApartamentoEditarLayout.createSequentialGroup()
                                    .addComponent(jTextFieldEditarQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabelEditarVagasGaragem))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelApartamentoEditarLayout.createSequentialGroup()
                                    .addComponent(jTextFieldEditarAndar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(jLabelEditarApartamento)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldEditarApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEditarVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButtonEditarsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditarSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelApartamentoEditarLayout.setVerticalGroup(
            jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarLogradouro)
                    .addComponent(jTextFieldEditarLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarNumero)
                    .addComponent(jTextFieldEditarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarBairro)
                    .addComponent(jTextFieldEditarBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarCidade)
                    .addComponent(jTextFieldEditarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarAreaTotal)
                    .addComponent(jTextFieldEditarAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarValor)
                    .addComponent(jTextFieldEditarValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarValorCondominio)
                    .addComponent(jTextFieldEditarValorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarEdificio)
                    .addComponent(jTextFieldEditarEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditarAnoConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarAnoConstruca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarAndar)
                    .addComponent(jTextFieldEditarAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditarApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarQuartos)
                    .addComponent(jTextFieldEditarQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarVagasGaragem)
                    .addComponent(jTextFieldEditarVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                        .addComponent(jLabelEditarDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelauxiliar)
                        .addGap(41, 41, 41)))
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEditarSalvar)
                        .addComponent(jButtonEditarVoltar))
                    .addComponent(jButtonEditarsalvar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPaneApartamento.addTab("Detalhes", jPanelApartamentoEditar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//<editor-fold defaultstate="collapsed" desc="Botão Voltar (Tab Edição)">
     
    private void jButtonEditarVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarVoltarActionPerformed
        Inicial voltar = new Inicial();
        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEditarVoltarActionPerformed

//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Botão Adicionar">
   
    private void jButtonAddAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAdicionarActionPerformed
        if(jTextFieldAddLogradouro.getText().trim().equals("") || jTextFieldAddApartamentoNum.getText().trim().equals("") || jTextFieldAddCidade.getText().equals("")
            || jTextFieldAddBairro.getText().trim().equals("") || jTextFieldAddVagasGaragem.getText().trim().equals("") || jTextFieldAddQuartos.getText().trim().equals("")
            || jTextFieldAddAndar.getText().trim().equals("") ||jTextFieldAddValor.getText().trim().equals("") || jTextFieldAddAreaTotal.getText().trim().equals("")
            || jTextAreaAddDescricao.getText().trim().equals("") || jTextFieldAddApartamento.getText().trim().equals("")){

            JOptionPane.showMessageDialog(null,"Pro favor preencha os campos obrigatórios.");

        } else {
            //Declarando as variaveis que irao armazenar os valores do objeto Apartamento
            int AnoConstrucao;
            int Andar;
            int Apartamento;
            int Numero;
            int Garagem;
            int Quartos;
            String Logradouro;
            String Edificio;
            String Cidade;
            String Bairro;
            String Descricao;
            double Valor;
            double ValorCondominio;
            double AreaTotal;

            //Inicializando as variaveis
            AnoConstrucao = Integer.parseInt(jTextFieldAddAnoConstrucao.getText().trim());
            Andar = Integer.parseInt(jTextFieldAddAndar.getText().trim());
            Apartamento = Integer.parseInt(jTextFieldAddApartamento.getText().trim());
            Numero = Integer.parseInt(jTextFieldAddApartamentoNum.getText().trim());
            Garagem = Integer.parseInt(jTextFieldAddVagasGaragem.getText().trim());
            Quartos = Integer.parseInt(jTextFieldAddQuartos.getText().trim());
            Logradouro = jTextFieldAddLogradouro.getText().trim();
            Edificio = jTextFieldAddEdificio.getText().trim();
            Cidade = jTextFieldAddCidade.getText().trim();
            Bairro = jTextFieldAddBairro.getText().trim();
            Descricao = jTextAreaAddDescricao.getText().trim();
            Valor = Double.parseDouble(jTextFieldAddValor.getText().trim());
            ValorCondominio = Double.parseDouble(jTextFieldAddValorCondominio.getText().trim());
            AreaTotal = Double.parseDouble(jTextFieldAddAreaTotal.getText().trim());

            //Atribuindo todos os valores ao Apartamento referenciado como objeto
            Apartamento objeto = new Apartamento(Cidade, Bairro, Logradouro, Numero, Valor,
                Edificio, Andar,Apartamento, AnoConstrucao,Quartos,Garagem, ValorCondominio, Descricao,AreaTotal);
            
            listaapartamento.incluir(objeto);
            //Salvando na Lista o objeto apartamento
            listaapartamento.escreverArquivo();
           
                        if(listaapartamento.escreverArquivo()){
                                                                        JOptionPane.showMessageDialog(null,"Imóvel salvo com sucesso.");
                                                                        limparCampos();
                                                                      }
                        else {
                                  JOptionPane.showMessageDialog(null, "O imóvel não pode ser adicionado.");
                                  limparCampos();
                                }
        }
        
 
        
    }//GEN-LAST:event_jButtonAddAdicionarActionPerformed
//</editor-fold>
 
    
    private void jButtonAddVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddVoltarActionPerformed
        jTabbedPaneApartamento.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonAddVoltarActionPerformed

    private void jTextFieldAddEdificioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddEdificioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddEdificioActionPerformed

//<editor-fold defaultstate="collapsed" desc="Botões da Tela Consultar">
    
    private void jButtonConsultarVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarVoltarActionPerformed
        Inicial voltar = new Inicial();
        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonConsultarVoltarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        int codigo;
        codigo = Integer.parseInt(jTextFieldConsultarCodigoApartamento.getText().trim());
        DefaultListModel modelo = new DefaultListModel();
        Imovel modelo1 = listaapartamento.consultar(codigo);
        if (modelo1 == null) {
            JOptionPane.showMessageDialog(null, "Imóvel não encontrado");
        } else {
            modelo.addElement(modelo1.toString());
            jListListaApartamento.setModel(modelo);
        }
        preencherCampos(codigo);
        jButtonEditarSalvar.setVisible(false);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    //</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Validação dos Campos">
    private void jTextFieldConsultarCodigoApartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldConsultarCodigoApartamentoKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldConsultarCodigoApartamentoKeyTyped

    private void jTextFieldAddApartamentoNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddApartamentoNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddApartamentoNumActionPerformed

    private void jTextFieldAddApartamentoNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddApartamentoNumKeyTyped
       soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldAddApartamentoNumKeyTyped

    private void jTextFieldAddAnoConstrucaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddAnoConstrucaoKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldAddAnoConstrucaoKeyTyped

    private void jTextFieldAddAndarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddAndarKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldAddAndarKeyTyped

    private void jTextFieldAddApartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddApartamentoKeyTyped
       soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldAddApartamentoKeyTyped

    private void jTextFieldAddQuartosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddQuartosKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldAddQuartosKeyTyped

    private void jTextFieldAddVagasGaragemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddVagasGaragemKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldAddVagasGaragemKeyTyped

    private void jTextFieldAddAreaTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddAreaTotalKeyTyped
        soNumeros(evt, isDouble(jTextFieldAddAreaTotal));
    }//GEN-LAST:event_jTextFieldAddAreaTotalKeyTyped

    private void jTextFieldAddValorCondominioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddValorCondominioKeyTyped
        soNumeros(evt, isDouble(jTextFieldAddValorCondominio));
    }//GEN-LAST:event_jTextFieldAddValorCondominioKeyTyped

    private void jTextFieldAddValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddValorKeyTyped
        soNumeros(evt, isDouble(jTextFieldAddValor));
    }//GEN-LAST:event_jTextFieldAddValorKeyTyped

//</editor-fold>    
    
    private void jListListaApartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListListaApartamentoMouseClicked
        
        jListListaApartamento.getSelectedValue();
    }//GEN-LAST:event_jListListaApartamentoMouseClicked

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
      int auxiliar = Integer.parseInt(jTextFieldConsultarCodigoApartamento.getText());
        preencherCampos(auxiliar);
        jLabelauxiliar.setText(String.valueOf(auxiliar));
    }//GEN-LAST:event_jButtonEditarActionPerformed

//<editor-fold defaultstate="collapsed" desc="Botão Salvar Edição">
    
    private void jButtonEditarSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarSalvarActionPerformed
        
        if(jTextAreaEditarDescricao.getText().trim().equals("") || jTextFieldEditarVagasGaragem.getText().trim().equals("") || jTextFieldEditarQuartos.getText().trim().equals("") || jTextFieldEditarApartamento.getText().trim().equals("") ||
            jTextFieldEditarAndar.getText().trim().equals("") || jTextFieldEditarValor.getText().trim().equals("") || jTextFieldEditarAreaTotal.getText().trim().equals("") || jTextFieldEditarCidade.getText().trim().equals("") || jTextFieldEditarBairro.getText().trim().equals("")
            || jTextFieldEditarNumero.getText().trim().equals("") || jTextFieldEditarLogradouro.getText().trim().equals("")) {
            
            JOptionPane.showMessageDialog(null,"Por favor, preencha os campos obrigatórios.");
            
        } else {
            
            //Declarando as variaveis que irao armazenar os valores do objeto Apartamento
            int AnoConstrucao;
            int Andar;
            int Apartamento;
            int Numero;
            int Garagem;
            int Quartos;
            String Logradouro;
            String Edificio;
            String Cidade;
            String Bairro;
            String Descricao;
            double Valor;
            double ValorCondominio;
            double AreaTotal;

            //Atribuindo os valores dos campos às variaveis
            AnoConstrucao = Integer.parseInt(jTextFieldEditarAnoConstrucao.getText().trim());
            Andar = Integer.parseInt(jTextFieldEditarAndar.getText().trim());
            Apartamento = Integer.parseInt(jTextFieldEditarApartamento.getText().trim());
            Numero = Integer.parseInt(jTextFieldEditarNumero.getText().trim());
            Garagem = Integer.parseInt(jTextFieldEditarVagasGaragem.getText().trim());
            Quartos = Integer.parseInt(jTextFieldEditarQuartos.getText().trim());
            Logradouro = jTextFieldEditarLogradouro.getText().trim();
            Edificio = jTextFieldEditarEdificio.getText().trim();
            Cidade = jTextFieldEditarCidade.getText().trim();
            Bairro = jTextFieldEditarBairro.getText().trim();
            Descricao = jTextAreaEditarDescricao.getText().trim();
            Valor = Double.parseDouble(jTextFieldEditarValor.getText().trim());
            ValorCondominio = Double.parseDouble(jTextFieldEditarValorCondominio.getText().trim());
            AreaTotal = Double.parseDouble(jTextFieldEditarAreaTotal.getText().trim());
            
            //Atribuindo todos os valores ao Apartamento referenciado como objeto
            Apartamento objeto = new Apartamento(Cidade, Bairro, Logradouro, Numero, Valor,
                Edificio, Andar,Apartamento, AnoConstrucao,Quartos,Garagem, ValorCondominio, Descricao, AreaTotal);
            
            int codigo;
            codigo = getCod(jListListaApartamento.getSelectedValue());//Recebendo o código do objeto
            
            //Salvando objeto editado na Lista 
            listaapartamento.editar(codigo, objeto);
            
            if(listaapartamento.editar(codigo, objeto) == true){
                                                                    JOptionPane.showMessageDialog(null,"Imóvel editado com sucesso.");
                                                                    limparCampos();
                                                                 }
                                                                   else{
                                                                            JOptionPane.showMessageDialog(null, "Objeto não pode ser editado.");
                                                                            limparCampos();
                                                                         }
        }
    }//GEN-LAST:event_jButtonEditarSalvarActionPerformed

    private void jPanelApartamentoConsultarComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelApartamentoConsultarComponentShown
                   Date hoje = new Date();
                   SimpleDateFormat df;
                   df = new SimpleDateFormat("dd/MM/yyyy");
                   jLabelData.setText(df.format(hoje));
                   listar();
                   
    }//GEN-LAST:event_jPanelApartamentoConsultarComponentShown

    private void jTabbedPaneApartamentoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneApartamentoMouseMoved
        
    }//GEN-LAST:event_jTabbedPaneApartamentoMouseMoved

    private void jPanelApartamentoEditarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelApartamentoEditarMouseMoved
       
    }//GEN-LAST:event_jPanelApartamentoEditarMouseMoved

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int escolha = Integer.valueOf(JOptionPane.showInputDialog("Digite o código do apartamento que deseja excluir: "));
        
        if(listaapartamento.consultar(escolha) == null){
                                                            JOptionPane.showMessageDialog(null, "Digite um código válido.");
                                                         }
        else {
                if(listaapartamento.excluir(escolha) == false){
                                                                 JOptionPane.showMessageDialog(null, "Não foi possível excluir o apartamento.");
                                                                }
                else{
                    JOptionPane.showMessageDialog(null,"Apartamento excluído.");
                }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jPanelApartamentoConsultarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelApartamentoConsultarMouseMoved
        listar();
    }//GEN-LAST:event_jPanelApartamentoConsultarMouseMoved

    private void jButtonEditarsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarsalvarActionPerformed
       
        int AnoConstrucao;
            int Andar;
            int Apartamento;
            int Numero;
            int Garagem;
            int Quartos;
            String Logradouro;
            String Edificio;
            String Cidade;
            String Bairro;
            String Descricao;
            double Valor;
            double ValorCondominio;
            double AreaTotal;
        
        int codigo = Integer.parseInt(jLabelauxiliar.getText()); 
        Apartamento apartclone = (Apartamento) listaapartamento.consultar(codigo);
        System.out.println(codigo);
        try {
             Apartamento apart = (Apartamento) apartclone.clone();
            AnoConstrucao = Integer.parseInt(jTextFieldEditarAnoConstrucao.getText().trim());
            Andar = Integer.parseInt(jTextFieldEditarAndar.getText().trim());
            Apartamento = Integer.parseInt(jTextFieldEditarApartamento.getText().trim());
            Numero = Integer.parseInt(jTextFieldEditarNumero.getText().trim());
            Garagem = Integer.parseInt(jTextFieldEditarVagasGaragem.getText().trim());
            Quartos = Integer.parseInt(jTextFieldEditarQuartos.getText().trim());
            Logradouro = jTextFieldEditarLogradouro.getText().trim();
            Edificio = jTextFieldEditarEdificio.getText().trim();
            Cidade = jTextFieldEditarCidade.getText().trim();
            Bairro = jTextFieldEditarBairro.getText().trim();
            Descricao = jTextAreaEditarDescricao.getText().trim();
            Valor = Double.parseDouble(jTextFieldEditarValor.getText().trim());
            ValorCondominio = Double.parseDouble(jTextFieldEditarValorCondominio.getText().trim());
            AreaTotal = Double.parseDouble(jTextFieldEditarAreaTotal.getText().trim());
            apart.setAnoConstrucao(AnoConstrucao);
            apart.setAndar(Andar);
            apart.setNroApartamento(Apartamento);
            apart.setNumero(Numero);
            apart.setVgsGaragem(Garagem);
            apart.setNroQuartos(Quartos);
            apart.setLogradouro(Logradouro);
            apart.setNomeEdificio(Edificio);
            apart.setCidade(Cidade);
            apart.setBairro(Bairro);
            apart.setDescricao(Descricao);
            apart.setValor(Valor);
            apart.setValorCondominio(ValorCondominio);
            
            listaapartamento.escreverArquivo();
            listaapartamento.editar(codigo, apart);
            JOptionPane.showMessageDialog(null, "Salvo.");
                    
            
        } catch (CloneNotSupportedException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonEditarsalvarActionPerformed

//</editor-fold>  

//<editor-fold defaultstate="collapsed" desc="Método Main">
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
            java.util.logging.Logger.getLogger(FrameApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameApartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameApartamento().setVisible(true);
            }
        });
    }
//</editor-fold>    
    
//<editor-fold defaultstate="collapsed" desc="Método para listar os objetos Apartamento">
    
    private void listar(){
        DefaultListModel modelList = new DefaultListModel();
        
        List<Imovel> imovel = listaapartamento.getLista();
        
        for(Imovel  imovel1: imovel){
            modelList.addElement(imovel1.toString());
        }
        jListListaApartamento.setModel(modelList);
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Métodos Complementares">

    /**
     * Método usado para limpar todos os campos tanto após uma edição quanto
     * após uma edição.
     */
    private void limparCampos() {
        jTextFieldAddAndar.setText("");
        jTextFieldAddAnoConstrucao.setText("");
        jTextFieldAddApartamento.setText("");
        jTextFieldAddApartamentoNum.setText("");
        jTextFieldAddAreaTotal.setText("");
        jTextFieldAddBairro.setText("");
        jTextFieldAddCidade.setText("");
        jTextFieldAddEdificio.setText("");
        jTextFieldAddLogradouro.setText("");
        jTextFieldAddQuartos.setText("");
        jTextFieldAddVagasGaragem.setText("");
        jTextFieldAddValor.setText("");
        jTextFieldAddValorCondominio.setText("");
        jTextAreaAddDescricao.setText("");
    }
    
    /**
     * metodo para validar campo numerico
     * @param evt
     * @param isDouble 
     */
    private void soNumeros(java.awt.event.KeyEvent evt, boolean isDouble) {
        char ch = evt.getKeyChar();
        if (isDouble) {
            if (Character.isDigit(ch) || ch == '.') {

            } else {
                evt.consume();
            }
        } else if (Character.isDigit(ch)) {

        } else {
            evt.consume();
        }
    }
    
   /**
    * Metodo para Validar campos double
    * @param campo
    * @return 
    */ 
    private boolean isDouble(javax.swing.JTextField campo) {
        String texto = campo.getText().trim();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '.') {
                return false;
            }
        }

        return true;
    }
    
    /**
     * Método para pegar o codigo do objeto
     * @param cod
     * @return 
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
    
    /**
     * Método para preencher os campos com informaçoes de um objeto especifico
     * @param apartamento 
     */
    private void preencherCampos(int apartamento) {

        Apartamento newapartamento = (Apartamento) listaapartamento.consultar(apartamento);
        
           
        jButtonEditarSalvar.setVisible(false);
        jTextFieldEditarAndar.setText(String.valueOf(newapartamento.getAndar()));
        jTextFieldEditarAreaTotal.setText(String.valueOf(newapartamento.getAreaTotal()));
        jTextFieldEditarAnoConstrucao.setText(String.valueOf(newapartamento.getAnoConstrucao()));
        jTextFieldEditarApartamento.setText(String.valueOf(newapartamento.getNroApartamento()));
        jTextFieldEditarBairro.setText(String.valueOf(newapartamento.getBairro()));
        jTextFieldEditarCidade.setText(String.valueOf(newapartamento.getCidade()));
        jTextFieldEditarEdificio.setText(String.valueOf(newapartamento.getNomeEdificio()));
        jTextFieldEditarLogradouro.setText(newapartamento.getLogradouro());
        jTextFieldEditarNumero.setText(String.valueOf(newapartamento.getNumero()));
        jTextFieldEditarQuartos.setText(String.valueOf(newapartamento.getNroQuartos()));
        jTextFieldEditarVagasGaragem.setText(String.valueOf(newapartamento.getVgsGaragem()));
        jTextFieldEditarValor.setText(String.valueOf(newapartamento.getValor()));
        jTextFieldEditarValorCondominio.setText(String.valueOf(newapartamento.getValorCondominio()));
        jTextAreaEditarDescricao.setText(String.valueOf(newapartamento.getDescricao()));
    }

//</editor-fold>
  
   
    
//<editor-fold defaultstate="collapsed" desc="Declaração dos Componentes">    
/**
 * Declaraçao das variaveis (componentes)
 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAdicionar;
    private javax.swing.JButton jButtonAddVoltar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonConsultarVoltar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEditarSalvar;
    private javax.swing.JButton jButtonEditarVoltar;
    private javax.swing.JButton jButtonEditarsalvar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabelAddAndar;
    private javax.swing.JLabel jLabelAddAnoConstrucao;
    private javax.swing.JLabel jLabelAddApartamento;
    private javax.swing.JLabel jLabelAddAreaTotal;
    private javax.swing.JLabel jLabelAddBairro;
    private javax.swing.JLabel jLabelAddCidade;
    private javax.swing.JLabel jLabelAddDescricao;
    private javax.swing.JLabel jLabelAddEdificio;
    private javax.swing.JLabel jLabelAddLogradouro;
    private javax.swing.JLabel jLabelAddNumero;
    private javax.swing.JLabel jLabelAddQuartos;
    private javax.swing.JLabel jLabelAddVagasGaragem;
    private javax.swing.JLabel jLabelAddValor;
    private javax.swing.JLabel jLabelAddValorCondominio;
    private javax.swing.JLabel jLabelBemvindo;
    private javax.swing.JLabel jLabelCamposObrigatorios;
    private javax.swing.JLabel jLabelConsultarCodigoApartamento;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelEditarAndar;
    private javax.swing.JLabel jLabelEditarAnoConstruca;
    private javax.swing.JLabel jLabelEditarApartamento;
    private javax.swing.JLabel jLabelEditarAreaTotal;
    private javax.swing.JLabel jLabelEditarBairro;
    private javax.swing.JLabel jLabelEditarCidade;
    private javax.swing.JLabel jLabelEditarDescricao;
    private javax.swing.JLabel jLabelEditarEdificio;
    private javax.swing.JLabel jLabelEditarLogradouro;
    private javax.swing.JLabel jLabelEditarNumero;
    private javax.swing.JLabel jLabelEditarQuartos;
    private javax.swing.JLabel jLabelEditarVagasGaragem;
    private javax.swing.JLabel jLabelEditarValor;
    private javax.swing.JLabel jLabelEditarValorCondominio;
    private javax.swing.JLabel jLabelajuda;
    private javax.swing.JLabel jLabelauxiliar;
    private javax.swing.JLabel jLabeldia;
    private javax.swing.JList<String> jListListaApartamento;
    private javax.swing.JPanel jPanelApartamentoAdicionar;
    private javax.swing.JPanel jPanelApartamentoConsultar;
    private javax.swing.JPanel jPanelApartamentoEditar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneApartamento;
    private javax.swing.JTextArea jTextAreaAddDescricao;
    private javax.swing.JTextArea jTextAreaEditarDescricao;
    private javax.swing.JTextField jTextFieldAddAndar;
    private javax.swing.JTextField jTextFieldAddAnoConstrucao;
    private javax.swing.JTextField jTextFieldAddApartamento;
    private javax.swing.JTextField jTextFieldAddApartamentoNum;
    private javax.swing.JTextField jTextFieldAddAreaTotal;
    private javax.swing.JTextField jTextFieldAddBairro;
    private javax.swing.JTextField jTextFieldAddCidade;
    private javax.swing.JTextField jTextFieldAddEdificio;
    private javax.swing.JTextField jTextFieldAddLogradouro;
    private javax.swing.JTextField jTextFieldAddQuartos;
    private javax.swing.JTextField jTextFieldAddVagasGaragem;
    private javax.swing.JTextField jTextFieldAddValor;
    private javax.swing.JTextField jTextFieldAddValorCondominio;
    private javax.swing.JTextField jTextFieldConsultarCodigoApartamento;
    private javax.swing.JTextField jTextFieldEditarAndar;
    private javax.swing.JTextField jTextFieldEditarAnoConstrucao;
    private javax.swing.JTextField jTextFieldEditarApartamento;
    private javax.swing.JTextField jTextFieldEditarAreaTotal;
    private javax.swing.JTextField jTextFieldEditarBairro;
    private javax.swing.JTextField jTextFieldEditarCidade;
    private javax.swing.JTextField jTextFieldEditarEdificio;
    private javax.swing.JTextField jTextFieldEditarLogradouro;
    private javax.swing.JTextField jTextFieldEditarNumero;
    private javax.swing.JTextField jTextFieldEditarQuartos;
    private javax.swing.JTextField jTextFieldEditarVagasGaragem;
    private javax.swing.JTextField jTextFieldEditarValor;
    private javax.swing.JTextField jTextFieldEditarValorCondominio;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    
}
