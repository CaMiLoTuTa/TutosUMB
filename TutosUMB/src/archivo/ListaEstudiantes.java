/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package archivo;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import modelo.Servidor;

/**
 *
 * @author tutaa
 */
public class ListaEstudiantes extends javax.swing.JFrame {

    Conexion con1 = new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    /**
     * Creates new form listaestudiantes
     */
    public ListaEstudiantes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("LISTA ESTUDIANTES");
        this.setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));

        setLocationRelativeTo(null);
        consultar();

    }

    void consultar() {
        String sql = "select * from usuarios";

        try {
            conet = con1.getConection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[1];
            modelo = (DefaultTableModel) Tabla.getModel();
            while (rs.next()) {
                cliente[0] = rs.getString("nombre");
                modelo.addRow(cliente);
            }
            Tabla.setModel(modelo);

        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        botonCuenta1 = new javax.swing.JButton();
        botonSesiones1 = new javax.swing.JButton();
        botonCambiarCuenta1 = new javax.swing.JButton();
        botonAtras1 = new javax.swing.JButton();
        botonCalendario1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnjugartiki = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 251, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 496, -1, -1));

        botonCuenta1.setBackground(new java.awt.Color(185, 215, 234));
        botonCuenta1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonCuenta1.setForeground(new java.awt.Color(66, 120, 181));
        botonCuenta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo/notebook.png"))); // NOI18N
        botonCuenta1.setText("CUENTA");
        botonCuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuenta1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 184, 97));

        botonSesiones1.setBackground(new java.awt.Color(185, 215, 234));
        botonSesiones1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSesiones1.setForeground(new java.awt.Color(66, 120, 181));
        botonSesiones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo/message.png"))); // NOI18N
        botonSesiones1.setText("SESIONES");
        botonSesiones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSesiones1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonSesiones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 221, 184, 97));

        botonCambiarCuenta1.setBackground(new java.awt.Color(185, 215, 234));
        botonCambiarCuenta1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonCambiarCuenta1.setForeground(new java.awt.Color(66, 120, 181));
        botonCambiarCuenta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo/arrows.png"))); // NOI18N
        botonCambiarCuenta1.setText("CAMBIAR CUENTA");
        botonCambiarCuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarCuenta1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonCambiarCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 324, 184, 97));

        botonAtras1.setBackground(new java.awt.Color(185, 215, 234));
        botonAtras1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonAtras1.setForeground(new java.awt.Color(66, 120, 181));
        botonAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo/close.png"))); // NOI18N
        botonAtras1.setText("CERRAR");
        botonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtras1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 427, 184, 97));

        botonCalendario1.setBackground(new java.awt.Color(185, 215, 234));
        botonCalendario1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonCalendario1.setForeground(new java.awt.Color(66, 120, 181));
        botonCalendario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo/calendar.png"))); // NOI18N
        botonCalendario1.setText("CALENDARIO");
        botonCalendario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalendario1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonCalendario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 184, 97));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(118, 159, 205));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo/image (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 650, 140));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(118, 159, 205));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo/lista2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        btnjugartiki.setBackground(new java.awt.Color(185, 215, 234));
        btnjugartiki.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnjugartiki.setForeground(new java.awt.Color(66, 120, 181));
        btnjugartiki.setText("Jugar Triki");
        btnjugartiki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugartikiActionPerformed(evt);
            }
        });
        jPanel1.add(btnjugartiki, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 113, 37));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(118, 159, 205));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo/estudiantes.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(185, 215, 234));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(66, 120, 181));
        btnIniciar.setText("NUEVO CHAT");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, 40));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(118, 159, 205));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo/chat2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        Tabla.setBackground(new java.awt.Color(247, 251, 252));
        Tabla.setForeground(new java.awt.Color(118, 159, 205));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE"
            }
        ));
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 280, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuenta1ActionPerformed
        // TODO add your handling code here:
        Cuenta cuenta = new Cuenta();
        cuenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCuenta1ActionPerformed

    private void botonSesiones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSesiones1ActionPerformed
        // TODO add your handling code here:
        Sesiones ses = new Sesiones();
        ses.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonSesiones1ActionPerformed

    private void botonCambiarCuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarCuenta1ActionPerformed
        // TODO add your handling code here:
        PantallaInicio pantalla = new PantallaInicio();
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCambiarCuenta1ActionPerformed

    private void botonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtras1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botonAtras1ActionPerformed

    private void botonCalendario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalendario1ActionPerformed
        // TODO add your handling code here:
        Calendario cal = new Calendario();
        cal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCalendario1ActionPerformed

    private void btnjugartikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugartikiActionPerformed
        // TODO add your handling code here:
        TrikiVisual trikiv = new TrikiVisual();
        trikiv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnjugartikiActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        PrincipalView pv = new PrincipalView();
        //pv.setVisible(true);
        pv.server = new Servidor(6000);
        Thread t = new Thread(pv.server);
        t.start();

        ServidorView sv = new ServidorView();
        //sv.setVisible(true);

        pv.server.addObserver(sv);
        pv.server.setVistaServidor(sv);

        ClienteView cv = new ClienteView();

        pv.server.addObserver(cv);
        cv.setVisible(true);


    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton botonAtras1;
    private javax.swing.JButton botonCalendario1;
    private javax.swing.JButton botonCambiarCuenta1;
    private javax.swing.JButton botonCuenta1;
    private javax.swing.JButton botonSesiones1;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnjugartiki;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
