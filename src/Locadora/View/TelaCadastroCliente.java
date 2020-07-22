/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locadora.View;


import Locadora.Controller.ClienteController;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroCliente() {
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

        jLabelCadastroCliente = new javax.swing.JLabel();
        jPanelCadastroCliente = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNascimento = new javax.swing.JLabel();
        jFormattedTextFieldNascimento = new javax.swing.JFormattedTextField();
        jLabelCPF = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jButtonSalva = new javax.swing.JButton();
        jButtonLimpa = new javax.swing.JButton();
        jButtonCancela = new javax.swing.JButton();
        jButtonConsulta = new javax.swing.JButton();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cine Pipoca");
        setResizable(false);

        jLabelCadastroCliente.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon.png"))); // NOI18N
        jLabelCadastroCliente.setText("Cadastro Cliente");

        jPanelCadastroCliente.setBackground(new java.awt.Color(102, 102, 102));
        jPanelCadastroCliente.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanelCadastroCliente.setPreferredSize(new java.awt.Dimension(780, 540));

        jLabelNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldNome.setToolTipText("Informe o nome do Cliente");

        jLabelNascimento.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNascimento.setText("Nascimento:");

        try {
            jFormattedTextFieldNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldNascimento.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabelCPF.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPF.setText("CPF:");

        jLabelEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email:");

        jTextFieldEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEmail.setToolTipText("Informe o email do cliente");

        jLabelEndereco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("Endereço:");

        jLabelBairro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBairro.setText("Bairro:");

        jLabelCidade.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCidade.setText("Cidade:");

        jLabelEstado.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstado.setText("Estado:");

        jTextFieldEndereco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEndereco.setToolTipText("Informe o endereço do cliente");

        jTextFieldBairro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldBairro.setToolTipText("Informe o bairro");

        jTextFieldCidade.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldCidade.setToolTipText("Informe a cidade");

        jTextFieldEstado.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextFieldEstado.setToolTipText("informe o estado");

        jButtonSalva.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalva.setText("Salvar");
        jButtonSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvaActionPerformed(evt);
            }
        });

        jButtonLimpa.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLimpa.setText("Limpar");
        jButtonLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpaActionPerformed(evt);
            }
        });

        jButtonCancela.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCancela.setText("Cancelar");

        jButtonConsulta.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonConsulta.setText("Consulta");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jFormattedTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroClienteLayout = new javax.swing.GroupLayout(jPanelCadastroCliente);
        jPanelCadastroCliente.setLayout(jPanelCadastroClienteLayout);
        jPanelCadastroClienteLayout.setHorizontalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelNascimento))
                            .addComponent(jLabelCPF)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelEstado)
                            .addComponent(jLabelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBairro)
                            .addComponent(jLabelCidade))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(jTextFieldEndereco)
                            .addComponent(jTextFieldBairro)
                            .addComponent(jTextFieldCidade)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldNascimento)
                            .addComponent(jTextFieldEstado)))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButtonSalva)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonLimpa)
                        .addGap(62, 62, 62)
                        .addComponent(jButtonCancela)
                        .addGap(57, 57, 57)
                        .addComponent(jButtonConsulta)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanelCadastroClienteLayout.setVerticalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNascimento)
                    .addComponent(jFormattedTextFieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldCPF))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalva)
                    .addComponent(jButtonLimpa)
                    .addComponent(jButtonCancela)
                    .addComponent(jButtonConsulta))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabelCadastroCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPFActionPerformed

    private void jButtonSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvaActionPerformed
        String Nome = jTextFieldNome.getText();
        String CPF = jFormattedTextFieldCPF.getText();
        String Email = jTextFieldEmail.getText();
        String Endereco = jTextFieldEndereco.getText();
        String Bairro = jTextFieldBairro.getText();
        String Cidade = jTextFieldCidade.getText();
        String Estado = jTextFieldEstado.getText();
        boolean sucesso;
        
        try
        {
            ClienteController clienteController = new ClienteController();
            sucesso = clienteController.CadastraCliente(Nome, CPF, Email, Endereco, Bairro, Cidade, Estado,jFormattedTextFieldNascimento.getText());
            if (sucesso == true)
            {
                JOptionPane.showMessageDialog(null, "O cadastro de cliente foi feito corretamente!");
                this.jButtonLimpaActionPerformed(evt);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Ocorreu um erro durante o cadastro");
            }
            
        }
        catch(Exception E)
        {
                JOptionPane.showMessageDialog(null, "ERROR: " + E);
        }
        
        
    }//GEN-LAST:event_jButtonSalvaActionPerformed

    private void jButtonLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JButton jButtonConsulta;
    private javax.swing.JButton jButtonLimpa;
    private javax.swing.JButton jButtonSalva;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldNascimento;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCadastroCliente;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelCadastroCliente;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}