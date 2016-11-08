/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipampa.rp2.frames;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import br.edu.unipampa.rp2.listaimoveis.Lista;
import br.edu.unipampa.rp2.tiposimoveis.Chacara;
import br.edu.unipampa.rp2.tiposimoveis.Imovel;

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
        jTabbedPaneChacara.setEnabledAt(1, false);
        jTabbedPaneChacara.setEnabledAt(2, false);
        listar();
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

    public void desativarCampos() {
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

    public void ativarCampos() {
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

        jListChacara.setModel(listChacara);
    }

    /**
     * Métodos usado para limpar todos os campos, tanto após uma inclusão quanto
     * após uma edição.
     */
    private void limpar() {
        jTextFieldLogradouro.setText("");
        jTextFieldAno.setText("");
        jTextFieldArea.setText("");
        jTextFieldCampoBusca.setText("");
        jTextFieldDistancia.setText("");
        jTextFieldNumero.setText("");
        jTextFieldQuartos.setText("");
        jTextFieldValor.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldDesc.setText("");
        jTextFieldAreaTotal.setText("");
    }
    private void limparEdit(){
        jTextFieldLogradouroEdit.setText("");
        jTextFieldAnoEdit.setText("");
        jTextFieldAreaEdit.setText("");
        jTextFieldCampoBusca.setText("");
        jTextFieldDistanciaEdit.setText("");
        jTextFieldNumeroEdit.setText("");
        jTextFieldQuartosEdit.setText("");
        jTextFieldValorEdit.setText("");
        jTextFieldBairroEdit.setText("");
        jTextFieldCidadeEdit.setText("");
        jTextFieldDescEdit.setText("");
        jTextFieldAreaTotalEdit.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneChacara = new javax.swing.JTabbedPane();
        jPanelConsultar = new javax.swing.JPanel();
        jTextFieldCampoBusca = new javax.swing.JTextField();
        jComboBoxBusca = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPaneChacara = new javax.swing.JScrollPane();
        jListChacara = new javax.swing.JList<>();
        jButtonDetalhesChacara = new javax.swing.JButton();
        jButtonEditarChacara = new javax.swing.JButton();
        jButtonExcluirChacara = new javax.swing.JButton();
        jButtonOrdenarChacara = new javax.swing.JButton();
        jButtonIncluirChacara = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jPanelCadastrar = new javax.swing.JPanel();
        jLabelCadastroChacara = new javax.swing.JLabel();
        jLabelDistanciaCidadeChacara = new javax.swing.JLabel();
        jLabelValorChacara = new javax.swing.JLabel();
        jLabelAreaConstruidaChacara = new javax.swing.JLabel();
        jLabelAnoConstrucaoChacara = new javax.swing.JLabel();
        jLabelNroQuartosChacara = new javax.swing.JLabel();
        jLabelLogradouroChacara = new javax.swing.JLabel();
        jLabelNroChacara = new javax.swing.JLabel();
        jLabelCidadeChacara = new javax.swing.JLabel();
        jLabelBairroChacara = new javax.swing.JLabel();
        jLabelDescricaoChacara = new javax.swing.JLabel();
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
        jButtonSalvarChacara = new javax.swing.JButton();
        jButtonVoltarChacara = new javax.swing.JButton();
        jLabelAraTotalChacara = new javax.swing.JLabel();
        jTextFieldAreaTotal = new javax.swing.JTextField();
        jPanelDetalhesEEditar = new javax.swing.JPanel();
        jLabelDetalhesEditarChacara = new javax.swing.JLabel();
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
        jLabelDistanciaCidadeEditarChacara = new javax.swing.JLabel();
        jLabelValorEditarChacara = new javax.swing.JLabel();
        jLabelAreaConstruidaEditarChacara = new javax.swing.JLabel();
        jLabelAnoConstrucaoEditarChacara = new javax.swing.JLabel();
        jLabelNroQuartosEditarChacara = new javax.swing.JLabel();
        jLabelLogradouroEditarChacara = new javax.swing.JLabel();
        jLabelNroEditarChacara = new javax.swing.JLabel();
        jLabelCidadeEditarChacara = new javax.swing.JLabel();
        jLabelBairroEditarChacara = new javax.swing.JLabel();
        jLabelDescricaoEditarChacara = new javax.swing.JLabel();
        jButtonSalvarEditarChacara = new javax.swing.JButton();
        jButtonVoltarEditarChacara = new javax.swing.JButton();
        jLabelAreaTotalEditarChacara = new javax.swing.JLabel();
        jTextFieldAreaTotalEdit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldCampoBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoBuscaKeyTyped(evt);
            }
        });

        jComboBoxBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Valor", "Bairro" }));
        jComboBoxBusca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxBuscaItemStateChanged(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jScrollPaneChacara.setViewportView(jListChacara);

        jButtonDetalhesChacara.setText("Detalhes");
        jButtonDetalhesChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhesChacaraActionPerformed(evt);
            }
        });

        jButtonEditarChacara.setText("Editar");
        jButtonEditarChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarChacaraActionPerformed(evt);
            }
        });

        jButtonExcluirChacara.setText("Excluir");
        jButtonExcluirChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirChacaraActionPerformed(evt);
            }
        });

        jButtonOrdenarChacara.setText("Ordenar");
        jButtonOrdenarChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarChacaraActionPerformed(evt);
            }
        });

        jButtonIncluirChacara.setText("Incluir");
        jButtonIncluirChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirChacaraActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultarLayout = new javax.swing.GroupLayout(jPanelConsultar);
        jPanelConsultar.setLayout(jPanelConsultarLayout);
        jPanelConsultarLayout.setHorizontalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultarLayout.createSequentialGroup()
                        .addComponent(jComboBoxBusca, 0, 204, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConsultarLayout.createSequentialGroup()
                        .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDetalhesChacara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOrdenarChacara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluirChacara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditarChacara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonIncluirChacara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPaneChacara)))
                .addContainerGap())
        );
        jPanelConsultarLayout.setVerticalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(27, 27, 27)
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultarLayout.createSequentialGroup()
                        .addComponent(jButtonIncluirChacara)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditarChacara)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluirChacara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDetalhesChacara)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOrdenarChacara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar))
                    .addComponent(jScrollPaneChacara))
                .addContainerGap())
        );

        jTabbedPaneChacara.addTab("Consultar", jPanelConsultar);

        jLabelCadastroChacara.setText("CADASTRO DE CHÁCARA");

        jLabelDistanciaCidadeChacara.setText("Distância da cidade (em KM):*");

        jLabelValorChacara.setText("Valor da chácara (R$):*");

        jLabelAreaConstruidaChacara.setText("Área Construida (m²):*");

        jLabelAnoConstrucaoChacara.setText("Ano de Construção:*");

        jLabelNroQuartosChacara.setText("Nº de Quartos:");

        jLabelLogradouroChacara.setText("Logradouro:*");

        jLabelNroChacara.setText("Número:*");

        jLabelCidadeChacara.setText("Cidade:*");

        jLabelBairroChacara.setText("Bairro:*");

        jLabelDescricaoChacara.setText("Descrição:*");

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

        jButtonSalvarChacara.setText("Salvar");
        jButtonSalvarChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarChacaraActionPerformed(evt);
            }
        });

        jButtonVoltarChacara.setText("Voltar");
        jButtonVoltarChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarChacaraActionPerformed(evt);
            }
        });

        jLabelAraTotalChacara.setText("Área Total:*");

        javax.swing.GroupLayout jPanelCadastrarLayout = new javax.swing.GroupLayout(jPanelCadastrar);
        jPanelCadastrar.setLayout(jPanelCadastrarLayout);
        jPanelCadastrarLayout.setHorizontalGroup(
            jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                        .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDistanciaCidadeChacara)
                                    .addComponent(jLabelValorChacara)
                                    .addComponent(jLabelAreaConstruidaChacara)
                                    .addComponent(jLabelAnoConstrucaoChacara)
                                    .addComponent(jLabelLogradouroChacara)
                                    .addComponent(jLabelNroChacara)
                                    .addComponent(jLabelCidadeChacara)
                                    .addComponent(jLabelBairroChacara)
                                    .addComponent(jLabelDescricaoChacara)
                                    .addComponent(jLabelNroQuartosChacara))
                                .addGap(58, 58, 58))
                            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                                .addComponent(jLabelAraTotalChacara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(180, 180, 180)))
                        .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCadastroChacara)
                            .addComponent(jTextFieldArea, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jTextFieldValor)
                            .addComponent(jTextFieldDistancia)
                            .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jTextFieldLogradouro)
                            .addComponent(jTextFieldAreaTotal)))
                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                        .addComponent(jButtonVoltarChacara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarChacara)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanelCadastrarLayout.setVerticalGroup(
            jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastroChacara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDistanciaCidadeChacara)
                    .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValorChacara)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAreaConstruidaChacara)
                    .addComponent(jTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                        .addComponent(jLabelAnoConstrucaoChacara)
                        .addGap(12, 12, 12)
                        .addComponent(jLabelNroQuartosChacara)))
                .addGap(10, 10, 10)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouroChacara)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNroChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCidadeChacara)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBairroChacara)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoChacara)
                    .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAraTotalChacara, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarChacara)
                    .addComponent(jButtonVoltarChacara))
                .addGap(32, 32, 32))
        );

        jTabbedPaneChacara.addTab("Cadastrar", jPanelCadastrar);

        jLabelDetalhesEditarChacara.setText("DETALHES/EDITAR CHÁCARA");

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

        jLabelDistanciaCidadeEditarChacara.setText("Distância da cidade (em KM):*");

        jLabelValorEditarChacara.setText("Valor da Chacára (R$):*");

        jLabelAreaConstruidaEditarChacara.setText("Área Construida (m²):*");

        jLabelAnoConstrucaoEditarChacara.setText("Ano de Construção:*");

        jLabelNroQuartosEditarChacara.setText("Nº de Quartos:*");

        jLabelLogradouroEditarChacara.setText("Logradouro:*");

        jLabelNroEditarChacara.setText("Número:*");

        jLabelCidadeEditarChacara.setText("Cidade:*");

        jLabelBairroEditarChacara.setText("Bairro:*");

        jLabelDescricaoEditarChacara.setText("Descrição:*");

        jButtonSalvarEditarChacara.setText("Salvar");
        jButtonSalvarEditarChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarEditarChacaraActionPerformed(evt);
            }
        });

        jButtonVoltarEditarChacara.setText("Voltar");
        jButtonVoltarEditarChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarEditarChacaraActionPerformed(evt);
            }
        });

        jLabelAreaTotalEditarChacara.setText("Área Total:*");

        javax.swing.GroupLayout jPanelDetalhesEEditarLayout = new javax.swing.GroupLayout(jPanelDetalhesEEditar);
        jPanelDetalhesEEditar.setLayout(jPanelDetalhesEEditarLayout);
        jPanelDetalhesEEditarLayout.setHorizontalGroup(
            jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalhesEEditarLayout.createSequentialGroup()
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetalhesEEditarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDistanciaCidadeEditarChacara)
                            .addComponent(jLabelValorEditarChacara)
                            .addComponent(jLabelAreaConstruidaEditarChacara)
                            .addComponent(jLabelAnoConstrucaoEditarChacara)
                            .addComponent(jLabelNroQuartosEditarChacara)
                            .addComponent(jLabelLogradouroEditarChacara)
                            .addComponent(jLabelNroEditarChacara)
                            .addComponent(jLabelCidadeEditarChacara)
                            .addComponent(jLabelBairroEditarChacara)
                            .addComponent(jLabelDescricaoEditarChacara)
                            .addComponent(jButtonVoltarEditarChacara))
                        .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDetalhesEEditarLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLogradouroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCidadeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldAreaEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addComponent(jTextFieldValorEdit, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldDistanciaEdit, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldQuartosEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                        .addComponent(jTextFieldAnoEdit, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jTextFieldNumeroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDetalhesEEditarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldDescEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(jTextFieldBairroEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(jTextFieldAreaTotalEdit))
                                    .addComponent(jButtonSalvarEditarChacara, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanelDetalhesEEditarLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabelDetalhesEditarChacara))
                    .addGroup(jPanelDetalhesEEditarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelAreaTotalEditarChacara, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanelDetalhesEEditarLayout.setVerticalGroup(
            jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalhesEEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDetalhesEditarChacara)
                .addGap(18, 18, 18)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDistanciaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDistanciaCidadeEditarChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValorEditarChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAreaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAreaConstruidaEditarChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnoConstrucaoEditarChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuartosEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNroQuartosEditarChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogradouroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogradouroEditarChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumeroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNroEditarChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCidadeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidadeEditarChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBairroEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairroEditarChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoEditarChacara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAreaTotalEditarChacara)
                    .addComponent(jTextFieldAreaTotalEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanelDetalhesEEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarEditarChacara)
                    .addComponent(jButtonVoltarEditarChacara))
                .addGap(41, 41, 41))
        );

        jTabbedPaneChacara.addTab("Detalhes/Editar", jPanelDetalhesEEditar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneChacara)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneChacara, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        String indice = jComboBoxBusca.getSelectedItem().toString();
        switch (indice) {
            case "Codigo":
                if (jTextFieldCampoBusca.getText().trim().equals("")) {
                    listarCodigo(-1);
                } else {
                    listarCodigo(Integer.parseInt(jTextFieldCampoBusca.getText().trim()));
                }
                break;
            case "Valor":
                if (jTextFieldCampoBusca.getText().trim().equals("")) {
                    listarValor(-1);
                } else {
                    listarValor(Double.parseDouble(jTextFieldCampoBusca.getText().trim()));
                }
                break;
            case "Bairro":
                listarBairro(jTextFieldCampoBusca.getText().trim());
                break;
        }

        /*if (jTextFieldCampo.getText().trim().equals("")) {
            listarCodigo(-1);
        } else {
            listarCodigo(Integer.parseInt(jTextFieldCampo.getText().trim()));
        }*/
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            if (preencherCampos(Integer.parseInt(cod))) {
                this.cod = Integer.parseInt(cod);
                jTabbedPaneChacara.setEnabledAt(0, false);
                jTabbedPaneChacara.setEnabledAt(2, true);
                jTabbedPaneChacara.setSelectedIndex(2);
                jButtonSalvarEditarChacara.setVisible(true);
                jTabbedPaneChacara.setSelectedIndex(2);
            }else{
                JOptionPane.showMessageDialog(null, "Não encontrado");
            }
        }

    }//GEN-LAST:event_jButtonEditarChacaraActionPerformed

    private void jButtonOrdenarChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarChacaraActionPerformed
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
        jListChacara.setModel(lista);
    }//GEN-LAST:event_jButtonOrdenarChacaraActionPerformed

    private void jTextFieldLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLogradouroActionPerformed

    private void jButtonDetalhesChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesChacaraActionPerformed
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
                jTabbedPaneChacara.setEnabledAt(0, false);
                jTabbedPaneChacara.setEnabledAt(2, true);
                jTabbedPaneChacara.setSelectedIndex(2);
                jButtonSalvarEditarChacara.setVisible(false);
            }

        }
    }//GEN-LAST:event_jButtonDetalhesChacaraActionPerformed

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

    private void jButtonSalvarChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarChacaraActionPerformed

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
            jTabbedPaneChacara.setEnabledAt(1, false);
            jTabbedPaneChacara.setEnabledAt(0, true);
            jTabbedPaneChacara.setSelectedIndex(0);
            listar();
        }


    }//GEN-LAST:event_jButtonSalvarChacaraActionPerformed

    private void jButtonVoltarChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarChacaraActionPerformed
        // TODO add your handling code here:
        jTabbedPaneChacara.setSelectedIndex(0);
        jTabbedPaneChacara.setEnabledAt(1, false);
        jTabbedPaneChacara.setEnabledAt(0, true);
        listar();
        limpar();
    }//GEN-LAST:event_jButtonVoltarChacaraActionPerformed

    private void jButtonSalvarEditarChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarEditarChacaraActionPerformed
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
            double areaTotal = Double.parseDouble(jTextFieldAreaTotalEdit.getText().trim());
            Chacara a = (Chacara) listaChacara.consultar(cod);

            try {
                Chacara objeto = a.clone();
                objeto.setAreaConstruida(areaConstruida);
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
                    jTabbedPaneChacara.setSelectedIndex(0);
                    jTabbedPaneChacara.setEnabledAt(0, true);
                    jTabbedPaneChacara.setEnabledAt(2, false);
                    listar();
                    limparEdit();
                } else {
                    JOptionPane.showMessageDialog(null, "Objeto não pode ser editado.");
                    limparEdit();

                }
                //Chacara objeto = new Chacara(numero, valor, cidade, bairro, nroQuartos, areaConstruida, ano, distanciaCidade, logradouro, descricao);
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(FrameChacara.class.getName()).log(Level.SEVERE, null, ex);
            }

            int codigo;
            codigo = cod;

        }
        cod = -1;
    }//GEN-LAST:event_jButtonSalvarEditarChacaraActionPerformed

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

    private void jButtonIncluirChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirChacaraActionPerformed
        jTabbedPaneChacara.setEnabledAt(1, true);
        jTabbedPaneChacara.setEnabledAt(0, false);
        jTabbedPaneChacara.setSelectedIndex(1);
    }//GEN-LAST:event_jButtonIncluirChacaraActionPerformed

    private void jButtonVoltarEditarChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarEditarChacaraActionPerformed
        jTabbedPaneChacara.setEnabledAt(2, false);
        jTabbedPaneChacara.setEnabledAt(0, true);
        jTabbedPaneChacara.setSelectedIndex(0);
        jButtonSalvarEditarChacara.setVisible(true);
        limparEdit();
    }//GEN-LAST:event_jButtonVoltarEditarChacaraActionPerformed

    private void jComboBoxBuscaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxBuscaItemStateChanged
        jTextFieldCampoBusca.setText("");
    }//GEN-LAST:event_jComboBoxBuscaItemStateChanged

    private void jTextFieldCampoBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoBuscaKeyTyped
        if (jTextFieldCampoBusca.getText().equals(".")) {
            jTextFieldCampoBusca.setText("");
        } else if (jComboBoxBusca.getSelectedItem().toString().equals("Codigo")) {
            soNumeros(evt);
        } else if (jComboBoxBusca.getSelectedItem().toString().equals("Valor")) {
            soDouble(evt, jTextFieldCampoBusca.getText());
        }
    }//GEN-LAST:event_jTextFieldCampoBuscaKeyTyped

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

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Inicial voltar = new Inicial();
        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonDetalhesChacara;
    private javax.swing.JButton jButtonEditarChacara;
    private javax.swing.JButton jButtonExcluirChacara;
    private javax.swing.JButton jButtonIncluirChacara;
    private javax.swing.JButton jButtonOrdenarChacara;
    private javax.swing.JButton jButtonSalvarChacara;
    private javax.swing.JButton jButtonSalvarEditarChacara;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonVoltarChacara;
    private javax.swing.JButton jButtonVoltarEditarChacara;
    private javax.swing.JComboBox<String> jComboBoxBusca;
    private javax.swing.JLabel jLabelAnoConstrucaoChacara;
    private javax.swing.JLabel jLabelAnoConstrucaoEditarChacara;
    private javax.swing.JLabel jLabelAraTotalChacara;
    private javax.swing.JLabel jLabelAreaConstruidaChacara;
    private javax.swing.JLabel jLabelAreaConstruidaEditarChacara;
    private javax.swing.JLabel jLabelAreaTotalEditarChacara;
    private javax.swing.JLabel jLabelBairroChacara;
    private javax.swing.JLabel jLabelBairroEditarChacara;
    private javax.swing.JLabel jLabelCadastroChacara;
    private javax.swing.JLabel jLabelCidadeChacara;
    private javax.swing.JLabel jLabelCidadeEditarChacara;
    private javax.swing.JLabel jLabelDescricaoChacara;
    private javax.swing.JLabel jLabelDescricaoEditarChacara;
    private javax.swing.JLabel jLabelDetalhesEditarChacara;
    private javax.swing.JLabel jLabelDistanciaCidadeChacara;
    private javax.swing.JLabel jLabelDistanciaCidadeEditarChacara;
    private javax.swing.JLabel jLabelLogradouroChacara;
    private javax.swing.JLabel jLabelLogradouroEditarChacara;
    private javax.swing.JLabel jLabelNroChacara;
    private javax.swing.JLabel jLabelNroEditarChacara;
    private javax.swing.JLabel jLabelNroQuartosChacara;
    private javax.swing.JLabel jLabelNroQuartosEditarChacara;
    private javax.swing.JLabel jLabelValorChacara;
    private javax.swing.JLabel jLabelValorEditarChacara;
    private javax.swing.JList<String> jListChacara;
    private javax.swing.JPanel jPanelCadastrar;
    private javax.swing.JPanel jPanelConsultar;
    private javax.swing.JPanel jPanelDetalhesEEditar;
    private javax.swing.JScrollPane jScrollPaneChacara;
    private javax.swing.JTabbedPane jTabbedPaneChacara;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldAnoEdit;
    private javax.swing.JTextField jTextFieldArea;
    private javax.swing.JTextField jTextFieldAreaEdit;
    private javax.swing.JTextField jTextFieldAreaTotal;
    private javax.swing.JTextField jTextFieldAreaTotalEdit;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldBairroEdit;
    private javax.swing.JTextField jTextFieldCampoBusca;
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
        jListChacara.setModel(modelList);
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
            jListChacara.setModel(listModel);
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
            jListChacara.setModel(listModel);
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
            jListChacara.setModel(listModel);
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
