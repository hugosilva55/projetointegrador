/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Telas;

import br.com.DAO.ParticipanteDAO;
import br.com.Modelos.Participante;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Thiago Alencar
 */
public class CadastroParticipante extends javax.swing.JFrame {

    Participante part = new Participante();
    ParticipanteDAO partDAO = new ParticipanteDAO();
    
    public CadastroParticipante() {
        initComponents();
        LineBorder lineBorder = new LineBorder(Color.LIGHT_GRAY, 1, true);
        txtNome.setBorder(lineBorder );
        txtCPF.setBorder(lineBorder );
        txtEmail.setBorder(lineBorder );
        txtMae.setBorder(lineBorder );
        txtNacionalidade.setBorder(lineBorder );
        txtPai.setBorder(lineBorder );
        txtRG.setBorder(lineBorder );
        txtdataNascimento.setBorder(lineBorder );
        txtAno.setBorder(lineBorder);
       
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
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        Ema = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcCivil = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdataNascimento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNacionalidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPai = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMae = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jcCurso = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 290), new java.awt.Dimension(0, 290), new java.awt.Dimension(32767, 290));
        jLabel14 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtFone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/logo pequena.png"))); // NOI18N

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 1, 76));
        jLabel1.setText("Cadastro de Participante");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 27));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel3.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 370, 30));

        Ema.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Ema.setText("Email:");
        jPanel3.add(Ema, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 370, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Estado Civil:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        jcCivil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)" }));
        jcCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCivilActionPerformed(evt);
            }
        });
        jPanel3.add(jcCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 150, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("CPF:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txtCPF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPFKeyTyped(evt);
            }
        });
        jPanel3.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 370, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Data de Nascimento:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        txtdataNascimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtdataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdataNascimentoActionPerformed(evt);
            }
        });
        txtdataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdataNascimentoKeyTyped(evt);
            }
        });
        jPanel3.add(txtdataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 130, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Sexo:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 70, -1));

        jcSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", " " }));
        jPanel3.add(jcSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 150, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Nacionalidade:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        txtNacionalidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadeActionPerformed(evt);
            }
        });
        jPanel3.add(txtNacionalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 130, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("RG:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtRG.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRGKeyTyped(evt);
            }
        });
        jPanel3.add(txtRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 370, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Nome do Pai:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtPai.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel3.add(txtPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 370, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Nome do Mãe:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        txtMae.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel3.add(txtMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 320, 30));

        btSalvar.setBackground(new java.awt.Color(0, 1, 76));
        btSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 130, 40));

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

        jcCurso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Análise e Desenvolvimento de Sistemas", "Ciências Contábeis", "Direito", "Educação Física", "Enfermagem", "Fisioterapia", "Psicologia", "Serviço Social" }));
        jcCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCursoActionPerformed(evt);
            }
        });
        jPanel3.add(jcCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 150, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Curso:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        filler1.setBackground(new java.awt.Color(255, 245, 255));
        filler1.setOpaque(true);
        jPanel3.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 2, -1));

        jLabel14.setText("Ano do Vestibular:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        txtAno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });
        txtAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnoKeyTyped(evt);
            }
        });
        jPanel3.add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 130, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Telefone:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 60, -1));

        txtFone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel3.add(txtFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 320, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 790, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCursoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConsultarParticipante pesquisaPart = new ConsultarParticipante();
        pesquisaPart.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadeActionPerformed

    private void txtdataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdataNascimentoActionPerformed

    private void jcCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCivilActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if(txtNome.getText().equals("") || txtEmail.getText().equals("") ||
            txtCPF.getText().equals("") || txtdataNascimento.getText().equals("") ||
            txtNacionalidade.getText().equals("") || txtRG.getText().equals("") || txtMae.getText().equals("") ||
            txtPai.getText().equals("") || txtAno.getText().equals("") || txtFone.getText().equals("") ){

            JOptionPane.showMessageDialog(null,"Por favor, preencha todos os campos!!");
        }else{

            part.setNome(txtNome.getText());
            part.setEmail(txtEmail.getText());
            part.setEstadoCivil(String.valueOf(jcCivil.getSelectedItem()));
            part.setCurso(String.valueOf(jcCurso.getSelectedItem()));
            part.setCPF(txtCPF.getText());
            part.setDataNascimento(txtdataNascimento.getText());
            part.setSexo(String.valueOf(jcSexo.getSelectedItem()));
            part.setNacionalidade(txtNacionalidade.getText());
            part.setRG(txtRG.getText());
            part.setNomeMae(txtMae.getText());
            part.setNomePai(txtPai.getText());
            part.setAno(txtAno.getText());
            part.setTelefone(txtFone.getText());
            
            partDAO.salvarParticipante(part);
            limparCampos();

        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void txtCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyTyped
        int ascii = evt.getKeyChar();
        
        if (!(ascii >= 48 && ascii <= 57) && !(ascii == evt.VK_BACK_SPACE)){
            evt.consume();
        }
        if(txtCPF.getText().length() >= 11){
            evt.consume();
        }
    }//GEN-LAST:event_txtCPFKeyTyped

    private void txtRGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRGKeyTyped
        int ascii = evt.getKeyChar();
        if (!(ascii >= 48 && ascii <= 57) && !(ascii == evt.VK_BACK_SPACE)){
            evt.consume();
        }
        if(txtRG.getText().length() >= 12){
            evt.consume();
        }
    }//GEN-LAST:event_txtRGKeyTyped

    private void txtAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoKeyTyped
        int ascii = evt.getKeyChar();
        if(!(ascii >= 48 && ascii <= 57) && !(ascii == evt.VK_BACK_SPACE)){
            evt.consume();
        }
        if(txtAno.getText().length() >= 5){
            evt.consume();
        }
    }//GEN-LAST:event_txtAnoKeyTyped

    private void txtdataNascimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdataNascimentoKeyTyped
        int ascii = evt.getKeyChar();
        if(!(ascii >= 48 && ascii <=57) && !(ascii == evt.VK_BACK_SPACE)){
            evt.consume();
        }
        if(txtdataNascimento.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_txtdataNascimentoKeyTyped

    public void limparCampos(){
        txtNome.setText("");
        txtEmail.setText("");
        txtCPF.setText("");
        txtdataNascimento.setText("");
        txtNacionalidade.setText("");
        txtRG.setText("");
        txtMae.setText("");
        txtPai.setText("");
        txtAno.setText("");
        part = new Participante();
        
    }
    public void atualizarDados(){
        txtNome.setText(part.getNome());
        txtEmail.setText(part.getEmail());
        txtCPF.setText(part.getCPF());
        txtdataNascimento.setText(part.getDataNascimento());
        txtNacionalidade.setText(part.getNacionalidade());
        txtRG.setText(part.getRG());
        txtMae.setText(part.getNomeMae());
        txtPai.setText(part.getNomePai());
        txtAno.setText(part.getAno());
        
    }
    
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
            java.util.logging.Logger.getLogger(CadastroParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroParticipante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ema;
    private javax.swing.JButton btSalvar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcCivil;
    private javax.swing.JComboBox<String> jcCurso;
    private javax.swing.JComboBox<String> jcSexo;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtMae;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPai;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtdataNascimento;
    // End of variables declaration//GEN-END:variables
}
