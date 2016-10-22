/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.frames;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        
        if(listaapartamento.lerArquivo()){
            
        }else{
            JOptionPane.showMessageDialog(null,"Arquivo não encontrado. Será criado um novo arquivo.");
        }
        
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
        jButtonInicioConsultar = new javax.swing.JButton();
        jButtonInicioVoltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListListaApartamento = new javax.swing.JList<>();
        jLabelBemvindo = new javax.swing.JLabel();
        jLabelajuda = new javax.swing.JLabel();
        jLabeldia = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jPanelApartamentoEditar = new javax.swing.JPanel();
        jLabelEditarLogradouro = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jLabelEditarNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelEditarBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelEditarCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelEditarAreaTotal = new javax.swing.JLabel();
        jTextFieldAreaTotal = new javax.swing.JTextField();
        jLabelEditarValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabelEditarValorCondominio = new javax.swing.JLabel();
        jTextFieldValorCondominio = new javax.swing.JTextField();
        jLabelEditarEdificio = new javax.swing.JLabel();
        jTextFieldEdificio = new javax.swing.JTextField();
        jTextFieldAnoConstrucao = new javax.swing.JTextField();
        jLabelEditarAnoConstruca = new javax.swing.JLabel();
        jLabelEditarAndar = new javax.swing.JLabel();
        jTextFieldAndar = new javax.swing.JTextField();
        jLabelEditarApartamento = new javax.swing.JLabel();
        jTextFieldApartamento = new javax.swing.JTextField();
        jLabelEditarQuartos = new javax.swing.JLabel();
        jTextFieldQuartos = new javax.swing.JTextField();
        jLabelEditarVagasGaragem = new javax.swing.JLabel();
        jTextFieldVagasGaragem = new javax.swing.JTextField();
        jLabelEditarDescricao = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jButtonDadosVoltar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabelauxiliar = new javax.swing.JLabel();
        jLabelAviso = new javax.swing.JLabel();

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
        jPanelApartamentoConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelApartamentoConsultarMouseClicked(evt);
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

        jButtonInicioConsultar.setText("Consultar");
        jButtonInicioConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioConsultarActionPerformed(evt);
            }
        });

        jButtonInicioVoltar.setText("Voltar");
        jButtonInicioVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioVoltarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelApartamentoConsultarLayout = new javax.swing.GroupLayout(jPanelApartamentoConsultar);
        jPanelApartamentoConsultar.setLayout(jPanelApartamentoConsultarLayout);
        jPanelApartamentoConsultarLayout.setHorizontalGroup(
            jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                        .addGroup(jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonInicioVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabelajuda))
                            .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addGroup(jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                                        .addComponent(jLabeldia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                                        .addComponent(jLabelBemvindo)
                                        .addGap(20, 20, 20)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelApartamentoConsultarLayout.createSequentialGroup()
                        .addGroup(jPanelApartamentoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelApartamentoConsultarLayout.createSequentialGroup()
                                .addComponent(jLabelConsultarCodigoApartamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldConsultarCodigoApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonInicioConsultar)))
                        .addGap(16, 16, 16))))
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
                    .addComponent(jButtonInicioConsultar)
                    .addComponent(jTextFieldConsultarCodigoApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConsultarCodigoApartamento))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButtonInicioVoltar)
                .addContainerGap())
        );

        jTabbedPaneApartamento.addTab("Início", jPanelApartamentoConsultar);

        jPanelApartamentoEditar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelApartamentoEditarMouseMoved(evt);
            }
        });

        jLabelEditarLogradouro.setText("* Logradouro:");

        jLabelEditarNumero.setText("* Número:");

        jTextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroKeyTyped(evt);
            }
        });

        jLabelEditarBairro.setText("* Bairro:");

        jLabelEditarCidade.setText("* Cidade:");

        jLabelEditarAreaTotal.setText("* Área Total (m²):");

        jTextFieldAreaTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAreaTotalKeyTyped(evt);
            }
        });

        jLabelEditarValor.setText("* Valor (R$):");

        jTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyTyped(evt);
            }
        });

        jLabelEditarValorCondominio.setText("* Valor Condomínio (R$):");

        jTextFieldValorCondominio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorCondominioKeyTyped(evt);
            }
        });

        jLabelEditarEdificio.setText("Edifício:");

        jTextFieldAnoConstrucao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnoConstrucaoKeyTyped(evt);
            }
        });

        jLabelEditarAnoConstruca.setText("Ano de Construção:");

        jLabelEditarAndar.setText("* Andar:");

        jTextFieldAndar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAndarKeyTyped(evt);
            }
        });

        jLabelEditarApartamento.setText("* Apartamento:");

        jTextFieldApartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApartamentoKeyTyped(evt);
            }
        });

        jLabelEditarQuartos.setText("* Quartos:");

        jTextFieldQuartos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuartosKeyTyped(evt);
            }
        });

        jLabelEditarVagasGaragem.setText("* Vagas na Garagem:");

        jTextFieldVagasGaragem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldVagasGaragemKeyTyped(evt);
            }
        });

        jLabelEditarDescricao.setText("* Descrição:");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane4.setViewportView(jTextAreaDescricao);

        jButtonDadosVoltar.setText("Voltar");
        jButtonDadosVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDadosVoltarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabelAviso.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabelAviso.setForeground(new java.awt.Color(204, 0, 0));
        jLabelAviso.setText("Os campos com (*) são de preenchimento obrigatório.");

        javax.swing.GroupLayout jPanelApartamentoEditarLayout = new javax.swing.GroupLayout(jPanelApartamentoEditar);
        jPanelApartamentoEditar.setLayout(jPanelApartamentoEditarLayout);
        jPanelApartamentoEditarLayout.setHorizontalGroup(
            jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
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
                                .addComponent(jButtonDadosVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelauxiliar))
                        .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                                    .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabelEditarBairro)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldBairro))
                                .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                                    .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                                            .addGap(125, 125, 125)
                                            .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabelEditarAreaTotal)
                                                .addComponent(jLabelEditarValorCondominio)
                                                .addComponent(jLabelEditarAnoConstruca)))
                                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldValorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldAnoConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                                    .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelApartamentoEditarLayout.createSequentialGroup()
                                            .addComponent(jTextFieldQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(19, 19, 19)
                                            .addComponent(jLabelEditarVagasGaragem))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelApartamentoEditarLayout.createSequentialGroup()
                                            .addComponent(jTextFieldAndar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(56, 56, 56)
                                            .addComponent(jLabelEditarApartamento)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelApartamentoEditarLayout.createSequentialGroup()
                        .addComponent(jLabelAviso)
                        .addGap(0, 0, 0))))
        );
        jPanelApartamentoEditarLayout.setVerticalGroup(
            jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoEditarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelAviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarLogradouro)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarAreaTotal)
                    .addComponent(jTextFieldAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarValor)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarValorCondominio)
                    .addComponent(jTextFieldValorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarEdificio)
                    .addComponent(jTextFieldEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnoConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarAnoConstruca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarAndar)
                    .addComponent(jTextFieldAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditarQuartos)
                    .addComponent(jTextFieldQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarVagasGaragem)
                    .addComponent(jTextFieldVagasGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanelApartamentoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonDadosVoltar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPaneApartamento.addTab("Dados do Imóvel", jPanelApartamentoEditar);

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
     
    private void jButtonDadosVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDadosVoltarActionPerformed
        Inicial voltar = new Inicial();
        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonDadosVoltarActionPerformed

//</editor-fold>
   
  //<editor-fold defaultstate="collapsed" desc="Botões da Tela Consultar">
   
  //<editor-fold defaultstate="collapsed" desc="Ação do botão Voltar">
    
    private void jButtonInicioVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioVoltarActionPerformed
        Inicial voltar = new Inicial();
        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonInicioVoltarActionPerformed

 //</editor-fold>   
    
  //<editor-fold defaultstate="collapsed" desc="Ação do botão Consultar">    
    
    private void jButtonInicioConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioConsultarActionPerformed
     
        int codigo;
        codigo = Integer.parseInt(jTextFieldConsultarCodigoApartamento.getText().trim());
        if (jTextFieldConsultarCodigoApartamento.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite um código no campo de busca.");
        } else if (listaapartamento.consultar(codigo) == null) {
            JOptionPane.showMessageDialog(null, "Apartamento não encontrado. Por favor verifique o código.");
        } else {
            preencherCampos(codigo);
            jButtonSalvar.setVisible(false);
            mudarAbas(0, 1);
    }//GEN-LAST:event_jButtonInicioConsultarActionPerformed
    }
  
    //</editor-fold>
    
    //</editor-fold>
    
  //<editor-fold defaultstate="collapsed" desc="Validação dos Campos">
    private void jTextFieldConsultarCodigoApartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldConsultarCodigoApartamentoKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldConsultarCodigoApartamentoKeyTyped

//</editor-fold>    
    
  //<editor-fold defaultstate="collapsed" desc="Ação dos cliques na lista">
    
    private void jListListaApartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListListaApartamentoMouseClicked
        
        if (!javax.swing.SwingUtilities.isRightMouseButton(evt) && !javax.swing.SwingUtilities.isMiddleMouseButton(evt)) {//javax.swing.SwingUtilities.isMiddleMouseButton(evt)){
            if (jListListaApartamento.getModel().getSize() != 0) {
                codEdit = (getCod(jListListaApartamento.getSelectedValue()));
                int escolha = Integer.valueOf(JOptionPane.showInputDialog("Selecione uma opção:\n1- Visualizar Detalhes\n2- Editar\n3- Excluir\n4- Voltar"));
                switch (escolha) {
                    case 1:
                        if (listaapartamento.consultar(codEdit) != null) {
                            preencherCampos(codEdit);
                            desativarEdicao();
                            isEdit = false;
                            mudarAbas(0, 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "Imóvel não encontrado.");
                        }
                        break;
                    case 2:
                        if (listaapartamento.consultar(codEdit) != null) {
                            preencherCampos(codEdit);
                            mudarAbas(0, 1);
                            isEdit = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Imóvel não encontrado.");
                        }
                        break;
                    case 3:
                        if (listaapartamento.consultar(codEdit) != null) {
                            Apartamento auxiliar = (Apartamento) listaapartamento.consultar(codEdit);
                            String edificio = auxiliar.getNomeEdificio();
                            String logradouro = auxiliar.getLogradouro();
                            String cidade = auxiliar.getCidade();
                            int numero = auxiliar.getNumero();
                            int andar = auxiliar.getAndar();
                            int apartamento = auxiliar.getNroApartamento();
                            double valor = auxiliar.getValor();
                            String mensagem = "Dados do Imóvel:\n\nEdificio: " + edificio + "\nLogradouro: " + logradouro + "\nCidade: " + cidade + "\nNúmero: " + numero + "\nAndar: " + andar + "\nApartamento: " + apartamento + "\nValor: R$" + valor + "\n\nRealmente deseja excluir este Imóvel?\n 1- Sim\n2- Não\n3- Voltar";
                            int opcao = Integer.valueOf(JOptionPane.showInputDialog(mensagem));
                            switch (opcao) {
                                case 1:
                                    if (!listaapartamento.excluir(codEdit)) {
                                        JOptionPane.showMessageDialog(null, "Imóvel excluído com sucesso.");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Não foi possível excluir este Imóvel");

                                    }
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Imóvel não encontrado.");
                        }
                        break;
                    case 4:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
                        break;
                }
            }
        } else if (!javax.swing.SwingUtilities.isLeftMouseButton(evt) && !javax.swing.SwingUtilities.isMiddleMouseButton(evt)) {
            String menu = "Selecione uma opção:\n\n1- Ordenar\n2- Pesquisar\n3- Voltar";
            int escolha = Integer.valueOf(JOptionPane.showInputDialog(menu));
            switch (escolha) {
                case 1:
                    String menu2 = "Selecione um tipo de ordenação:\n\n1- Por Valor\n2- Por Código\n3- Por Área Total\n4- Voltar";
                    int opcao = Integer.valueOf(JOptionPane.showInputDialog(menu2));
                    switch (opcao) {
                        case 1:
                            listaapartamento.ordenarValor();
                            DefaultListModel modelList = new DefaultListModel();

                            List<Imovel> imovel = listaapartamento.getLista();

                            for (Imovel imovel1 : imovel) {
                                modelList.addElement(imovel1.toString());
                            }
                            jListListaApartamento.setModel(modelList);
                            break;
                        case 2:
                            listaapartamento.ordenarCodigo();
                            DefaultListModel modelList1 = new DefaultListModel();

                            List<Imovel> imovel2 = listaapartamento.getLista();

                            for (Imovel imovelx : imovel2) {
                                modelList1.addElement(imovelx.toString());
                            }
                            jListListaApartamento.setModel(modelList1);
                            break;
                        case 3:
                            listaapartamento.ordenarArea();
                            DefaultListModel modelListx = new DefaultListModel();

                            List<Imovel> imovelI = listaapartamento.getLista();

                            for (Imovel imovel3 : imovelI) {
                                modelListx.addElement(imovel3.toString());
                            }
                            jListListaApartamento.setModel(modelListx);
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
                            break;
                    }
            }
        }

    }//GEN-LAST:event_jListListaApartamentoMouseClicked

    //</editor-fold>
    
  //<editor-fold defaultstate="collapsed" desc="Botão Salvar Edição">
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (!isEdit) {
            if (jTextAreaDescricao.getText().trim().equals("") || jTextFieldVagasGaragem.getText().trim().equals("") || jTextFieldQuartos.getText().trim().equals("") || jTextFieldApartamento.getText().trim().equals("")
                    || jTextFieldAndar.getText().trim().equals("") || jTextFieldValor.getText().trim().equals("") || jTextFieldAreaTotal.getText().trim().equals("") || jTextFieldCidade.getText().trim().equals("") || jTextFieldBairro.getText().trim().equals("")
                    || jTextFieldNumero.getText().trim().equals("") || jTextFieldLogradouro.getText().trim().equals("")) {

                JOptionPane.showMessageDialog(null, "Por favor, preencha os campos obrigatórios.");

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
                AnoConstrucao = Integer.parseInt(jTextFieldAnoConstrucao.getText().trim());
                Andar = Integer.parseInt(jTextFieldAndar.getText().trim());
                Apartamento = Integer.parseInt(jTextFieldApartamento.getText().trim());
                Numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                Garagem = Integer.parseInt(jTextFieldVagasGaragem.getText().trim());
                Quartos = Integer.parseInt(jTextFieldQuartos.getText().trim());
                Logradouro = jTextFieldLogradouro.getText().trim();
                Edificio = jTextFieldEdificio.getText().trim();
                Cidade = jTextFieldCidade.getText().trim();
                Bairro = jTextFieldBairro.getText().trim();
                Descricao = jTextAreaDescricao.getText().trim();
                Valor = Double.parseDouble(jTextFieldValor.getText().trim());
                ValorCondominio = Double.parseDouble(jTextFieldValorCondominio.getText().trim());
                AreaTotal = Double.parseDouble(jTextFieldAreaTotal.getText().trim());

                //Atribuindo todos os valores ao Apartamento referenciado como objeto
                Apartamento objeto = new Apartamento(Cidade, Bairro, Logradouro, Numero, Valor,
                        Edificio, Andar, Apartamento, AnoConstrucao, Quartos, Garagem, ValorCondominio, Descricao, AreaTotal);

                //Salvando objeto editado na Lista 
                if (!listaapartamento.incluir(objeto)) {
                    JOptionPane.showMessageDialog(null, "Não foi possível incluir o Imóvel.");
                    limparCampos();
                    mudarAbas(1, 0);
                } else if (!listaapartamento.escreverArquivo()) {
                    JOptionPane.showMessageDialog(null, "Não foi possível incluir o Imóvel.");
                    limparCampos();
                    mudarAbas(1, 0);
                } else {
                    JOptionPane.showMessageDialog(null, "Imóvel salvo com sucesso. ");
                    limparCampos();
                    mudarAbas(1, 0);
                }
            }
        } else if (jTextAreaDescricao.getText().trim().equals("") || jTextFieldVagasGaragem.getText().trim().equals("") || jTextFieldQuartos.getText().trim().equals("") || jTextFieldApartamento.getText().trim().equals("")
                || jTextFieldAndar.getText().trim().equals("") || jTextFieldValor.getText().trim().equals("") || jTextFieldAreaTotal.getText().trim().equals("") || jTextFieldCidade.getText().trim().equals("") || jTextFieldBairro.getText().trim().equals("")
                || jTextFieldNumero.getText().trim().equals("") || jTextFieldLogradouro.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos obrigatórios.");

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
           
                     Apartamento novoapart = (Apartamento) listaapartamento.consultar(codEdit);
            //Atribuindo os valores dos campos às variaveis
            novoapart.setAnoConstrucao(Integer.parseInt(jTextFieldAnoConstrucao.getText().trim()));
            novoapart.setAndar(Integer.parseInt(jTextFieldAndar.getText().trim()));
            novoapart.setNroApartamento(Integer.parseInt(jTextFieldApartamento.getText().trim()));
            novoapart.setNumero(Integer.parseInt(jTextFieldNumero.getText().trim()));
            novoapart.setVgsGaragem(Integer.parseInt(jTextFieldVagasGaragem.getText().trim()));
            novoapart.setNroQuartos(Integer.parseInt(jTextFieldQuartos.getText().trim()));
            novoapart.setLogradouro(jTextFieldLogradouro.getText().trim());
            novoapart.setNomeEdificio(jTextFieldEdificio.getText().trim());
            novoapart.setCidade(jTextFieldCidade.getText().trim());
            novoapart.setBairro(jTextFieldBairro.getText().trim());
            novoapart.setDescricao(jTextAreaDescricao.getText().trim());
            novoapart.setValor(Double.parseDouble(jTextFieldValor.getText().trim()));
            novoapart.setValorCondominio(Double.parseDouble(jTextFieldValorCondominio.getText().trim()));
            novoapart.setAreaTotal(Double.parseDouble(jTextFieldAreaTotal.getText().trim()));

            
            if (listaapartamento.consultar(codEdit) == null) {
                JOptionPane.showMessageDialog(null, "Não foi possível encontrar o Imóvel desejado.");
            } else if (listaapartamento.editar(codEdit, novoapart)) {
                JOptionPane.showMessageDialog(null, "Imóvel Editado com sucesso.");
                limparCampos();
                mudarAbas(1,0);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível editar o imóvel.");
                limparCampos();
                mudarAbas(1,0);
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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

    private void jPanelApartamentoConsultarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelApartamentoConsultarMouseMoved
    
    }//GEN-LAST:event_jPanelApartamentoConsultarMouseMoved

    private void jPanelApartamentoEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelApartamentoEditarMouseClicked
       
    }//GEN-LAST:event_jPanelApartamentoEditarMouseClicked

    private void jPanelApartamentoConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelApartamentoConsultarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelApartamentoConsultarMouseClicked

    private void jTextFieldNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldNumeroKeyTyped

    private void jTextFieldAndarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAndarKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldAndarKeyTyped

    private void jTextFieldApartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApartamentoKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldApartamentoKeyTyped

    private void jTextFieldQuartosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuartosKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldQuartosKeyTyped

    private void jTextFieldVagasGaragemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVagasGaragemKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldVagasGaragemKeyTyped

    private void jTextFieldAnoConstrucaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnoConstrucaoKeyTyped
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldAnoConstrucaoKeyTyped

    private void jTextFieldAreaTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAreaTotalKeyTyped
        soNumeros(evt, isDouble(jTextFieldAreaTotal));
    }//GEN-LAST:event_jTextFieldAreaTotalKeyTyped

    private void jTextFieldValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyTyped
        soNumeros(evt, isDouble(jTextFieldValor));
    }//GEN-LAST:event_jTextFieldValorKeyTyped

    private void jTextFieldValorCondominioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorCondominioKeyTyped
        soNumeros(evt, isDouble(jTextFieldValorCondominio));
    }//GEN-LAST:event_jTextFieldValorCondominioKeyTyped

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
  
  //<editor-fold defaultstate="collapsed" desc="Método para "limpar" os campos">
    
    private void limparCampos() {
        jTextFieldAndar.setText("");
        jTextFieldAnoConstrucao.setText("");
        jTextFieldApartamento.setText("");
        jTextFieldApartamento.setText("");
        jTextFieldAreaTotal.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEdificio.setText("");
        jTextFieldLogradouro.setText("");
        jTextFieldQuartos.setText("");
        jTextFieldVagasGaragem.setText("");
        jTextFieldValor.setText("");
        jTextFieldValorCondominio.setText("");
        jTextAreaDescricao.setText("");
    }
    
    //</editor-fold>
    
  //<editor-fold defaultstate="collapsed" desc="Método para impossibilitar inserção de caracteres inválidos em campos numéricos">

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

    //</editor-fold>
    
  //<editor-fold defaultstate="collapsed" desc="Validação de campos do tipo Double">
    
    private boolean isDouble(javax.swing.JTextField campo) {
        String texto = campo.getText().trim();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '.') {
                return false;
            }
        }

        return true;
    }
    
    //</editor-fold>
    
  //<editor-fold defaultstate="collapsed" desc="Método que retorna o código de um objeto">
    
    private int getCod(String cod) {
        int end = 0;
        for (int i = 8; i < cod.length(); i++) {
            if (cod.charAt(i) == '-') {
                end = i - 1;
                break;
            }
        }

        cod = cod.substring(8, end);
        return Integer.parseInt(cod);
    }
    
    //</editor-fold>
    
  //<editor-fold defaultstate="collapsed" desc="Método para preencher os campos com informaçoes de um objeto especifico">
    
    private void preencherCampos(int apartamento) {

        Apartamento newapartamento = (Apartamento) listaapartamento.consultar(apartamento);
    
        jTextFieldAndar.setText(String.valueOf(newapartamento.getAndar()));
        jTextFieldAreaTotal.setText(String.valueOf(newapartamento.getAreaTotal()));
        jTextFieldAnoConstrucao.setText(String.valueOf(newapartamento.getAnoConstrucao()));
        jTextFieldApartamento.setText(String.valueOf(newapartamento.getNroApartamento()));
        jTextFieldBairro.setText(String.valueOf(newapartamento.getBairro()));
        jTextFieldCidade.setText(String.valueOf(newapartamento.getCidade()));
        jTextFieldEdificio.setText(String.valueOf(newapartamento.getNomeEdificio()));
        jTextFieldLogradouro.setText(newapartamento.getLogradouro());
        jTextFieldNumero.setText(String.valueOf(newapartamento.getNumero()));
        jTextFieldQuartos.setText(String.valueOf(newapartamento.getNroQuartos()));
        jTextFieldVagasGaragem.setText(String.valueOf(newapartamento.getVgsGaragem()));
        jTextFieldValor.setText(String.valueOf(newapartamento.getValor()));
        jTextFieldValorCondominio.setText(String.valueOf(newapartamento.getValorCondominio()));
        jTextAreaDescricao.setText(String.valueOf(newapartamento.getDescricao()));
    }
    
    //</editor-fold>
    
  //<editor-fold defaultstate="collapsed" desc="Método para alternar entre as abas">
    
    private void mudarAbas(int saida, int chegada){
        jTabbedPaneApartamento.setEnabledAt(saida, false);
        jTabbedPaneApartamento.setEnabledAt(chegada, true);
        jTabbedPaneApartamento.setSelectedIndex(chegada);
    }
    
//</editor-fold>
    
  //<editor-fold defaultstate="collapsed" desc="Método para desativar edição dos campos (usado para visualizar detalhes)">
 
    public void desativarEdicao(){
        
        jButtonSalvar.setVisible(false);
        jTextFieldAndar.setEditable(false);
        jTextFieldAreaTotal.setEditable(false);
        jTextFieldAnoConstrucao.setEditable(false);
        jTextFieldApartamento.setEditable(false);
        jTextFieldBairro.setEditable(false);
        jTextFieldCidade.setEditable(false);
        jTextFieldEdificio.setEditable(false);
        jTextFieldLogradouro.setEditable(false);
        jTextFieldNumero.setEditable(false);
        jTextFieldQuartos.setEditable(false);
        jTextFieldVagasGaragem.setEditable(false);
        jTextFieldValor.setEditable(false);
        jTextFieldValorCondominio.setEditable(false);
        jTextAreaDescricao.setEditable(false);
        
    }
    
  //</editor-fold>  
    
  //<editor-fold defaultstate="collapsed" desc="Declaração dos Componentes">    
/**
 * Declaraçao das variaveis (componentes)
 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDadosVoltar;
    private javax.swing.JButton jButtonInicioConsultar;
    private javax.swing.JButton jButtonInicioVoltar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelAviso;
    private javax.swing.JLabel jLabelBemvindo;
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
    private javax.swing.JPanel jPanelApartamentoConsultar;
    private javax.swing.JPanel jPanelApartamentoEditar;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneApartamento;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldAndar;
    private javax.swing.JTextField jTextFieldAnoConstrucao;
    private javax.swing.JTextField jTextFieldApartamento;
    private javax.swing.JTextField jTextFieldAreaTotal;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldConsultarCodigoApartamento;
    private javax.swing.JTextField jTextFieldEdificio;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldQuartos;
    private javax.swing.JTextField jTextFieldVagasGaragem;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldValorCondominio;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    
}
