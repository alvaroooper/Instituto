/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import ClasesBase.Curso;
import ClasesBase.Instituto;
import ClasesBase.Modulo;
import Usuarios.Administrador;
import Usuarios.Alumno;
import Usuarios.Profesor;
import Usuarios.Usuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author MR.Pitiilin
 */
public class jManejarUsuarios extends javax.swing.JFrame {

    Instituto i;
    //Administrador adm;

    //tablas
    String cabeceraTodos[] = {"tipo", "Nombre", "Dni", "fecha nacimiento"};
    String cabeceraAlumnos[] = {"Nombre", "dni", "fecha nacimiento"};
    String cabeceraProfesores[] = {"Nombre", "dni", "fecha nacimiento"};

    DefaultTableModel tabla;

    public jManejarUsuarios() {

        initComponents();
        /*
        ArrayList<Alumno> alumnos = new ArrayList();
        ArrayList<Ciclo> ciclos = new ArrayList();
        ArrayList<Modulo> modulos = new ArrayList();
        ArrayList<Usuario> usuarios = new ArrayList();

        m = new Modulo("programacion", "1Daw", 3);
        modulos.add(m);

        c = new Ciclo(modulos, "DAW1", 1, 76);
        ciclos.add(c);

        u = new Alumno("daniel", "contra", "71177171E", new Date(), c);
        usuarios.add(u);
        alumnos.add(u);

        p = new Profesor("gero", "estilton", "101010F", new Date(), modulos, ciclos);
        profesores.add(p);
        usuarios.add(p);

        i = new Instituto(usuarios, ciclos, "camino", "plaza", "777777");
         */
    }

    public jManejarUsuarios(Instituto i) {
        initComponents();
        this.i = i;
        tabla = new DefaultTableModel(i.mostrarUsuarios(), cabeceraTodos);
        tablaUsuarios.setModel(tabla);
        //this.adm=adm;

        /*
        ArrayList<Profesor> profesores = new ArrayList();
        ArrayList<Alumno> alumnos = new ArrayList();
        ArrayList<Ciclo> ciclos = new ArrayList();
        ArrayList<Modulo> modulos = new ArrayList();
        ArrayList<Usuario> usuarios = new ArrayList();

        m = new Modulo("programacion", "1Daw", 3);
        modulos.add(m);

        c = new Ciclo(modulos, "DAW1", 1, 76);
        ciclos.add(c);

        u = new Alumno("daniel", "contra", "71177171E", new Date(), c);
        usuarios.add(u);
        alumnos.add(u);

        p = new Profesor("gero", "estilton", "101010F", new Date(), modulos, ciclos);
        profesores.add(p);
        usuarios.add(p);

        i = new Instituto(usuarios, ciclos, "camino", "plaza", "777777");
         */
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new jPanelGardient();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonAlumnos = new javax.swing.JRadioButton();
        jButtonProfesores = new javax.swing.JRadioButton();
        jButtonTodos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jModificar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jAnnadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 103, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manejar Usuarios");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(394, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(331, 331, 331)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-11, -8, 1010, 100));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jButtonAlumnos.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jButtonAlumnos);
        jButtonAlumnos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButtonAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlumnos.setText("Alumnos");
        jButtonAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlumnosActionPerformed(evt);
            }
        });

        jButtonProfesores.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jButtonProfesores);
        jButtonProfesores.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButtonProfesores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProfesores.setText("Profesores");
        jButtonProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfesoresActionPerformed(evt);
            }
        });

        jButtonTodos.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jButtonTodos);
        jButtonTodos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButtonTodos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTodos.setSelected(true);
        jButtonTodos.setText("Todos");
        jButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButtonTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButtonProfesores)
                .addGap(36, 36, 36)
                .addComponent(jButtonAlumnos)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlumnos)
                    .addComponent(jButtonProfesores)
                    .addComponent(jButtonTodos))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        tablaUsuarios.setAutoCreateRowSorter(true);
        tablaUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        tablaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaUsuarios.setSelectionBackground(new java.awt.Color(255, 153, 51));
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 204, 825, 318));

        jModificar.setBackground(new java.awt.Color(0, 0, 0));
        jModificar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jModificar.setForeground(new java.awt.Color(255, 255, 255));
        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, -1, -1));

        jEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jEliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jEliminar.setText("Eliminar");
        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, -1, -1));

        jAnnadir.setText("Añadir");
        jAnnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnnadirActionPerformed(evt);
            }
        });
        jPanel1.add(jAnnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(985, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTodosActionPerformed
        // TODO add your handling code here:

        tabla = new DefaultTableModel(i.mostrarUsuarios(), cabeceraTodos);
        tablaUsuarios.setModel(tabla);


    }//GEN-LAST:event_jButtonTodosActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed

        Usuario usuario = i.buscarUsuario(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 1).toString());

        jAnnadirUsuario a = new jAnnadirUsuario(this, true);
        a.setInstituto(i);

        if (usuario instanceof Alumno) {

            Alumno alumno = (Alumno) usuario;
            a.mostrarDatosAlumno(alumno);
        }else if (usuario instanceof Profesor){
            Profesor profesor = (Profesor) usuario;
            
            
        }

        this.setVisible(false);
        a.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jModificarActionPerformed

    private void jButtonAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlumnosActionPerformed

        tabla = new DefaultTableModel(i.mostrarAlumnos(), cabeceraAlumnos);
        tablaUsuarios.setModel(tabla);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlumnosActionPerformed

    private void jButtonProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfesoresActionPerformed

        tabla = new DefaultTableModel(i.mostrarProfesores(), cabeceraProfesores);
        tablaUsuarios.setModel(tabla);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProfesoresActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnnadirActionPerformed
        // TODO add your handling code here:
        jAnnadirUsuario a = new jAnnadirUsuario(this, true);
        a.setInstituto(i);
        this.setVisible(false);
        a.setVisible(true);

    }//GEN-LAST:event_jAnnadirActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(jManejarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jManejarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jManejarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jManejarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jManejarUsuarios().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jAnnadir;
    private javax.swing.JRadioButton jButtonAlumnos;
    private javax.swing.JRadioButton jButtonProfesores;
    private javax.swing.JRadioButton jButtonTodos;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
