/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.clase_conexion;
import clases.clase_consultas;
import clases.clase_horario;
import clases.clase_personal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Family
 */
public class frm_eliminar_agenda extends javax.swing.JFrame {
String fecha;
String nombre_perso;
String hora;
String año;
String mes;
String dia;
String id_hora;
       
  clase_conexion cc= new clase_conexion();      
   clase_horario ch;
    /**
     * Creates new form frm_eliminar_agenda
     */
    public frm_eliminar_agenda() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbx_personal = new javax.swing.JComboBox<clase_personal>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbx_hora = new javax.swing.JComboBox();
        bt_agendar = new javax.swing.JButton();
        txt_rut = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        calendario_eliminar = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Eliminar Agendamiento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setText("Hora:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        cbx_personal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_personalItemStateChanged(evt);
            }
        });
        cbx_personal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_personalMouseClicked(evt);
            }
        });
        cbx_personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_personalActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 210, -1));

        jLabel5.setText("Rut Participante");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel7.setText("Seleccionar Personal");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        cbx_hora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_horaItemStateChanged(evt);
            }
        });
        cbx_hora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_horaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbx_horaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_horaMousePressed(evt);
            }
        });
        cbx_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_horaActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, -1));

        bt_agendar.setText("Agendar");
        bt_agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agendarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_agendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));
        jPanel1.add(txt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 120, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        calendario_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendario_eliminarMouseClicked(evt);
            }
        });
        jPanel1.add(calendario_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 70, 100, -1));
        calendario_eliminar.getDateEditor().addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt){

            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_personalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_personalItemStateChanged
        

    }//GEN-LAST:event_cbx_personalItemStateChanged

    private void cbx_personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_personalActionPerformed
        
    }//GEN-LAST:event_cbx_personalActionPerformed

    private void cbx_horaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_horaItemStateChanged
       //cargar_horario();
    }//GEN-LAST:event_cbx_horaItemStateChanged

    private void bt_agendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agendarActionPerformed

        

     
    }//GEN-LAST:event_bt_agendarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clase_consultas consulta=new clase_consultas();
        ch=(clase_horario) cbx_hora.getSelectedItem(); 
        //consulta.setRut_participante(this.txt_rut.getText());
        consulta.buscar_agenda();
        //this.fecha=consulta.getId_fecha();
        //this.id_hora=ch.getId();
        cbx_hora.removeAllItems();
        cbx_personal.removeAllItems();
        this.hora=ch.getHorar_hora();
        //this.nombre_perso=consulta.getNombre_perso();
        try {    
            
            SimpleDateFormat formato =new SimpleDateFormat("dd/MM/yyyy");
            Date fechaDate =formato.parse(this.fecha);
            calendario_eliminar.setDate(fechaDate);
            System.out.println(hora);
            this.cbx_personal.addItem(new clase_personal(null, nombre_perso));
            this.cbx_hora.addItem(this.hora);
            
            this.nombre_perso="";
            this.hora="";
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbx_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_horaActionPerformed
        //cargar_horario();
    }//GEN-LAST:event_cbx_horaActionPerformed

    private void cbx_horaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_horaMouseClicked
        cargar_horario();
    }//GEN-LAST:event_cbx_horaMouseClicked

    private void cbx_horaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_horaMousePressed
        
    }//GEN-LAST:event_cbx_horaMousePressed

    private void cbx_horaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_horaMouseEntered
        
    }//GEN-LAST:event_cbx_horaMouseEntered

    private void cbx_personalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_personalMouseClicked
       cargar_personal();
    }//GEN-LAST:event_cbx_personalMouseClicked

    private void calendario_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendario_eliminarMouseClicked
        cargar_horario();
cargar_personal();
    }//GEN-LAST:event_calendario_eliminarMouseClicked

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
            java.util.logging.Logger.getLogger(frm_eliminar_agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_eliminar_agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_eliminar_agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_eliminar_agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_eliminar_agenda().setVisible(true);
            }
        });
    }
    
    
    
    public void cargar_horario(){        
        try {
            Connection c= cc.conectar();
            Statement st= c.createStatement();
            
            ResultSet rs= st.executeQuery("SELECT * FROM horarios");
            DefaultComboBoxModel formato_cbx = new DefaultComboBoxModel();
            
            while (rs.next()) {
              formato_cbx.addElement(new clase_horario(rs.getString("id"), rs.getString("horar_hora")));
              
            }
            
            cbx_hora.setModel(formato_cbx);
            c.close();
            //capturar_hora();
        } catch (Exception e) {
            System.out.println(e);
        
        
     }  
        
        
        
     }
    
    public void cargar_personal(){
     
        try {
            Connection c= cc.conectar();
            Statement st= c.createStatement();
            
            ResultSet rs= st.executeQuery("SELECT * FROM personal "
                    + "WHERE perso_id  NOT IN(SELECT p.perso_id FROM agendamientos a, horarios_agendamientos h, personal_agendamientos p "
                    + "WHERE a.agend_fecha= '"+this.fecha+"' AND a.agend_id=h.agend_id AND h.id='"+this.id_hora+"' AND a.agend_id=p.agend_id)");
            DefaultComboBoxModel formato_cbx = new DefaultComboBoxModel();
            
            
            while (rs.next()) {
               
              formato_cbx.addElement(new clase_personal(rs.getString("perso_id"), rs.getString("perso_nombre")));
            }
            cbx_personal.setModel(formato_cbx);
            c.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agendar;
    private com.toedter.calendar.JDateChooser calendario_eliminar;
    public javax.swing.JComboBox cbx_hora;
    public javax.swing.JComboBox<clase_personal> cbx_personal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_rut;
    // End of variables declaration//GEN-END:variables
}