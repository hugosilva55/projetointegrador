/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Telas;

import br.com.DAO.ParticipanteDAO;
import br.com.Modelos.Participante;
import br.com.Modelos.ParticipanteTableModel;
import br.com.Modelos.listarParticipantesTableModel;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author jonat
 */
public class PesquisarParticipantes extends javax.swing.JFrame {

    Participante participante = new Participante();
    ParticipanteDAO participanteDAO = new ParticipanteDAO();

    private String tipoUsuario;

    public PesquisarParticipantes() {
        initComponents();
        LineBorder lineBorder = new LineBorder(Color.LIGHT_GRAY, 1, true);
        txAno.setBorder(lineBorder);
    }

    public PesquisarParticipantes(String tipo) {
        initComponents();
        LineBorder lineBorder = new LineBorder(Color.LIGHT_GRAY, 1, true);
        txAno.setBorder(lineBorder);
        this.tipoUsuario = tipo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbCurso = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();
        btnCorrigir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableParicipantes = new javax.swing.JTable();
        txAno = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(235, 235, 235));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/logo pequena.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, 393, 72));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 11, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Ano Letivo:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Curso:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, 30));

        jcbCurso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Análise e Desenvolvimento de Sistemas", "Ciências Contábeis", "Direito", "Educação Física", "Enfermagem", "Fisioterapia", "Psicologia", "Serviço Social" }));
        jPanel4.add(jcbCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 190, 30));

        btnPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 1, 76));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel4.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 110, 30));

        btnCorrigir.setBackground(new java.awt.Color(0, 1, 76));
        btnCorrigir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCorrigir.setForeground(new java.awt.Color(255, 255, 255));
        btnCorrigir.setText("Corrigir Gabarito");
        btnCorrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigirActionPerformed(evt);
            }
        });
        jPanel4.add(btnCorrigir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 310, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 1, 76));
        jLabel3.setText("Pesquisar Participante");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 27));

        jScrollPane1.setBorder(null);

        tableParicipantes.setAutoCreateRowSorter(true);
        tableParicipantes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableParicipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Participante"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableParicipantes.setGridColor(new java.awt.Color(255, 255, 255));
        tableParicipantes.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableParicipantes.setRowHeight(30);
        tableParicipantes.setSelectionBackground(new java.awt.Color(0, 1, 76));
        jScrollPane1.setViewportView(tableParicipantes);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 690, 210));

        try {
            txAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(txAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 110, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 790, 430));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        //Recuperar valores
        String AnoLetivo = txAno.getText();
        String curso = jcbCurso.getSelectedItem().toString();
        atualizarTabela(AnoLetivo, curso);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCorrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigirActionPerformed
        int linha = tableParicipantes.getSelectedRow();
        CorrigirGabaritoAluno cga = new CorrigirGabaritoAluno(this.tipoUsuario);

        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecione uma linha!!");
        } else {
            participante = participanteDAO.pesquisarParticipanteId("idUsuario", (int) tableParicipantes.getValueAt(linha, 0));
            cga.Ano = txAno.getText();
            cga.Curso = String.valueOf(jcbCurso.getSelectedItem());
            cga.nomeParticipante = String.valueOf(tableParicipantes.getValueAt(tableParicipantes.getSelectedRow(), 1));
            cga.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnCorrigirActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Main main = new Main(this.tipoUsuario);
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
            java.util.logging.Logger.getLogger(PesquisarParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarParticipantes().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorrigir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JTable tableParicipantes;
    private javax.swing.JFormattedTextField txAno;
    // End of variables declaration//GEN-END:variables

    public void atualizarTabela(String ano, String curso) {
        listarParticipantesTableModel modelo = new listarParticipantesTableModel(participanteDAO.listarParticipantesPorCurso(ano, curso));
        tableParicipantes.setModel(modelo);
    }
}
