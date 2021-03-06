/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Martha Lucía
 */
public class Menuppal extends javax.swing.JFrame {

    /**
     * Creates new form Menuppal
     */
    public Menuppal() {
        initComponents();
        btnConsulta1.setVisible(false);
        btnConsulta2.setVisible(false);
        btnVolver.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnConsulta1 = new javax.swing.JButton();
        btnConsulta2 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        jLabel1.setText("Seleccione la acción");

        btnConsultar.setText("Consultar");
        btnConsultar.setActionCommand("btnConsultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.setActionCommand("btnInsertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnConsulta1.setText("Consulta 1");
        btnConsulta1.setToolTipText("");
        btnConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta1ActionPerformed(evt);
            }
        });

        btnConsulta2.setText("Consulta 2");
        btnConsulta2.setActionCommand("btnConsulta2");
        btnConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta2ActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsulta2)
                            .addComponent(btnConsulta1)
                            .addComponent(btnConsultar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(btnInsertar)))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnConsultar))
                .addGap(60, 60, 60)
                .addComponent(btnConsulta1)
                .addGap(34, 34, 34)
                .addComponent(btnConsulta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta1ActionPerformed
        VentCons1 v1=new VentCons1();
        v1.setVisible(true);
        v1.generarTabla();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsulta1ActionPerformed

    private void btnConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta2ActionPerformed
        VentCons2 v2=new VentCons2();
        v2.setVisible(true);
        v2.generarTabla2();
// TODO add your handling code here:
    }//GEN-LAST:event_btnConsulta2ActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        btnInsertar.setEnabled(false);
        btnConsulta1.setVisible(true);
        btnConsulta2.setVisible(true);
        btnVolver.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        btnInsertar.setEnabled(true);
        btnConsulta1.setVisible(false);
        btnConsulta2.setVisible(false);
        btnVolver.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        VentInsert v3=new VentInsert();
        v3.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta1;
    private javax.swing.JButton btnConsulta2;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
