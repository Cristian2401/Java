/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;


import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Family
 */


public class form_opciones extends javax.swing.JFrame {

 String tipo_menu;

form_agendamiento form_agendamiento;
form_agregar_eliminar_modificar form_agregar_eliminar_modificar = new form_agregar_eliminar_modificar();

public void llenado_agregar(){
 if (tipo_menu.equals("agendamientos")){
 
 

 form_agendamiento.jLabel1.setText("Agendamientos");
 form_agendamiento.jLabel2.setText("Fecha");
form_agendamiento.jLabel3.setText("Hora");
form_agendamiento.jLabel4.setText("Rut Participante");
form_agendamiento.jLabel5.setText("Nombre");
form_agendamiento.jLabel6.setText("Personal");
form_agendamiento.jDateChooser2.setDate(Date.from(Instant.now()));
form_agendamiento.jComboBox1.addItem("Hora");
form_agendamiento.jTextField1.setText("");
form_agendamiento.jTextField2.setText("");
form_agendamiento.jComboBox2.setVisible(false);
form_agendamiento.jComboBox3.addItem("Nombre");
form_agendamiento.jButton1.setText("Agregar");

 form_agendamiento.setVisible(true);
 }
 
 if(tipo_menu.equals("horarios")){
   form_agregar_eliminar_modificar.jLabel1.setText("Horarios");
   form_agregar_eliminar_modificar.jLabel2.setText("Nuevo Horario");
   form_agregar_eliminar_modificar.jLabel3.setVisible(false);
   form_agregar_eliminar_modificar.jTextField1.setText("");
   form_agregar_eliminar_modificar.jTextField2.setVisible(false);
   form_agregar_eliminar_modificar.jButton1.setText("Agregar");
   form_agregar_eliminar_modificar.jComboBox1.setVisible(false);
   form_agregar_eliminar_modificar.jComboBox2.setVisible(false);
 form_agregar_eliminar_modificar.setVisible(true);      
 }   
  if(tipo_menu.equals("permisos")){
   form_agregar_eliminar_modificar.jLabel1.setText("Permisos");
   form_agregar_eliminar_modificar.jLabel2.setText("Trabajador");
   form_agregar_eliminar_modificar.jLabel3.setText("Cantidad de dias");
   form_agregar_eliminar_modificar.jTextField1.setText("");
   form_agregar_eliminar_modificar.jTextField1.setVisible(false);
   form_agregar_eliminar_modificar.jButton1.setText("Agregar");
   form_agregar_eliminar_modificar.jComboBox1.addItem("Trabajador");
   form_agregar_eliminar_modificar.jComboBox2.addItem("Fecha");
 form_agregar_eliminar_modificar.setVisible(true);         
         
         }
 if(tipo_menu.equals("personal")){
   form_agregar_eliminar_modificar.jLabel1.setText("Personal");
   form_agregar_eliminar_modificar.jLabel2.setText("Ingrese Rut");
   form_agregar_eliminar_modificar.jLabel3.setText("Nombre");
   form_agregar_eliminar_modificar.jTextField1.setText("");
   form_agregar_eliminar_modificar.jTextField2.setText("");
   form_agregar_eliminar_modificar.jButton1.setText("Agregar");
   form_agregar_eliminar_modificar.jComboBox1.setVisible(false);
   form_agregar_eliminar_modificar.jComboBox2.setVisible(false);
 form_agregar_eliminar_modificar.setVisible(true);         
         
         }
 }
 public void llenado_eliminar(){
     if (tipo_menu.equals("agendamientos")){
 form_agendamiento.jLabel1.setText("Agendamientos");
 form_agendamiento.jLabel2.setText("Fecha");
form_agendamiento.jLabel3.setText("Hora");
form_agendamiento.jLabel4.setText("Rut Participante");
form_agendamiento.jLabel5.setText("Nombre");
form_agendamiento.jLabel6.setText("Personal");
form_agendamiento.jDateChooser2.setDate(Date.from(Instant.now()));
form_agendamiento.jComboBox1.addItem("Hora");
form_agendamiento.jTextField1.setVisible(false);
form_agendamiento.jTextField2.setEnabled(false);
form_agendamiento.jTextField2.setText("Nombre");
form_agendamiento.jComboBox2.addItem("rut participante");
form_agendamiento.jComboBox3.setEnabled(false);
form_agendamiento.jComboBox3.addItem("Nombre");
form_agendamiento.jButton1.setText("Eliminar");

 form_agendamiento.setVisible(true);
 }
 if(tipo_menu.equals("horarios")){
   form_agregar_eliminar_modificar.jLabel1.setText("Horarios");
   form_agregar_eliminar_modificar.jLabel2.setText("Horario");
   form_agregar_eliminar_modificar.jLabel3.setVisible(false);
   form_agregar_eliminar_modificar.jTextField1.setVisible(false);
   form_agregar_eliminar_modificar.jTextField2.setVisible(false);
   form_agregar_eliminar_modificar.jButton1.setText("Eliminar");
   form_agregar_eliminar_modificar.jComboBox1.addItem("Horarios");
   form_agregar_eliminar_modificar.jComboBox2.setVisible(false);
 form_agregar_eliminar_modificar.setVisible(true);      
 }   
  if(tipo_menu.equals("permisos")){
   form_agregar_eliminar_modificar.jLabel1.setText("Permisos");
   form_agregar_eliminar_modificar.jLabel2.setText("Trabajador");
   form_agregar_eliminar_modificar.jLabel3.setText("Cantidad de dias");
   form_agregar_eliminar_modificar.jTextField1.setVisible(false);
   form_agregar_eliminar_modificar.jTextField2.setText("");
   form_agregar_eliminar_modificar.jButton1.setText("Eliminar");
   form_agregar_eliminar_modificar.jComboBox1.addItem("Trabajador");
   form_agregar_eliminar_modificar.jComboBox2.addItem("Permiso");
 form_agregar_eliminar_modificar.setVisible(true);         
         
         }
 if(tipo_menu.equals("personal")){
   form_agregar_eliminar_modificar.jLabel1.setText("Personal");
   form_agregar_eliminar_modificar.jLabel2.setText("Rut");
   form_agregar_eliminar_modificar.jLabel3.setText("Nombre");
   form_agregar_eliminar_modificar.jTextField1.setVisible(false);
   form_agregar_eliminar_modificar.jTextField2.setText("");
   form_agregar_eliminar_modificar.jTextField2.setEnabled(false);
   form_agregar_eliminar_modificar.jButton1.setText("Eliminar");
   form_agregar_eliminar_modificar.jComboBox1.addItem("rut");
   form_agregar_eliminar_modificar.jComboBox2.setVisible(false);
 form_agregar_eliminar_modificar.setVisible(true);         
         
         }
 }
 public void llenado_modificar(){
      if (tipo_menu.equals("agendamientos")){
 form_agendamiento.jLabel1.setText("Agendamientos");
 form_agendamiento.jLabel2.setText("Fecha");
form_agendamiento.jLabel3.setText("Hora");
form_agendamiento.jLabel4.setText("Rut Participante");
form_agendamiento.jLabel5.setText("Nombre");
form_agendamiento.jLabel6.setText("Personal");
form_agendamiento.jDateChooser2.setDate(Date.from(Instant.now()));
form_agendamiento.jComboBox1.addItem("Hora");
form_agendamiento.jTextField1.setVisible(false);
form_agendamiento.jTextField2.setText("Nombre");
form_agendamiento.jComboBox2.addItem("Rut");
form_agendamiento.jComboBox3.addItem("Nombre");
form_agendamiento.jButton1.setText("Modificar");

 form_agendamiento.setVisible(true);
 }
 if(tipo_menu.equals("horarios")){
   form_agregar_eliminar_modificar.jLabel1.setText("Horarios");
   form_agregar_eliminar_modificar.jLabel2.setText("Horario");
   form_agregar_eliminar_modificar.jLabel3.setText("Nuevo Horario");
   form_agregar_eliminar_modificar.jTextField1.setVisible(false);
   form_agregar_eliminar_modificar.jTextField2.setText("");
   form_agregar_eliminar_modificar.jButton1.setText("Modificar");
   form_agregar_eliminar_modificar.jComboBox1.addItem("Horarios");
   form_agregar_eliminar_modificar.jComboBox2.setVisible(false);
 form_agregar_eliminar_modificar.setVisible(true);      
 }   
  if(tipo_menu.equals("permisos")){
   form_agregar_eliminar_modificar.jLabel1.setText("Permisos");
   form_agregar_eliminar_modificar.jLabel2.setText("Trabajador");
   form_agregar_eliminar_modificar.jLabel3.setText("Cantidad de dias");
   form_agregar_eliminar_modificar.jTextField1.setVisible(false);
   form_agregar_eliminar_modificar.jTextField2.setText("");
   form_agregar_eliminar_modificar.jButton1.setText("Modificar");
   form_agregar_eliminar_modificar.jComboBox1.addItem("Trabajador");
   form_agregar_eliminar_modificar.jComboBox2.addItem("Permiso");
 form_agregar_eliminar_modificar.setVisible(true);         
         
         }
 if(tipo_menu.equals("personal")){
   form_agregar_eliminar_modificar.jLabel1.setText("Personal");
   form_agregar_eliminar_modificar.jLabel2.setText("Rut");
   form_agregar_eliminar_modificar.jLabel3.setText("Nombre");
   form_agregar_eliminar_modificar.jTextField1.setText("");
   form_agregar_eliminar_modificar.jTextField2.setText("");
   form_agregar_eliminar_modificar.jButton1.setText("Modificar");
   form_agregar_eliminar_modificar.jComboBox1.addItem("rut");
   form_agregar_eliminar_modificar.jComboBox2.setVisible(false);
 form_agregar_eliminar_modificar.setVisible(true);         
         
         }
 }

public String getTipo_menu() {
        return tipo_menu;
    }

    public void setTipo_menu(String tipo_menu) {
        this.tipo_menu = tipo_menu;
    }
    
    /**
     * Creates new form form_opciones
     */
    public form_opciones() {
        this.form_agendamiento = new form_agendamiento();
        initComponents();
        
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(tipo_menu);
        llenado_agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       llenado_eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    llenado_modificar();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(form_opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
