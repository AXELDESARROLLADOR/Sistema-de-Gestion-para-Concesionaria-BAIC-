package com.axeldesarrolador.concesionaria_baic;

import com.axeldesarrolador.concesionaria_baic.igu.Principal_IGU;

public class Concesionaria_baic {

    public static void main(String[] args) {
    
        
    inicioPrograma();    
            
}

private static void inicioPrograma() {

/*
1. Configuración del "Look and Feel" (Estética del Sistema)
La primera parte del código se encarga de que la aplicación no se vea como un programa de Java "viejo" (estilo Metal), sino que "adopte la apariencia nativa de Windows".

El Bucle For: Recorre todos los estilos visuales instalados en el sistema operativo donde se ejecute el programa.

La Condición "Windows": Busca específicamente el motor de renderizado de Windows. Esto hace que tus botones, tablas y cuadros de texto (JComboBox, JTextField) tengan los bordes, sombreados y fuentes que el usuario está acostumbrado a ver en su computadora.

Manejo de Errores (Catch): Es robusto. Si por alguna razón el programa se ejecuta en un sistema que no sea Windows (como Linux o macOS), el catch evita que el programa "explote"; simplemente ignora la instrucción y usa el estilo por defecto de Java.

2. Gestión del Hilo de Ejecución "(EventQueue)"
El uso de "java.awt.EventQueue.invokeLater" es una buena práctica de desarrollo esencial en Swing.

"Thread-Safety": Las interfaces gráficas en Java no son "seguras para hilos". Este método asegura que la ventana se cree y se actualice dentro del Event Dispatch Thread (EDT), que es el hilo especial de Java dedicado exclusivamente a pintar la pantalla y capturar clics. Sin esto, podrías sufrir errores extraños o "congelamientos" de pantalla.

3. Inicialización y Propiedades de la Ventana
Finalmente, el código dentro del lambda (() -> { ... }) define cómo aparece tu pantalla principal:

setLocationRelativeTo(null): Es el truco estándar para que la ventana aparezca perfectamente centrada en el monitor del usuario, sin importar la resolución que tenga. Da una sensación mucho más profesional que si apareciera en la esquina superior izquierda.

setResizable(false): Esta línea es vital para tu diseño actual. Al impedir que el usuario estire la ventana, aseguras que los componentes (logos, botones y la tabla de vehículos) mantengan las posiciones y proporciones exactas que definiste en el editor de NetBeans, evitando que el diseño se "deforme" o queden espacios vacíos antiestéticos.      

*/
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            // Si no encuentra Windows (por ejemplo en Linux/Mac), usa el sistema por defecto
            java.util.logging.Logger.getLogger(Principal_IGU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Ventana
        java.awt.EventQueue.invokeLater(() -> {
            Principal_IGU principal = new Principal_IGU();
            principal.setVisible(true);
            principal.setLocationRelativeTo(null); // Centra la ventana en la pantalla
            principal.setResizable(false); // Evita que se maximice y se dforme el diseñoeforme el diseño
        });

    }

        
        
   
    }

