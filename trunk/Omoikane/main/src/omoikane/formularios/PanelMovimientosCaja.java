/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelMovimientosCaja.java
 *
 * Created on 15/05/2009, 01:08:13 PM
 */

package omoikane.formularios;

/**
 *
 * @author SYSTEM
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class PanelMovimientosCaja extends javax.swing.JPanel {

    BufferedImage          fondo;
    
    /** Creates new form PanelMovimientosCaja */
    public PanelMovimientosCaja() {
        initComponents();
        this.setOpaque(false);
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
        btnCerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRetiros = new javax.swing.JTextField();
        txtVentas = new javax.swing.JTextField();
        txtNVentas = new javax.swing.JTextField();
        txtDepositos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnRetiro = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setMinimumSize(new java.awt.Dimension(409, 329));
        setNextFocusableComponent(txtImporte);
        setOpaque(false);
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html><head><style type='text/css'>body { font-family: 'Roboto Thin'; font-size: 18px; }</style></head>\n<body>\nResumen de movimientos\n</body></html>");
        add(jLabel2);
        jLabel2.setBounds(10, 10, 380, 30);

        btnCerrar.setText("Cerrar [Enter]");
        btnCerrar.setFocusable(false);
        add(btnCerrar);
        btnCerrar.setBounds(270, 283, 120, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ventas:");
        add(jLabel3);
        jLabel3.setBounds(10, 50, 50, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("# Ventas:");
        add(jLabel4);
        jLabel4.setBounds(10, 90, 70, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Depósitos:");
        add(jLabel5);
        jLabel5.setBounds(210, 50, 60, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Retiros:");
        add(jLabel6);
        jLabel6.setBounds(210, 90, 60, 30);

        txtRetiros.setEditable(false);
        txtRetiros.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtRetiros.setFocusable(false);
        add(txtRetiros);
        txtRetiros.setBounds(270, 90, 120, 30);

        txtVentas.setEditable(false);
        txtVentas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtVentas.setFocusable(false);
        add(txtVentas);
        txtVentas.setBounds(70, 50, 120, 30);

        txtNVentas.setEditable(false);
        txtNVentas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNVentas.setFocusable(false);
        add(txtNVentas);
        txtNVentas.setBounds(70, 90, 120, 30);

        txtDepositos.setEditable(false);
        txtDepositos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtDepositos.setFocusable(false);
        add(txtDepositos);
        txtDepositos.setBounds(270, 50, 120, 30);
        add(jSeparator1);
        jSeparator1.setBounds(10, 40, 380, 10);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html><head><style type='text/css'>body { font-family: 'Roboto Thin'; font-size: 18px; }</style></head>\n<body>\nDepósitos y retiros\n</body></html>");
        add(jLabel7);
        jLabel7.setBounds(10, 140, 380, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Importe:");
        add(jLabel8);
        jLabel8.setBounds(40, 180, 60, 30);

        txtImporte.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtImporte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtImporteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtImporteFocusLost(evt);
            }
        });
        add(txtImporte);
        txtImporte.setBounds(40, 210, 170, 30);
        add(jSeparator2);
        jSeparator2.setBounds(10, 170, 380, 10);

        btnRetiro.setText("Retiro [F6]");
        btnRetiro.setFocusable(false);
        add(btnRetiro);
        btnRetiro.setBounds(230, 223, 130, 30);

        btnDeposito.setText("Depósito [F5]");
        btnDeposito.setFocusable(false);
        add(btnDeposito);
        btnDeposito.setBounds(230, 183, 130, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void txtImporteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtImporteFocusGained
        // TODO add your handling code here:
        evt.getComponent().setBackground(new Color(150,150,255));
    }//GEN-LAST:event_txtImporteFocusGained

    private void txtImporteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtImporteFocusLost
        // TODO add your handling code here:
        evt.getComponent().setBackground(null);
    }//GEN-LAST:event_txtImporteFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDepositos;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNVentas;
    private javax.swing.JTextField txtRetiros;
    private javax.swing.JTextField txtVentas;
    // End of variables declaration//GEN-END:variables

}
