/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import clases.Vuelo;
import javax.swing.table.DefaultTableModel;
import util.AdminSerializacion;

/**
 *
 * @author angel
 */
public class frmCarrito extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmEleccionAsientosVuelo
     */
    
    public frmCarrito() {
        initComponents();
        //actualizarElementosTabla();
        System.out.println("CARRITO: "+ MDIPrincipal.gCarrito.toString());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVueloCarrito = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnEliminarVueloCarrito = new javax.swing.JButton();
        btnSiguenteCarrito = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("VUELOS EN CARRITO");

        jtVueloCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Origen", "Destino", "Fecha y hora salida", "Fecha y hora llegada", "Escalas", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtVueloCarrito);

        jLabel4.setText("VUELOS AGREGADOS");

        btnEliminarVueloCarrito.setText("ELIMINAR VUELO DEL CARRITO");
        btnEliminarVueloCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVueloCarritoActionPerformed(evt);
            }
        });

        btnSiguenteCarrito.setText("SIGUIENTE");
        btnSiguenteCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguenteCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(93, 93, 93)))
                        .addGap(382, 382, 382))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEliminarVueloCarrito)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(321, 321, 321)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel4))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSiguenteCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnEliminarVueloCarrito)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnSiguenteCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguenteCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguenteCarritoActionPerformed
        // TODO add your handling code here:
        
        //INGRESO DE VUELOS (objetos) AL CARRITO
        for(int  i=0; i<MDIPrincipal.gCarrito.getControlPosiciones().size(); i++){
            Vuelo vuelo= new Vuelo();
            vuelo.set_codigoVuelo(MDIPrincipal.gCarrito.getControlPosiciones().get(i).getCodigoVuelo());
            MDIPrincipal.gCarrito.agregarVuelo(vuelo);
            AdminSerializacion.serializacion(MDIPrincipal.gCarrito,"gCarrito.obj");
            
        }
        this.getDesktopPane().add(MDIPrincipal.frmIngresoInfoCompra);
        MDIPrincipal.gVueloCompra=MDIPrincipal.gCarrito.buscarVueloObj(MDIPrincipal.gCarrito.getControlPosiciones().get(0).getCodigoVuelo());
        MDIPrincipal.frmIngresoInfoCompra.setVisible(true);
        MDIPrincipal.frmIngresoInfoCompra.actualizarElementosTablaVueloCarrito();
        MDIPrincipal.frmIngresoInfoCompra.inicio(MDIPrincipal.gVueloCompra);
    }//GEN-LAST:event_btnSiguenteCarritoActionPerformed

    private void btnEliminarVueloCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVueloCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarVueloCarritoActionPerformed
    public void actualizarElementosTablaCarrito(){
        String[] titulos={"Codigo de Vuelo","Ciudad Origen","Ciudad Destino","Fecha y Hora Salida","Fecha y Hora Llegada","Escalas","Precio"};
        DefaultTableModel df=new DefaultTableModel(MDIPrincipal.gCarrito.getArrayModelCarrito(MDIPrincipal.gVuelo),titulos);
        this.jtVueloCarrito.setModel(df);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarVueloCarrito;
    private javax.swing.JButton btnSiguenteCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jtVueloCarrito;
    // End of variables declaration//GEN-END:variables
}
