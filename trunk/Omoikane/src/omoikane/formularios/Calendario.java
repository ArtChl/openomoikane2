/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Calendario.java
 *
 * Created on 11/08/2009, 02:34:34 PM
 */

package omoikane.formularios;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
/**
 *
 * @author DP Roberts
 */
public class Calendario extends javax.swing.JInternalFrame {

    BufferedImage     fondo;
    Component invocador;

    /** Creates new form Calendario */
    public Calendario(Component invk) {
        initComponents();
        invocador = invk;
        jxmvCalendario.getInputMap().remove(KeyStroke.getKeyStroke("ESCAPE"));

        this.setOpaque(false);
        ((JPanel)this.getContentPane()).setOpaque(false);
        this.getLayeredPane().setOpaque(false);
        this.getRootPane().setOpaque(false);
        this.generarFondo(this);
        omoikane.sistema.Herramientas.centrarVentana(this);
        this.setVisible(true);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaCalendario = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jxmvCalendario = new org.jdesktop.swingx.JXMonthView();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        etiquetaCalendario.setFont(new java.awt.Font("Arial", 1, 36));
        etiquetaCalendario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCalendario.setText("Calendario");

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/back.png"))); // NOI18N
        btnCerrar.setText("Cerrar[ESC]");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jxmvCalendario.setBackground(new java.awt.Color(0, 0, 51));
        jxmvCalendario.setForeground(new java.awt.Color(255, 255, 255));
        jxmvCalendario.setAntialiased(true);
        jxmvCalendario.setDaysOfTheWeekForeground(new java.awt.Color(204, 204, 204));
        jxmvCalendario.setFont(new java.awt.Font("Arial", 0, 24));
        jxmvCalendario.setMonthStringBackground(new java.awt.Color(0, 0, 153));
        jxmvCalendario.setMonthStringForeground(new java.awt.Color(204, 204, 204));
        jxmvCalendario.setSelectedBackground(new java.awt.Color(51, 0, 153));
        jxmvCalendario.setTraversable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jxmvCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCalendario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaCalendario)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jxmvCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
}//GEN-LAST:event_btnCerrarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // NOTA: Función manejada en principal.Calendario (groovy)
    }//GEN-LAST:event_formInternalFrameClosed

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
      g2d.setColor(new Color(55,55,255,165));
      g2d.fillRect(0,0,areaDibujo.width,areaDibujo.height);
      fondo = tmp;

    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel etiquetaCalendario;
    private org.jdesktop.swingx.JXMonthView jxmvCalendario;
    // End of variables declaration//GEN-END:variables

}