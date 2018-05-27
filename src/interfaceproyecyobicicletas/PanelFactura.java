
package interfaceproyecyobicicletas;

import Conectar.Conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author jonas
 */
public class PanelFactura extends javax.swing.JPanel {

    /**
     * Creates new form PanelFactura
     */
    public PanelFactura() {
        initComponents();
        limpiar();
        
        
    }
    void limpiar(){
        
        txtIdFactura.setText("");
        
        
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblFechaFactura = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtIdFactura = new javax.swing.JTextField();
        lblTarifa = new javax.swing.JLabel();
        lblTotalPagar = new javax.swing.JLabel();
        lblIngreso = new javax.swing.JLabel();
        lblIdFactura = new javax.swing.JLabel();
        jdFechaFactura = new com.toedter.calendar.JDateChooser();
        jdFechaSalida = new com.toedter.calendar.JDateChooser();
        txtingreso = new javax.swing.JTextField();
        cbTarifa = new javax.swing.JComboBox<>();
        lblDatos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnFacturar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        lblAcciones = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();

        setBackground(new java.awt.Color(179, 202, 44));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(179, 202, 44));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        lblFechaFactura.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblFechaFactura.setText("Fecha Factura:");

        lblFechaSalida.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblFechaSalida.setText("Hora Salida:");

        lblTotal.setText("\"Total\"");

        lblTarifa.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblTarifa.setText("Tarifa:");

        lblTotalPagar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblTotalPagar.setText("Total a Pagar:");

        lblIngreso.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblIngreso.setText("ID Ingreso:");

        lblIdFactura.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblIdFactura.setText("ID Factura:");

        cbTarifa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minuto", "Completa " }));
        cbTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTarifaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaSalida)
                    .addComponent(lblIdFactura)
                    .addComponent(lblTarifa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jdFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(txtingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblTotalPagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jdFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaFactura)
                        .addComponent(lblIdFactura))
                    .addComponent(jdFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFechaSalida)
                        .addComponent(lblIngreso)
                        .addComponent(txtingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTarifa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalPagar)
                            .addComponent(lblTotal)))
                    .addComponent(cbTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        lblDatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDatos.setForeground(new java.awt.Color(255, 255, 255));
        lblDatos.setText("Datos:");

        jPanel2.setBackground(new java.awt.Color(179, 202, 44));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        btnFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/file-text2.png"))); // NOI18N
        btnFacturar.setText("Facturar");
        btnFacturar.setActionCommand(" Facturar");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/file-text.png"))); // NOI18N
        btnEditar.setText(" Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/book.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnFacturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnFacturar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblAcciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAcciones.setForeground(new java.awt.Color(255, 255, 255));
        lblAcciones.setText("Acciones:");

        lblFactura.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        lblFactura.setText("FACTURAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDatos)
                                .addGap(448, 448, 448)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAcciones)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(lblFactura)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblFactura)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDatos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAcciones, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        FrameConsultarFactura consultarFactura = new FrameConsultarFactura();
        consultarFactura.setVisible(true);
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void cbTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTarifaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        
        String IdFactura,FechaFactura,FechaSalida,Idingreso, TotalPagar;
        String sql = "";
        
        IdFactura = txtIdFactura.getText();
        
        Idingreso = txtingreso.getText();
        
        DateFormat hourdateFormat;
        hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        FechaFactura = hourdateFormat.format(jdFechaFactura.getDate());
        FechaSalida = hourdateFormat.format(jdFechaSalida.getDate());
        int totalFactura = valorpagar(FechaSalida);
        lblTotal.setText(String.valueOf(totalFactura));
        
        sql = "UPDATE tblfactura SET "
            + "FechaFactura = '"+FechaFactura+"', "
            + "Salida = '"+FechaSalida+"',"
            + "totalFactura = '"+totalFactura+"'"                         
            + " WHERE identificacionFactura = '"+IdFactura+"'";
        
        try{
            PreparedStatement pst = cn.prepareStatement(sql);
            int registro=pst.executeUpdate();
            
            if (registro>0){
                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
                limpiar();                
            }
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado para actualizar");
                limpiar();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Registro no actualizado " + e.getMessage()); 
        }
    }                                            

    private void txtIdentificacionUsuarioKeyPressed(java.awt.event.KeyEvent evt) {                                                    
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        
        Conexion cc = new Conexion();
        Connection cn = cc.conexion();
        
        String IdFactura,FechaFactura,FechaSalida,Idingreso, TotalPagar;
        String sql = "";
        
        IdFactura = txtIdFactura.getText();
        
        Idingreso = txtingreso.getText();
        
        DateFormat hourdateFormat;
        hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        FechaFactura = hourdateFormat.format(jdFechaFactura.getDate());
        FechaSalida = hourdateFormat.format(jdFechaSalida.getDate());
        int totalFactura = valorpagar(FechaSalida);
        lblTotal.setText(String.valueOf(totalFactura));
        
        sql = "UPDATE tblfactura SET "
            + "FechaFactura = '"+FechaFactura+"', "
            + "Salida = '"+FechaSalida+"',"
            + "totalFactura = '"+totalFactura+"'"                         
            + " WHERE identificacionFactura = '"+IdFactura+"'";
        
        try{
            PreparedStatement pst = cn.prepareStatement(sql);
            int registro=pst.executeUpdate();
            
            if (registro>0){
                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
                limpiar();                
            }
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado para actualizar");
                limpiar();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Registro no actualizado " + e.getMessage()); 
        }
       
        
    }//GEN-LAST:event_btnFacturarActionPerformed
    
    int valorpagar(String FechaSalida){
                
        String Tarifa = cbTarifa.getSelectedItem().toString();
        
        if ("Completa".equals(Tarifa)) {
            return 5000;
        }else{
            //Peticion a la base de datos por la fecha de Ingreso y hora
            Conexion cc = new Conexion();
            Connection cn = cc.conexion();
            String IDIngreso,FechaIngreso = "";
            int Minutos = 0;
            String sql = "";
            IDIngreso = txtingreso.getText();
            sql = "Select Ingreso from  tblIngreso where "
                + "  identificacionIngreso='"+IDIngreso+"'";
            
             try{
             PreparedStatement pst = cn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery(sql);            
             FechaIngreso = rs.getString(IDIngreso); // Se obtiene la fecha salidad en formato "dd-MM-yyyy HH:mm:ss
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Fecha no encontrada " + e.getMessage());
            }
             
            sql = "SELECT TIMESTAMPDIFF(MINUTE, '"+FechaIngreso+"', '"+FechaSalida+"')";
            
             try{
             PreparedStatement pst = cn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery(sql);            
             Minutos = rs.getInt(1); // Se obtiene la fecha salidad en formato "dd-MM-yyyy HH:mm:ss
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Fecha no encontrada " + e.getMessage());
            }
            
            // Operaciones de tiempo
            return Minutos*10;
            
        }
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFacturar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbTarifa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdFechaFactura;
    private com.toedter.calendar.JDateChooser jdFechaSalida;
    private javax.swing.JLabel lblAcciones;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFechaFactura;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblIdFactura;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JLabel lblTarifa;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JTextField txtIdFactura;
    private javax.swing.JTextField txtingreso;
    // End of variables declaration//GEN-END:variables
}
