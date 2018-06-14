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
    private String tipoUser;
    public ConsultarGabaritoOficial() {
        initComponents();
        atualizarTabela();
    }
        public ConsultarGabaritoOficial(String tipo) {
        initComponents();
        atualizarTabela();
        this.tipoUser = tipo;
    }
    
    public void atualizarTabela(){
        GabaritoOficialTableModel modelo = new GabaritoOficialTableModel(gabaritoOficDAO.listarGabaritoOficial());
        tbGabaritoOfic1.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbCurso = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGabaritoOfic1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/logo pequena.png"))); // NOI18N

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);

        tbGabaritoOfic1.setAutoCreateRowSorter(true);
        tbGabaritoOfic1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbGabaritoOfic1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Ano Seletivo", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGabaritoOfic1.setGridColor(new java.awt.Color(255, 255, 255));
        tbGabaritoOfic1.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tbGabaritoOfic1.setRowHeight(30);
        tbGabaritoOfic1.setSelectionBackground(new java.awt.Color(0, 1, 76));
        jScrollPane2.setViewportView(tbGabaritoOfic1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 730, 270));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 1, 76));
        jLabel3.setText("Consultar Gabarito Oficial");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 27));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/edit.png"))); // NOI18N
        jLabel1.setText("Editar");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/x-button.png"))); // NOI18N
        jLabel2.setText("Remover");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 790, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       int linha = tbGabaritoOfic1.getSelectedRow();
        if (linha == -1) {

            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha!! ");
        } else {
            gabaritoOfic = gabaritoOficDAO.pesquisarGabaritoOficId("idGabarito", (int) tbGabaritoOfic1.getValueAt(linha, 0));
            CadastrarGabaritoOficial  cadGabaritoOfic = new CadastrarGabaritoOficial (this.tipoUser);
            cadGabaritoOfic.gabaritoOfic = gabaritoOfic;
            cadGabaritoOfic.atualizarCampos();
            cadGabaritoOfic.setVisible(true);
            dispose();

        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int linha = tbGabaritoOfic1.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null,"Por favor, selecione uma linha!!");
        }else if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?", "Excluir"
        , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            
            gabaritoOfic = gabaritoOficDAO.pesquisarGabaritoOficId("idGabarito",(int) tbGabaritoOfic1.getValueAt(linha, 0));
            gabaritoOficDAO.excluirGabaritoOficial(gabaritoOfic);
            atualizarTabela();
            
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Main main = new Main(this.tipoUser);
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

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
                new ConsultarGabaritoOficial().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbCurso;
    private javax.swing.JTable tbGabaritoOfic1;
    // End of variables declaration//GEN-END:variables
}
