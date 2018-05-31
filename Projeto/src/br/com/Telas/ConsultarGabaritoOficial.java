/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Telas;

import br.com.Modelos.GabaritoOficial;
import br.com.DAO.GabaritoOficialDAO;
import br.com.Modelos.GabaritoOficialTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Thiago Alencar
 */
public class ConsultarGabaritoOficial extends javax.swing.JFrame {

    GabaritoOficial gabaritoOfic = new GabaritoOficial();
    GabaritoOficialDAO gabaritoOficDAO = new GabaritoOficialDAO();

    public ConsultarGabaritoOficial() {
        initComponents();
        atualizarTabela();
    }
    
    public void atualizarTabela(){
        GabaritoOficialTableModel gabaritoOficTable = new GabaritoOficialTableModel(gabaritoOficDAO.listarGabaritoOficial());
        tbGabaritoOfic1.setModel((TableModel) gabaritoOficTable);
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbCurso = new javax.swing.JTable();
        jbVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGabaritoOfic1 = new javax.swing.JTable();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbVoltar1 = new javax.swing.JButton();

        tbCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbCurso);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        tbGabaritoOfic1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(tbGabaritoOfic1);

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbVoltar1.setText("Cadastrar Gabarito");
        jbVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jbEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbExcluir)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVoltar)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbVoltar1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        Main menu = new Main();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        int linha = tbGabaritoOfic1.getSelectedRow();
        if (linha == -1) {

            JOptionPane.showMessageDialog(null, " Selecione uma linha!! ");
        } else {
            gabaritoOfic = gabaritoOficDAO.pesquisarGabaritoOficId("idGabarito", (int) tbGabaritoOfic1.getValueAt(linha, 0));
            CadastrarGabaritoOficial  cadGabaritoOfic = new CadastrarGabaritoOficial ();
            cadGabaritoOfic.gabaritoOfic = gabaritoOfic;
            cadGabaritoOfic.atualizarCampos();
            cadGabaritoOfic.setVisible(true);
            dispose();

        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = tbGabaritoOfic1.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null,"Por favor, selecione uma linha!!");
        }else if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?", "Excluir"
        , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            
            gabaritoOfic = gabaritoOficDAO.pesquisarGabaritoOficId("idGabarito",(int) tbGabaritoOfic1.getValueAt(linha, 0));
            gabaritoOficDAO.excluirGabaritoOficial(gabaritoOfic);
            JOptionPane.showMessageDialog(null, "Gabarito Excluido Com Sucesso!!!");
            atualizarTabela();
            
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltar1ActionPerformed
        CadastrarGabaritoOficial newGabarito = new CadastrarGabaritoOficial();
        newGabarito.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVoltar1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarGabaritoOficial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarGabaritoOficial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarGabaritoOficial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarGabaritoOficial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarGabaritoOficial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JButton jbVoltar1;
    private javax.swing.JTable tbCurso;
    private javax.swing.JTable tbGabaritoOfic1;
    // End of variables declaration//GEN-END:variables
}
