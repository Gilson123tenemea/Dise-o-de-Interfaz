
package Interfases;

import java.awt.BorderLayout;

public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PANELPRINCIPAL = new javax.swing.JPanel();
        carrerasBtn = new javax.swing.JButton();
        institutoBTN1 = new javax.swing.JButton();
        institutoBTN3 = new javax.swing.JButton();
        institutoBTN5 = new javax.swing.JButton();
        institutoBTN6 = new javax.swing.JButton();
        institutoBTN7 = new javax.swing.JButton();
        institutoBTN8 = new javax.swing.JButton();
        institutoBTN9 = new javax.swing.JButton();
        institutoBTN10 = new javax.swing.JButton();
        institutoBTN11 = new javax.swing.JButton();
        institutoBTN12 = new javax.swing.JButton();
        institutoBTN13 = new javax.swing.JButton();
        institutoBTN14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SISTEMA DE MATRICULAS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 480, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Periodo Academico 2024-2025");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/garantizar.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 140, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 100));

        PANELPRINCIPAL.setBackground(new java.awt.Color(255, 255, 255));
        PANELPRINCIPAL.setLayout(new java.awt.CardLayout());
        jPanel1.add(PANELPRINCIPAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 780, 500));

        carrerasBtn.setBackground(new java.awt.Color(255, 255, 255));
        carrerasBtn.setForeground(new java.awt.Color(0, 0, 0));
        carrerasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/profesional.png"))); // NOI18N
        carrerasBtn.setText("Carreras");
        carrerasBtn.setBorder(null);
        carrerasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrerasBtnActionPerformed(evt);
            }
        });
        jPanel1.add(carrerasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 30));

        institutoBTN1.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN1.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/institucion.png"))); // NOI18N
        institutoBTN1.setText("Institucion");
        institutoBTN1.setBorder(null);
        institutoBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN1ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, 30));

        institutoBTN3.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN3.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/institucion.png"))); // NOI18N
        institutoBTN3.setText("Area");
        institutoBTN3.setBorder(null);
        institutoBTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN3ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 170, -1));

        institutoBTN5.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN5.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/formacion.png"))); // NOI18N
        institutoBTN5.setText("Formacion");
        institutoBTN5.setBorder(null);
        institutoBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN5ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 170, -1));

        institutoBTN6.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN6.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/provincia_1.png"))); // NOI18N
        institutoBTN6.setText("Provincias");
        institutoBTN6.setBorder(null);
        institutoBTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN6ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 170, -1));

        institutoBTN7.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN7.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/duracion_1.png"))); // NOI18N
        institutoBTN7.setText("Duracion");
        institutoBTN7.setBorder(null);
        institutoBTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN7ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 170, -1));

        institutoBTN8.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN8.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/Modalidad_1.png"))); // NOI18N
        institutoBTN8.setText("Modalidad");
        institutoBTN8.setBorder(null);
        institutoBTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN8ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, -1));

        institutoBTN9.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN9.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/campus.png"))); // NOI18N
        institutoBTN9.setText("Campus");
        institutoBTN9.setBorder(null);
        institutoBTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN9ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 170, -1));

        institutoBTN10.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN10.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/Matricula.png"))); // NOI18N
        institutoBTN10.setText("Matricula");
        institutoBTN10.setBorder(null);
        institutoBTN10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN10ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 170, -1));

        institutoBTN11.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN11.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/institucion.png"))); // NOI18N
        institutoBTN11.setText("Periodo");
        institutoBTN11.setBorder(null);
        institutoBTN11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN11ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 170, -1));

        institutoBTN12.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN12.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/institucion.png"))); // NOI18N
        institutoBTN12.setText("Financiamiento");
        institutoBTN12.setBorder(null);
        institutoBTN12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN12ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 170, -1));

        institutoBTN13.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN13.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/institucion.png"))); // NOI18N
        institutoBTN13.setText("Institucion");
        institutoBTN13.setBorder(null);
        institutoBTN13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN13ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 170, -1));

        institutoBTN14.setBackground(new java.awt.Color(255, 255, 255));
        institutoBTN14.setForeground(new java.awt.Color(0, 0, 0));
        institutoBTN14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD/institucion.png"))); // NOI18N
        institutoBTN14.setText("Canton");
        institutoBTN14.setBorder(null);
        institutoBTN14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutoBTN14ActionPerformed(evt);
            }
        });
        jPanel1.add(institutoBTN14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carrerasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrerasBtnActionPerformed
        Carreras ca = new Carreras();
        ca.setSize(770, 500);
        ca.setLocation(0, 0);
        carrerasBtn.removeAll();
        carrerasBtn.add(ca, BorderLayout.CENTER);
        carrerasBtn.revalidate();
        carrerasBtn.repaint();
        PANELPRINCIPAL.removeAll();
        PANELPRINCIPAL.add(ca, BorderLayout.CENTER);
        PANELPRINCIPAL.revalidate();
        PANELPRINCIPAL.repaint();
        
    }//GEN-LAST:event_carrerasBtnActionPerformed

    private void institutoBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN1ActionPerformed
       Institucion insti = new Institucion();
        insti.setSize(770, 500);
        insti.setLocation(0, 0);
        carrerasBtn.removeAll();
        carrerasBtn.add(insti, BorderLayout.CENTER);
        carrerasBtn.revalidate();
        carrerasBtn.repaint();
        PANELPRINCIPAL.removeAll();
        PANELPRINCIPAL.add(insti, BorderLayout.CENTER);
        PANELPRINCIPAL.revalidate();
        PANELPRINCIPAL.repaint();
        
        
        
    }//GEN-LAST:event_institutoBTN1ActionPerformed

    private void institutoBTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institutoBTN3ActionPerformed

    private void institutoBTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN5ActionPerformed
       
        Nivel_Formacion forma = new Nivel_Formacion();
        forma.setSize(770, 500);
        forma.setLocation(0, 0);
        carrerasBtn.removeAll();
        carrerasBtn.add(forma, BorderLayout.CENTER);
        carrerasBtn.revalidate();
        carrerasBtn.repaint();
        PANELPRINCIPAL.removeAll();
        PANELPRINCIPAL.add(forma, BorderLayout.CENTER);
        PANELPRINCIPAL.revalidate();
        PANELPRINCIPAL.repaint();
        
    }//GEN-LAST:event_institutoBTN5ActionPerformed

    private void institutoBTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN6ActionPerformed
        
        Provincia pronci = new Provincia();
        pronci.setSize(770, 500);
        pronci.setLocation(0, 0);
        carrerasBtn.removeAll();
        carrerasBtn.add(pronci, BorderLayout.CENTER);
        carrerasBtn.revalidate();
        carrerasBtn.repaint();
        PANELPRINCIPAL.removeAll();
        PANELPRINCIPAL.add(pronci, BorderLayout.CENTER);
        PANELPRINCIPAL.revalidate();
        PANELPRINCIPAL.repaint();
        
        
    }//GEN-LAST:event_institutoBTN6ActionPerformed

    private void institutoBTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN7ActionPerformed
       
        Duracion Dura = new Duracion();
        Dura.setSize(770, 500);
        Dura.setLocation(0, 0);
        carrerasBtn.removeAll();
        carrerasBtn.add(Dura, BorderLayout.CENTER);
        carrerasBtn.revalidate();
        carrerasBtn.repaint();
        PANELPRINCIPAL.removeAll();
        PANELPRINCIPAL.add(Dura, BorderLayout.CENTER);
        PANELPRINCIPAL.revalidate();
        PANELPRINCIPAL.repaint();  
        
    }//GEN-LAST:event_institutoBTN7ActionPerformed

    private void institutoBTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN8ActionPerformed
       
        Modalidad Moda = new Modalidad();
        Moda.setSize(770, 500);
        Moda.setLocation(0, 0);
        carrerasBtn.removeAll();
        carrerasBtn.add(Moda, BorderLayout.CENTER);
        carrerasBtn.revalidate();
        carrerasBtn.repaint();
        PANELPRINCIPAL.removeAll();
        PANELPRINCIPAL.add(Moda, BorderLayout.CENTER);
        PANELPRINCIPAL.revalidate();
        PANELPRINCIPAL.repaint();  
        
    }//GEN-LAST:event_institutoBTN8ActionPerformed

    private void institutoBTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institutoBTN9ActionPerformed

    private void institutoBTN10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN10ActionPerformed
        
        Matriculas Matri = new Matriculas();
        Matri.setSize(770, 500);
        Matri.setLocation(0, 0);
        carrerasBtn.removeAll();
        carrerasBtn.add(Matri, BorderLayout.CENTER);
        carrerasBtn.revalidate();
        carrerasBtn.repaint();
        PANELPRINCIPAL.removeAll();
        PANELPRINCIPAL.add(Matri, BorderLayout.CENTER);
        PANELPRINCIPAL.revalidate();
        PANELPRINCIPAL.repaint();  
        
        
    }//GEN-LAST:event_institutoBTN10ActionPerformed

    private void institutoBTN11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institutoBTN11ActionPerformed

    private void institutoBTN12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institutoBTN12ActionPerformed

    private void institutoBTN13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institutoBTN13ActionPerformed

    private void institutoBTN14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutoBTN14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institutoBTN14ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANELPRINCIPAL;
    private javax.swing.JButton carrerasBtn;
    private javax.swing.JButton institutoBTN1;
    private javax.swing.JButton institutoBTN10;
    private javax.swing.JButton institutoBTN11;
    private javax.swing.JButton institutoBTN12;
    private javax.swing.JButton institutoBTN13;
    private javax.swing.JButton institutoBTN14;
    private javax.swing.JButton institutoBTN3;
    private javax.swing.JButton institutoBTN5;
    private javax.swing.JButton institutoBTN6;
    private javax.swing.JButton institutoBTN7;
    private javax.swing.JButton institutoBTN8;
    private javax.swing.JButton institutoBTN9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
