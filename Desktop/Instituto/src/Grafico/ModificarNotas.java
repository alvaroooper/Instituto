/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import BaseDatos.DAOInstituto2;
import ClasesBase.Ciclo;
import ClasesBase.Instituto;
import ClasesBase.Modulo;
import ClasesBase.Nota;
import Usuarios.Alumno;
import Usuarios.Profesor;
import Usuarios.Usuario;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Marcos
 */
public class ModificarNotas extends javax.swing.JFrame {

    Profesor prof;
    Instituto i;
    DefaultTableModel tabla;
    String cabecera[] = {"Alumnos", "DNI"};
    String cabeceranNotas[] = {"Primera", "Segunda", "Tercera", "Final"};

    /**
     * Creates new form ModificarNotas
     */
    public ModificarNotas(java.awt.Frame parent, boolean modal, Profesor prof, Instituto i) {
        initComponents();
        this.prof = prof;
        this.i = i;
        llenar();
        this.setBackground(Color.black);
        this.setForeground(Color.white);
        jPanel2.setVisible(false);
    }

    private void llenar() {

        for (Modulo m : prof.getAsignaturasDadas()) {
            modulos.addItem(m.toString());

        }

    }

    private ModificarNotas() {
        initComponents();
    }

    class jPanelGardient extends JPanel {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(221, 0, 255);
            Color color2 = new Color(255, 162, 0);
            GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
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

        jPanel1 =   new jPanelGardient();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        modulos = new javax.swing.JComboBox<>();
        modificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nota1 = new javax.swing.JTextField();
        nota2 = new javax.swing.JTextField();
        nota3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        notaAlum = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAlumnos.setBackground(new java.awt.Color(0, 0, 0));
        tablaAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "DNI"
            }
        ));
        tablaAlumnos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 364, 133));

        modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulosActionPerformed(evt);
            }
        });
        jPanel1.add(modulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 261, 120, -1));

        modificar.setText("Cambiar nota");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 324, -1, -1));

        nota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota1ActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cambiar notas a: ");

        notaAlum.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(notaAlum))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGap(26, 26, 26)))
                .addGap(23, 23, 23)
                .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(notaAlum))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 280, 220));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificar Notas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(41, 41, 41))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1308, -1));

        tablaNotas.setBackground(new java.awt.Color(0, 0, 0));
        tablaNotas.setForeground(new java.awt.Color(255, 255, 255));
        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Primera", "Segunda", "Tercera", "FINAL"
            }
        ));
        tablaNotas.setGridColor(new java.awt.Color(0, 0, 0));
        tablaNotas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tablaNotas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 380, 137));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 410, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void modulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulosActionPerformed
        String itemSeleccionado = modulos.getSelectedItem().toString();//Recogemos el item seleccionado en el desplegable de ordenar
        tabla = new DefaultTableModel(i.getAlumnosAsignatura(itemSeleccionado), cabecera);
        tablaAlumnos.setModel(tabla);
    }//GEN-LAST:event_modulosActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        String itemSeleccionado = modulos.getSelectedItem().toString();
        int alumnoSeleccionado = tablaAlumnos.getSelectedRow();
        String nombreAlumno = i.getMombreAlumnosAsignatura(itemSeleccionado, alumnoSeleccionado);
        System.out.println(nombreAlumno);
        notaAlum.setText(nombreAlumno);
        jPanel2.setVisible(true);


    }//GEN-LAST:event_modificarActionPerformed

    private void tablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosMouseClicked
        // TODO add your handling code here:
        String itemSeleccionado = modulos.getSelectedItem().toString();
        int alumnoSeleccionado = tablaAlumnos.getSelectedRow();
        String nombreAlumno = i.getMombreAlumnosAsignatura(itemSeleccionado, alumnoSeleccionado);

        tabla = new DefaultTableModel(i.getDos(nombreAlumno, itemSeleccionado), cabeceranNotas);
        tablaNotas.setModel(tabla);
    }//GEN-LAST:event_tablaAlumnosMouseClicked

    private void nota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String itemSeleccionado = modulos.getSelectedItem().toString();
        int alumnoSeleccionado = tablaAlumnos.getSelectedRow();
        String nombreAlumno = i.getMombreAlumnosAsignatura(itemSeleccionado, alumnoSeleccionado);
        System.out.println("ItemSelecionado: " + itemSeleccionado);
        System.out.println("alumnoSelecionado: " + alumnoSeleccionado);
        System.out.println("nombreAlumno: " + nombreAlumno);

        System.out.println(nota1.getText());
        System.out.println(nota2.getText());
        System.out.println(nota3.getText());
        jPanel2.setVisible(false);
        DAOInstituto2.instancia().modificarNotas(nombreAlumno, nota1.getText(), itemSeleccionado);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificar;
    private javax.swing.JComboBox<Object> modulos;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField nota3;
    private javax.swing.JLabel notaAlum;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTable tablaNotas;
    // End of variables declaration//GEN-END:variables

}
