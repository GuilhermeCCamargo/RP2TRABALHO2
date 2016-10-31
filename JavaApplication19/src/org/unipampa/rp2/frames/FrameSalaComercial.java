/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.frames;

//<editor-fold defaultstate="collapsed" desc="Importações">

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.unipampa.rp2.listaimoveis.Lista;
import org.unipampa.rp2.tiposimoveis.Imovel;
import org.unipampa.rp2.tiposimoveis.SalaComercial;

//</editor-fold>

/**
 *
 * @author yuryalencar
 */
public class FrameSalaComercial extends javax.swing.JFrame {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private Lista listaSalaComercial;
    private int codEdit = 0;
    private boolean isEdit = false;

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="InitComponents">
    
    /**
     * Creates new form SalaComercial
     */
    public FrameSalaComercial(Lista listaSalaComercial) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Imobiliária - Sala Comercial");
        
        this.listaSalaComercial = listaSalaComercial;

        listar();

        jButtonEditarSalaComercial.setEnabled(false);
        jButtonDetalhesSalaComercial.setEnabled(false);

        jTabbedPaneSalaComercial.setEnabledAt(0, true);
        jTabbedPaneSalaComercial.setEnabledAt(1, false);
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GetCod">
    
    /**
     * Método para retirar o código do toString da classe sala comercial
     *
     * @param cod - String que veio do toString da classe
     * @return - retorna um inteiro com o código
     */
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
    
    //<editor-fold defaultstate="collapsed" desc="Métodos(Campos Inteiros ou Double)">
    
    /**
     * Método isDouble que verifica se um '.' já foi digitado em campos double.
     *
     * @param campo - o campo para pegar o item digitado
     * @return - true caso não tenha um ponto, e false caso o mesmo exista para
     * que não possa mais ser adicionado
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
     * Método que aceita a entrada somente de números inteiros dentro do campo
     * de texto
     *
     * @param evt - evento de digitar no campo de texto através do teclado
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

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Manipulação de Campos(Ativar, Desativar, Preencher, Limpar)">
    
    /**
     * Método para preencher os campos quando for editar uma sala comercial
     *
     * @param sala - string que está no jList
     */
    private void preencherCampos(String sala) {

        SalaComercial newSala = (SalaComercial) listaSalaComercial.consultar(getCod(sala));

        jTextFieldAndarSalaComercial.setText(String.valueOf(newSala.getAndar()));
        jTextFieldAreaTotalImovel.setText(String.valueOf(newSala.getAreaTotal()));
        jTextFieldNroBanheirosSalaComercial.setText(String.valueOf(newSala.getNroBanheiros()));
        jTextFieldNroSalaSalaComercial.setText(String.valueOf(newSala.getNroSala()));
        jTextFieldNumeroImovel.setText(String.valueOf(newSala.getNumero()));
        jTextFieldValorCondominioSalaComercial.setText(String.valueOf(newSala.getValorCondominio()));
        jTextFieldValorImovel.setText(String.valueOf(newSala.getValor()));
        jTextFieldNomeEdificioSalaComercial.setText(newSala.getNomeEdificio());
        jTextFieldLogradouroImovel.setText(newSala.getLogradouro());
        jTextFieldDescricaoImovel.setText(newSala.getDescricao());
        jTextFieldBairroImovel.setText(newSala.getBairro());
        jTextFieldCidadeImovel.setText(newSala.getCidade());

    }

    /**
     * Método para ativar todos os campos
     */
    private void ativarCampos() {
        jTextFieldAndarSalaComercial.setEnabled(true);
        jTextFieldAreaTotalImovel.setEnabled(true);
        jTextFieldNroBanheirosSalaComercial.setEnabled(true);
        jTextFieldNroSalaSalaComercial.setEnabled(true);
        jTextFieldNumeroImovel.setEnabled(true);
        jTextFieldValorImovel.setEnabled(true);
        jTextFieldNomeEdificioSalaComercial.setEnabled(true);
        jTextFieldLogradouroImovel.setEnabled(true);
        jTextFieldDescricaoImovel.setEnabled(true);
        jTextFieldCidadeImovel.setEnabled(true);
        jTextFieldBairroImovel.setEnabled(true);
        jTextFieldValorCondominioSalaComercial.setEnabled(true);

        jButtonSalvar.setVisible(true);
    }

    /**
     * Método para desativar todos os campos
     */
    private void desativarCampos() {
        jTextFieldAndarSalaComercial.setEnabled(false);
        jTextFieldAreaTotalImovel.setEnabled(false);
        jTextFieldNroBanheirosSalaComercial.setEnabled(false);
        jTextFieldNroSalaSalaComercial.setEnabled(false);
        jTextFieldNumeroImovel.setEnabled(false);
        jTextFieldValorImovel.setEnabled(false);
        jTextFieldNomeEdificioSalaComercial.setEnabled(false);
        jTextFieldLogradouroImovel.setEnabled(false);
        jTextFieldDescricaoImovel.setEnabled(false);
        jTextFieldBairroImovel.setEnabled(false);
        jTextFieldCidadeImovel.setEnabled(false);
        jTextFieldValorCondominioSalaComercial.setEnabled(false);

        jButtonSalvar.setVisible(false);
    }

    /**
     * Método usado para limpar todos os campos tanto após uma edição quanto
     * após uma edição.
     */
    private void limparCampos() {
        jTextFieldAndarSalaComercial.setText("");
        jTextFieldAreaTotalImovel.setText("");
        jTextFieldDescricaoImovel.setText("");
        jTextFieldLogradouroImovel.setText("");
        jTextFieldNomeEdificioSalaComercial.setText("");
        jTextFieldNroBanheirosSalaComercial.setText("");
        jTextFieldNroSalaSalaComercial.setText("");
        jTextFieldNumeroImovel.setText("");
        jTextFieldValorImovel.setText("");
        jTextFieldCidadeImovel.setText("");
        jTextFieldBairroImovel.setText("");
        jTextFieldValorCondominioSalaComercial.setText("");
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Manipulação de jList (todos os listar)">
    
    /**
     * Método para listar todos os dados dentro da jList
     */
    private void listar() {

        DefaultListModel listModel = new DefaultListModel();

        List<Imovel> salaComercial = listaSalaComercial.getLista();

        for (Imovel sala : salaComercial) {
            listModel.addElement(sala.toString());
        }

        jListSalaComercial.setModel(listModel);
    }

    /**
     * Método para pesquisar a partir do código
     * @param cod - inteiro para a busca
     */
    private void listarCodigo(int cod){
        DefaultListModel listModel = new DefaultListModel();
        
        Imovel sala = listaSalaComercial.consultar(cod);
        
        if (sala != null) {
            listModel.addElement(sala.toString());
        }
        
        jListSalaComercial.setModel(listModel);

    }
    
    /**
     * Método para pesquisar a partir do valor
     * @param valor - double para a busca(valor)
     */
    private void listarValor(double valor){
        DefaultListModel listModel = new DefaultListModel();
        
        List<Imovel> sala = listaSalaComercial.pesquisaValor(valor);
        
        if (sala != null){
            for (Imovel imovel : sala) {
                listModel.addElement(imovel.toString());    
            }
        }
        
        jListSalaComercial.setModel(listModel);

    }
    
    /**
     * Método para pesquisar a partir do bairro
     * @param bairro - String para a busca(bairro)
     */
    private void listarBairro(String bairro){
        DefaultListModel listModel = new DefaultListModel();
        
        List<Imovel> sala = listaSalaComercial.pesquisaBairro(bairro);
        
        if (sala != null){
            for (Imovel imovel : sala) {
                listModel.addElement(imovel.toString());    
            }
        }
        
        jListSalaComercial.setModel(listModel);

    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mudança de abas">
    
    private void mudarAbas(int saida, int chegada){
        jTabbedPaneSalaComercial.setEnabledAt(saida, false);
        jTabbedPaneSalaComercial.setEnabledAt(chegada, true);
        jTabbedPaneSalaComercial.setSelectedIndex(chegada);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Método de verificação">
    
    /**
     * Método para fazer alguma verificação no sistema.
     * @param mensagem - Mensagem que deseja ser exibida para
     * o usuário.
     * @return - true caso a resposta seja sim e false caso contrário
     */
    private boolean verificacao(String mensagem){
        int reply = JOptionPane.showConfirmDialog(null, mensagem,
                            "RP II - IMOBILIÁRIA", JOptionPane.YES_NO_OPTION);
                    
        if(reply == JOptionPane.YES_OPTION){
            return true;
        }
        
        return false;
    }
    
    //</editor-fold>
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPaneSalaComercial = new javax.swing.JTabbedPane();
        jPanelConsultar = new javax.swing.JPanel();
        jScrollPaneListarSalaComercial = new javax.swing.JScrollPane();
        jListSalaComercial = new javax.swing.JList<>();
        jButtonIncluirSalaComercial = new javax.swing.JButton();
        jButtonEditarSalaComercial = new javax.swing.JButton();
        jButtonExcluirSalaComercial = new javax.swing.JButton();
        jTextFieldBusca = new javax.swing.JTextField();
        jButtonDetalhesSalaComercial = new javax.swing.JButton();
        jButtonVoltarInicial = new javax.swing.JButton();
        jComboBoxBusca = new javax.swing.JComboBox<>();
        jButtonOrdenar = new javax.swing.JButton();
        jPanelAdicionar = new javax.swing.JPanel();
        jScrollPaneAdicionar = new javax.swing.JScrollPane();
        jPanelAdicionarHeranca = new javax.swing.JPanel();
        jPanelSalaComercial = new javax.swing.JPanel();
        jLabelNomeEdificioSalaComercial = new javax.swing.JLabel();
        jTextFieldNomeEdificioSalaComercial = new javax.swing.JTextField();
        jLabelAndarSalaComercial = new javax.swing.JLabel();
        jLabelValorCondomioSalaComercial = new javax.swing.JLabel();
        jTextFieldValorCondominioSalaComercial = new javax.swing.JTextField();
        jLabelNroSalaSalaComercial = new javax.swing.JLabel();
        jLabelNroBanheirosSalaComercial = new javax.swing.JLabel();
        jTextFieldAndarSalaComercial = new javax.swing.JTextField();
        jTextFieldNroSalaSalaComercial = new javax.swing.JTextField();
        jTextFieldNroBanheirosSalaComercial = new javax.swing.JTextField();
        jPanelImovel = new javax.swing.JPanel();
        jLabelNumeroImovel = new javax.swing.JLabel();
        jLabelAreaTotalImovel = new javax.swing.JLabel();
        jLabelValorImovel = new javax.swing.JLabel();
        jTextFieldValorImovel = new javax.swing.JTextField();
        jLabelLogradouroImovel = new javax.swing.JLabel();
        jTextFieldLogradouroImovel = new javax.swing.JTextField();
        jTextFieldDescricaoImovel = new javax.swing.JTextField();
        jLabelDescricaoImovel = new javax.swing.JLabel();
        jTextFieldNumeroImovel = new javax.swing.JTextField();
        jTextFieldAreaTotalImovel = new javax.swing.JTextField();
        jLabelCidadeImovel = new javax.swing.JLabel();
        jTextFieldCidadeImovel = new javax.swing.JTextField();
        jLabelBairroImovel = new javax.swing.JLabel();
        jTextFieldBairroImovel = new javax.swing.JTextField();
        jButtonVoltarConsultar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListSalaComercial.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListSalaComercialValueChanged(evt);
            }
        });
        jScrollPaneListarSalaComercial.setViewportView(jListSalaComercial);

        jButtonIncluirSalaComercial.setText("Incluir");
        jButtonIncluirSalaComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirSalaComercialActionPerformed(evt);
            }
        });

        jButtonEditarSalaComercial.setText("Editar");
        jButtonEditarSalaComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarSalaComercialActionPerformed(evt);
            }
        });

        jButtonExcluirSalaComercial.setText("Excluir");
        jButtonExcluirSalaComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirSalaComercialActionPerformed(evt);
            }
        });

        jTextFieldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaKeyReleased(evt);
            }
        });

        jButtonDetalhesSalaComercial.setText("Detalhes");
        jButtonDetalhesSalaComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhesSalaComercialActionPerformed(evt);
            }
        });

        jButtonVoltarInicial.setText("Voltar");
        jButtonVoltarInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarInicialActionPerformed(evt);
            }
        });

        jComboBoxBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Bairro", "Valor" }));
        jComboBoxBusca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxBuscaItemStateChanged(evt);
            }
        });

        jButtonOrdenar.setText("Ordenar");
        jButtonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultarLayout = new javax.swing.GroupLayout(jPanelConsultar);
        jPanelConsultar.setLayout(jPanelConsultarLayout);
        jPanelConsultarLayout.setHorizontalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonDetalhesSalaComercial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluirSalaComercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditarSalaComercial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltarInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIncluirSalaComercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneListarSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarLayout.createSequentialGroup()
                        .addComponent(jTextFieldBusca)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOrdenar)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelConsultarLayout.setVerticalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOrdenar))
                .addGap(10, 10, 10)
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneListarSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelConsultarLayout.createSequentialGroup()
                        .addComponent(jButtonIncluirSalaComercial)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluirSalaComercial)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditarSalaComercial)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDetalhesSalaComercial)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButtonVoltarInicial)
                .addContainerGap())
        );

        jTabbedPaneSalaComercial.addTab("Consultar", jPanelConsultar);

        jLabelNomeEdificioSalaComercial.setText("Nome do Edifício: ");

        jTextFieldNomeEdificioSalaComercial.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelAndarSalaComercial.setText("Andar: ");

        jLabelValorCondomioSalaComercial.setText("Valor condomínio: ");

        jTextFieldValorCondominioSalaComercial.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldValorCondominioSalaComercial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValorCondominioSalaComercialFocusLost(evt);
            }
        });
        jTextFieldValorCondominioSalaComercial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorCondominioSalaComercialKeyTyped(evt);
            }
        });

        jLabelNroSalaSalaComercial.setText("Número da sala: ");

        jLabelNroBanheirosSalaComercial.setText("Número de banheiros: ");

        jTextFieldAndarSalaComercial.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAndarSalaComercial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAndarSalaComercialKeyTyped(evt);
            }
        });

        jTextFieldNroSalaSalaComercial.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNroSalaSalaComercial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNroSalaSalaComercialKeyTyped(evt);
            }
        });

        jTextFieldNroBanheirosSalaComercial.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNroBanheirosSalaComercial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNroBanheirosSalaComercialKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelSalaComercialLayout = new javax.swing.GroupLayout(jPanelSalaComercial);
        jPanelSalaComercial.setLayout(jPanelSalaComercialLayout);
        jPanelSalaComercialLayout.setHorizontalGroup(
            jPanelSalaComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalaComercialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSalaComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelSalaComercialLayout.createSequentialGroup()
                        .addGroup(jPanelSalaComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSalaComercialLayout.createSequentialGroup()
                                .addComponent(jLabelValorCondomioSalaComercial)
                                .addGap(3, 3, 3)
                                .addComponent(jTextFieldValorCondominioSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSalaComercialLayout.createSequentialGroup()
                                .addComponent(jLabelAndarSalaComercial)
                                .addGap(6, 6, 6)
                                .addComponent(jTextFieldAndarSalaComercial)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSalaComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelSalaComercialLayout.createSequentialGroup()
                                .addComponent(jLabelNroSalaSalaComercial)
                                .addGap(3, 3, 3)
                                .addComponent(jTextFieldNroSalaSalaComercial))
                            .addGroup(jPanelSalaComercialLayout.createSequentialGroup()
                                .addComponent(jLabelNroBanheirosSalaComercial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNroBanheirosSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelSalaComercialLayout.createSequentialGroup()
                        .addComponent(jLabelNomeEdificioSalaComercial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeEdificioSalaComercial)))
                .addGap(70, 70, 70))
        );
        jPanelSalaComercialLayout.setVerticalGroup(
            jPanelSalaComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalaComercialLayout.createSequentialGroup()
                .addGroup(jPanelSalaComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeEdificioSalaComercial)
                    .addComponent(jTextFieldNomeEdificioSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSalaComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAndarSalaComercial)
                    .addComponent(jLabelNroSalaSalaComercial)
                    .addComponent(jTextFieldAndarSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNroSalaSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSalaComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorCondomioSalaComercial)
                    .addComponent(jTextFieldValorCondominioSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNroBanheirosSalaComercial)
                    .addComponent(jTextFieldNroBanheirosSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jLabelNumeroImovel.setText("Número:* ");

        jLabelAreaTotalImovel.setText("Área Total(m²): ");

        jLabelValorImovel.setText("Valor:* ");

        jTextFieldValorImovel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldValorImovel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValorImovelFocusLost(evt);
            }
        });
        jTextFieldValorImovel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorImovelKeyTyped(evt);
            }
        });

        jLabelLogradouroImovel.setText("Logradouro: ");

        jTextFieldLogradouroImovel.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldDescricaoImovel.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelDescricaoImovel.setText("Descrição: ");

        jTextFieldNumeroImovel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroImovel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroImovelKeyTyped(evt);
            }
        });

        jTextFieldAreaTotalImovel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAreaTotalImovel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldAreaTotalImovelFocusLost(evt);
            }
        });
        jTextFieldAreaTotalImovel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAreaTotalImovelKeyTyped(evt);
            }
        });

        jLabelCidadeImovel.setText("Cidade:* ");

        jTextFieldCidadeImovel.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabelBairroImovel.setText("Bairro: ");

        jTextFieldBairroImovel.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelImovelLayout = new javax.swing.GroupLayout(jPanelImovel);
        jPanelImovel.setLayout(jPanelImovelLayout);
        jPanelImovelLayout.setHorizontalGroup(
            jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addComponent(jLabelValorImovel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorImovel))
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addComponent(jLabelNumeroImovel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumeroImovel))
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addComponent(jLabelAreaTotalImovel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAreaTotalImovel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogradouroImovel)
                            .addComponent(jLabelDescricaoImovel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDescricaoImovel)
                            .addComponent(jTextFieldLogradouroImovel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCidadeImovel)
                            .addComponent(jLabelBairroImovel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBairroImovel)
                            .addComponent(jTextFieldCidadeImovel))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelImovelLayout.setVerticalGroup(
            jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNumeroImovel)
                        .addComponent(jTextFieldNumeroImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLogradouroImovel)
                        .addComponent(jTextFieldLogradouroImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAreaTotalImovel)
                    .addComponent(jTextFieldDescricaoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoImovel)
                    .addComponent(jTextFieldAreaTotalImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValorImovel)
                            .addComponent(jTextFieldValorImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCidadeImovel)
                            .addComponent(jTextFieldCidadeImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBairroImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBairroImovel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelAdicionarHerancaLayout = new javax.swing.GroupLayout(jPanelAdicionarHeranca);
        jPanelAdicionarHeranca.setLayout(jPanelAdicionarHerancaLayout);
        jPanelAdicionarHerancaLayout.setHorizontalGroup(
            jPanelAdicionarHerancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionarHerancaLayout.createSequentialGroup()
                .addComponent(jPanelImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelSalaComercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelAdicionarHerancaLayout.setVerticalGroup(
            jPanelAdicionarHerancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionarHerancaLayout.createSequentialGroup()
                .addComponent(jPanelImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSalaComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPaneAdicionar.setViewportView(jPanelAdicionarHeranca);

        jButtonVoltarConsultar.setText("Voltar");
        jButtonVoltarConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarConsultarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdicionarLayout = new javax.swing.GroupLayout(jPanelAdicionar);
        jPanelAdicionar.setLayout(jPanelAdicionarLayout);
        jPanelAdicionarLayout.setHorizontalGroup(
            jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltarConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelAdicionarLayout.createSequentialGroup()
                .addComponent(jScrollPaneAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelAdicionarLayout.setVerticalGroup(
            jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionarLayout.createSequentialGroup()
                .addComponent(jScrollPaneAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarConsultar)
                    .addComponent(jButtonSalvar))
                .addContainerGap())
        );

        jTabbedPaneSalaComercial.addTab("Dados imóvel", jPanelAdicionar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneSalaComercial))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneSalaComercial)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão para passar para a aba incluir
     *
     * @param evt - Evento do tipo action performed (Clicando no botão)
     */
    private void jButtonVoltarConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarConsultarActionPerformed
        // TODO add your handling code here:
        listar();
        mudarAbas(1, 0);
    }//GEN-LAST:event_jButtonVoltarConsultarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        if (jTextFieldValorImovel.getText().trim().equals("")
                || jTextFieldNumeroImovel.getText().trim().equals("")
                || jTextFieldCidadeImovel.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios(*)");

        } else {

            int nroBanheiros = 0, andar = 0, nroSala = 0;
            double valorCondominio = 0, areaTotal = 0;

            //<editor-fold defaultstate="collapsed" desc="Verificando campos em branco">
            
            if (!(jTextFieldNroBanheirosSalaComercial.getText().trim().equals(""))) {
                nroBanheiros = Integer.parseInt(jTextFieldNroBanheirosSalaComercial.getText().trim());
            }

            if (!(jTextFieldAndarSalaComercial.getText().trim().equals(""))) {
                andar = Integer.parseInt(jTextFieldAndarSalaComercial.getText().trim());
            }

            if (!(jTextFieldNroSalaSalaComercial.getText().trim().equals(""))) {
                nroSala = Integer.parseInt(jTextFieldNroSalaSalaComercial.getText().trim());
            }

            if (!(jTextFieldValorCondominioSalaComercial.getText().trim().equals(""))) {
                valorCondominio = Double.parseDouble(jTextFieldValorCondominioSalaComercial.getText().trim());
            }

            if (!(jTextFieldAreaTotalImovel.getText().trim().equals(""))) {
                areaTotal = Double.parseDouble(jTextFieldAreaTotalImovel.getText().trim());
            }

            //</editor-fold>
            
            if (isEdit) {
                SalaComercial sala = (SalaComercial) listaSalaComercial.consultar(codEdit);
                
                try {
                    SalaComercial novaSala = (SalaComercial) sala.clone();
                
                    //<editor-fold defaultstate="collapsed" desc="Sets (NovaSala)">
                    
                    novaSala.setAndar(andar);
                    novaSala.setAreaTotal(areaTotal);
                    novaSala.setNroBanheiros(nroBanheiros);
                    novaSala.setNroSala(nroSala);
                    novaSala.setValorCondominio(valorCondominio);
                    novaSala.setValor(Double.parseDouble(jTextFieldValorImovel.getText().trim()));
                    novaSala.setNumero(Integer.parseInt(jTextFieldNumeroImovel.getText().trim()));
                    novaSala.setNomeEdificio(jTextFieldNomeEdificioSalaComercial.getText().trim());
                    novaSala.setLogradouro(jTextFieldLogradouroImovel.getText().trim());
                    novaSala.setDescricao(jTextFieldDescricaoImovel.getText().trim());
                    novaSala.setCidade(jTextFieldCidadeImovel.getText().trim());
                    novaSala.setBairro(jTextFieldBairroImovel.getText().trim());
                
                    //</editor-fold>
                    
                    if(verificacao("Deseja realmente editar este imóvel?")){
                        if (listaSalaComercial.editar(codEdit, novaSala)) {
                            JOptionPane.showMessageDialog(null, "Imóvel editado com sucesso!");
                            listar();
                            mudarAbas(1, 0);
                        } else {
                            JOptionPane.showMessageDialog(null, "ERRO 03 - Imóvel não encontrado para a edição");
                        }
                        limparCampos();
                    }
                    
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(FrameSalaComercial.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                SalaComercial sala = new SalaComercial(Integer.parseInt(jTextFieldNumeroImovel.getText().trim()),
                    Double.parseDouble(jTextFieldValorImovel.getText().trim()),
                    jTextFieldLogradouroImovel.getText().trim(),
                    nroBanheiros, andar, nroSala, valorCondominio,
                    jTextFieldNomeEdificioSalaComercial.getText().trim(), areaTotal,
                    jTextFieldDescricaoImovel.getText().trim(), jTextFieldCidadeImovel.getText(),
                    jTextFieldBairroImovel.getText());

                if (listaSalaComercial.incluir(sala)) {
                    JOptionPane.showMessageDialog(null, "Imóvel inserido com sucesso!");
                    
                    try {
                        listaSalaComercial.gravarUltimoCod(sala.getCod());
                    } catch (IOException ex) {
                        Logger.getLogger(FrameSalaComercial.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "ERRO 04 - Imóvel não pode ser adicionado");
                }
            }
        
            if (!(listaSalaComercial.escreverArquivo())) {
                JOptionPane.showMessageDialog(null, "ERRO 05 - Não foi possível Gravar o arquivo");
            }
            
            if(!isEdit){
                if(!(verificacao("Deseja cadastrar um novo imóvel?"))){
                    listar();
                    limparCampos();
                    mudarAbas(1, 0);
                } else {
                    limparCampos();
                }
            }
            
            
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    //<editor-fold defaultstate="collapsed" desc="Eventos de campos">

    private void jTextFieldAreaTotalImovelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAreaTotalImovelKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, isDouble(jTextFieldAreaTotalImovel));
    }//GEN-LAST:event_jTextFieldAreaTotalImovelKeyTyped

    private void jTextFieldNumeroImovelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroImovelKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldNumeroImovelKeyTyped

    private void jTextFieldValorImovelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorImovelKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, isDouble(jTextFieldValorImovel));
    }//GEN-LAST:event_jTextFieldValorImovelKeyTyped

    private void jTextFieldNroBanheirosSalaComercialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNroBanheirosSalaComercialKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldNroBanheirosSalaComercialKeyTyped

    private void jTextFieldNroSalaSalaComercialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNroSalaSalaComercialKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldNroSalaSalaComercialKeyTyped

    private void jTextFieldAndarSalaComercialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAndarSalaComercialKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, false);
    }//GEN-LAST:event_jTextFieldAndarSalaComercialKeyTyped

    private void jTextFieldValorCondominioSalaComercialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorCondominioSalaComercialKeyTyped
        // TODO add your handling code here:
        soNumeros(evt, isDouble(jTextFieldValorCondominioSalaComercial));
    }//GEN-LAST:event_jTextFieldValorCondominioSalaComercialKeyTyped

//</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="Botão mais detalhes">
    
    private void jButtonDetalhesSalaComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesSalaComercialActionPerformed
        // TODO add your handling code here:
        preencherCampos(jListSalaComercial.getSelectedValue());
        desativarCampos();
        mudarAbas(0, 1);
    }//GEN-LAST:event_jButtonDetalhesSalaComercialActionPerformed

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Evento de campo">
    
    private void jTextFieldBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyTyped
        // TODO add your handling code here:
        switch(jComboBoxBusca.getSelectedItem().toString().trim()){
            case "Código":
                soNumeros(evt, false);
                break;
            case "Valor":
                soNumeros(evt, isDouble(jTextFieldBusca));
                break;
        }
    }//GEN-LAST:event_jTextFieldBuscaKeyTyped

    //</editor-fold>
    
    private void jButtonExcluirSalaComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirSalaComercialActionPerformed
        // TODO add your handling code here:
        String aux;
        boolean error = false;

        aux = JOptionPane.showInputDialog("Insira o código da Sala Comercial que deseja excluir: ");

        if (aux != null) {
            if (!(aux.trim().equals(""))) {
                for (int i = 0; i < aux.length(); i++) {
                    if (!(Character.isDigit(aux.charAt(i)))) {
                        JOptionPane.showMessageDialog(null, "ERRO 01 - Informe apenas números inteiros.");
                        error = true;
                        break;
                    }
                }

                if (!error) {
                    if(verificacao("Deseja realmente excluir este imóvel?")){
                        if (!(listaSalaComercial.excluir(Integer.parseInt(aux)))) {
                            JOptionPane.showMessageDialog(null, "ERRO 02 - Imóvel não encontrado.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Imóvel deletado com sucesso.");
                        }
                    }
                }

                if (!(listaSalaComercial.escreverArquivo())) {
                    JOptionPane.showMessageDialog(null, "ERRO 05 - Não foi possível Gravar o arquivo");
                }

                listar();

            } else {
                JOptionPane.showMessageDialog(null, "ERRO 04 - Informe um número inteiro para prosseguir.");
            }

        }
    }//GEN-LAST:event_jButtonExcluirSalaComercialActionPerformed

    private void jButtonEditarSalaComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarSalaComercialActionPerformed
        // TODO add your handling code here:
        isEdit = true;
        mudarAbas(0, 1);
        preencherCampos(jListSalaComercial.getSelectedValue());
        this.codEdit = getCod(jListSalaComercial.getSelectedValue());
        ativarCampos();
    }//GEN-LAST:event_jButtonEditarSalaComercialActionPerformed

    private void jButtonIncluirSalaComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirSalaComercialActionPerformed
        // TODO add your handling code here:
        this.isEdit = false;
        limparCampos();
        mudarAbas(0, 1);
        ativarCampos();
    }//GEN-LAST:event_jButtonIncluirSalaComercialActionPerformed

    private void jListSalaComercialValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListSalaComercialValueChanged
        // TODO add your handling code here:
        if (jListSalaComercial.isSelectionEmpty()) {
            jButtonEditarSalaComercial.setEnabled(false);
            jButtonDetalhesSalaComercial.setEnabled(false);
        } else {
            jButtonEditarSalaComercial.setEnabled(true);
            jButtonDetalhesSalaComercial.setEnabled(true);
        }
    }//GEN-LAST:event_jListSalaComercialValueChanged

    private void jButtonVoltarInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarInicialActionPerformed
        // TODO add your handling code here:
        new Inicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarInicialActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        preencherCampos(jListSalaComercial.getSelectedValue());
        desativarCampos();
        mudarAbas(0, 1);    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jComboBoxBuscaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxBuscaItemStateChanged
        // TODO add your handling code here:
        jTextFieldBusca.setText("");
    }//GEN-LAST:event_jComboBoxBuscaItemStateChanged

    private void jButtonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarActionPerformed
        // TODO add your handling code here:
        String [] opcao = {"Código","Valor","Área Total", "Cancelar"};
        int result = JOptionPane.showOptionDialog(null, "Deseja ordenar:", "Ordenação",   
                JOptionPane.WHEN_IN_FOCUSED_WINDOW, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[3]);

        DefaultListModel listModel = new DefaultListModel();
        List<Imovel> listaOrdenada=null;
        boolean ordenacao=false;
        
        switch(result){
            case 0:
                listaOrdenada = listaSalaComercial.ordenarCodigo();
                ordenacao=true;
                break;
            case 1:
                listaOrdenada = listaSalaComercial.ordenarValor();
                ordenacao=true;
                break;
            case 2:
                listaOrdenada = listaSalaComercial.ordenarArea();
                ordenacao=true;
                break;
        }
        
        if(ordenacao){
            for (Imovel imovel : listaOrdenada) {
                listModel.addElement(imovel.toString());
            }
            jListSalaComercial.setModel(listModel);
        }
    }//GEN-LAST:event_jButtonOrdenarActionPerformed

    private void jTextFieldBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyReleased
        // TODO add your handling code here:
        String texto = jTextFieldBusca.getText();
        if(!texto.trim().equals("") && evt.getKeyChar() != '\n'){
            switch(jComboBoxBusca.getSelectedItem().toString()){
                case "Código":
                    listarCodigo(Integer.parseInt(texto));
                    break;
                case "Valor":
                    if(!jTextFieldBusca.getText().trim().equals(".")){
                        listarValor(Double.parseDouble(texto));
                    } else {
                        jTextFieldBusca.setText("");
                    }
                    break;
                case "Bairro":
                    listarBairro(texto);
                    break;
            }
        } else if(evt.getKeyChar() != '\n'){
            listar();
        }
    }//GEN-LAST:event_jTextFieldBuscaKeyReleased

    private void jTextFieldAreaTotalImovelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAreaTotalImovelFocusLost
        // TODO add your handling code here:
        if(jTextFieldAreaTotalImovel.getText().trim().equals(".")){
            jTextFieldAreaTotalImovel.setText("");
        }
    }//GEN-LAST:event_jTextFieldAreaTotalImovelFocusLost

    private void jTextFieldValorImovelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorImovelFocusLost
        // TODO add your handling code here:
        if(jTextFieldValorImovel.getText().trim().equals(".")){
            jTextFieldValorImovel.setText("");
        }
    }//GEN-LAST:event_jTextFieldValorImovelFocusLost

    private void jTextFieldValorCondominioSalaComercialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorCondominioSalaComercialFocusLost
        // TODO add your handling code here:
        if(jTextFieldValorCondominioSalaComercial.getText().trim().equals(".")){
            jTextFieldValorCondominioSalaComercial.setText("");
        }
    }//GEN-LAST:event_jTextFieldValorCondominioSalaComercialFocusLost

    //<editor-fold defaultstate="collapsed" desc="Main (Frame)">
    
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
            java.util.logging.Logger.getLogger(FrameSalaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSalaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSalaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSalaComercial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSalaComercial(null).setVisible(true);
            }
        });
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Declaração de variáveis da Frame">
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetalhesSalaComercial;
    private javax.swing.JButton jButtonEditarSalaComercial;
    private javax.swing.JButton jButtonExcluirSalaComercial;
    private javax.swing.JButton jButtonIncluirSalaComercial;
    private javax.swing.JButton jButtonOrdenar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltarConsultar;
    private javax.swing.JButton jButtonVoltarInicial;
    private javax.swing.JComboBox<String> jComboBoxBusca;
    private javax.swing.JLabel jLabelAndarSalaComercial;
    private javax.swing.JLabel jLabelAreaTotalImovel;
    private javax.swing.JLabel jLabelBairroImovel;
    private javax.swing.JLabel jLabelCidadeImovel;
    private javax.swing.JLabel jLabelDescricaoImovel;
    private javax.swing.JLabel jLabelLogradouroImovel;
    private javax.swing.JLabel jLabelNomeEdificioSalaComercial;
    private javax.swing.JLabel jLabelNroBanheirosSalaComercial;
    private javax.swing.JLabel jLabelNroSalaSalaComercial;
    private javax.swing.JLabel jLabelNumeroImovel;
    private javax.swing.JLabel jLabelValorCondomioSalaComercial;
    private javax.swing.JLabel jLabelValorImovel;
    private javax.swing.JList<String> jListSalaComercial;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelAdicionar;
    private javax.swing.JPanel jPanelAdicionarHeranca;
    private javax.swing.JPanel jPanelConsultar;
    private javax.swing.JPanel jPanelImovel;
    private javax.swing.JPanel jPanelSalaComercial;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPaneAdicionar;
    private javax.swing.JScrollPane jScrollPaneListarSalaComercial;
    private javax.swing.JTabbedPane jTabbedPaneSalaComercial;
    private javax.swing.JTextField jTextFieldAndarSalaComercial;
    private javax.swing.JTextField jTextFieldAreaTotalImovel;
    private javax.swing.JTextField jTextFieldBairroImovel;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldCidadeImovel;
    private javax.swing.JTextField jTextFieldDescricaoImovel;
    private javax.swing.JTextField jTextFieldLogradouroImovel;
    private javax.swing.JTextField jTextFieldNomeEdificioSalaComercial;
    private javax.swing.JTextField jTextFieldNroBanheirosSalaComercial;
    private javax.swing.JTextField jTextFieldNroSalaSalaComercial;
    private javax.swing.JTextField jTextFieldNumeroImovel;
    private javax.swing.JTextField jTextFieldValorCondominioSalaComercial;
    private javax.swing.JTextField jTextFieldValorImovel;
    // End of variables declaration//GEN-END:variables
    
    //</editor-fold>
}
