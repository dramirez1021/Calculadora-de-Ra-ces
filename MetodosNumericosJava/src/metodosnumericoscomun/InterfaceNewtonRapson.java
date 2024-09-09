/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericoscomun;

import Menu.Menu;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metodosnumericosraices.NewtonRapson;

/**
 *
 * @author kevin
 */
public class InterfaceNewtonRapson extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceNewtonRapson
     */
    public InterfaceNewtonRapson() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        textField1 = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textField5 = new java.awt.TextField();
        textField6 = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        panel = grafica.obtieneGrafica();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Newton-Raphson");
        setMaximumSize(new java.awt.Dimension(1000, 390));
        setMinimumSize(new java.awt.Dimension(1000, 390));
        setPreferredSize(new java.awt.Dimension(1000, 390));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Método Newton-Raphson");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 340, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Funcion:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 70, 60, 30);
        jPanel1.add(textField1);
        textField1.setBounds(110, 70, 170, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Raiz:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 280, 40, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Iteraciones: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 190, 80, 17);
        jPanel1.add(textField2);
        textField2.setBounds(110, 150, 50, 30);
        jPanel1.add(textField3);
        textField3.setBounds(110, 190, 50, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Valor inicial:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 150, 90, 30);
        jPanel1.add(textField4);
        textField4.setBounds(110, 230, 150, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 320, 100, 30);

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpiar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 320, 100, 30);

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Calcular");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 320, 100, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Derivada:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 110, 60, 20);
        jPanel1.add(textField5);
        textField5.setBounds(110, 110, 170, 30);

        textField6.setEditable(false);
        textField6.setEnabled(false);
        textField6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(textField6);
        textField6.setBounds(210, 270, 190, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Error:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 230, 50, 17);

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel11.setText("Ingrese los datos requeridos a continuación.");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 40, 440, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 440, 365);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Desde");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(450, 330, 40, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(490, 320, 80, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Hasta");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(580, 330, 34, 20);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(620, 320, 90, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(810, 320, 86, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Intervalos de");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(730, 330, 80, 15);

        jButton4.setText("Graficar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(900, 323, 80, 30);

        panel.setMaximumSize(new java.awt.Dimension(516, 317));
        panel.setMinimumSize(new java.awt.Dimension(516, 317));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        getContentPane().add(panel);
        panel.setBounds(440, 0, 540, 317);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Menu men = new Menu();
        men.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        String def, ef;
        def = textField1.getText();
        ef = textField5.getText();
        try{
        double e=Double.parseDouble(textField4.getText());
        double xxi=Double.parseDouble(textField2.getText());
        int i=Integer.parseInt(textField3.getText());
        
        Funcion f= new Funcion(def);
        Funcion df= new Funcion(ef);
        NewtonRapson n = new NewtonRapson(f, df);
        double r;
        r=n.raiz(xxi,e,i);
        textField6.setText(""+ r);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Datos incorrectos, favor de verificar.");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String def = textField1.getText();
            double x0 = Double.parseDouble(jTextField1.getText());
            double xn = Double.parseDouble(jTextField2.getText());
            double d = Double.parseDouble(jTextField3.getText());
            FuncionGrafica f= new FuncionGrafica(def);
            double[] x= f.rango(x0, xn, d);
            double[] y = f.eval(x);
            
            grafica.crearGrafica(def, x, y);
        } catch (Exception ex) {
            Logger.getLogger(InterfaceNewtonRapson.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String def = "0" ;
            
            double x0 = Double.parseDouble(jTextField1.getText());
            double xn = Double.parseDouble(jTextField2.getText());
            double d = Double.parseDouble(jTextField3.getText()) ;
            FuncionGrafica f= new FuncionGrafica(def);
            double[] x= f.rango(x0, xn, d);
            double[] y = f.eval(x);
            
            grafica.agregarGrafica(def, x, y);
        } catch (Exception ex) {
            Logger.getLogger(InterfacePuntoFijo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceNewtonRapson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceNewtonRapson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceNewtonRapson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceNewtonRapson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceNewtonRapson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panel;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    // End of variables declaration//GEN-END:variables
Grafica grafica= new Grafica ("GRAFICA DE LA FUNCION", "X" ,"Y");
}
