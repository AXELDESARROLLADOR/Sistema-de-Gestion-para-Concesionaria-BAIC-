package com.axeldesarrolador.concesionaria_baic.igu;

import com.axeldesarrolador.concesionaria_baic.logica.Automovil;
import com.axeldesarrolador.concesionaria_baic.logica.Camioneta;
import com.axeldesarrolador.concesionaria_baic.logica.Controladora;
import com.axeldesarrolador.concesionaria_baic.logica.Vehiculo;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
1. Estructura y Herencia
Herencia de JFrame: La clase extiende de javax.swing.JFrame, lo que la convierte en una ventana independiente del sistema operativo.

Conectividad: Instancia un objeto de la clase Controladora, que actúa como el cerebro del proyecto, encargándose de enviar la información procesada hacia la base de datos.

2. Lógica Dinámica: Adaptación según el Tipo
Una de las funcionalidades más profesionales de este código es su capacidad de auto-configuración:

Constructor Parametrizado: Recibe un String tipo (Automóvil o Camioneta). Esto permite que una sola ventana sirva para ambos propósitos, ahorrando código.

configurarModelosSegunTipo(): Este método limpia el combo de modelos y lo rellena específicamente. Si es un Automóvil, muestra modelos como el U5 Plus; si es una Camioneta, muestra la línea X35 o BJ40.

3. Experiencia de Usuario y Estética (UX/UI)
El código pone mucho énfasis en que la aplicación se sienta moderna y fácil de usar:

personalizarCombos(): Este método recorre todos los componentes gráficos (JComboBox y JTextField) para aplicarles un diseño unificado: fondo blanco puro y bordes de color azul suave.

Renderizado Personalizado: Incluye un "Renderer" para los menús desplegables. Esto evita que, al seleccionar una opción, aparezca ese color azul fuerte genérico de Java, reemplazándolo por un gris elegante que mantiene la estética de la marca.

Filtro de Entrada: El método txtCantidadDisponibleKeyTyped utiliza un validador que solo permite ingresar números. Si intentas escribir una letra, el evento se "consume" (se anula) y el sistema emite un pitido de advertencia.

4. Procesamiento de Datos (btnGuardarActionPerformed)
Cuando el usuario hace clic en "Guardar", ocurre lo siguiente:

Captura: Se extraen los valores seleccionados de todos los combos (modelo, color, motor, etc.).

Conversión: Transforma los textos necesarios a números enteros (como la cantidad disponible y puertas).

Persistencia: Llama al método crearVehiculo de la controladora, enviando el "paquete" completo de datos para ser guardado en MySQL.

Feedback: Utiliza mostrarMensaje para confirmar al usuario que la operación fue exitosa mediante una ventana emergente personalizada.

5. Navegación y Flujo
Botón Atrás: Permite regresar a la lista de vehículos, cerrando la ventana actual (this.dispose()) para liberar memoria.

Logo Interactivo: El método panelLogoMouseClicked permite que, al hacer clic en el logo de BAIC, el usuario regrese instantáneamente al menú principal de la aplicación.


*/





public class AñadirVehiculo_IGU extends javax.swing.JFrame {

    Controladora control = new Controladora();
    String tipoFiltro;

    public AñadirVehiculo_IGU(String tipo) {
        initComponents();
        
        this.tipoFiltro = tipo;
        
        personalizarCombos();
        
        configurarModelosSegunTipo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        panelDeBarra = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        logoBaic = new javax.swing.JLabel();
        panelPresentacion = new javax.swing.JPanel();
        panelFormulario = new javax.swing.JPanel();
        tituloModelo = new javax.swing.JLabel();
        boxModelo = new javax.swing.JComboBox<>();
        tituloColor = new javax.swing.JLabel();
        boxColor = new javax.swing.JComboBox<>();
        tituloMotor = new javax.swing.JLabel();
        boxMotor = new javax.swing.JComboBox<>();
        tituloCantidadDisponible = new javax.swing.JLabel();
        txtCantidadDisponible = new javax.swing.JTextField();
        tituloPuertas = new javax.swing.JLabel();
        tituloOpcionCompra = new javax.swing.JLabel();
        boxOpcCompra = new javax.swing.JComboBox<>();
        tituloPantTactil = new javax.swing.JLabel();
        boxPantTactil = new javax.swing.JComboBox<>();
        tituloCamTrasera = new javax.swing.JLabel();
        boxCamTrasera = new javax.swing.JComboBox<>();
        boxCantPuertas = new javax.swing.JComboBox<>();
        panelDelBotonAtras = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        panelBtnGuardar = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Concesionaria BAIC: Añadir ");
        setMinimumSize(new java.awt.Dimension(390, 610));
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(390, 610));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(390, 610));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(390, 610));

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperior.setMaximumSize(new java.awt.Dimension(390, 100));
        panelSuperior.setMinimumSize(new java.awt.Dimension(390, 100));
        panelSuperior.setPreferredSize(new java.awt.Dimension(390, 100));

        panelDeBarra.setBackground(new java.awt.Color(255, 255, 255));
        panelDeBarra.setMaximumSize(new java.awt.Dimension(200, 100));
        panelDeBarra.setMinimumSize(new java.awt.Dimension(200, 100));
        panelDeBarra.setPreferredSize(new java.awt.Dimension(200, 100));

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));
        panelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLogo.setMaximumSize(new java.awt.Dimension(100, 100));
        panelLogo.setMinimumSize(new java.awt.Dimension(100, 100));
        panelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLogoMouseClicked(evt);
            }
        });

        logoBaic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logobaic (2).png"))); // NOI18N

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

        javax.swing.GroupLayout panelDeBarraLayout = new javax.swing.GroupLayout(panelDeBarra);
        panelDeBarra.setLayout(panelDeBarraLayout);
        panelDeBarraLayout.setHorizontalGroup(
            panelDeBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeBarraLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelDeBarraLayout.setVerticalGroup(
            panelDeBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeBarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
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
        panelPresentacion.setMaximumSize(new java.awt.Dimension(354, 457));
        panelPresentacion.setMinimumSize(new java.awt.Dimension(354, 457));
        panelPresentacion.setPreferredSize(new java.awt.Dimension(354, 457));

        panelFormulario.setBackground(new java.awt.Color(255, 255, 255));
        panelFormulario.setMaximumSize(new java.awt.Dimension(342, 457));
        panelFormulario.setMinimumSize(new java.awt.Dimension(342, 457));
        panelFormulario.setPreferredSize(new java.awt.Dimension(342, 457));

        tituloModelo.setText("Modelo:");
        tituloModelo.setMaximumSize(new java.awt.Dimension(200, 16));
        tituloModelo.setMinimumSize(new java.awt.Dimension(200, 16));
        tituloModelo.setPreferredSize(new java.awt.Dimension(200, 16));

        boxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        boxModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxModelo.setMaximumSize(new java.awt.Dimension(200, 22));
        boxModelo.setMinimumSize(new java.awt.Dimension(200, 22));
        boxModelo.setPreferredSize(new java.awt.Dimension(200, 22));
        boxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxModeloActionPerformed(evt);
            }
        });

        tituloColor.setText("Color:");
        tituloColor.setMaximumSize(new java.awt.Dimension(200, 16));
        tituloColor.setMinimumSize(new java.awt.Dimension(200, 16));
        tituloColor.setPreferredSize(new java.awt.Dimension(200, 16));

        boxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Silver", "Rojo", "Blanco", "Azul petróleo", "Verde esmeralda", "Amarillo dorado", "Rosa pastel", "Beige" }));
        boxColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxColor.setMaximumSize(new java.awt.Dimension(200, 22));
        boxColor.setMinimumSize(new java.awt.Dimension(200, 22));
        boxColor.setPreferredSize(new java.awt.Dimension(200, 22));

        tituloMotor.setText("Motor:");
        tituloMotor.setMaximumSize(new java.awt.Dimension(200, 16));
        tituloMotor.setMinimumSize(new java.awt.Dimension(200, 16));
        tituloMotor.setPreferredSize(new java.awt.Dimension(200, 16));

        boxMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1.5", "2.0", "Electrico", "Hibrido" }));
        boxMotor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxMotor.setMaximumSize(new java.awt.Dimension(200, 22));
        boxMotor.setMinimumSize(new java.awt.Dimension(200, 22));
        boxMotor.setPreferredSize(new java.awt.Dimension(200, 22));
        boxMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMotorActionPerformed(evt);
            }
        });

        tituloCantidadDisponible.setText("Cantidad de unidades disponibles:");
        tituloCantidadDisponible.setMaximumSize(new java.awt.Dimension(200, 16));
        tituloCantidadDisponible.setMinimumSize(new java.awt.Dimension(200, 16));
        tituloCantidadDisponible.setPreferredSize(new java.awt.Dimension(200, 16));

        txtCantidadDisponible.setText("0");
        txtCantidadDisponible.setMaximumSize(new java.awt.Dimension(200, 22));
        txtCantidadDisponible.setMinimumSize(new java.awt.Dimension(200, 22));
        txtCantidadDisponible.setPreferredSize(new java.awt.Dimension(200, 22));
        txtCantidadDisponible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadDisponibleKeyTyped(evt);
            }
        });

        tituloPuertas.setText("Cantidad de puertas:");
        tituloPuertas.setMaximumSize(new java.awt.Dimension(200, 16));
        tituloPuertas.setMinimumSize(new java.awt.Dimension(200, 16));
        tituloPuertas.setPreferredSize(new java.awt.Dimension(200, 16));

        tituloOpcionCompra.setText("Tipo de opción de compra:");
        tituloOpcionCompra.setMaximumSize(new java.awt.Dimension(200, 16));
        tituloOpcionCompra.setMinimumSize(new java.awt.Dimension(200, 16));
        tituloOpcionCompra.setPreferredSize(new java.awt.Dimension(200, 16));

        boxOpcCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Nuevo 0KM", "Plan ahorro", "Financiación BAIC" }));
        boxOpcCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxOpcCompra.setMaximumSize(new java.awt.Dimension(200, 22));
        boxOpcCompra.setMinimumSize(new java.awt.Dimension(200, 22));
        boxOpcCompra.setPreferredSize(new java.awt.Dimension(200, 22));
        boxOpcCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOpcCompraActionPerformed(evt);
            }
        });

        tituloPantTactil.setText("Pantalla tactil:");
        tituloPantTactil.setMaximumSize(new java.awt.Dimension(200, 16));
        tituloPantTactil.setMinimumSize(new java.awt.Dimension(200, 16));
        tituloPantTactil.setPreferredSize(new java.awt.Dimension(200, 16));

        boxPantTactil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "´9´", "´10´" }));
        boxPantTactil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxPantTactil.setMaximumSize(new java.awt.Dimension(200, 22));
        boxPantTactil.setMinimumSize(new java.awt.Dimension(200, 22));
        boxPantTactil.setPreferredSize(new java.awt.Dimension(200, 22));
        boxPantTactil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPantTactilActionPerformed(evt);
            }
        });

        tituloCamTrasera.setText("Camara trasera y sensor:");
        tituloCamTrasera.setMaximumSize(new java.awt.Dimension(200, 16));
        tituloCamTrasera.setMinimumSize(new java.awt.Dimension(200, 16));
        tituloCamTrasera.setPreferredSize(new java.awt.Dimension(200, 16));

        boxCamTrasera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "No", "Si" }));
        boxCamTrasera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxCamTrasera.setMaximumSize(new java.awt.Dimension(200, 22));
        boxCamTrasera.setMinimumSize(new java.awt.Dimension(200, 22));
        boxCamTrasera.setPreferredSize(new java.awt.Dimension(200, 22));
        boxCamTrasera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCamTraseraActionPerformed(evt);
            }
        });

        boxCantPuertas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "4" }));
        boxCantPuertas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxCantPuertas.setMaximumSize(new java.awt.Dimension(200, 22));
        boxCantPuertas.setMinimumSize(new java.awt.Dimension(200, 22));
        boxCantPuertas.setPreferredSize(new java.awt.Dimension(200, 22));

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloOpcionCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloCamTrasera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloPantTactil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addComponent(boxModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxMotor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantidadDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxCantPuertas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxOpcCompra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxPantTactil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxCamTrasera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addComponent(tituloModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloOpcionCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxOpcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloPantTactil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxPantTactil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloCamTrasera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxCamTrasera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPresentacionLayout = new javax.swing.GroupLayout(panelPresentacion);
        panelPresentacion.setLayout(panelPresentacionLayout);
        panelPresentacionLayout.setHorizontalGroup(
            panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPresentacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPresentacionLayout.setVerticalGroup(
            panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        panelDelBotonAtras.setBackground(new java.awt.Color(255, 255, 255));
        panelDelBotonAtras.setMaximumSize(new java.awt.Dimension(175, 35));
        panelDelBotonAtras.setMinimumSize(new java.awt.Dimension(175, 35));

        btnAtras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(65, 65, 65));
        btnAtras.setText("Atrás");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setMaximumSize(new java.awt.Dimension(81, 21));
        btnAtras.setMinimumSize(new java.awt.Dimension(81, 21));
        btnAtras.setPreferredSize(new java.awt.Dimension(81, 21));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        panelBtnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        panelBtnGuardar.setMaximumSize(new java.awt.Dimension(97, 23));
        panelBtnGuardar.setMinimumSize(new java.awt.Dimension(97, 23));

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setMaximumSize(new java.awt.Dimension(81, 21));
        btnGuardar.setMinimumSize(new java.awt.Dimension(81, 21));
        btnGuardar.setPreferredSize(new java.awt.Dimension(81, 21));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnGuardarLayout = new javax.swing.GroupLayout(panelBtnGuardar);
        panelBtnGuardar.setLayout(panelBtnGuardarLayout);
        panelBtnGuardarLayout.setHorizontalGroup(
            panelBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBtnGuardarLayout.setVerticalGroup(
            panelBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panelDelBotonAtrasLayout = new javax.swing.GroupLayout(panelDelBotonAtras);
        panelDelBotonAtras.setLayout(panelDelBotonAtrasLayout);
        panelDelBotonAtrasLayout.setHorizontalGroup(
            panelDelBotonAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDelBotonAtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDelBotonAtrasLayout.setVerticalGroup(
            panelDelBotonAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDelBotonAtrasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelDelBotonAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBtnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelDelBotonAtras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSuperior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPresentacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDelBotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ListaVehiculos_IGU automoviles = new ListaVehiculos_IGU(tipoFiltro);
        automoviles.setVisible(true);
        automoviles.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void boxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxModeloActionPerformed

    private void boxMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMotorActionPerformed

    private void boxOpcCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOpcCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxOpcCompraActionPerformed

    private void boxPantTactilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPantTactilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxPantTactilActionPerformed

    private void boxCamTraseraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCamTraseraActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_boxCamTraseraActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
            String modelo = (String) boxModelo.getSelectedItem();
        String color = (String) boxColor.getSelectedItem();
        String motor = (String) boxMotor.getSelectedItem();
        int cantidad_disponible = Integer.parseInt(txtCantidadDisponible.getText());
        int cantidad_puertas = Integer.parseInt((String) boxCantPuertas.getSelectedItem());
        String opcion_compra = (String) boxOpcCompra.getSelectedItem();
        String pantalla_tactil = (String) boxPantTactil.getSelectedItem();
        String camara_trasera = (String) boxCamTrasera.getSelectedItem();

        String tipo = tipoFiltro;

        // Usamos la instancia 'control' (no la clase Controladora con mayúscula)
        control.crearVehiculo(modelo, color, motor, cantidad_disponible,
                cantidad_puertas, opcion_compra, pantalla_tactil, camara_trasera, tipo);

        mostrarMensaje(tipoFiltro + " guardado correctamente.", "Info", "Guardado exitosamente");
   
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void panelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLogoMouseClicked
        Principal_IGU principal = new Principal_IGU();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_panelLogoMouseClicked

    private void txtCantidadDisponibleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadDisponibleKeyTyped
        // 1. Obtenemos el carácter de la tecla presionada
        char c = evt.getKeyChar();

        // 2. Verificamos si NO es un número (del 0 al 9) y si NO es la tecla borrar
        if (!Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            // 3. Si no es un número, consumimos el evento para que no se escriba
            evt.consume();

            // Opcional: Sonido de advertencia del sistema
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtCantidadDisponibleKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCamTrasera;
    private javax.swing.JComboBox<String> boxCantPuertas;
    private javax.swing.JComboBox<String> boxColor;
    private javax.swing.JComboBox<String> boxModelo;
    private javax.swing.JComboBox<String> boxMotor;
    private javax.swing.JComboBox<String> boxOpcCompra;
    private javax.swing.JComboBox<String> boxPantTactil;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel logoBaic;
    private javax.swing.JPanel panelBtnGuardar;
    private javax.swing.JPanel panelDeBarra;
    private javax.swing.JPanel panelDelBotonAtras;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelPresentacion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel tituloCamTrasera;
    private javax.swing.JLabel tituloCantidadDisponible;
    private javax.swing.JLabel tituloColor;
    private javax.swing.JLabel tituloModelo;
    private javax.swing.JLabel tituloMotor;
    private javax.swing.JLabel tituloOpcionCompra;
    private javax.swing.JLabel tituloPantTactil;
    private javax.swing.JLabel tituloPuertas;
    private javax.swing.JTextField txtCantidadDisponible;
    // End of variables declaration//GEN-END:variables

    private void mostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {

            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);

        } else if (tipo.equals("Error")) {

            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);

        }

        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }

    
    private void personalizarCombos() {
        // 1. Definimos los colores 
        java.awt.Color blancofondo = new java.awt.Color(255, 255, 255);
        java.awt.Color azulBorde = new java.awt.Color(153, 180, 209); 

        // 2. Array con todos tus componentes
        javax.swing.JComponent[] componentes = {
            boxModelo, boxColor, boxMotor, txtCantidadDisponible, boxCantPuertas, boxOpcCompra, boxPantTactil, boxCamTrasera
        };

        for (javax.swing.JComponent c : componentes) {
            // 3. Aplicamos fondo gris y borde azul delgado
            c.setBackground(blancofondo);
            c.setBorder(javax.swing.BorderFactory.createLineBorder(azulBorde, 1));

            // 4. Regla de foco: Texto editable, Combos limpios
            if (c instanceof javax.swing.JTextField) {
                c.setFocusable(true);
            } else {
                c.setFocusable(false);
            }

            // 5. IMPORTANTE: NO usamos setUI(new BasicComboBoxUI) aquí
            // para que conserve las flechas modernas y el estilo redondeado.
            if (c instanceof javax.swing.JComboBox) {
                javax.swing.JComboBox cb = (javax.swing.JComboBox) c;
                cb.setOpaque(true);

                // Renderizador para que la lista desplegable sea gris y sin azul fuerte
                cb.setRenderer(new javax.swing.plaf.basic.BasicComboBoxRenderer() {
                    @Override
                    public java.awt.Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (isSelected) {
                            
                            setBackground(new java.awt.Color(200, 200, 200));
                            setForeground(java.awt.Color.BLACK);
                        } else {
                            setBackground(blancofondo);
                            setForeground(java.awt.Color.BLACK);
                        }
                        return this;
                    }
                });
            }
        }
    }

    private void configurarModelosSegunTipo() {
        // 1. Limpiamos las opciones que trae por defecto de la interfaz
        boxModelo.removeAllItems();
        boxModelo.addItem("-"); // Mantenemos la opción neutra

        // 2. Cargamos según el tipo de vehículo
        if (tipoFiltro.equals("Automovil")) {
            boxModelo.addItem("Senova D20");
            boxModelo.addItem("U5 Plus");
            boxModelo.addItem("EU5");
        } else if (tipoFiltro.equals("Camioneta")) {
            boxModelo.addItem("X35");
            boxModelo.addItem("X55 II");
            boxModelo.addItem("BJ40");
            boxModelo.addItem("X7");
        }
    }
}
