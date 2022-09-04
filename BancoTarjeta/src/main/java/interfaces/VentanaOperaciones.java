package interfaces;

import entidades.Banco;
import entidades.TarjetaCredito;
import entidades.TarjetaDebito;

public class VentanaOperaciones extends javax.swing.JFrame {

    private Banco banco;

    public VentanaOperaciones() {
        initComponents();
        banco = new Banco();
        txtLimite.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrTipoOperacion = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboTipoTarjeta1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNroTarjeta1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTitular = new javax.swing.JTextField();
        txtLimite = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTarjetasDebito = new javax.swing.JLabel();
        lblSaldoPromedio = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        rbtExtraccion = new javax.swing.JRadioButton();
        rbtDeposito = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cboTipoTarjeta2 = new javax.swing.JComboBox<>();
        txtNroTarjeta2 = new javax.swing.JTextField();
        txtImporte = new javax.swing.JTextField();
        btnOperar = new javax.swing.JToggleButton();
        lblMensajes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("OPERACIONES DE TARJETAS");

        jLabel2.setText("Tipo de Tarjeta");

        cboTipoTarjeta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de Débito", "Tarjeta de Crédito" }));
        cboTipoTarjeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoTarjeta1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Número");

        jLabel4.setText("Saldo");

        jLabel5.setText("Titular");

        jLabel6.setText("Límite");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel7.setText("El saldo total de las tarjetas de débito es: ");

        jLabel8.setText("El promedio de saldo de tarjetas de crédito es:");

        lblTarjetasDebito.setText("0");

        lblSaldoPromedio.setText("0");

        btnReportes.setText("Mostrar Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        bgrTipoOperacion.add(rbtExtraccion);
        rbtExtraccion.setText("Extracción");

        bgrTipoOperacion.add(rbtDeposito);
        rbtDeposito.setText("Depósito");

        jLabel11.setText("Tipo de Tarjeta");

        jLabel12.setText("Número de Tarjeta");

        jLabel13.setText("Importe");

        cboTipoTarjeta2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de Débito", "Tarjeta de Crédito" }));

        btnOperar.setText("Operar");
        btnOperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperarActionPerformed(evt);
            }
        });

        lblMensajes.setText("MENSAJES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(204, 204, 204))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboTipoTarjeta1, 0, 178, Short.MAX_VALUE)
                                    .addComponent(txtNroTarjeta1)
                                    .addComponent(txtSaldo)
                                    .addComponent(txtTitular)
                                    .addComponent(txtLimite))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblTarjetasDebito))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblSaldoPromedio))
                                            .addComponent(rbtExtraccion)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnReportes)
                                                    .addComponent(rbtDeposito))
                                                .addGap(55, 55, 55))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtImporte)
                                                    .addComponent(txtNroTarjeta2)
                                                    .addComponent(cboTipoTarjeta2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMensajes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOperar)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboTipoTarjeta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblTarjetasDebito))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNroTarjeta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lblSaldoPromedio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtExtraccion)
                    .addComponent(rbtDeposito))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cboTipoTarjeta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(jLabel12)
                    .addComponent(txtNroTarjeta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOperar)
                    .addComponent(lblMensajes))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int tipoTarjeta = cboTipoTarjeta1.getSelectedIndex();
        int numero = Integer.parseInt(txtNroTarjeta1.getText());
        float saldo = Float.parseFloat(txtSaldo.getText());
        String titular = txtTitular.getText();

        if (tipoTarjeta == 0) {
            TarjetaDebito debito = new TarjetaDebito(numero, saldo, titular);
            banco.agregarTarjeta(debito);
        } else {
            float limite = Float.parseFloat(txtLimite.getText());
            TarjetaCredito credito = new TarjetaCredito(limite, numero, saldo, titular);
            banco.agregarTarjeta(credito);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        float saldoTotal = banco.saldoTotalDebito();
        float promedio = banco.promedioCredito();

        lblTarjetasDebito.setText(String.valueOf(saldoTotal));
        lblSaldoPromedio.setText(String.valueOf(promedio));
    }//GEN-LAST:event_btnReportesActionPerformed

    private void cboTipoTarjeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoTarjeta1ActionPerformed
        int tipoTarjeta = cboTipoTarjeta1.getSelectedIndex();
        if (tipoTarjeta == 0)
            txtLimite.setEnabled(false);
        else
            txtLimite.setEnabled(true);
    }//GEN-LAST:event_cboTipoTarjeta1ActionPerformed

    private void btnOperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperarActionPerformed
        float importe = Float.parseFloat(txtImporte.getText());
        int numero = Integer.parseInt(txtNroTarjeta2.getText());
        int tipo = cboTipoTarjeta2.getSelectedIndex();
        boolean exito = false;
        if (rbtExtraccion.isSelected()) {
            exito = banco.extraer(numero, tipo, importe);
        } else {
            exito = banco.depositar(numero, tipo, importe);
        }
        if(exito)
            lblMensajes.setText("La operación se registró correctamente");
        else
            lblMensajes.setText("La operación no se pudo concretar");
    }//GEN-LAST:event_btnOperarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrTipoOperacion;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JToggleButton btnOperar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JComboBox<String> cboTipoTarjeta1;
    private javax.swing.JComboBox<String> cboTipoTarjeta2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblMensajes;
    private javax.swing.JLabel lblSaldoPromedio;
    private javax.swing.JLabel lblTarjetasDebito;
    private javax.swing.JRadioButton rbtDeposito;
    private javax.swing.JRadioButton rbtExtraccion;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtLimite;
    private javax.swing.JTextField txtNroTarjeta1;
    private javax.swing.JTextField txtNroTarjeta2;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTitular;
    // End of variables declaration//GEN-END:variables
}
