package Vista;

import javax.swing.JLabel;

/**
 *
 * @author ariellugo
 */
public class dialogCartilla extends javax.swing.JDialog {

    public dialogCartilla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    private void opcionesIniciales(){
        int rows = 4;
        int cols = 4;
        int total_cells = (rows * cols);
        
        for (int i = 0; i < total_cells; i++) {
            JLabel lbl = new JLabel();
            lbl.setSize(200, 200);
            lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            lbl.setText("Texto Ejemplo");
            
            this.pnlCentral.add(lbl);
            this.pnlCentral.updateUI();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        pnlCentral = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40), 4));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(1, 3, 38));
        jPanel2.setPreferredSize(new java.awt.Dimension(736, 45));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(542, 30));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(1, 3, 38));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(15, 15));
        jPanel4.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel2.setBackground(new java.awt.Color(1, 3, 38));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(186, 217, 214));
        jLabel2.setText("JUEGO  DE LA CHALUPA");
        jLabel2.setOpaque(true);
        jPanel4.add(jLabel2, java.awt.BorderLayout.CENTER);

        jButton1.setBackground(new java.awt.Color(1, 3, 38));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, java.awt.BorderLayout.EAST);

        jPanel2.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.setLayout(new java.awt.BorderLayout());

        pnlCentral.setPreferredSize(new java.awt.Dimension(5, 400));
        pnlCentral.setLayout(new java.awt.GridLayout(4, 4, 5, 5));
        jPanel5.add(pnlCentral, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(30, 396));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, java.awt.BorderLayout.EAST);

        jPanel7.setPreferredSize(new java.awt.Dimension(30, 396));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel8, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(718, 702));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.opcionesIniciales();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(dialogCartilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogCartilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogCartilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogCartilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogCartilla dialog = new dialogCartilla(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel pnlCentral;
    // End of variables declaration//GEN-END:variables
}