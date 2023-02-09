/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package windows;

import control.MetodosJogo;
import domain.Guerreiro;
import java.awt.Cursor;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;


/**
 *
 * @author Paulo Henrique
 */
public class Jogo extends javax.swing.JDialog {
    MetodosJogo jogo = new MetodosJogo();
    private LinkedList<Guerreiro> lado1;
    private LinkedList<Guerreiro> lado2;
    private DefaultListModel modelo1 = new DefaultListModel();
    private DefaultListModel modelo2 = new DefaultListModel();
    /**
     * Creates new form Jogo
     * @param parent
     * @param modal
     */
    public Jogo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public Jogo(java.awt.Frame parent, boolean modal, LinkedList<Guerreiro> lado1,LinkedList<Guerreiro> lado2){
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.lado1 = lado1;
        this.lado2 = lado2;
        jListLado1.setModel(modelo1);
        jListLado2.setModel(modelo2);    
        listar();
        colocaImgGuerreiros(lado1, lado2);
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListLado1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListLado2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblImagem1 = new javax.swing.JLabel();
        lblImagem2 = new javax.swing.JLabel();
        lblInfos1 = new javax.swing.JLabel();
        lblInfos2 = new javax.swing.JLabel();
        lblNomeG1 = new javax.swing.JLabel();
        lblNomeG2 = new javax.swing.JLabel();
        lblVoltar = new javax.swing.JLabel();
        lblFight = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBandeiraBranca1 = new javax.swing.JLabel();
        lblBandeiraBranca2 = new javax.swing.JLabel();
        lblFundoArena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1056, 562));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        getContentPane().setLayout(null);

        jListLado1.setToolTipText("");
        jScrollPane1.setViewportView(jListLado1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 85, 212, 430);

        jScrollPane2.setViewportView(jListLado2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(821, 85, 212, 430);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Lado 1 / DESISTIR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 60, 126, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Lado 2 / DESISTIR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(821, 60, 121, 17);
        getContentPane().add(lblImagem1);
        lblImagem1.setBounds(224, 177, 150, 150);
        getContentPane().add(lblImagem2);
        lblImagem2.setBounds(665, 177, 150, 150);

        lblInfos1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblInfos1.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(lblInfos1);
        lblInfos1.setBounds(224, 345, 150, 30);

        lblInfos2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblInfos2.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(lblInfos2);
        lblInfos2.setBounds(665, 345, 150, 30);

        lblNomeG1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNomeG1.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(lblNomeG1);
        lblNomeG1.setBounds(224, 381, 150, 30);

        lblNomeG2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNomeG2.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(lblNomeG2);
        lblNomeG2.setBounds(665, 381, 150, 30);

        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar.png"))); // NOI18N
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(lblVoltar);
        lblVoltar.setBounds(610, 464, 40, 30);

        lblFight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Figth.png"))); // NOI18N
        lblFight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFightMouseClicked(evt);
            }
        });
        getContentPane().add(lblFight);
        lblFight.setBounds(380, 447, 220, 70);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Voltar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(610, 500, 42, 17);

        lblBandeiraBranca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BandeiraBranca.png"))); // NOI18N
        lblBandeiraBranca1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBandeiraBranca1MouseClicked(evt);
            }
        });
        getContentPane().add(lblBandeiraBranca1);
        lblBandeiraBranca1.setBounds(150, 10, 70, 70);

        lblBandeiraBranca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BandeiraBranca.png"))); // NOI18N
        lblBandeiraBranca2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBandeiraBranca2MouseClicked(evt);
            }
        });
        getContentPane().add(lblBandeiraBranca2);
        lblBandeiraBranca2.setBounds(960, 10, 70, 70);

        lblFundoArena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Arena.jpg"))); // NOI18N
        getContentPane().add(lblFundoArena);
        lblFundoArena.setBounds(0, 0, 1040, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void listar(){
        for(int i=0;i < lado1.size();i++){
            modelo1.addElement("Vida:["+lado1.get(i).getEnergia()+"]  Nome:  "+lado1.get(i).getNome());
        }
        for(int i=0;i < lado2.size();i++){
            modelo2.addElement("Vida:["+lado2.get(i).getEnergia()+"]  Nome:  "+lado2.get(i).getNome());
        }
    }
    
    private void colocaImgGuerreiros(LinkedList<Guerreiro> lado1,LinkedList<Guerreiro> lado2){
        int index = 0;      
        if((lado1.size() <= 0) || (lado2.size() <= 0)){
            if(lado1.size() <= 0){
                lblImagem1.setIcon(new ImageIcon(getClass().getResource("/imagens/"+"Vazio"+".jpg")));
                lblInfos1.setText("Vazio");
                lblNomeG1.setText("Vazio");
            }else{
                lblImagem2.setIcon(new ImageIcon(getClass().getResource("/imagens/"+"Vazio"+".jpg")));
                lblInfos2.setText("Vazio");
                lblNomeG2.setText("Vazio");
            }            
        }else{
            String nome = lado1.get(index).toString();
            lblImagem1.setIcon(new ImageIcon(getClass().getResource("/imagens/"+nome+".jpg")));
            lblInfos1.setText(nome);
            lblNomeG1.setText(lado1.get(index).getNome());
            String nome2 = lado2.get(index).toString();
            lblImagem2.setIcon(new ImageIcon(getClass().getResource("/imagens/"+nome2+".jpg")));
            lblInfos2.setText(nome2);
            lblNomeG2.setText(lado2.get(index).getNome());
        }    
    }
    
    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblVoltarMouseClicked

    private void lblFightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFightMouseClicked
        jogo.jogo(lado1, lado2);        
        modelo1.removeAllElements();
        modelo2.removeAllElements();       
        listar();
        colocaImgGuerreiros(lado1, lado2);
    }//GEN-LAST:event_lblFightMouseClicked

    private void lblBandeiraBranca1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBandeiraBranca1MouseClicked
        
        
    }//GEN-LAST:event_lblBandeiraBranca1MouseClicked

    private void lblBandeiraBranca2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBandeiraBranca2MouseClicked
        
        
    }//GEN-LAST:event_lblBandeiraBranca2MouseClicked

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jogo dialog = new Jogo(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListLado1;
    private javax.swing.JList<String> jListLado2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBandeiraBranca1;
    private javax.swing.JLabel lblBandeiraBranca2;
    private javax.swing.JLabel lblFight;
    private javax.swing.JLabel lblFundoArena;
    private javax.swing.JLabel lblImagem1;
    private javax.swing.JLabel lblImagem2;
    private javax.swing.JLabel lblInfos1;
    private javax.swing.JLabel lblInfos2;
    private javax.swing.JLabel lblNomeG1;
    private javax.swing.JLabel lblNomeG2;
    private javax.swing.JLabel lblVoltar;
    // End of variables declaration//GEN-END:variables


    
}