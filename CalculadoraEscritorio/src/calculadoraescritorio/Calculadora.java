/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraescritorio;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import soft.calc.controlador.Controlador;

/**
 *
 * @author Annia
 */
public class Calculadora extends javax.swing.JFrame {
     Controlador control=new Controlador();
    
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        agregaropcion();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        Combo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        valor1 = new javax.swing.JTextField();
        valor2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        Mensaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Calculadora");
        jInternalFrame1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jInternalFrame1.setVisible(true);

        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });

        jLabel1.setText(" = ");

        valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Calculadora Java");

        jLabel4.setText("- Operación Seleccionada -");

        Resultado.setEnabled(false);
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        jLabel2.setText(".");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 134, Short.MAX_VALUE)
                .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel3))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(58, 58, 58)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void agregaropcion(){
        int indice;
        ArrayList<String> lista=control.lista();
        DefaultComboBoxModel modelo= new DefaultComboBoxModel ();
        modelo.addElement("Selecione una operación");
        for(indice=0;indice<lista.size();indice++){         
            modelo.addElement(lista.get(indice));
        }
        Combo.setModel(modelo);
    }
    
    boolean validar(){
        if (valor1.getText().equals("") || valor2.getText().equals("")){
            return true;
        }
        else{
         return false;   
        }
    }
    
    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        int seleccion =  Combo.getSelectedIndex();
        valor2.setVisible(true);
        switch(seleccion){
            case 1: jLabel4.setText("Suma");
                jLabel2.setText("+"); break;
            case 2: jLabel4.setText("Resta");
                jLabel2.setText("-"); break;
            case 3:jLabel4.setText("Multiplicación");
                jLabel2.setText("*"); break;
            case 4: jLabel4.setText("División");
                jLabel2.setText("/"); break;
            case 5: jLabel4.setText("Elevar");
                jLabel2.setText("^"); break;
            case 6: jLabel4.setText("Raíz cuadrada");
                jLabel2.setText("|/"); 
                valor2.setVisible(false); break;
            case 7:jLabel4.setText("Conversión Binario");
                jLabel2.setText(""); 
                valor2.setVisible(false); break;
            case 8: jLabel4.setText("Conversión Octal");
                jLabel2.setText(""); 
                valor2.setVisible(false); break;  
            case 9: jLabel4.setText("Conversión Hexádecimal");
                jLabel2.setText(""); 
                valor2.setVisible(false); break;
        }
    }//GEN-LAST:event_ComboActionPerformed

    private void valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor1ActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

         String opcion=Combo.getSelectedItem().toString();
         int seleccion =  Combo.getSelectedIndex();
         if(seleccion<=5 && seleccion>=0){
            if (validar()){
                Mensaje.setText("Favor ingresar valores");
                valor1.setText("");
                valor2.setText("");
           }
            else{
                int num1= Integer.parseInt(valor1.getText());
                int num2= Integer.parseInt(valor2.getText());        
                String resultado=control.Calculadora(opcion, num1, num2);
                Resultado.setText(resultado);
                valor1.setText("");
                valor2.setText("");
                Mensaje.setText("");                
            }
         }
         else{
             if(!(valor1.getText().equals(""))){
                int num1= Integer.parseInt(valor1.getText()); 
                String resultado;
                if(seleccion==6)
                resultado=control.Radical(opcion, num1);
                else
                    resultado=control.Convertidora(opcion, num1);
                Resultado.setText(resultado);
                valor1.setText("");
                valor2.setText("");
                Mensaje.setText("");                    
             }
             else{
                Mensaje.setText("Favor ingresar valores");
                valor1.setText("");                   
             }           
             
         }
          
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combo;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField valor1;
    private javax.swing.JTextField valor2;
    // End of variables declaration//GEN-END:variables
}