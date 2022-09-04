package interfaces;

import entidades.Examen;
import entidades.Universidad;

public class VentanaUniversidad extends javax.swing.JFrame {

    private Universidad universidad;

    public VentanaUniversidad() {
        initComponents();
        universidad = new Universidad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrEntrega = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreMateria = new javax.swing.JTextField();
        cboEvaluacion = new javax.swing.JComboBox();
        txtNota = new javax.swing.JTextField();
        rbtPresencial = new javax.swing.JRadioButton();
        rbtMail = new javax.swing.JRadioButton();
        rbtZoom = new javax.swing.JRadioButton();
        btnCargar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPromParciales = new javax.swing.JLabel();
        lblRecuDesaprobados = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblAproZoom = new javax.swing.JLabel();
        btnListado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("UNIVERSIDAD TECNOLÓGICA NACIONAL");

        jLabel2.setText("DATOS");

        jLabel3.setText("Nombre de la Materia:");

        jLabel4.setText("Tipo de Evaluación:");

        jLabel5.setText("Nota:");

        jLabel6.setText("Modalidad de Entrega:");

        cboEvaluacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Parcial", "Recuperatorio", "Final" }));

        bgrEntrega.add(rbtPresencial);
        rbtPresencial.setText("Presencial");

        bgrEntrega.add(rbtMail);
        rbtMail.setText("Mail");

        bgrEntrega.add(rbtZoom);
        rbtZoom.setText("Zoom");

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jLabel7.setText("Promedio General Parciales:");

        jLabel8.setText("Cantidad Recuperatorios Desaprobados:");

        lblPromParciales.setText("0");

        lblRecuDesaprobados.setText("0");

        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        jLabel9.setText("Materias Aprobadas Zoom:");

        lblAproZoom.setText("0");

        btnListado.setText("Listado");
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCargar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombreMateria, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cboEvaluacion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNota, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbtPresencial)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbtMail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbtZoom))))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(lblPromParciales))
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnReportes)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblAproZoom))
                                .addComponent(btnListado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(lblRecuDesaprobados)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblPromParciales))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lblRecuDesaprobados))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(lblAproZoom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbtPresencial)
                    .addComponent(rbtMail)
                    .addComponent(rbtZoom)
                    .addComponent(btnReportes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnListado))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        String materia="";
        if (txtNombreMateria.getText() == "") {
            System.out.println("Por favor escriba el nombre de la materia");
        }
        else
            materia = txtNombreMateria.getText();
            
        int tipoEvaluacion = cboEvaluacion.getSelectedIndex();
        float nota = 0;
        if (txtNota.getText() == "") {
            System.out.println("Ingrese la nota por favor");
        } else {
            nota = Float.parseFloat(txtNota.getText());
        }
        int modalEntrega = 0;
        if (rbtPresencial.isSelected()) {
            modalEntrega = 0;
        }
        if (rbtMail.isSelected()) {
            modalEntrega = 1;
        }
        if (rbtZoom.isSelected()) {
            modalEntrega = 2;
        } 
        Examen e = new Examen(materia, tipoEvaluacion, nota, modalEntrega);
        universidad.agregarExamen(e);
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        float promParciales=universidad.promedioParciales();
        int recuDesaprobados=universidad.recuDesaprobados();
        int materiasZoom=universidad.materiasAprobadasZoom();
        
        lblPromParciales.setText(String.valueOf(promParciales));
        lblRecuDesaprobados.setText(String.valueOf(recuDesaprobados));
        lblAproZoom.setText(String.valueOf(materiasZoom));
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        VentanaListado ventana=new VentanaListado(universidad);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnListadoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUniversidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrEntrega;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnReportes;
    private javax.swing.JComboBox cboEvaluacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAproZoom;
    private javax.swing.JLabel lblPromParciales;
    private javax.swing.JLabel lblRecuDesaprobados;
    private javax.swing.JRadioButton rbtMail;
    private javax.swing.JRadioButton rbtPresencial;
    private javax.swing.JRadioButton rbtZoom;
    private javax.swing.JTextField txtNombreMateria;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
