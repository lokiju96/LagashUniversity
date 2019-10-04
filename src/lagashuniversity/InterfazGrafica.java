/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagashuniversity;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Agustin
 */
public class InterfazGrafica extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGrafica
     */
    static final int CANT_PARQUIMETROS = 20;
    ArrayList<Parquimetro> parquimetros;

    public InterfazGrafica() {
        initComponents();
        parquimetros = new ArrayList<>();
        for (int i = 0; i < CANT_PARQUIMETROS; i++) {
            parquimetros.add(new Parquimetro(100));
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
        SpinnerModel model = new SpinnerNumberModel(0,0,CANT_PARQUIMETROS - 1,1);
        parquimetroNumero = new javax.swing.JSpinner(model);
        jLabel2 = new javax.swing.JLabel();
        Detectado = new javax.swing.JButton();
        MinutoTodos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        importeText = new javax.swing.JTextField();
        Finalizar = new javax.swing.JButton();
        Minuto = new javax.swing.JButton();
        setImporte = new javax.swing.JButton();
        getMinutos = new javax.swing.JButton();
        Patente = new javax.swing.JButton();
        getImporte = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        patenteText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Parquimetro N°:");

        parquimetroNumero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PARQUIMETROS INTELIGENTES");

        Detectado.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Detectado.setText("Auto Detectado");
        Detectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetectadoActionPerformed(evt);
            }
        });

        MinutoTodos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        MinutoTodos.setText("Avanzar Minuto (TODOS)");
        MinutoTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinutoTodosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Patente:");

        importeText.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        importeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importeTextActionPerformed(evt);
            }
        });

        Finalizar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Finalizar.setText("Finalizar");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        Minuto.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Minuto.setText("Avanzar Minuto");
        Minuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinutoActionPerformed(evt);
            }
        });

        setImporte.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        setImporte.setText("Establecer Importe");
        setImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setImporteActionPerformed(evt);
            }
        });

        getMinutos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getMinutos.setText("Consultar Minutos");
        getMinutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMinutosActionPerformed(evt);
            }
        });

        Patente.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Patente.setText("Consultar Patente");
        Patente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Patente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatenteActionPerformed(evt);
            }
        });

        getImporte.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getImporte.setText("Consultar Importe");
        getImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getImporteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Importe:");

        patenteText.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        patenteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patenteTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SERVICIO EXTERNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(patenteText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(parquimetroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 94, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(MinutoTodos)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Detectado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Minuto, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(Finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(importeText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(Patente, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(getMinutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65))))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(parquimetroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinutoTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(patenteText))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(importeText)
                            .addComponent(jLabel4))
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setImporte)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(getImporte)))
                        .addGap(11, 11, 11)
                        .addComponent(getMinutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Patente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Detectado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Minuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Finalizar)))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DetectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetectadoActionPerformed
        // TODO add your handling code here:
        int numero = (int) parquimetroNumero.getValue();
        String patente = patenteText.getText();
        if (Pattern.matches("^[a-zA-Z]{3}[0-9]{3}$", patente)
                || Pattern.matches("^[a-zA-Z]{2}[0-9]{3}[a-zA-Z]{2}$", patente)) {
            parquimetros.get(numero).autoDetectado(patente);
        } else {
            JOptionPane.showMessageDialog(null, "Patente no válida");
            System.out.println("Patente no válida");
        }
    }//GEN-LAST:event_DetectadoActionPerformed

    private void MinutoTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinutoTodosActionPerformed
        // TODO add your handling code here:
        for (Parquimetro parquimetro : parquimetros) {
            parquimetro.avanzarMinuto();
        }
        JOptionPane.showMessageDialog(null, "Minuto avanzado para todos los parquímetros");
        System.out.println("Minuto avanzado (para todos los parquimetros)");
    }//GEN-LAST:event_MinutoTodosActionPerformed

    private void importeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importeTextActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        // TODO add your handling code here:
        int numero = (int) parquimetroNumero.getValue();
        parquimetros.get(numero).estacionamientoFinalizado();
        System.out.println("Estacionamiento finalizado");
    }//GEN-LAST:event_FinalizarActionPerformed

    private void MinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinutoActionPerformed
        // TODO add your handling code here:
        int numero = (int) parquimetroNumero.getValue();
        parquimetros.get(numero).avanzarMinuto();
        JOptionPane.showMessageDialog(null, "Minuto avanzado");
        System.out.println("Minuto avanzado (Parquimetro "+numero+")");
    }//GEN-LAST:event_MinutoActionPerformed

    private void setImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setImporteActionPerformed
        // TODO add your handling code here:
        String importe = importeText.getText();
        if (Pattern.matches("^[0-9]+$", importe)) {
            int numero = (int) parquimetroNumero.getValue();
            parquimetros.get(numero).setCentavosPorHora(Integer.parseInt(importe));
            JOptionPane.showMessageDialog(null, "El Parquímetro tiene ahora un valor de "+importe+" centavos por hora");
        }else{
            JOptionPane.showMessageDialog(null, "Importe no válido");
        }
    }//GEN-LAST:event_setImporteActionPerformed

    private void getMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMinutosActionPerformed
        // TODO add your handling code here:
        int numero = (int) parquimetroNumero.getValue();
        JOptionPane.showMessageDialog(null, parquimetros.get(numero).getMinutosEstacionado());
    }//GEN-LAST:event_getMinutosActionPerformed

    private void PatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatenteActionPerformed
        // TODO add your handling code here:
        int numero = (int) parquimetroNumero.getValue();
        JOptionPane.showMessageDialog(null, parquimetros.get(numero).getPatente());
    }//GEN-LAST:event_PatenteActionPerformed

    private void getImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getImporteActionPerformed
        // TODO add your handling code here:
        int numero = (int) parquimetroNumero.getValue();
        int valor = parquimetros.get(numero).getCentavosPorHora();
        JOptionPane.showMessageDialog(null, "El Parquímetro tiene un valor de "+valor+" centavos por hora");
    }//GEN-LAST:event_getImporteActionPerformed

    private void patenteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patenteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patenteTextActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Detectado;
    private javax.swing.JButton Finalizar;
    private javax.swing.JButton Minuto;
    private javax.swing.JButton MinutoTodos;
    private javax.swing.JButton Patente;
    private javax.swing.JButton getImporte;
    private javax.swing.JButton getMinutos;
    private javax.swing.JTextField importeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner parquimetroNumero;
    private javax.swing.JTextField patenteText;
    private javax.swing.JButton setImporte;
    // End of variables declaration//GEN-END:variables
}
