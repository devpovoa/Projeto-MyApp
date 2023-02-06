package View;

import Controller.ProjetoControle;
import Model.Projeto;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author devpovoa
 */
public class CadastroProjeto extends javax.swing.JDialog {

    ProjetoControle controle;

    /**
     * Creates new form TelaDialogo
     *
     * @param parent
     * @param modal
     */
    public CadastroProjeto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controle = new ProjetoControle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layoutCadastroProjeto = new javax.swing.JPanel();
        tituloCadastroProjeto = new javax.swing.JLabel();
        imgCadastroProjeto = new javax.swing.JLabel();
        subLayoutCadastroProjeto = new javax.swing.JPanel();
        nomeCadastroProjeto = new javax.swing.JLabel();
        inputNomeCadastroProjeto = new javax.swing.JTextField();
        descricaoCadastroProjeto = new javax.swing.JLabel();
        painelTextoDescricao = new javax.swing.JScrollPane();
        inputDescricaoProjeto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 340));

        layoutCadastroProjeto.setBackground(new java.awt.Color(0, 153, 102));

        tituloCadastroProjeto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCadastroProjeto.setForeground(new java.awt.Color(255, 255, 255));
        tituloCadastroProjeto.setText("Projeto");

        imgCadastroProjeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCadastroProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        imgCadastroProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCadastroProjetoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layoutCadastroProjetoLayout = new javax.swing.GroupLayout(layoutCadastroProjeto);
        layoutCadastroProjeto.setLayout(layoutCadastroProjetoLayout);
        layoutCadastroProjetoLayout.setHorizontalGroup(
            layoutCadastroProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutCadastroProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCadastroProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgCadastroProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layoutCadastroProjetoLayout.setVerticalGroup(
            layoutCadastroProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutCadastroProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layoutCadastroProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgCadastroProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(tituloCadastroProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        subLayoutCadastroProjeto.setBackground(new java.awt.Color(255, 255, 255));

        nomeCadastroProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeCadastroProjeto.setText("Nome");

        inputNomeCadastroProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        descricaoCadastroProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descricaoCadastroProjeto.setText("Descrição");

        inputDescricaoProjeto.setColumns(20);
        inputDescricaoProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputDescricaoProjeto.setRows(5);
        painelTextoDescricao.setViewportView(inputDescricaoProjeto);

        javax.swing.GroupLayout subLayoutCadastroProjetoLayout = new javax.swing.GroupLayout(subLayoutCadastroProjeto);
        subLayoutCadastroProjeto.setLayout(subLayoutCadastroProjetoLayout);
        subLayoutCadastroProjetoLayout.setHorizontalGroup(
            subLayoutCadastroProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subLayoutCadastroProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subLayoutCadastroProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelTextoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(descricaoCadastroProjeto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputNomeCadastroProjeto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCadastroProjeto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subLayoutCadastroProjetoLayout.setVerticalGroup(
            subLayoutCadastroProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subLayoutCadastroProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeCadastroProjeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNomeCadastroProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descricaoCadastroProjeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTextoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutCadastroProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subLayoutCadastroProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(layoutCadastroProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subLayoutCadastroProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgCadastroProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCadastroProjetoMouseClicked
        // TODO add your handling code here:
        try {

            if (!inputNomeCadastroProjeto.getText().equals("")) {
                Projeto projeto = new Projeto();
                projeto.setNome(inputNomeCadastroProjeto.getText());
                projeto.setDescricao(inputDescricaoProjeto.getText());
                controle.salvar(projeto);
                JOptionPane.showMessageDialog(rootPane, "Projeto salvo com sucesso!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Projeto não pode ser salvo, "
                        + "falta informar um nome para o mesmo.");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }


    }//GEN-LAST:event_imgCadastroProjetoMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            CadastroProjeto dialog = new CadastroProjeto(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descricaoCadastroProjeto;
    private javax.swing.JLabel imgCadastroProjeto;
    private javax.swing.JTextArea inputDescricaoProjeto;
    private javax.swing.JTextField inputNomeCadastroProjeto;
    private javax.swing.JPanel layoutCadastroProjeto;
    private javax.swing.JLabel nomeCadastroProjeto;
    private javax.swing.JScrollPane painelTextoDescricao;
    private javax.swing.JPanel subLayoutCadastroProjeto;
    private javax.swing.JLabel tituloCadastroProjeto;
    // End of variables declaration//GEN-END:variables
}