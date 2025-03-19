/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import clases.Avion;
import clases.Pasajero;
import clases.Ruta;
import clases.Vuelo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.AdminSerializacion;

/**
 *
 * @author angel
 */
public class frmVuelosIngresados extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmVuelosIngresados
    */
    
    public frmVuelosIngresados() {
        initComponents();
    }
    private boolean _agregandoRuta;
    private boolean _agregandoAvion;
    private int _indiceSeleccionado;
    private int _indiceSeleccion;
    private Vuelo vueloCache=new Vuelo(); 
    
    public void actualizarElementosTablaRutas(Vuelo vuelo){
        String[] titulos={"Aropuerto Origen","Pais Origen","Ciudad Origen","Fecha Salida","Aropuerto Destino","Pais Destino","Ciudad Destino","Fecha Llegada"};
        DefaultTableModel df=new DefaultTableModel(vuelo.getArrayModelRutas(),titulos);
        this.jtRutasVuelo1.setModel(df);
    }
    
   
    public void actualizarElementosTablaAvion(Avion[] avion,Vuelo vuelo){
        String[] titulos={"Codigo","Aerolinea","Numero de Asientos"};
        DefaultTableModel df=new DefaultTableModel(vuelo.getArrayModelAvion(avion),titulos);
        this.jtInfoAvAsig.setModel(df);
    }
    
    public void actualizarElementosTablaPasajeros(Vuelo vuelo){
        String[] titulos={"Codigo","Nombres","Apellidos","Telefono","Correo Electronico"};
        DefaultTableModel df=new DefaultTableModel(vuelo.getArrayModelPasajeros(),titulos);
        this.jtPasajerosVuelo.setModel(df);
    }
    
    public void actualizarElementosTablaAsientos(Vuelo vuelo){
        String[] titulos={"Codigo","Numero","Categoria"};
        DefaultTableModel df=new DefaultTableModel(vuelo.getArrayModelAsientos(),titulos);
        this.jtAsientosVuelo.setModel(df);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtRutasVuelo1 = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtPasajerosVuelo = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtEditarPasajBuscVuelo = new javax.swing.JToggleButton();
        txtBuscarPasajBuscVuelo = new javax.swing.JToggleButton();
        txtEliminarPasajBuscVuelo = new javax.swing.JToggleButton();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtAsientosVuelo = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txtBuscarAsientoBuscVuelo = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtInfoAvAsig = new javax.swing.JTable();
        txtCodigoBuscVuelo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscarVuelo = new javax.swing.JButton();
        btnNuevoAvAsigVuelo = new javax.swing.JButton();
        btnGuardarAvAsigVuelo = new javax.swing.JButton();
        btnNuevoRutVuelo = new javax.swing.JButton();
        btnGuardarRutVuelo = new javax.swing.JButton();
        btnEliminarRutVuelo = new javax.swing.JButton();
        txtPrecioBuscVuelo = new javax.swing.JTextField();
        Precio2 = new javax.swing.JLabel();
        txtMonedaBuscVuelo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCodAvBuscVuelo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCodRutaBuscVuelo1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel7.setText("INFORMACIÓN DEL AVION ASIGNADO");

        jtRutasVuelo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Aeropuerto Origen", "Pais Origen", "Ciudad Origen", "Fecha Salida", "Hora Salida", "Pais Destino", "Aeropuerto Destino", "Ciudad Destino", "Fecha Llegada", "Hora Llegada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtRutasVuelo1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtRutasVuelo1ComponentAdded(evt);
            }
        });
        jtRutasVuelo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtRutasVuelo1MousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(jtRutasVuelo1);

        jLabel12.setText("INFORMACIÓN DE LAS RUTAS DE VUELO");

        jtPasajerosVuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombres", "Apellidos", "Telefono", "Correo Electronico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtPasajerosVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtPasajerosVueloMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(jtPasajerosVuelo);

        jLabel10.setText("INFORMACION DE PASAJEROS");

        txtEditarPasajBuscVuelo.setText("Editar");

        txtBuscarPasajBuscVuelo.setText("Buscar");
        txtBuscarPasajBuscVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPasajBuscVueloActionPerformed(evt);
            }
        });

        txtEliminarPasajBuscVuelo.setText("Eliminar");

        jtAsientosVuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Código", "Numero", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jtAsientosVuelo);

        jLabel13.setText("INFORMACIÓN DE ASIENTOS");

        txtBuscarAsientoBuscVuelo.setText("Buscar");
        txtBuscarAsientoBuscVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarAsientoBuscVueloActionPerformed(evt);
            }
        });

        jtInfoAvAsig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, ""}
            },
            new String [] {
                "Código", "Aerolinea", "Numero de Asientos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtInfoAvAsig);

        txtCodigoBuscVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBuscVueloActionPerformed(evt);
            }
        });

        jLabel16.setText("**Ingrese el codigo para buscar el vuelo");

        jLabel6.setText("BUSQUEDA DE VUELOS");

        btnBuscarVuelo.setText("BUSCAR");
        btnBuscarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVueloActionPerformed(evt);
            }
        });

        btnNuevoAvAsigVuelo.setText("Nuevo");
        btnNuevoAvAsigVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAvAsigVueloActionPerformed(evt);
            }
        });

        btnGuardarAvAsigVuelo.setText("Guardar");
        btnGuardarAvAsigVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAvAsigVueloActionPerformed(evt);
            }
        });

        btnNuevoRutVuelo.setText("Nuevo");
        btnNuevoRutVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRutVueloActionPerformed(evt);
            }
        });

        btnGuardarRutVuelo.setText("Guardar");
        btnGuardarRutVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRutVueloActionPerformed(evt);
            }
        });

        btnEliminarRutVuelo.setText("Eliminar");
        btnEliminarRutVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRutVueloActionPerformed(evt);
            }
        });

        txtPrecioBuscVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioBuscVueloActionPerformed(evt);
            }
        });

        Precio2.setText("Precio");

        txtMonedaBuscVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonedaBuscVueloActionPerformed(evt);
            }
        });

        jLabel20.setText("Moneda");

        jLabel17.setText("Código de Vuelo");

        jLabel14.setText("Código de Avion");

        txtCodAvBuscVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodAvBuscVueloActionPerformed(evt);
            }
        });

        jLabel15.setText("Código de Ruta");

        txtCodRutaBuscVuelo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodRutaBuscVuelo1ActionPerformed(evt);
            }
        });

        jLabel18.setText("** Si desea modificar el avion ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(txtBuscarAsientoBuscVuelo)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnNuevoAvAsigVuelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardarAvAsigVuelo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtEditarPasajBuscVuelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEliminarPasajBuscVuelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscarPasajBuscVuelo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel12)
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodRutaBuscVuelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnNuevoRutVuelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardarRutVuelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarRutVuelo)))
                        .addGap(180, 180, 180))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodAvBuscVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCodigoBuscVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(29, 29, 29)
                                        .addComponent(btnBuscarVuelo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Precio2)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel7)
                                        .addGap(138, 138, 138)))
                                .addComponent(txtPrecioBuscVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel20)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMonedaBuscVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(303, 303, 303))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoBuscVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVuelo)
                    .addComponent(Precio2)
                    .addComponent(txtPrecioBuscVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtMonedaBuscVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtCodAvBuscVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoAvAsigVuelo)
                    .addComponent(btnGuardarAvAsigVuelo))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtCodRutaBuscVuelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRutVuelo)
                    .addComponent(btnGuardarRutVuelo)
                    .addComponent(btnEliminarRutVuelo))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEditarPasajBuscVuelo)
                            .addComponent(txtBuscarPasajBuscVuelo)
                            .addComponent(txtEliminarPasajBuscVuelo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarAsientoBuscVuelo)))
                .addGap(258, 258, 258))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarPasajBuscVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPasajBuscVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPasajBuscVueloActionPerformed

    private void txtMonedaBuscVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonedaBuscVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonedaBuscVueloActionPerformed

    private void txtPrecioBuscVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioBuscVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioBuscVueloActionPerformed

    private void btnEliminarRutVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRutVueloActionPerformed
        // TODO add your handling code here:
        if(_indiceSeleccionado>=0){
            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Warning", JOptionPane.YES_NO_OPTION);
            if(resultado==JOptionPane.YES_OPTION){
                try{
                    String codigoVuelo;
                    codigoVuelo=this.txtCodigoBuscVuelo.getText();
                    Vuelo infoVuelo=MDIPrincipal.gVuelo.buscarVueloObj(codigoVuelo);

                    String codigoRuta=this.txtCodRutaBuscVuelo1.getText();
                    Ruta infoNRuta=MDIPrincipal.gRuta.buscarRutaObj(codigoRuta);
                    vueloCache.eliminarRutaPorIndice(_indiceSeleccion);   
                    
                    //SETEANDO VUELO
                    int posV=MDIPrincipal.gVuelo.buscarVuelo(codigoVuelo);
                    MDIPrincipal.gVuelo.modificarVuelo(posV, vueloCache);
                    //MDIPrincipal.gRuta.eliminarPorIndice(_indiceSeleccion);
                    actualizarElementosTablaRutas(vueloCache);
                    //Paso para Serializar informacion
                   AdminSerializacion.serializacion(MDIPrincipal.gVuelo, "gVuelo.obj");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Ha ocurrido un error al eliminar"+e.getMessage());
                }
            }
        }
        else{
           JOptionPane.showMessageDialog(this, "Favor seleccione el elemento de la tabla que desea eliminar"); 
        }
    }//GEN-LAST:event_btnEliminarRutVueloActionPerformed

    private void btnGuardarRutVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRutVueloActionPerformed
        // TODO add your handling code here:
       if(_agregandoRuta){
            String codigoVuelo;
            codigoVuelo=this.txtCodigoBuscVuelo.getText();
            Vuelo infoVuelo=MDIPrincipal.gVuelo.buscarVueloObj(codigoVuelo);
            
            String codigoRuta=this.txtCodRutaBuscVuelo1.getText();
            Ruta infoNRuta=MDIPrincipal.gRuta.buscarRutaObj(codigoRuta);
            vueloCache.agregarRuta(infoNRuta);
            
            //SETEANDO VUELO
            int posV=MDIPrincipal.gVuelo.buscarVuelo(codigoVuelo);
            MDIPrincipal.gVuelo.modificarVuelo(posV, vueloCache);
            
            
            actualizarElementosTablaRutas(vueloCache);
            
            AdminSerializacion.serializacion(MDIPrincipal.gVuelo, "gVuelo.obj");
            
            this._agregandoAvion=false;
        }            
        /**
        if(_agregandoRuta){
            String codigoRuta=this.txtCodRutRegistroVuelo.getText();
            Ruta infoRuta=new Ruta();
            infoRuta = MDIPrincipal.gRuta.buscarRutaObj(codigoRuta);
            gRutaCache.agregarRuta(infoRuta);
            actualizarElementosTablaRutas();
        }else{

        }
        */
    }//GEN-LAST:event_btnGuardarRutVueloActionPerformed

    private void btnNuevoRutVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRutVueloActionPerformed
        // TODO add your handling code here:
        this._agregandoRuta=true;
    }//GEN-LAST:event_btnNuevoRutVueloActionPerformed

    private void btnNuevoAvAsigVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAvAsigVueloActionPerformed
        // TODO add your handling code here:
        this._agregandoAvion=true;
        
    }//GEN-LAST:event_btnNuevoAvAsigVueloActionPerformed

    private void btnBuscarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVueloActionPerformed
        // TODO add your handling code here:
        String codigo;
        codigo=this.txtCodigoBuscVuelo.getText();
        Vuelo infoVuelo=MDIPrincipal.gVuelo.buscarVueloObj(codigo);
        vueloCache=infoVuelo;
        this.txtPrecioBuscVuelo.setText(Double.toString(infoVuelo.get_precioVuelo()));
        this.txtMonedaBuscVuelo.setText(infoVuelo.get_moneda());
        //System.out.println(infoVuelo);
        actualizarElementosTablaRutas(infoVuelo);

        Avion [] infoAvion=new Avion[1];
        infoAvion[0]=infoVuelo.get_avion();

        actualizarElementosTablaAvion(infoAvion,infoVuelo);
        actualizarElementosTablaPasajeros(infoVuelo);

        actualizarElementosTablaAsientos(infoVuelo);
    }//GEN-LAST:event_btnBuscarVueloActionPerformed

    private void jtRutasVuelo1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtRutasVuelo1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRutasVuelo1ComponentAdded

    private void txtCodigoBuscVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBuscVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBuscVueloActionPerformed

    private void txtBuscarAsientoBuscVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarAsientoBuscVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarAsientoBuscVueloActionPerformed

    private void jtPasajerosVueloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPasajerosVueloMousePressed
        // TODO add your handling code here:
        _indiceSeleccionado= this.jtPasajerosVuelo.getSelectedRow();
        if(_indiceSeleccionado!=-1){

        }
    }//GEN-LAST:event_jtPasajerosVueloMousePressed

    private void btnGuardarAvAsigVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAvAsigVueloActionPerformed
        // TODO add your handling code here:
        if(_agregandoAvion){
            String codigoVuelo;
            codigoVuelo=this.txtCodigoBuscVuelo.getText();
            Vuelo infoVuelo=MDIPrincipal.gVuelo.buscarVueloObj(codigoVuelo);
            
            String codigoAvion=this.txtCodAvBuscVuelo.getText();
            Avion infoNAv=MDIPrincipal.gAvion.buscarAvionObj(codigoAvion);
            vueloCache.set_avion(infoNAv);
            
            int posV=MDIPrincipal.gVuelo.buscarVuelo(codigoVuelo);
            MDIPrincipal.gVuelo.modificarVuelo(posV, vueloCache);
            
            
            Avion [] infoAvion=new Avion[1];
            infoAvion[0]=vueloCache.get_avion();

            actualizarElementosTablaAvion(infoAvion,vueloCache);
            
            AdminSerializacion.serializacion(MDIPrincipal.gVuelo, "gVuelo.obj");
            
            this._agregandoAvion=false;
        }        
        
    }//GEN-LAST:event_btnGuardarAvAsigVueloActionPerformed

    private void txtCodAvBuscVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodAvBuscVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAvBuscVueloActionPerformed

    private void txtCodRutaBuscVuelo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodRutaBuscVuelo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodRutaBuscVuelo1ActionPerformed

    private void jtRutasVuelo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRutasVuelo1MousePressed
        // TODO add your handling code here:
        _indiceSeleccionado= this.jtRutasVuelo1.getSelectedRow();
        if(_indiceSeleccionado!=-1){
           JOptionPane.showMessageDialog(this, "Informacion Seleccionada, Presione el Boton Eliminar"); 
        }
    }//GEN-LAST:event_jtRutasVuelo1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Precio2;
    private javax.swing.JButton btnBuscarVuelo;
    private javax.swing.JButton btnEliminarRutVuelo;
    private javax.swing.JButton btnGuardarAvAsigVuelo;
    private javax.swing.JButton btnGuardarRutVuelo;
    private javax.swing.JButton btnNuevoAvAsigVuelo;
    private javax.swing.JButton btnNuevoRutVuelo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jtAsientosVuelo;
    private javax.swing.JTable jtInfoAvAsig;
    private javax.swing.JTable jtPasajerosVuelo;
    private javax.swing.JTable jtRutasVuelo1;
    private javax.swing.JToggleButton txtBuscarAsientoBuscVuelo;
    private javax.swing.JToggleButton txtBuscarPasajBuscVuelo;
    private javax.swing.JTextField txtCodAvBuscVuelo;
    private javax.swing.JTextField txtCodRutaBuscVuelo1;
    private javax.swing.JTextField txtCodigoBuscVuelo;
    private javax.swing.JToggleButton txtEditarPasajBuscVuelo;
    private javax.swing.JToggleButton txtEliminarPasajBuscVuelo;
    private javax.swing.JTextField txtMonedaBuscVuelo;
    private javax.swing.JTextField txtPrecioBuscVuelo;
    // End of variables declaration//GEN-END:variables
}
