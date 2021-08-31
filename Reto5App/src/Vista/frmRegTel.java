/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author CRISTHIAN. S
 */
public class frmRegTel extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRegTelMed
     */
    public frmRegTel() {
        initComponents();
    }

   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtPacTel = new javax.swing.JTextField();
        txtSelIDPac = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscPac = new javax.swing.JButton();
        btnRegTelP = new javax.swing.JButton();
        BtnActTelP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jLabel7.setText("Telefono ");

        txtSelIDPac.setEditable(false);

        jLabel3.setText("ID Persona");

        btnBuscPac.setText("Buscar persona");

        btnRegTelP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegTelP.setText("Registrar Telefono");

        BtnActTelP.setBackground(new java.awt.Color(255, 255, 255));
        BtnActTelP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/system-update_116789.png"))); // NOI18N
        BtnActTelP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnActTelP.setFocusable(false);
        BtnActTelP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnActTelP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jLabel1.setText("Actualizar Telefono ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPacTel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSelIDPac, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscPac)))
                    .addComponent(btnRegTelP, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnActTelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSelIDPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscPac))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPacTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(btnRegTelP))
                    .addComponent(BtnActTelP))
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Registrar telefonos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnBuscPac() {
        return btnBuscPac;
    }

    public void setBtnBuscPac(JButton btnBuscPac) {
        this.btnBuscPac = btnBuscPac;
    }

    public JButton getBtnActTelP() {
        return BtnActTelP;
    }

    public void setBtnActTelP(JButton BtnActTelP) {
        this.BtnActTelP = BtnActTelP;
    }

    public JButton getBtnRegTelP() {
        return btnRegTelP;
    }

    public void setBtnRegTelP(JButton btnRegTelP) {
        this.btnRegTelP = btnRegTelP;
    }

  

    public JTextField getTxtPacTel() {
        return txtPacTel;
    }

    public void setTxtPacTel(JTextField txtPacTel) {
        this.txtPacTel = txtPacTel;
    }

    public JTextField getTxtSelIDPac() {
        return txtSelIDPac;
    }

    public void setTxtSelIDPac(JTextField txtSelIDPac) {
        this.txtSelIDPac = txtSelIDPac;
    }

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActTelP;
    private javax.swing.JButton btnBuscPac;
    private javax.swing.JButton btnRegTelP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPacTel;
    private javax.swing.JTextField txtSelIDPac;
    // End of variables declaration//GEN-END:variables
}
