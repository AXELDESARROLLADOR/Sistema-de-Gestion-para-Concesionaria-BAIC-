package com.axeldesarrolador.concesionaria_baic.igu;


/*
1. Arquitectura de Navegación Basada en Filtros
El diseño de esta ventana no solo es estético, sino que define el comportamiento de las ventanas siguientes:

Botones con Propósito: Cada botón de navegación (btnAutomoviles, btnCamionetas, btnInventario) instancia la clase ListaVehiculos_IGU pasando un argumento de tipo String.

Pasaje de Parámetros: Al hacer clic en un botón, se envía el filtro correspondiente ("Automovil", "Camioneta" o "Todo"). Esto permite que la ventana de destino sepa exactamente qué datos solicitar a la base de datos sin necesidad de crear tres clases diferentes para listar vehículos.

Gestión de Memoria: Utiliza this.dispose() después de abrir una nueva ventana para cerrar la actual y liberar los recursos del sistema.

2. Diseño Visual y UX (Experiencia de Usuario)
Como es la primera pantalla que ve el cliente o el administrador, el código pone énfasis en la identidad visual:

Identidad de Marca: Incluye el logo oficial de BAIC y una imagen de presentación (imgCamioneta) que refuerza la temática del software.

Interactividad Dinámica: Se implementaron métodos de escucha de ratón (MouseEntered y MouseExited) para todos los botones principales. Esto genera un efecto de "hover" donde el texto cambia a color rojo al pasar el cursor, confirmando al usuario que el elemento es interactivo.

Propiedades de Ventana: Se utiliza setResizable(false) para garantizar que el diseño de los paneles y las imágenes no se deformen, manteniendo la armonía visual definida en el diseño original.

3. Organización por Paneles (Modularidad Gráfica)
El código utiliza una estructura de paneles anidados para organizar la interfaz de forma profesional:

panelSuperior: Contiene la barra de navegación y el logo, manteniéndolos aislados del contenido principal.

panelBotones: Agrupa la lógica de navegación en una sola unidad, facilitando ajustes de alineación y espaciado.

panelPresentacion: Funciona como el área de contenido principal donde se despliega la imagen de bienvenida del sistema.

4. Configuración y Centrado
Aunque no se ve en este fragmento, esta clase es la que suele recibir el bloque de código de configuración que vimos anteriormente (Look and Feel de Windows y centrado en pantalla).

pack(): Este método al final del constructor asegura que la ventana tome el tamaño preferido basado en los componentes internos antes de mostrarse.

setLocationRelativeTo(null): (Invocado desde el Main) asegura que la experiencia comience siempre en el centro del monitor del usuario.

*/




public class Principal_IGU extends javax.swing.JFrame {

   
    public Principal_IGU() {
        initComponents();
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
        btnAutomoviles = new javax.swing.JButton();
        btnCamionetas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        panelPresentacion = new javax.swing.JPanel();
        imgCamioneta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Concesionaria BAIC");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(800, 600));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(800, 600));

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperior.setMaximumSize(new java.awt.Dimension(800, 100));
        panelSuperior.setMinimumSize(new java.awt.Dimension(800, 100));
        panelSuperior.setPreferredSize(new java.awt.Dimension(800, 100));

        panelDeBarra.setBackground(new java.awt.Color(255, 255, 255));
        panelDeBarra.setMaximumSize(new java.awt.Dimension(600, 100));
        panelDeBarra.setMinimumSize(new java.awt.Dimension(600, 100));
        panelDeBarra.setPreferredSize(new java.awt.Dimension(600, 100));

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));
        panelLogo.setMaximumSize(new java.awt.Dimension(100, 100));
        panelLogo.setMinimumSize(new java.awt.Dimension(100, 100));

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

        btnAutomoviles.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAutomoviles.setForeground(new java.awt.Color(102, 102, 102));
        btnAutomoviles.setText("Automoviles");
        btnAutomoviles.setToolTipText("Sección específica de automóviles en la concesionaria.");
        btnAutomoviles.setBorder(null);
        btnAutomoviles.setBorderPainted(false);
        btnAutomoviles.setContentAreaFilled(false);
        btnAutomoviles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAutomoviles.setFocusPainted(false);
        btnAutomoviles.setMaximumSize(new java.awt.Dimension(117, 24));
        btnAutomoviles.setMinimumSize(new java.awt.Dimension(117, 24));
        btnAutomoviles.setPreferredSize(new java.awt.Dimension(117, 24));
        btnAutomoviles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAutomovilesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAutomovilesMouseExited(evt);
            }
        });
        btnAutomoviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutomovilesActionPerformed(evt);
            }
        });

        btnCamionetas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCamionetas.setForeground(new java.awt.Color(102, 102, 102));
        btnCamionetas.setText("Camionetas");
        btnCamionetas.setToolTipText("Sección específica de camionetas en la concesionaria.");
        btnCamionetas.setBorder(null);
        btnCamionetas.setBorderPainted(false);
        btnCamionetas.setContentAreaFilled(false);
        btnCamionetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCamionetas.setFocusPainted(false);
        btnCamionetas.setMaximumSize(new java.awt.Dimension(117, 24));
        btnCamionetas.setMinimumSize(new java.awt.Dimension(117, 24));
        btnCamionetas.setPreferredSize(new java.awt.Dimension(117, 24));
        btnCamionetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCamionetasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCamionetasMouseExited(evt);
            }
        });
        btnCamionetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamionetasActionPerformed(evt);
            }
        });

        btnInventario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(102, 102, 102));
        btnInventario.setText("Inventario");
        btnInventario.setToolTipText("Sección específica de inventario general en la concesionaria.");
        btnInventario.setBorder(null);
        btnInventario.setBorderPainted(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.setFocusPainted(false);
        btnInventario.setMaximumSize(new java.awt.Dimension(117, 24));
        btnInventario.setMinimumSize(new java.awt.Dimension(117, 24));
        btnInventario.setPreferredSize(new java.awt.Dimension(117, 24));
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInventarioMouseExited(evt);
            }
        });
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addComponent(btnAutomoviles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCamionetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAutomoviles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCamionetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        panelPresentacion.setMaximumSize(new java.awt.Dimension(800, 494));
        panelPresentacion.setMinimumSize(new java.awt.Dimension(800, 494));

        imgCamioneta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\logoincio (1).jpg")); // NOI18N

        javax.swing.GroupLayout panelPresentacionLayout = new javax.swing.GroupLayout(panelPresentacion);
        panelPresentacion.setLayout(panelPresentacionLayout);
        panelPresentacionLayout.setHorizontalGroup(
            panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCamioneta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPresentacionLayout.setVerticalGroup(
            panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCamioneta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(panelPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCamionetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamionetasActionPerformed
        ListaVehiculos_IGU listaVehiculos=new ListaVehiculos_IGU("Camioneta");
        listaVehiculos.setVisible(true);
        listaVehiculos.setLocationRelativeTo(null);
       
        this.dispose();
    }//GEN-LAST:event_btnCamionetasActionPerformed

    private void btnAutomovilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutomovilesActionPerformed
        ListaVehiculos_IGU listaVehiculos=new ListaVehiculos_IGU("Automovil");
        listaVehiculos.setVisible(true);
        listaVehiculos.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnAutomovilesActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        ListaVehiculos_IGU listaVehiculos=new ListaVehiculos_IGU("Todo");
        listaVehiculos.setVisible(true);
        listaVehiculos.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnAutomovilesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutomovilesMouseEntered
       btnAutomoviles.setForeground(java.awt.Color.RED);
       btnAutomoviles.repaint();
    }//GEN-LAST:event_btnAutomovilesMouseEntered

    private void btnAutomovilesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutomovilesMouseExited
       btnAutomoviles.setForeground(new java.awt.Color(102,102,102));
       btnAutomoviles.repaint();
    }//GEN-LAST:event_btnAutomovilesMouseExited

    private void btnCamionetasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCamionetasMouseEntered
       btnCamionetas.setForeground(java.awt.Color.RED);
       btnCamionetas.repaint();
    }//GEN-LAST:event_btnCamionetasMouseEntered

    private void btnCamionetasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCamionetasMouseExited
       btnCamionetas.setForeground(new java.awt.Color(102,102,102));
       btnCamionetas.repaint();
    }//GEN-LAST:event_btnCamionetasMouseExited

    private void btnInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseEntered
        btnInventario.setForeground(java.awt.Color.RED);
        btnInventario.repaint();
    }//GEN-LAST:event_btnInventarioMouseEntered

    private void btnInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseExited
       btnInventario.setForeground(new java.awt.Color(102,102,102));
       btnInventario.repaint();
    }//GEN-LAST:event_btnInventarioMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutomoviles;
    private javax.swing.JButton btnCamionetas;
    private javax.swing.JButton btnInventario;
    private javax.swing.JLabel imgCamioneta;
    private javax.swing.JLabel logoBaic;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDeBarra;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelPresentacion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
}
