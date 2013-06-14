/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Articulo.java
 *
 * Created on 22/08/2008, 07:40:21 PM
 */

package omoikane.formularios;

import java.util.*;
import java.awt.image.*;
import java.awt.*;
import javax.swing.*;
import omoikane.sistema.*;
import java.awt.event.*;

/**
 *
 * @author Octavio
 */
public class CajaDetalles extends javax.swing.JInternalFrame {

    BufferedImage fondo;
    /** Creates new form Articulo */
    public CajaDetalles() {
        initComponents();
        //Instrucciones para el funcionamiento del fondo semistransparente
        this.setOpaque(false);
        ((JPanel)this.getContentPane()).setOpaque(false);
        this.getLayeredPane().setOpaque(false);
        this.getRootPane().setOpaque(false);
        this.generarFondo(this);

        Herramientas.centrarVentana(this);

        Set newKeys = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS));
        newKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0));
        setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, newKeys);

        newKeys = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        newKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, newKeys);
       
    }

        

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdCaja = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtUModificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCreado = new javax.swing.JTextField();

        setTitle("Caja");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html><head><style type='text/css'>body { font-family: 'Roboto Thin'; font-size: 28px; }</style></head>\n<body>\nCaja\n</body></html>");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id Caja:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripcion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtIdCaja.setEditable(false);
        getContentPane().add(txtIdCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 280, -1));

        txtDescripcion.setEditable(false);
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 280, -1));

        txtUModificacion.setEditable(false);
        getContentPane().add(txtUModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 280, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html>Última<br>Modificación:</html>");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        btnModificar.setText("Modificar [F6]");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        btnGuardar.setText("Guardar [F6]");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        btnCerrar.setText("Cerrar [ESC]");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 10, 0));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Creacion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtCreado.setEditable(false);
        getContentPane().add(txtCreado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Caja.guardar(this);
}//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_btnCerrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        omoikane.principal.Caja.modificar(this);
}//GEN-LAST:event_btnModificarActionPerformed


   public void setEditable(boolean editable)
    {
        this.txtDescripcion.setEditable(editable);
    }


  public void setModoNuevo()
    {
        setEditable(true);
        this.btnModificar.setVisible(false);
    }

      public void setModoDetalles()
    {
        setEditable(false);
        this.btnGuardar.setVisible(false);
        this.btnModificar.setVisible(false);

    }
    public void setModoModificar()
    {
        setEditable(true);
        this.btnModificar.setVisible(true);
        this.btnGuardar.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCreado;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdCaja;
    private javax.swing.JTextField txtUModificacion;
    // End of variables declaration//GEN-END:variables


    public String getTxtIDCaja() {
        return txtIdCaja.getText();
    }

    public String getTxtDescripcion() {
        return txtDescripcion.getText();
    }

    public void setTxtIDCaja(String txtIDCaja)
    {
        this.txtIdCaja.setText(txtIDCaja);
    }

    public void setTxtDescripcion(String txtDescripcion)
    {
        this.txtDescripcion.setText(txtDescripcion);
    }

        public void setTxtCreado(String txt)
    {
        txtCreado.setText(txt);
    }

        public void setTxtUModificacion(String txt)
    {
        txtUModificacion.setText(txt);
    }

    public void paintComponent(Graphics g)
    {
      Graphics2D g2d = (Graphics2D) g;
      g2d.drawImage(fondo, 0, 0, null);

    }
    public void generarFondo(Component componente)
    {
      Rectangle areaDibujo = this.getBounds();
      BufferedImage tmp;
      GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();

      tmp = gc.createCompatibleImage(areaDibujo.width, areaDibujo.height,BufferedImage.TRANSLUCENT);
      Graphics2D g2d = (Graphics2D) tmp.getGraphics();
      g2d.setColor(new Color(0,0,0,165));
      g2d.fillRect(0,0,areaDibujo.width,areaDibujo.height);
      fondo = tmp;
    }
}