/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import BaseDatos.DAOInstituto2;
import ClasesBase.Curso;
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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        jPanel2 = new javax.swing.JPanel();
        nota1 = new javax.swing.JTextField();
        nota2 = new javax.swing.JTextField();
        nota3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        notaAlum = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        imprimierNotas = new javax.swing.JButton();
        panelNotas = new javax.swing.JPanel();
        jLabelN1 = new javax.swing.JLabel();
        jLabelN2 = new javax.swing.JLabel();
        jLabelN3 = new javax.swing.JLabel();
        modificarNota = new javax.swing.JButton();
        nomA = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelFinal = new javax.swing.JLabel();

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 380, 133));

        modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulosActionPerformed(evt);
            }
        });
        jPanel1.add(modulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 120, -1));

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

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(notaAlum)
                        .addGap(140, 140, 140))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(notaAlum))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cancelar))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 280, 140));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1308, -1));

        imprimierNotas.setText("Imprimir notas");
        jPanel1.add(imprimierNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        jLabelN1.setText("0");

        jLabelN2.setText("0");

        jLabelN3.setText("0");

        modificarNota.setText("Modificar Nota");
        modificarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarNotaActionPerformed(evt);
            }
        });

        nomA.setText("nombre");

        jLabel3.setText("Alumno: ");

        jLabelFinal.setText("0");

        javax.swing.GroupLayout panelNotasLayout = new javax.swing.GroupLayout(panelNotas);
        panelNotas.setLayout(panelNotasLayout);
        panelNotasLayout.setHorizontalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNotasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNotasLayout.createSequentialGroup()
                        .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modificarNota)
                            .addGroup(panelNotasLayout.createSequentialGroup()
                                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelN2)
                                    .addComponent(jLabel3))
                                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelNotasLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(nomA))
                                    .addGroup(panelNotasLayout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabelN3)))))
                        .addGap(16, 16, 16))
                    .addGroup(panelNotasLayout.createSequentialGroup()
                        .addComponent(jLabelN1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabelFinal)
                .addGap(28, 28, 28))
        );
        panelNotasLayout.setVerticalGroup(
            panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNotasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomA))
                .addGap(35, 35, 35)
                .addGroup(panelNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelN1)
                    .addComponent(jLabelN2)
                    .addComponent(jLabelN3)
                    .addComponent(jLabelFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(modificarNota)
                .addGap(16, 16, 16))
        );

        jPanel1.add(panelNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 180, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void modulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulosActionPerformed
        String itemSeleccionado = modulos.getSelectedItem().toString();//Recogemos el item seleccionado en el desplegable de ordenar
        tabla = new DefaultTableModel(i.getAlumnosAsignatura(itemSeleccionado), cabecera);
        tablaAlumnos.setModel(tabla);
        panelNotas.setVisible(false);
    }//GEN-LAST:event_modulosActionPerformed

    private void tablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosMouseClicked
        // TODO add your handling code here:

        String itemSeleccionado = modulos.getSelectedItem().toString();
        int alumnoSeleccionado = tablaAlumnos.getSelectedRow();
        String nombreAlumno = i.getMombreAlumnosAsignatura(itemSeleccionado, alumnoSeleccionado);
        //System.out.println(nombreAlumno);
        panelNotas.setVisible(true);
        try {
            jLabelN1.setText(String.valueOf(0));
            jLabelN2.setText(String.valueOf(0));
            jLabelN3.setText(String.valueOf(0));

            nomA.setText(nombreAlumno);
            jLabelN1.setText(String.valueOf(i.buscarAlumno(nombreAlumno).getNotas().get(0).getNota()));
            jLabelN2.setText(String.valueOf(i.buscarAlumno(nombreAlumno).getNotas().get(1).getNota()));
            jLabelN3.setText(String.valueOf(i.buscarAlumno(nombreAlumno).getNotas().get(2).getNota()));
            jLabelFinal.setText(String.valueOf(0));

        } catch (NullPointerException a) {
            System.out.println(a);

            //Esta null pointer no la tratamos ya que puede dar si un usuario no tiene todas las notas
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Falta Alguna nota");

        }

    }//GEN-LAST:event_tablaAlumnosMouseClicked

    private void nota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String itemSeleccionado = modulos.getSelectedItem().toString();
        int alumnoSeleccionado = tablaAlumnos.getSelectedRow();
        String nombreAlumno = i.getMombreAlumnosAsignatura(itemSeleccionado, alumnoSeleccionado);

        DAOInstituto2.instancia().borrarNotas(nombreAlumno);
        i.borrarNotas(nombreAlumno, itemSeleccionado);

        try {
            DAOInstituto2.instancia().modificarNotas(nombreAlumno, nota1.getText(), itemSeleccionado, i.getNombre());
            DAOInstituto2.instancia().modificarNotas(nombreAlumno, nota2.getText(), itemSeleccionado, i.getNombre());
            DAOInstituto2.instancia().modificarNotas(nombreAlumno, nota3.getText(), itemSeleccionado, i.getNombre());

            Nota n1 = new Nota(itemSeleccionado, Integer.parseInt(nota1.getText()));
            Nota n2 = new Nota(itemSeleccionado, Integer.parseInt(nota2.getText()));
            Nota n3 = new Nota(itemSeleccionado, Integer.parseInt(nota3.getText()));

            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            i.ModificarNotas(itemSeleccionado, nombreAlumno, n1, n2, n3);

        } catch (SQLException ex) {

            System.out.println("Error al actualizar las notas");

        }

        jPanel2.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void modificarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarNotaActionPerformed
        // TODO add your handling code here:
        String itemSeleccionado = modulos.getSelectedItem().toString();
        int alumnoSeleccionado = tablaAlumnos.getSelectedRow();
        String nombreAlumno = i.getMombreAlumnosAsignatura(itemSeleccionado, alumnoSeleccionado);
        //System.out.println(nombreAlumno);
        notaAlum.setText(nombreAlumno);

        try {
            nota1.setText(String.valueOf(0));
            nota2.setText(String.valueOf(0));
            nota3.setText(String.valueOf(0));

            nota1.setText(String.valueOf(i.buscarAlumno(nombreAlumno).getNotas().get(0).getNota()));
            nota2.setText(String.valueOf(i.buscarAlumno(nombreAlumno).getNotas().get(1).getNota()));
            nota3.setText(String.valueOf(i.buscarAlumno(nombreAlumno).getNotas().get(2).getNota()));

        } catch (NullPointerException a) {

            //Esta null pointer no la tratamos ya que puede dar si un usuario no tiene todas las notas
        } catch (IndexOutOfBoundsException e) {

        }
        jPanel2.setVisible(true);


    }//GEN-LAST:event_modificarNotaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        nota1.setText(String.valueOf(0));
        nota2.setText(String.valueOf(0));
        nota3.setText(String.valueOf(0));
    }//GEN-LAST:event_cancelarActionPerformed

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
    private javax.swing.JButton cancelar;
    private javax.swing.JButton imprimierNotas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFinal;
    private javax.swing.JLabel jLabelN1;
    private javax.swing.JLabel jLabelN2;
    private javax.swing.JLabel jLabelN3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarNota;
    private javax.swing.JComboBox<Object> modulos;
    private javax.swing.JLabel nomA;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField nota3;
    private javax.swing.JLabel notaAlum;
    private javax.swing.JPanel panelNotas;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables

}
