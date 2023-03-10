/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package windows;

import java.awt.Cursor;

/**
 *
 * @author Paulo Henrique
 */
public class Informacao extends javax.swing.JDialog {

    /**
     * Creates new form Informacao
     */
    public Informacao(java.awt.Frame parent, boolean modal, int maiorIdade, int somas[]) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        exibeCoisas(maiorIdade,somas);
    }
    
    public Informacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPeso1 = new javax.swing.JLabel();
        lblPeso2 = new javax.swing.JLabel();
        lblMaiorI = new javax.swing.JLabel();
        lblVoltar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FundoInfos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informaçoes");
        setMinimumSize(new java.awt.Dimension(530, 330));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(lblPeso1);
        lblPeso1.setBounds(50, 30, 240, 30);
        getContentPane().add(lblPeso2);
        lblPeso2.setBounds(50, 110, 240, 31);
        getContentPane().add(lblMaiorI);
        lblMaiorI.setBounds(50, 220, 340, 28);

        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar.png"))); // NOI18N
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(lblVoltar);
        lblVoltar.setBounds(460, 220, 40, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/kg.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 30, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/kg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 110, 30, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("VOLTAR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 260, 50, 20);

        FundoInfos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoInfo.jpg"))); // NOI18N
        FundoInfos.setText("jLabel1");
        getContentPane().add(FundoInfos);
        FundoInfos.setBounds(0, 0, 520, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblVoltarMouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        cursorFora();
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        cursorDentro();
    }//GEN-LAST:event_formMouseExited
    
    private void cursorDentro(){
      this.setCursor(new Cursor(Cursor.HAND_CURSOR));
      
    }  
    private void cursorFora(){
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
    
    private void exibeCoisas(int maiorIdade, int somas[]){
        lblMaiorI.setText("A Maior Idade Entre Os Guerreiros É: "+maiorIdade+" anos");
        lblPeso1.setText("Lado 1 Pesa: "+somas[0]+" KG");
        lblPeso2.setText("Lado 2 Pesa: "+somas[1]+" KG");
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
            java.util.logging.Logger.getLogger(Informacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Informacao dialog = new Informacao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoInfos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMaiorI;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JLabel lblPeso2;
    private javax.swing.JLabel lblVoltar;
    // End of variables declaration//GEN-END:variables
}
