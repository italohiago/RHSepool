/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import static javafx.scene.input.KeyCode.Z;
import javax.swing.JOptionPane;
import modelo.ModeloUsuario;

/**
 *
 * @author professor
 */
public class TelaNovoUsuario extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaNovoUsuario
     */
    public TelaNovoUsuario() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNovoUsuarioUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxNovoUsuarioTipo = new javax.swing.JComboBox();
        jButtonNovoUsuarioCadastrar = new javax.swing.JButton();
        jButtonNovoUsuarioVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldNovoUsuarioSenha = new javax.swing.JPasswordField();
        jPasswordFieldNovoUsuarioConfirmarSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Novo usuário");

        jLabel1.setText("Usuário");

        jLabel2.setText("Senha");

        jLabel3.setText("Confirmar senha");

        jComboBoxNovoUsuarioTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo de usuário", "Teste1", "Teste2" }));

        jButtonNovoUsuarioCadastrar.setText("Cadastrar");
        jButtonNovoUsuarioCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoUsuarioCadastrarActionPerformed(evt);
            }
        });

        jButtonNovoUsuarioVoltar.setText("Voltar");
        jButtonNovoUsuarioVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoUsuarioVoltarActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipos de usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonNovoUsuarioVoltar)
                        .addGap(21, 21, 21)
                        .addComponent(jButtonNovoUsuarioCadastrar))
                    .addComponent(jComboBoxNovoUsuarioTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNovoUsuarioUsuario)
                    .addComponent(jPasswordFieldNovoUsuarioSenha)
                    .addComponent(jPasswordFieldNovoUsuarioConfirmarSenha))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNovoUsuarioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldNovoUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldNovoUsuarioConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(jComboBoxNovoUsuarioTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoUsuarioCadastrar)
                    .addComponent(jButtonNovoUsuarioVoltar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoUsuarioVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoUsuarioVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonNovoUsuarioVoltarActionPerformed

    private void jButtonNovoUsuarioCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoUsuarioCadastrarActionPerformed
        String campoUsuario = jTextFieldNovoUsuarioUsuario.getText();
        String campoSenha = jPasswordFieldNovoUsuarioSenha.getText();
        String campoConfirmaSenha = jPasswordFieldNovoUsuarioConfirmarSenha.getText();
        int index = jComboBoxNovoUsuarioTipo.getSelectedIndex();
        ModeloUsuario model = new ModeloUsuario();
        if((campoUsuario.length() <= 15) && verificaCaracteres(campoUsuario)){
            if ((campoSenha.length() >= 4) && (campoSenha.length() <= 8) && (verificaCaracteres(campoSenha)) ){
                if(campoConfirmaSenha.equals(campoSenha)){                    
                    if(index > 0){
                        switch(JOptionPane.showConfirmDialog(null, "Deseja confirmar seu cadastro?")){
                            case 0: 
                                model.setUsuario(campoUsuario);
                                model.setSenha(campoSenha);
                                model.setPermissao((String) jComboBoxNovoUsuarioTipo.getItemAt(index));
                                break;
                            case 2:
                                jTextFieldNovoUsuarioUsuario.setText("");
                                jPasswordFieldNovoUsuarioSenha.setText("");
                                jPasswordFieldNovoUsuarioConfirmarSenha.setText("");
                                jComboBoxNovoUsuarioTipo.setSelectedIndex(0);
                                break;
                        }
                    }else
                        JOptionPane.showMessageDialog(null, "Selecione o tipo de usuário!");
                }else{
                    JOptionPane.showMessageDialog(null, "Campos de senha diferentes!");
                    jPasswordFieldNovoUsuarioSenha.setText("");
                    jPasswordFieldNovoUsuarioConfirmarSenha.setText("");
                    jPasswordFieldNovoUsuarioSenha.requestFocus();
                }
            }else
                JOptionPane.showMessageDialog(null,"Senha inválida!");
        }else
            JOptionPane.showMessageDialog(null, "Usuário inválido!");
            
    }//GEN-LAST:event_jButtonNovoUsuarioCadastrarActionPerformed

    public boolean verificaCaracteres(String campo){
        if(campo.matches("[\\da-zA-Z]+"))
            return true;
        else
            return false;
    }
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
            java.util.logging.Logger.getLogger(TelaNovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNovoUsuarioCadastrar;
    private javax.swing.JButton jButtonNovoUsuarioVoltar;
    private javax.swing.JComboBox jComboBoxNovoUsuarioTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordFieldNovoUsuarioConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldNovoUsuarioSenha;
    private javax.swing.JTextField jTextFieldNovoUsuarioUsuario;
    // End of variables declaration//GEN-END:variables
}