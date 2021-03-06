package visao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author professor
 */
public class TelaPrincipalLider extends javax.swing.JFrame {

    VisualizarReunioes vReunioes = new VisualizarReunioes();
    VisualizarProjetos vProjetos = new VisualizarProjetos();
    VisualizarEquipes vEquipes = new VisualizarEquipes();
    
    public TelaPrincipalLider() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPaneLider = new javax.swing.JDesktopPane();
        jMenuBarTelaPrincipalLider = new javax.swing.JMenuBar();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemMeuUsuario = new javax.swing.JMenuItem();
        jMenuReunioes = new javax.swing.JMenu();
        jMenuItemNovaReuniao = new javax.swing.JMenuItem();
        jMenuItemVisualizarReuniao = new javax.swing.JMenuItem();
        jMenuProjetos = new javax.swing.JMenu();
        jMenuItemNovoProjeto = new javax.swing.JMenuItem();
        jMenuItemVisualizarProjeto = new javax.swing.JMenuItem();
        jMenuEquipes = new javax.swing.JMenu();
        jMenuItemNovaEquipe = new javax.swing.JMenuItem();
        jMenuItemVisualizarEquipe = new javax.swing.JMenuItem();
        jMenuMembros = new javax.swing.JMenu();
        jMenuItemMinhaSolicitacao = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemMelhorHorario = new javax.swing.JMenuItem();
        jMenuItemMinhaAgenda = new javax.swing.JMenuItem();

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RHSepool");

        javax.swing.GroupLayout jDesktopPaneLiderLayout = new javax.swing.GroupLayout(jDesktopPaneLider);
        jDesktopPaneLider.setLayout(jDesktopPaneLiderLayout);
        jDesktopPaneLiderLayout.setHorizontalGroup(
            jDesktopPaneLiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jDesktopPaneLiderLayout.setVerticalGroup(
            jDesktopPaneLiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        jMenuUsuario.setText("Usuários");

        jMenuItemMeuUsuario.setText("Meu usuário");
        jMenuItemMeuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMeuUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemMeuUsuario);

        jMenuBarTelaPrincipalLider.add(jMenuUsuario);

        jMenuReunioes.setText("Reuniões");

        jMenuItemNovaReuniao.setText("Nova");
        jMenuItemNovaReuniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovaReuniaoActionPerformed(evt);
            }
        });
        jMenuReunioes.add(jMenuItemNovaReuniao);

        jMenuItemVisualizarReuniao.setText("Visualizar");
        jMenuItemVisualizarReuniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarReuniaoActionPerformed(evt);
            }
        });
        jMenuReunioes.add(jMenuItemVisualizarReuniao);

        jMenuBarTelaPrincipalLider.add(jMenuReunioes);

        jMenuProjetos.setText("Projetos");

        jMenuItemNovoProjeto.setText("Novo");
        jMenuItemNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoProjetoActionPerformed(evt);
            }
        });
        jMenuProjetos.add(jMenuItemNovoProjeto);

        jMenuItemVisualizarProjeto.setText("Visualizar");
        jMenuItemVisualizarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarProjetoActionPerformed(evt);
            }
        });
        jMenuProjetos.add(jMenuItemVisualizarProjeto);

        jMenuBarTelaPrincipalLider.add(jMenuProjetos);

        jMenuEquipes.setText("Equipes");

        jMenuItemNovaEquipe.setText("Nova");
        jMenuItemNovaEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovaEquipeActionPerformed(evt);
            }
        });
        jMenuEquipes.add(jMenuItemNovaEquipe);

        jMenuItemVisualizarEquipe.setText("Visualizar");
        jMenuItemVisualizarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarEquipeActionPerformed(evt);
            }
        });
        jMenuEquipes.add(jMenuItemVisualizarEquipe);

        jMenuBarTelaPrincipalLider.add(jMenuEquipes);

        jMenuMembros.setText("Membros");

        jMenuItemMinhaSolicitacao.setText("Minha solicitação");
        jMenuItemMinhaSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMinhaSolicitacaoActionPerformed(evt);
            }
        });
        jMenuMembros.add(jMenuItemMinhaSolicitacao);

        jMenuBarTelaPrincipalLider.add(jMenuMembros);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemMelhorHorario.setText("Melhor Horário");
        jMenuFerramentas.add(jMenuItemMelhorHorario);

        jMenuItemMinhaAgenda.setText("Minha Agenda");
        jMenuFerramentas.add(jMenuItemMinhaAgenda);

        jMenuBarTelaPrincipalLider.add(jMenuFerramentas);

        setJMenuBar(jMenuBarTelaPrincipalLider);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneLider)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneLider)
        );

        setSize(new java.awt.Dimension(483, 355));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemVisualizarReuniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarReuniaoActionPerformed
        if(vReunioes.isVisible()){
            jDesktopPaneLider.remove(vReunioes);
        }
        if(vProjetos.isVisible()){
            jDesktopPaneLider.remove(vProjetos);
        }
        if(vEquipes.isVisible()){
            jDesktopPaneLider.remove(vEquipes);
        }
        vReunioes.setVisible(true);
        jDesktopPaneLider.add(vReunioes);
    }//GEN-LAST:event_jMenuItemVisualizarReuniaoActionPerformed

    private void jMenuItemVisualizarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarProjetoActionPerformed
        if(vReunioes.isVisible()){
            jDesktopPaneLider.remove(vReunioes);
        }
        if(vProjetos.isVisible()){
            jDesktopPaneLider.remove(vProjetos);
        }
        if(vEquipes.isVisible()){
            jDesktopPaneLider.remove(vEquipes);
        }
        vProjetos.setVisible(true);
        jDesktopPaneLider.add(vProjetos);
    }//GEN-LAST:event_jMenuItemVisualizarProjetoActionPerformed

    private void jMenuItemVisualizarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarEquipeActionPerformed
        if(vReunioes.isVisible()){
            jDesktopPaneLider.remove(vReunioes);
        }
        if(vProjetos.isVisible()){
            jDesktopPaneLider.remove(vProjetos);
        }
        if(vEquipes.isVisible()){
            jDesktopPaneLider.remove(vEquipes);
        }
        vEquipes.setVisible(true);
        jDesktopPaneLider.add(vEquipes);
    }//GEN-LAST:event_jMenuItemVisualizarEquipeActionPerformed
      
    private void jMenuItemNovaReuniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovaReuniaoActionPerformed
        TelaNovaReuniao novaReuniao=new TelaNovaReuniao();
        novaReuniao.setVisible(true);
    }//GEN-LAST:event_jMenuItemNovaReuniaoActionPerformed

    private void jMenuItemNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoProjetoActionPerformed
        TelaNovoProjeto novoProjeto=new TelaNovoProjeto();
        novoProjeto.setVisible(true);
    }//GEN-LAST:event_jMenuItemNovoProjetoActionPerformed

    private void jMenuItemMeuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMeuUsuarioActionPerformed
       TelaMeuUsuario meuUsuario=new TelaMeuUsuario();
        meuUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemMeuUsuarioActionPerformed

    private void jMenuItemNovaEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovaEquipeActionPerformed
        TelaNovaEquipe novaEquipe=new TelaNovaEquipe();
        novaEquipe.setVisible(true);
    }//GEN-LAST:event_jMenuItemNovaEquipeActionPerformed

    private void jMenuItemMinhaSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMinhaSolicitacaoActionPerformed
        FormularioSolicitacao formulario=new FormularioSolicitacao();
        formulario.setVisible(true);
    }//GEN-LAST:event_jMenuItemMinhaSolicitacaoActionPerformed

         
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
            java.util.logging.Logger.getLogger(TelaPrincipalLider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalLider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalLider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalLider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalLider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane jDesktopPaneLider;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBarTelaPrincipalLider;
    private javax.swing.JMenu jMenuEquipes;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemMelhorHorario;
    private javax.swing.JMenuItem jMenuItemMeuUsuario;
    private javax.swing.JMenuItem jMenuItemMinhaAgenda;
    private javax.swing.JMenuItem jMenuItemMinhaSolicitacao;
    private javax.swing.JMenuItem jMenuItemNovaEquipe;
    private javax.swing.JMenuItem jMenuItemNovaReuniao;
    private javax.swing.JMenuItem jMenuItemNovoProjeto;
    private javax.swing.JMenuItem jMenuItemVisualizarEquipe;
    private javax.swing.JMenuItem jMenuItemVisualizarProjeto;
    private javax.swing.JMenuItem jMenuItemVisualizarReuniao;
    private javax.swing.JMenu jMenuMembros;
    private javax.swing.JMenu jMenuProjetos;
    private javax.swing.JMenu jMenuReunioes;
    private javax.swing.JMenu jMenuUsuario;
    // End of variables declaration//GEN-END:variables
}
