/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author UPIIZ
 */
public class PrincipalGUI extends javax.swing.JFrame {
    private ArrayList<Persona> registros;

    /**
     * Creates new form PrincipalGUI
     */
    public PrincipalGUI() {
        initComponents();
        File fm=new File("Registro_medicos.txt");
        File fp=new File("Registro_pacientes.txt");
        if(fm.exists()){
            leerArchivo(fm);
        }else        if(fp.exists()){
            leerArchivo(fp);
        }else{
        registros = new ArrayList<Persona>();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAlumnos = new javax.swing.JMenuItem();
        menuDocentes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        subMenuAlumnos = new javax.swing.JMenuItem();
        subMenuDocentes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/Imagen_salud.jpg"))); // NOI18N

        jLabel2.setText("by FDMD");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hospital Villa Verde");

        jMenu1.setText("Archivo");

        menuAlumnos.setText("Médicos");
        menuAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(menuAlumnos);

        menuDocentes.setText("Pacientes");
        menuDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDocentesActionPerformed(evt);
            }
        });
        jMenu1.add(menuDocentes);

        jMenu2.setText("Ver Registros");

        subMenuAlumnos.setText("Médicos");
        subMenuAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAlumnosActionPerformed(evt);
            }
        });
        jMenu2.add(subMenuAlumnos);

        subMenuDocentes.setText("Pacientes");
        subMenuDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuDocentesActionPerformed(evt);
            }
        });
        jMenu2.add(subMenuDocentes);

        jMenu1.add(jMenu2);
        jMenu1.add(jSeparator1);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlumnosActionPerformed
        // TODO add your handling code here:
        PacienteGUI agui = new PacienteGUI();
        agui.setRegistros(registros); 
        this.dispose();
        agui.setVisible(true);
    }//GEN-LAST:event_menuAlumnosActionPerformed

    private void menuDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDocentesActionPerformed
        // TODO add your handling code here:
        MedicoGUI dgui = new MedicoGUI();
        dgui.setRegistros(registros);
        this.dispose();
        dgui.setVisible(true);
    }//GEN-LAST:event_menuDocentesActionPerformed

    private void subMenuDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuDocentesActionPerformed
        // TODO add your handling code here:
        RegistrosGUI rgui = new RegistrosGUI();
        rgui.leerArchivoMedicos();
        this.dispose();
        rgui.setVisible(true);
    }//GEN-LAST:event_subMenuDocentesActionPerformed

    private void subMenuAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAlumnosActionPerformed
        // TODO add your handling code here:
        RegistrosGUI rgui = new RegistrosGUI();
        rgui.leerArchivoPacientes();
        this.dispose();
        rgui.setVisible(true);
    }//GEN-LAST:event_subMenuAlumnosActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuAlumnos;
    private javax.swing.JMenuItem menuDocentes;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem subMenuAlumnos;
    private javax.swing.JMenuItem subMenuDocentes;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Persona> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Persona> registros) {
        this.registros = registros;
    }
    
 private void leerArchivo(File f) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            //f = new File("Registro_medicos.txt");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            DefaultListModel model = new DefaultListModel();
            registros = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
          
                
    }
}
