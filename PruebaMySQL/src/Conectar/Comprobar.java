
package Conectar;


import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Comprobar extends javax.swing.JFrame {


    public Comprobar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenido = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        PrecioLabel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IDLabel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnMod = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnActu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        IDBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBusqueda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelAdd.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        btnAceptar.setText("Añadir");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        Descripcion.setColumns(20);
        Descripcion.setRows(5);
        jScrollPane1.setViewportView(Descripcion);

        jLabel5.setText("Descripción del Producto:");

        jLabel1.setText("ID:");

        jLabel6.setText("(Por ID)");

        jLabel7.setText("(Inserte todo menos el ID)");

        btnMod.setText("Modificar");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        jLabel8.setText("(rellene todos los datos)");

        javax.swing.GroupLayout PanelAddLayout = new javax.swing.GroupLayout(PanelAdd);
        PanelAdd.setLayout(PanelAddLayout);
        PanelAddLayout.setHorizontalGroup(
            PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrecioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddLayout.createSequentialGroup()
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAddLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAddLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)))
                .addGap(56, 56, 56)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addGroup(PanelAddLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)))
                .addGap(80, 80, 80))
        );
        PanelAddLayout.setVerticalGroup(
            PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAddLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAddLayout.createSequentialGroup()
                        .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrecioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnAceptar)
                    .addComponent(btnMod))
                .addGap(4, 4, 4)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registro", PanelAdd);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

        btnActu.setText("Actualizar");
        btnActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnActu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnActu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Productos", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));

        jLabel4.setText("ID del Producto:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tableBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableBusqueda);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(IDBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IDBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar", jPanel2);

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            
        //Creamos un objeto de la clase Conexión para llamar al método que nos permitirá conectarnos.
        Conexion con = new Conexion();
        Connection conexion= con.Conecta();
        
        int res=0;
        //Creamos una variable que recoge el dato del ID insertado para utilizarlo en la función delete.
        String ident = IDLabel.getText();
        String eliminar =  "DELETE from electrodomesticos WHERE  id="+ident;
        
        try{
            //Llamamos a la función con el prepareStatement y recojemos el valor del Update para verificra si se ha realizado correctamente.
           java.sql.PreparedStatement st = conexion.prepareStatement(eliminar);
            res= st.executeUpdate();
            if (res>0){
                JOptionPane.showMessageDialog(null, "Registro eliminado.", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado.", "No existe", JOptionPane.INFORMATION_MESSAGE);
            }
            st=null;
            conexion.close();
            
            //Vaciamos todas las casillas para realizar la siguiente acción.
            IDLabel.setText("");
            NameLabel.setText("");
            PrecioLabel.setText("");
            Descripcion.setText("");
            
        }
        catch(Exception e){
            System.out.println("Error al eliminar el producto.");
            e.printStackTrace();
        }
        
        
        

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        //Conectamos con el método conecta.
        Conexion con = new Conexion();
        Connection conexion= con.Conecta();
        
        try{
            //Creamos nuestra función de insert y designamos los values con ? para faciliatar su inserción 
            String query = "INSERT INTO electrodomesticos (nombre,precio,descripcion) values(?,?,?)";
            java.sql.PreparedStatement statement = conexion.prepareStatement(query);
            
            //Indicamos con un número la posición en la que se colocará el valor de cada casilla correspondiente a la posicióm de la ?.
            statement.setString(1, NameLabel.getText());
            statement.setFloat(2, Float.parseFloat(PrecioLabel.getText()));
            statement.setString(3, Descripcion.getText());
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Producto insertado correctamente.");
            
            conexion.close();
            
            IDLabel.setText("");
            NameLabel.setText("");
            PrecioLabel.setText("");
            Descripcion.setText("");
        }
        catch(Exception e){
            System.out.println("Error al insertar los datos.");
            e.printStackTrace();
        }

                
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Conexion con = new Conexion();
        Connection conexion = con.Conecta();
        String ident = IDBuscar.getText();
        
        try{
        //Creamos una función que busque lso registros que contenga en id indicado en su campo de Texto.    
        String sql ="SELECT * FROM electrodomesticos WHERE id="+ident;
        
        
        
        //Misma funcionalidad que el Listado entero(función explicada en la clase main más abajo) pero en otra tabla de la interfaz.
        java.sql.Statement st;
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("precio");
        modelo.addColumn("descripcion");
        
        tableBusqueda.setModel(modelo);
        
        String[] dato = new String [4];
        
        st = conexion.createStatement();
        
        java.sql.ResultSet result = st.executeQuery(sql);

        
        while(result.next()){
            dato[0]=result.getString(1);
            dato[1]=result.getString(2);
            dato[2]=result.getString(3);
            dato[3]=result.getString(4);
            modelo.addRow(dato);
            
            
        }
         
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuActionPerformed
        
        Conexion con = new Conexion();
        Connection conexion = con.Conecta();
        
        //simplemente sirve para volver a lanzar el listado entero(función en la clase main más abajo) por si se ha realizado un cambio en la tabla de la base de datos
        //y se quiere ver reflejado en la interfaz.
        try{
        String sql ="SELECT * FROM electrodomesticos";
        
        java.sql.Statement st;
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("precio");
        modelo.addColumn("descripcion");
        
        table.setModel(modelo);
        
        String[] dato = new String [4];
        
        st = conexion.createStatement();
        
        java.sql.ResultSet result = st.executeQuery(sql);
        
        while(result.next()){
            dato[0]=result.getString(1);
            dato[1]=result.getString(2);
            dato[2]=result.getString(3);
            dato[3]=result.getString(4);
            modelo.addRow(dato);
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnActuActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        Conexion con = new Conexion();
        Connection conexion = con.Conecta();
        
        try{
            String ref = IDLabel.getText();
            
            //Creamos una función de Update siguiende a continuación con la misma estructura usada para la inserción de registros.
            String actualizar = "UPDATE electrodomesticos set nombre=?,precio=? ,descripcion=? "+" WHERE id="+ref;
            
            java.sql.PreparedStatement st = con.Conecta().prepareStatement(actualizar);
            
            
            st.setString(1, NameLabel.getText());
            st.setFloat(2, Float.parseFloat(PrecioLabel.getText()));
            st.setString(3, Descripcion.getText());
            
            if(st.executeUpdate()>0){
                System.out.println("Registro Actualizado correctamente");
            }
            else{
                System.out.println("Error al actualizar el registro.");
            }
            
            conexion.close();
            
            IDLabel.setText("");
            NameLabel.setText("");
            PrecioLabel.setText("");
            Descripcion.setText("");
            
        }
        catch(Exception e){
            System.out.println("Error al modifficar el registro");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnModActionPerformed

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
            java.util.logging.Logger.getLogger(Comprobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprobar().setVisible(true);
            }
        });
        
        Conexion con = new Conexion();
        Connection conexion = con.Conecta();
        
        //Creamos una función que seleccione todos los registros de nuestra tabla
        String sql ="SELECT * FROM electrodomesticos";
        
        java.sql.Statement st;
        
        //Creamos un modelo para nuestra tabla creada en la interfaz.
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("precio");
        modelo.addColumn("descripcion");
        
        table.setModel(modelo);
        
        //Creamos un Array en el que guardar los registros para poder añadirlos a a la tabla.
        String[] dato = new String [4];
        try{
        st = conexion.createStatement();
        
        java.sql.ResultSet result = st.executeQuery(sql);
        
        //Creamos un while para que mientras existan regsitros se añadan los datos al array y finalmente se va añadiendo a la tabla.
        while(result.next()){
            dato[0]=result.getString(1);
            dato[1]=result.getString(2);
            dato[2]=result.getString(3);
            dato[3]=result.getString(4);
            modelo.addRow(dato);
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenido;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JTextField IDBuscar;
    private javax.swing.JTextField IDLabel;
    private javax.swing.JTextField NameLabel;
    private javax.swing.JPanel PanelAdd;
    private javax.swing.JTextField PrecioLabel;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActu;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable table;
    private javax.swing.JTable tableBusqueda;
    // End of variables declaration//GEN-END:variables
}
