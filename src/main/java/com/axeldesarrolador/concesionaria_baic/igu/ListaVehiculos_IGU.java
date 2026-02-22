package com.axeldesarrolador.concesionaria_baic.igu;


import com.axeldesarrolador.concesionaria_baic.logica.Controladora;
import com.axeldesarrolador.concesionaria_baic.logica.Vehiculo;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
Esta clase, ListaVehiculos_IGU, representa el centro de operaciones de tu sistema de inventario para la Concesionaria BAIC. Su función principal es mostrar de forma tabular los datos almacenados y permitir al usuario interactuar con ellos a través de acciones de edición, eliminación y creación.

A continuación, presento una explicación técnica detallada de su funcionamiento:

1. Dinamismo y Gestión de Títulos
El constructor de la clase recibe un parámetro tipo, el cual define el comportamiento de toda la ventana:

Filtro Inteligente: El valor se almacena en tipoFiltro, permitiendo que una sola ventana sirva para ver el "Inventario General", solo "Automóviles" o solo "Camionetas".

Personalización de Títulos: Mediante una estructura if-else, la ventana ajusta su encabezado dinámicamente (ej. "Gestión de Automóviles BAIC"), mejorando la orientación del usuario.

2. El Corazón de los Datos: cargarTabla()
Este es el método más importante de la clase, encargado de la sincronización con la base de datos:

Modelo No Editable: Define un DefaultTableModel donde se sobrescribe isCellEditable para retornar false, asegurando que el usuario no pueda modificar el texto directamente sobre la celda de la tabla.

Consumo de Lógica: Llama a control.traerVehiculos(tipoFiltro), delegando a la capa de lógica la recuperación de la lista filtrada.

Manejo de Metadatos Ocultos: La columna 9 ("Tipo") se carga con el valor real del vehículo pero se oculta visualmente (ancho 0). Esto permite que el sistema sepa si una fila es un Automóvil o Camioneta sin ensuciar la vista del usuario.

3. Operaciones CRUD Dinámicas
La ventana actúa como disparadora de las acciones principales:

Añadir con Selección: Si el usuario está en la vista "Todo", el método elegirTipoYAñadir() despliega un panel de opciones (showOptionDialog) para definir qué clase de objeto instanciar. Si ya está en una categoría específica, salta este paso y usa el filtro actual.

Eliminación Segura: El botón eliminar captura el ID de la fila seleccionada y llama a control.borrarVehiculo(idVehiculo). Inmediatamente después, refresca la tabla para mostrar el cambio en tiempo real.

Edición con Contexto: Al editar, el código extrae el tipoReal de la columna oculta de la tabla. Esto garantiza que la ventana EditarVehiculo_IGU sepa exactamente qué catálogo de modelos cargar, incluso desde el inventario general.

4. Experiencia de Usuario (UX/UI) y Estética
Feedback Visual: Se implementaron eventos de ratón (MouseEntered / MouseExited) que cambian el color del texto de los botones a rojo al pasar el cursor, indicando interactividad.

Seguridad de Selección: Todos los botones de acción incluyen validaciones para verificar si la tabla está vacía o si el usuario no ha seleccionado ninguna fila, disparando el método mostrarMensaje con alertas de error si es necesario.

Navegación: El clic en el logo de BAIC permite un acceso rápido al menú principal, destruyendo la ventana actual para optimizar el uso de memoria.


*/

public class ListaVehiculos_IGU extends javax.swing.JFrame {

    String tipoFiltro;
     Controladora control=new Controladora();
   
    public ListaVehiculos_IGU(String tipo) {
        initComponents();
        this.tipoFiltro=tipo;
        
        if(tipo.equals("Todo")){
        
          setTitle("Inventario General - BAIC");
            
        }else if(tipo.equals("Camioneta")){
        
         setTitle("Gestión de "+tipoFiltro+"s BAIC");
        
        }else{
        
         setTitle("Gestión de "+tipoFiltro+"es BAIC");
        
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        panelDeBarra = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        logoBaic = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        panelPresentacion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 565));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(800, 565));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(800, 565));

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperior.setMaximumSize(new java.awt.Dimension(800, 100));
        panelSuperior.setMinimumSize(new java.awt.Dimension(800, 100));
        panelSuperior.setPreferredSize(new java.awt.Dimension(800, 100));

        panelDeBarra.setBackground(new java.awt.Color(255, 255, 255));
        panelDeBarra.setMaximumSize(new java.awt.Dimension(600, 100));
        panelDeBarra.setMinimumSize(new java.awt.Dimension(600, 100));
        panelDeBarra.setPreferredSize(new java.awt.Dimension(600, 100));

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));
        panelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLogo.setMaximumSize(new java.awt.Dimension(100, 100));
        panelLogo.setMinimumSize(new java.awt.Dimension(100, 100));
        panelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLogoMouseClicked(evt);
            }
        });

        logoBaic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\logobaic (2).png")); // NOI18N

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoBaic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoBaic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBotones.setBackground(new java.awt.Color(255, 255, 255));

        btnAñadir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(102, 102, 102));
        btnAñadir.setText("Añadir");
        btnAñadir.setToolTipText("Este es el botón para añadir.");
        btnAñadir.setBorder(null);
        btnAñadir.setBorderPainted(false);
        btnAñadir.setContentAreaFilled(false);
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadir.setFocusPainted(false);
        btnAñadir.setMaximumSize(new java.awt.Dimension(117, 24));
        btnAñadir.setMinimumSize(new java.awt.Dimension(117, 24));
        btnAñadir.setPreferredSize(new java.awt.Dimension(117, 24));
        btnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAñadirMouseExited(evt);
            }
        });
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(102, 102, 102));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Este es el botón para editar.");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.setMaximumSize(new java.awt.Dimension(117, 24));
        btnEditar.setMinimumSize(new java.awt.Dimension(117, 24));
        btnEditar.setPreferredSize(new java.awt.Dimension(117, 24));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(102, 102, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Este es el botón para eliminar.");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.setMaximumSize(new java.awt.Dimension(117, 24));
        btnEliminar.setMinimumSize(new java.awt.Dimension(117, 24));
        btnEliminar.setPreferredSize(new java.awt.Dimension(117, 24));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panelDeBarraLayout = new javax.swing.GroupLayout(panelDeBarra);
        panelDeBarra.setLayout(panelDeBarraLayout);
        panelDeBarraLayout.setHorizontalGroup(
            panelDeBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeBarraLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelDeBarraLayout.setVerticalGroup(
            panelDeBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeBarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelDeBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panelDeBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelDeBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPresentacion.setBackground(new java.awt.Color(255, 255, 255));
        panelPresentacion.setMaximumSize(new java.awt.Dimension(800, 453));
        panelPresentacion.setMinimumSize(new java.awt.Dimension(800, 453));
        panelPresentacion.setPreferredSize(new java.awt.Dimension(800, 453));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(780, 400));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(780, 400));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(780, 400));

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaVehiculos.setMaximumSize(new java.awt.Dimension(780, 400));
        tablaVehiculos.setMinimumSize(new java.awt.Dimension(780, 400));
        tablaVehiculos.setPreferredSize(new java.awt.Dimension(780, 400));
        jScrollPane1.setViewportView(tablaVehiculos);

        javax.swing.GroupLayout panelPresentacionLayout = new javax.swing.GroupLayout(panelPresentacion);
        panelPresentacion.setLayout(panelPresentacionLayout);
        panelPresentacionLayout.setHorizontalGroup(
            panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPresentacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelPresentacionLayout.setVerticalGroup(
            panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
            .addGroup(panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPresentacionLayout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelPresentacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSuperior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     
    if(tablaVehiculos.getRowCount()>0){
     if(tablaVehiculos.getSelectedRow()!=-1){
    
     int idVehiculo=Integer.parseInt(String.valueOf (tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(),0)));
  
      String tipoReal = String.valueOf(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(), 9));
      
         EditarVehiculo_IGU pantallaEdit = new EditarVehiculo_IGU(idVehiculo, tipoReal);
         pantallaEdit.setVisible(true);
         pantallaEdit.setLocationRelativeTo(null);
         this.dispose();
      
     }else{
       mostrarMensaje("Error al modificar: No selecciono fila alguna.","Error","Error al modificar");
    
     }    
    }else{
      mostrarMensaje("Error no hay filas para modificar.","Error","Error al modificar");
     }
      
    
      
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
    if (tipoFiltro.equals("Todo")) {
        // Si estamos en Inventario General, preguntamos qué tipo añadir
        elegirTipoYAñadir();
    } else {
        // Si ya estamos en una sección específica, usamos ese tipo directamente
        AñadirVehiculo_IGU pantallaAnadir = new AñadirVehiculo_IGU(tipoFiltro);
        pantallaAnadir.setVisible(true);
        pantallaAnadir.setLocationRelativeTo(null);
        this.dispose();
    }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      
        if(tablaVehiculos.getRowCount()>0){
            if(tablaVehiculos.getSelectedRow()!=-1){
               int idVehiculo=Integer.parseInt(String.valueOf(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(),0)));
               control.borrarVehiculo(idVehiculo);
               if(tipoFiltro.equals("Todo")){
               mostrarMensaje("Vehiculo"+" borrado correctamente.","Info","Borrado exitosamente");
               }else{
               mostrarMensaje(tipoFiltro+" borrado correctamente.","Info","Borrado exitosamente");
               }
               cargarTabla();  
               
            }
                     else{
    
                      mostrarMensaje("No selecciono un registro para borrar.","Error","Error al eliminar");
    
                    }     
        }
        else{    
          mostrarMensaje("La tabla esta vacia no se puede eliminar.","Error","Error al eliminar");
        }
            
            
         
     
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseEntered
         btnAñadir.setForeground(java.awt.Color.RED);
         btnAñadir.repaint();
    }//GEN-LAST:event_btnAñadirMouseEntered

    private void btnAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseExited
      btnAñadir.setForeground(new java.awt.Color(102,102,102));
      btnAñadir.repaint();
    }//GEN-LAST:event_btnAñadirMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        
      cargarTabla();  
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        
        if (tablaVehiculos.getSelectedRow() != -1) {
            // Cambia el cursor a la mano (Hand Cursor)
            btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

            btnEditar.setForeground(java.awt.Color.RED);
            btnEditar.repaint();
        } else {
            // Opcional: Volver al cursor por defecto si no hay nada seleccionado
            btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }

  
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
       btnEditar.setForeground(new java.awt.Color(102,102,102));
       btnEditar.repaint();
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        if (tablaVehiculos.getSelectedRow() != -1) {
            btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnEliminar.setForeground(java.awt.Color.RED);
            btnEliminar.repaint();
        } else {
            // Opcional: Volver al cursor por defecto si no hay nada seleccionado
            btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
       btnEliminar.setForeground(new java.awt.Color(102,102,102));
       btnEliminar.repaint();
    }//GEN-LAST:event_btnEliminarMouseExited

    private void panelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLogoMouseClicked
        Principal_IGU principal=new Principal_IGU();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_panelLogoMouseClicked

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoBaic;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDeBarra;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelPresentacion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tablaVehiculos;
    // End of variables declaration//GEN-END:variables

  private void cargarTabla() {
    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    String titulos[] = {"Id", "Modelo", "Color", "Motor", "Disponibles", "Puertas", "Plan de pago", "Pantalla", "Camara", "Tipo"};
    modelo.setColumnIdentifiers(titulos);
    tablaVehiculos.getTableHeader().setReorderingAllowed(false);

    // Llamamos al método centralizado usando 'tipoFiltro' (la variable del constructor)
    List<Vehiculo> listaVehiculos = control.traerVehiculos(tipoFiltro);

    if (listaVehiculos != null) {
        for (Vehiculo v : listaVehiculos) {
            Object[] objeto = {
                v.getId(), v.getModelo(), v.getColor(), v.getMotor(), 
                v.getCantidad_disponible(), v.getCantidad_puertas(),
                v.getOpcion_compra(), v.getPantalla_tactil(), v.getCamara_trasera(),
                v.getTipo() 
            };
            modelo.addRow(objeto);
        }
    }
    tablaVehiculos.setModel(modelo);
    tablaVehiculos.getColumnModel().getColumn(9).setMinWidth(0);
    tablaVehiculos.getColumnModel().getColumn(9).setMaxWidth(0);
    tablaVehiculos.getColumnModel().getColumn(9).setPreferredWidth(0);
}
    
    
    
    
    private void mostrarMensaje(String mensaje, String tipo, String titulo) {

    JOptionPane optionPane= new JOptionPane (mensaje);
    if(tipo.equals("Info")){
    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);    
    }
    else if(tipo.equals("Error")){  
    optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
    }
    JDialog dialog = optionPane.createDialog(titulo);
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
    }

   private void elegirTipoYAñadir() {
    // 1. Definimos las opciones que aparecerán en los botones
    Object[] opciones = {"Automovil", "Camioneta"};

    // 2. Mostramos el panel de selección
    int seleccion = JOptionPane.showOptionDialog(
            null,
            "Seleccione el tipo de vehículo que desea añadir:",
            "Elección de Tipo - BAIC",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]);

    // 3. Verificamos qué eligió el usuario (0 para Automovil, 1 para Camioneta)
    String tipoSeleccionado = "";
    
    if (seleccion == 0) {
        tipoSeleccionado = "Automovil";
    } else if (seleccion == 1) {
        tipoSeleccionado = "Camioneta";
    }

    // 4. Si no cerró la ventana sin elegir, abrimos "Añadir" con ese tipo
    if (seleccion != JOptionPane.CLOSED_OPTION) {
        AñadirVehiculo_IGU pantallaAnadir = new AñadirVehiculo_IGU(tipoSeleccionado);
        pantallaAnadir.setVisible(true);
        pantallaAnadir.setLocationRelativeTo(null);
        this.dispose();
    }
}
}
