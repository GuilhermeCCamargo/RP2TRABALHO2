/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.rp2.frames;

/**
 *
 * @author GuilhermeCCamargo
 */
public class Apartamento extends javax.swing.JFrame {

    /**
     * Creates new form Apartamento
     */
    public Apartamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        In = new javax.swing.JButton();
        jTabbedPaneApartamento = new javax.swing.JTabbedPane();
        jPanelConsultar = new javax.swing.JPanel();
        jSpinnerBuscaCodigoApartamento = new javax.swing.JSpinner();
        jButtonBuscaApartamento = new javax.swing.JButton();
        jButtonVoltarConsultar = new javax.swing.JButton();
        jLabelconsultaCodigo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListlistaApartamento = new javax.swing.JList();
        jPanelImovel = new javax.swing.JPanel();
        jLabelLogradouro = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelAreaTotal = new javax.swing.JLabel();
        jTextFieldAreaTotal = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jPanelApartamento = new javax.swing.JPanel();
        jLabelNomeEdificio = new javax.swing.JLabel();
        jTextFieldNomeEdificio = new javax.swing.JTextField();
        jLabelAnoConstrucao = new javax.swing.JLabel();
        jTextFieldAnoConstrucao = new javax.swing.JTextField();
        jLabelnroApartamento = new javax.swing.JLabel();
        jTextFieldnroApartamento = new javax.swing.JTextField();
        jLabelnroQuartos = new javax.swing.JLabel();
        jTextFieldnroQuartos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldvgsGaragem = new javax.swing.JTextField();
        jLabelAndar = new javax.swing.JLabel();
        jTextFieldAndar = new javax.swing.JTextField();
        jLabelvalorCondominio = new javax.swing.JLabel();
        jTextFieldvalorComdominio = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonVoltarAdicionar = new javax.swing.JButton();

        In.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonBuscaApartamento.setText("Buscar");

        jButtonVoltarConsultar.setText("Voltar");

        jLabelconsultaCodigo.setText("Código do Apartamento:");

        jListlistaApartamento.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListlistaApartamento);

        javax.swing.GroupLayout jPanelConsultarLayout = new javax.swing.GroupLayout(jPanelConsultar);
        jPanelConsultar.setLayout(jPanelConsultarLayout);
        jPanelConsultarLayout.setHorizontalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltarConsultar)
                .addContainerGap(424, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelConsultarLayout.createSequentialGroup()
                        .addComponent(jLabelconsultaCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerBuscaCodigoApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscaApartamento)))
                .addGap(32, 32, 32))
        );
        jPanelConsultarLayout.setVerticalGroup(
            jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerBuscaCodigoApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscaApartamento)
                    .addComponent(jLabelconsultaCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltarConsultar)
                .addContainerGap())
        );

        jTabbedPaneApartamento.addTab("Consultar", jPanelConsultar);

        jPanelImovel.setPreferredSize(new java.awt.Dimension(360, 128));

        jLabelLogradouro.setText("* Logradouro:");

        jLabelNumero.setText("*  Número:");
        jLabelNumero.setToolTipText("");

        jLabelBairro.setText("* Bairro:");

        jLabelCidade.setText("* Cidade:");

        jLabelCodigo.setText("Código:");

        jLabelDescricao.setText("Descrição:");

        jLabelAreaTotal.setText("* Área Total (m²):");

        jLabelValor.setText("* Valor (R$):");

        jPanelApartamento.setPreferredSize(new java.awt.Dimension(451, 150));

        jLabelNomeEdificio.setText("Nome do Edifício:");

        jLabelAnoConstrucao.setText("Ano de Construção:");

        jLabelnroApartamento.setText("* Número do Apartamento:");

        jLabelnroQuartos.setText("* Quartos:");

        jLabel1.setText("Vagas na Garagem:");

        jLabelAndar.setText("* Andar:");

        jLabelvalorCondominio.setText("Valor do Comdomínio (R$):");

        jButtonAdicionar.setText("Adicionar");

        jButtonVoltarAdicionar.setText("Voltar");

        javax.swing.GroupLayout jPanelApartamentoLayout = new javax.swing.GroupLayout(jPanelApartamento);
        jPanelApartamento.setLayout(jPanelApartamentoLayout);
        jPanelApartamentoLayout.setHorizontalGroup(
            jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelApartamentoLayout.createSequentialGroup()
                        .addGroup(jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelApartamentoLayout.createSequentialGroup()
                                .addGroup(jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelnroQuartos)
                                    .addComponent(jLabelAnoConstrucao)
                                    .addComponent(jLabelNomeEdificio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelApartamentoLayout.createSequentialGroup()
                                        .addComponent(jTextFieldNomeEdificio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelAndar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelApartamentoLayout.createSequentialGroup()
                                        .addComponent(jTextFieldnroQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelApartamentoLayout.createSequentialGroup()
                                        .addComponent(jTextFieldAnoConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelnroApartamento))))
                            .addGroup(jPanelApartamentoLayout.createSequentialGroup()
                                .addComponent(jLabelvalorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldvalorComdominio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldnroApartamento)
                            .addComponent(jTextFieldvgsGaragem)
                            .addComponent(jTextFieldAndar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                    .addGroup(jPanelApartamentoLayout.createSequentialGroup()
                        .addComponent(jButtonVoltarAdicionar)
                        .addGap(272, 272, 272)
                        .addComponent(jButtonAdicionar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanelApartamentoLayout.setVerticalGroup(
            jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeEdificio)
                    .addComponent(jTextFieldNomeEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAndar)
                    .addComponent(jTextFieldAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAnoConstrucao)
                    .addComponent(jTextFieldAnoConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelnroApartamento)
                    .addComponent(jTextFieldnroApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldnroQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelnroQuartos)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldvgsGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelvalorCondominio)
                    .addComponent(jTextFieldvalorComdominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelApartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonVoltarAdicionar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelImovelLayout = new javax.swing.GroupLayout(jPanelImovel);
        jPanelImovel.setLayout(jPanelImovelLayout);
        jPanelImovelLayout.setHorizontalGroup(
            jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImovelLayout.createSequentialGroup()
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelBairro)
                            .addComponent(jLabelLogradouro)
                            .addComponent(jLabelDescricao)
                            .addComponent(jLabelCodigo)))
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelAreaTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelImovelLayout.createSequentialGroup()
                            .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldLogradouro)
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelImovelLayout.createSequentialGroup()
                                    .addComponent(jLabelNumero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelImovelLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabelCidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImovelLayout.createSequentialGroup()
                            .addComponent(jTextFieldAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelValor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addComponent(jPanelApartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        jPanelImovelLayout.setVerticalGroup(
            jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAreaTotal)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelApartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );

        jTabbedPaneApartamento.addTab("Adicionar", jPanelImovel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneApartamento)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneApartamento, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Apartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupjButtonVoltarConsultarFeelException ex) {
            java.util.logging.Logger.getLogger(Apartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton In;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonBuscaApartamento;
    private javax.swing.JButton jButtonVoltarAdicionar;
    private javax.swing.JButton jButtonVoltarConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAndar;
    private javax.swing.JLabel jLabelAnoConstrucao;
    private javax.swing.JLabel jLabelAreaTotal;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNomeEdificio;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JLabel jLabelconsultaCodigo;
    private javax.swing.JLabel jLabelnroApartamento;
    private javax.swing.JLabel jLabelnroQuartos;
    private javax.swing.JLabel jLabelvalorCondominio;
    private javax.swing.JList jListlistaApartamento;
    private javax.swing.JPanel jPanelApartamento;
    private javax.swing.JPanel jPanelConsultar;
    private javax.swing.JPanel jPanelImovel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerBuscaCodigoApartamento;
    private javax.swing.JTabbedPane jTabbedPaneApartamento;
    private javax.swing.JTextField jTextFieldAndar;
    private javax.swing.JTextField jTextFieldAnoConstrucao;
    private javax.swing.JTextField jTextFieldAreaTotal;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNomeEdificio;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldnroApartamento;
    private javax.swing.JTextField jTextFieldnroQuartos;
    private javax.swing.JTextField jTextFieldvalorComdominio;
    private javax.swing.JTextField jTextFieldvgsGaragem;
    // End of variables declaration//GEN-END:variables
}
